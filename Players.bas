B4J=true
Group=Players
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
#Region Project Attributes 
	
#End Region

Sub Process_Globals
	Private sql As Sqlite
	Private fx As JFX
	Private PlayerForm As Form
	Private clvPlayer As CustomListView
	Private btnClose As Button
	Private clsFunc As FuncClass
	Private pnPlayer As Pane
	Private lblName As B4XView
	Private lblMoyenne As B4XView
	Private xui As XUI
	Private lblMake As B4XView
	Private selectedPlayerId, selectedIndex As String
	Private edtMake As TextField
	Private edtMoyenne As TextField
	Private edtName As TextField
	Private btnSave As Button
	Private btnNew As Button
End Sub

Public Sub InitForm
	sql.Initialize
	clsFunc.Initialize
	clsFunc.ConfigureForNumbers(True, False, edtMoyenne)
	
	PlayerForm.Initialize(Me, -1, -1)
	PlayerForm.RootPane.LoadLayout("playerlist")
	PlayerForm.WindowHeight = 500
	PlayerForm.WindowWidth = 500
	PlayerForm.Resizable = False
	PlayerForm.AlwaysOnTop = True
	SetScrollbarSize(clvPlayer.AsView, "VERTICAL", 20)
	Dim n As Node = clvPlayer.sv
	n.Id = "clv1"
	PlayerForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
	GetPlayers
End Sub

Sub PlayerForm_CloseRequest(EventData As Event)
	clsFunc.SetDisableCloseForm(False)
End Sub

Sub btnClose_MouseReleased (EventData As MouseEvent)
	Main.paneBlockInput.Visible = False
	Main.SetDisableCloseMain(False)
	Main.InitScollPanes
	PlayerForm.Close
End Sub

Public Sub ShowPlayerForm
	Main.paneBlockInput.Visible  = True
	Main.SetDisableCloseMain(True)
	GetPlayers
	edtMake.Text = ""
	edtMoyenne.Text = ""
	edtName.Text = ""
	PlayerForm.Show
End Sub

Private Sub GetPlayers
	Dim lstPlayers As List = sql.GetPlayerList
	clvPlayer.Clear
	If lstPlayers.Size <= 6 Then
'		clvPlayer.sv.
	End If
	'For i = 0 To 30
		For Each player As playerCurs In lstPlayers
			clvPlayer.Add(CreateClv(player), "")
		Next
	'Next
End Sub

Private Sub CreateClv(player As playerCurs) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 0, 45)
	p.LoadLayout("clvPlayer")
	lblName.Text = player.player
	lblMoyenne.Text = clsFunc.GetFormatNumber(player.moyenne/1000, 3, 3).Replace(",", ".")
	lblMake.Text = player.to_make
	p.Tag = player.player_id
	CSSUtils.SetBackgroundColor(p, fx.Colors.Transparent)
	Return p
End Sub

Sub pnPlayer_MouseReleased (EventData As MouseEvent)
	Dim p As Pane = Sender
	
	LogDebug(p.Tag)
End Sub

Sub clvPlayer_ItemClick (Index As Int, Value As Object)
	Dim p As Pane = clvPlayer.GetPanel(Index)
	
	clsFunc.SetClvSelectedColor(clvPlayer, Index)
	selectedPlayerId = p.Tag	
	selectedIndex = Index
	Dim playerList As List = sql.GetPlayerData(selectedPlayerId)
	Dim playerdata As playerCurs = playerList.Get(0)
	
	edtName.Text = playerdata.player
	edtMoyenne.Text = clsFunc.GetFormatNumber(playerdata.moyenne/1000, 3, 3)
	edtMake.Text = playerdata.to_make
	edtName.RequestFocus
	edtName.SetSelection(edtName.Text.Length,edtName.Text.Length)
	
End Sub


Sub UpdateClv
	Dim p As Pane
	Dim lbl As Label
	p = clvPlayer.GetPanel(selectedIndex)
	For Each v As Node In p.GetAllViewsRecursive
		If v.Tag = "name" Then
			lbl = v
			lbl.Text = edtName.Text
			Continue
		End If
		If v.Tag = "moyenne" Then
			lbl = v
			lbl.Text =clsFunc.GetFormatNumber(edtMoyenne.Text, 3, 3)
			Continue
		End If
		If v.Tag = "tomake" Then
			lbl = v
			lbl.Text = edtMake.Text
			Continue
		End If
	Next
	
