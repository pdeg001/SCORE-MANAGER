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
	Private cutils As ControlsUtils
	Private clsTabelView As TableViewClass
	Private clsForm As FormClass
	
	Private btnClose As Button
	Private clsFunc As FuncClass
	Private pnPlayer As Pane
	Private lblName As Label
	Private lblMoyenne As Label
	Private xui As XUI
	Private lblMake As Label
	Private selectedPlayerId, selectedIndex As String
	Private edtMake As TextField
	Private edtMoyenne As TextField
	Private edtName As TextField
	Private btnSave As Button
	Private btnNew As Button
	
	Private genPlayer As Button
	Private tblPlayer As TableView
	Private edtLastName As TextField
End Sub

Public Sub InitForm
	sql.Initialize
	clsFunc.Initialize
	clsFunc.ConfigureForNumbers(True, False, edtMoyenne)
	clsTabelView.Initialize(PlayerForm, tblPlayer)
	
	PlayerForm.Initialize(Me, -1, -1)
	PlayerForm.RootPane.LoadLayout("playerlist")
	PlayerForm.WindowHeight = 530
	PlayerForm.WindowWidth = 530
	PlayerForm.Resizable = True
	PlayerForm.AlwaysOnTop = True
	PlayerForm.Icon = clsFunc.GetAppIcon
	PlayerForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
	
End Sub

Sub PlayerForm_CloseRequest(EventData As Event)
	clsFunc.SetDisableCloseForm(False)
End Sub

Sub btnClose_MouseReleased (EventData As MouseEvent)
	playermatrix.paneBlockInput.Visible = False
	playermatrix.SetDisableCloseMain(False)
	playermatrix.InitScollPanes
	PlayerForm.Close
End Sub

Public Sub ShowPlayerForm
	playermatrix.paneBlockInput.Visible  = True
	playermatrix.SetDisableCloseMain(True)
	edtMake.Text = ""
	edtMoyenne.Text = ""
	edtName.Text = ""
	PlayerForm.Show
	GetPlayers
End Sub

Public Sub GetPlayers
	Dim lstPlayers As List = sql.GetPlayerList
	Dim tblItem As List
	tblItem.Initialize
	tblPlayer.Items.Clear
	
	
	tblPlayer.SetColumns(Array("Naam", "Moyenne", "Te maken"))
	For Each player As playerCurs In lstPlayers
		Dim row() As Object = CreateRow(Array As String($"${player.firstname} ${player.lastname}"$, player.moyenne/1000, player.to_make, player.player_id, player.firstname, player.lastname))
		tblPlayer.Items.Add(row)
	Next
	
	
	SetColumnStyle(1, "-fx-alignment: CENTER;")
	SetColumnStyle(2, "-fx-alignment: CENTER;")
End Sub

Sub tblPlayer_SelectedRowChanged(Index As Int, Row() As Object)
	If Index > -1 Then
		selectedPlayerId = GetCellValue(Index, 3)
		edtName.Text = GetCellValue(Index, 4)
		edtLastName.Text = GetCellValue(Index, 5)
		edtMoyenne.Text = GetCellValue(Index, 1)
		edtMake.Text = GetCellValue(Index, 2)
	End If
	
End Sub

Sub tblPlayer_Resize (Width As Double, Height As Double)
	Dim w As Double = (Width - 30) / tblPlayer.ColumnsCount
	For i = 0 To tblPlayer.ColumnsCount - 1
		tblPlayer.SetColumnWidth(i, w)
	Next
End Sub

#Region Helper Methods
Sub GetLabel(RowIndex As Int, CellIndex As Int) As Label
	Dim row() As Object = tblPlayer.Items.Get(RowIndex)
	Return row(CellIndex)
End Sub

Sub CreateRow(Row() As String) As Object()
	Dim labels(Row.Length) As Object
	For i = 0 To Row.Length - 1
		Dim lbl As Label
		lbl.Initialize("")
		lbl.Text = Row(i)
		labels(i) = lbl
	Next
	Return labels
End Sub

Sub GetCellValue(RowIndex As Int, CellIndex As Int) As String
	Return GetLabel(RowIndex, CellIndex).Text
End Sub

Sub SetCellValue(RowIndex As Int, CellIndex As Int, Value As String)
	GetLabel(RowIndex, CellIndex).Text = Value
End Sub

Sub SetColumnStyle(Index As Int, Style As String)
	Dim jo As JavaObject = tblPlayer
	Dim Column As JavaObject = jo.RunMethodJO("getColumns", Null).RunMethod("get", Array(Index))
	Column.RunMethod("setStyle", Array(Style))
End Sub
#End Region

Sub pnPlayer_MouseReleased (EventData As MouseEvent)
	Dim p As Pane = Sender
	
	LogDebug(p.Tag)
End Sub

Sub edtMoyenne_TextChanged (Old As String, New As String)
	Dim strNew As String
	If New = "" Then Return
	
	strNew = clsFunc.SetMoyenneFormat(New)
	
	Dim currPos As Int = edtMoyenne.SelectionStart
	

	edtMoyenne.Text = strNew
	edtMoyenne.SetSelection(currPos,currPos)
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

Private Sub GenMembers
	Dim name, lastname, encryptedName As String
	Dim nMoyenne As Double
	Dim make As Int
	For i = 0 To 43
		name = clsFunc.EncryptString($"Speler"$)
		lastname = clsFunc.EncryptString($"nummer ${i+1}"$)
		nMoyenne = Rnd(0, 12)
		clsFunc.GetFormatNumber(nMoyenne, 3, 3)
		make = Rnd(1,100)
		
		sql.SetPlayerData("0", name, lastname, nMoyenne, make) 'ignore
	Next
	
	
End Sub

Sub btnSave_MouseReleased (EventData As MouseEvent)
	Dim nMoyenne As Double
	Dim name, lastname, encryptedName As String
	
	If ValidateInput = False Then
		cutils.ShowNotification3(cmVars.appName, "Naam van de speler mag niet leeg zijn", cutils.ICON_INFORMATION, _
		PlayerForm, "BOTTOM_CENTER", 2000)
		Return
	End If
	
	nMoyenne = edtMoyenne.Text
	name = edtName.Text
	encryptedName = clsFunc.EncryptString(name)
	lastname = clsFunc.EncryptString(edtLastName.Text)
	
	
	
'	If CheckPlayerInList = True And selectedPlayerId = "0" Then
'		cutils.ShowNotification3(cmVars.appName, "Naam van de speler komt reeds voor", cutils.ICON_INFORMATION, _
'		PlayerForm, "BOTTOM_CENTER", 2000)
'		Return
'	End If
	sql.SetPlayerData(selectedPlayerId, encryptedName, lastname, nMoyenne, edtMake.Text) 'ignore
	If tblPlayer.SelectedRow = -1 Then Return
	SetCellValue(tblPlayer.SelectedRow, 0, $"${edtName.Text} ${edtLastName.Text}"$)
	SetCellValue(tblPlayer.SelectedRow, 1, edtMoyenne.Text)
	SetCellValue(tblPlayer.SelectedRow, 2, edtMake.Text)
	
End Sub

Sub ValidateInput As Boolean
	If edtName.Text = "" Or edtLastName.Text = "" Then
		Return False
	End If
	Return True
End Sub

Sub edtMoyenne_FocusChanged (HasFocus As Boolean)
	If edtMoyenne.Text.Length = 0 Then Return
	edtMoyenne.Text = clsFunc.GetFormatNumber(edtMoyenne.Text, 3, 3)
End Sub

Sub btnNew_MouseReleased (EventData As MouseEvent)
	selectedIndex = 0
	selectedPlayerId = "0"
	edtMake.Text = "0"
	edtMoyenne.Text = "0.000"
	edtName.Text = ""
	
	edtName.RequestFocus
	
End Sub

Sub SetSelectedPlayerIdToEmpty
	selectedPlayerId = "0"
End Sub

Sub genPlayer_MouseReleased (EventData As MouseEvent)
	GenMembers
End Sub