End Sub

Sub edtMoyenne_TextChanged (Old As String, New As String)
'	Dim RegexPattern As String = "^(0|[1-9]\d*)?(\.\d+)?(?<=\d)$"
'	
'	Dim m As Matcher = Regex.Matcher2(RegexPattern, 0, New)
'	Do While m.Find
'		Log("Match: " & m.Match)
'		For g = 1 To m.GroupCount
'			Log("Group #" & g & ": " & m.Group(g))
'		Next
'	Loop
	
	
	Dim strMoy As String = edtMoyenne.Text
	edtMoyenne.Text = strMoy.Replace(",", ".")
	edtMoyenne.SetSelection(edtMoyenne.Text.Length,edtMoyenne.Text.Length)
End Sub

Sub edtMake_TextChanged(Old As String, New As String)
	Dim update As Boolean
   
	Try
		Dim text As String = Regex.Replace("\D",New,"")
		If New <> text Then
			update = True
		End If
	Catch
		Log(LastException.Message)
	End Try
   
	If text.Length > 15 Then   ' 15 is the max length allowed you can change this :)
		text = text.SubString2(0,15)
		update = True
	End If
   
	If update Then
		edtMake.Text = text
		edtMake.SetSelection(text.Length,text.Length)
	End If
End Sub

Sub btnSave_MouseReleased (EventData As MouseEvent)
	Dim nMoyenne As Double
	If ValidateInput = False Then
		If fx.Msgbox2(PlayerForm, "Naam van de speler mag niet leeg zijn", "Score Manager", "OKE", "", "", _
			fx.MSGBOX_WARNING) = fx.DialogResponse.POSITIVE Then
			Return
		End If
	End If
	
	nMoyenne = edtMoyenne.Text
	
	sql.SetPlayerData(selectedPlayerId, edtName.Text,nMoyenne, edtMake.Text)
	If selectedPlayerId <> 0 Then
		UpdateClv
	Else
		Dim lstPlayer As List
		Dim lastId As String = sql.GetLastId
		lstPlayer.Initialize
		lstPlayer.Add(clsFunc.CreateplayerCurs(lastId, edtName.Text, edtMoyenne.Text, edtMake.Text))
		For Each player As playerCurs In lstPlayer
			clvPlayer.Add(CreateClv(player), "")
		Next
	End If
End Sub

Sub ValidateInput As Boolean
	If edtName.Text = "" Then
		Return False
	End If
	Return True
End Sub



Sub edtMoyenne_FocusChanged (HasFocus As Boolean)
	edtMoyenne.Text = clsFunc.GetFormatNumber(edtMoyenne.Text, 3, 3)
End Sub

Sub btnNew_MouseReleased (EventData As MouseEvent)
	selectedIndex = 0
	selectedPlayerId = 0
	edtMake.Text = "0"
	edtMoyenne.Text = "0.000"
	edtName.Text = ""
	
	edtName.RequestFocus
	
End Sub


'Parent - The Node that ontains a scrollbar i.e. ListView, TableView etc.
'Orientation - can be VERTICAL, HORIZONTAL or BOTH
'Size - The required width for a VERTICAl scrollbar or height for a HORIZONTAL scroll bar
Public Sub SetScrollbarSize(Parent As JavaObject, Orientation As String, Size As Double)
	'Get a Set that contains the scrollbars attached to the parent and convert it to an array
	Dim Arr() As Object = Parent.RunMethodJO("lookupAll",Array(".scroll-bar")).RunMethod("toArray",Null)

	For Each N As Node In Arr

		'Check this object is a scrolbar
		If GetType(N) = "com.sun.javafx.scene.control.skin.VirtualScrollBar" Or GetType(N) = "javafx.scene.control.ScrollBar" Then
			Dim SB As JavaObject = N

			'Get the orientation of the scrollbar as a string
			Dim BarOrientation As String = SB.RunMethodJO("getOrientation",Null).RunMethod("toString",Null)

			'Required Orientation is VERTICAL or BOTH
			If BarOrientation = "VERTICAL" And (Orientation  = BarOrientation Or Orientation = "BOTH") Then
				N.PrefWidth = Size
			End If

			'Required Orientation is HORIZONTAL or BOTH
			If BarOrientation = "HORIZONTAL" And (Orientation = BarOrientation Or Orientation = "BOTH") Then
				N.PrefHeight = Size
			End If
		End If
 
	Next
End Sub