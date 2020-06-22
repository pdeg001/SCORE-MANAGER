B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.31
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private mForm As Form
	Private clsFUnc As FuncClass
	Private sql As Sqlite
	Private dialog As B4XDialog
	Dim base As B4XView
	Private lblTest As B4XView
	
	Dim sp As ScrollPane
	Private ScrollPane1 As ScrollPane
	Private lblBaseweek As Label
	Private ScrollPane2 As ScrollPane
	Private lblHeight As Int = 30
	Private ScrollPane3 As ScrollPane
	Dim Label1 As Label 'ignore
	Private ptop, pleft As B4XView' = Label1
	Public paneBlockInput As Pane
	Private clvPlaying As CustomListView
	Private btnPlayer As Button
	Private lstPlayerId As List
	Private cmbGameType As ComboBox
	Private btnSettings As Button
End Sub

Sub InitMatrix
	sp.Initialize("SP")
	clsFUnc.Initialize
	sql.Initialize
	
	mForm.Initialize("mForm", 1050, 750)
	mForm.RootPane.LoadLayout("playermatrix")
	mForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
'	mForm.WindowHeight = 730
'	mForm.WindowWidth = 1028
	mForm.Resizable = True
	mForm.Icon =  clsFUnc.GetAppIcon
	mForm.Show
	paneBlockInput.Visible = True
	base = mForm.RootPane
	dialog.Initialize (base)
	Sleep(0)
	PopulateGameCombo
	InitScollPanes
	
End Sub

Sub ShowForm
	'mForm.Show
End Sub

Sub mForm_CloseRequest(EventData As Event)
	If clsFUnc.GetDisableCloseForm = True Then
		EventData.Consume
	End If
End Sub

Sub SetDisableCloseMain(disable As Boolean)
	clsFUnc.SetDisableCloseForm(disable)
End Sub

Sub InitScollPanes
	ScrollPane1.LoadLayout("scrollpane",200,0)
	ScrollPane2.LoadLayout("scrollpane",0 ,0)
	ScrollPane3.LoadLayout("scrollpane",0 ,160)
	
	ScrollPane2.SetHScrollVisibility("ALWAYS")
	ScrollPane1.SetHScrollVisibility("ALWAYS")
	ScrollPane1.SetVScrollVisibility("NEVER")
	
	SetVerticalNames
End Sub

Sub SetVerticalNames
	
	Dim p As Pane= ScrollPane1.InnerNode
	Dim lbl As Label
	Dim left As Int = 1'baseLabel.Left
	Dim top As Int = 0' baseLabel.Top + height
	Dim lstPlayers As List = sql.GetPlayerList
	
	
	If lstPlayers.Size = 0 Then
		Players.SetSelectedPlayerIdToEmpty
		Players.ShowPlayerForm
		Return
	End If

	Dim loopCount As Int = 0
	
	lstPlayerId.Initialize
	For Each player As playerCurs In lstPlayers
		Dim playerId As playerIdForGrid
		playerId.player1_id = player.player_id
		lstPlayerId.Add(playerId)
		loopCount = loopCount + 1
		
		lbl = lblTest
		lbl.TooltipText = $"Moyenne ${clsFUnc.GetFormatNumber(player.moyenne, 3, 3).Replace(",", ".")} Maken ${player.to_make}"$
		'lbl.Initialize("lblWeek")
		lbl.Initialize("")
		lbl.TextSize = 15
		lbl.Alignment = "CENTER_RIGHT"
		lbl.Tag = $"speler-${player.player_id}-L${loopCount}"$
	'	LogDebug(clsFUnc.DecryptString(player.player))
		lbl.Text = clsFUnc.DecryptString(player.player)'player.player
		lbl.Style = "-fx-padding: 0 10 0 0;"
	'	lbl.Style = "-fx-border-color: black;"
	'	lbl.Font = fx.LoadFont(File.DirAssets, "baloo2-regular.ttf", 15)
	'	CSSUtils.SetBorder(lbl, 0, fx.Colors.Gray, 4)
		p.AddNode(lbl, left, top, 210, 30)
		
		top = top + 31
	Next
	
	SetHorizontalNames
	SetWeeks(lbl.Top, lstPlayers.Size)


	p.PrefHeight = (lstPlayers.Size * 31)' + 15
	ScrollPane2.InnerNode.PrefHeight = p.PrefHeight '(39*lblHeight)'+25
	ScrollPane2.InnerNode.PrefWidth = (lstPlayers.Size * 31) + 15
	ScrollPane3.InnerNode.PrefWidth = (lstPlayers.Size * 31) + 15
End Sub

Sub SetToolTip (x As B4XView, Text As String)
	If x Is Control Then
		Dim c As Control = x
		c.TooltipText = Text
	End If
End Sub

Private Sub SetHorizontalNames
	Dim left, loopCount, loopId As Int
	Label1.Initialize("lblWeek")
	Dim baseLbl As B4XView = Label1
	Dim pw1 As Pane= ScrollPane3.InnerNode
	left = 5
	Dim lstPlayers As List = sql.GetPlayerList
	loopCount = lstPlayers.Size -1
	loopId = 0
	
	For Each player As playerCurs In lstPlayers
		loopId = loopId +1
		Dim playerId As playerIdForGrid
		playerId.Initialize
		playerId = lstPlayerId.Get(loopCount)
		playerId.player2_id = player.player_id
		
		'Label1.Initialize("lblWeek")
		Label1.Initialize("")
		Label1.Alignment = "CENTER_RIGHT"
		Label1.Style = "-fx-padding: 0 10 0 0;"
'		Label1.Font = fx.LoadFont(File.DirAssets, "baloo2-regular.ttf", 15)
		Label1.TooltipText = $"Moyenne ${clsFUnc.GetFormatNumber(player.moyenne, 3, 3).Replace(",", ".")} Maken ${player.to_make}"$
		baseLbl = Label1
		baseLbl.Rotation = 90
		
		SetToolTip(baseLbl, $"Moyenne ${clsFUnc.GetFormatNumber(player.moyenne/1000, 3, 3).Replace(",", ".")} Maken ${player.to_make}"$)
		'CSSUtils.SetBorder(baseLbl, 1, fx.Colors.Gray, 0)
		
		baseLbl= baseLbl
		baseLbl.Tag = $"speler-${player.player_id}-T${loopId}"$
	
		baseLbl.Text = clsFUnc.DecryptString(player.player) 'player.player'$"SPELER ${i} "$
		baseLbl.TextSize = lblTest.TextSize
		
		
		pw1.AddNode(baseLbl, left-75, 76, 180, 30)
		left = left+31
		loopCount = loopCount - 1
	Next

End Sub


Private Sub SetWeeks(top As Int, playerCount As Int)
	Dim left As Int
	Dim lbl As Label = lblTest
	Dim playerId As playerIdForGrid
	Dim pw As Pane= ScrollPane2.InnerNode
	left = 5
	top = 0
	playerId.Initialize
	
	For i = 1 To playerCount
		left = 5
		For j = 1 To playerCount
			playerId = lstPlayerId.Get(j-1)
		
			lbl.id = "lbl"&i&""&DateTime.GetYear(DateTime.Now)
			If i <> j Then
				lbl.Initialize("lblWeek")
			Else
				lbl.Initialize("")
				CSSUtils.SetBackgroundColor(lbl, fx.Colors.LightGray)
			End If
		
			lbl.Tag = $"week-${i}-${j}"$
			lbl.TextSize = lblTest.TextSize
			lbl.Alignment = "CENTER"
			CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 2)
		
			pw.AddNode(lbl, left, top, 30, 30)
			left = left+31
		Next
		top = top + 31
	Next
	
End Sub

Sub PopulateGameCombo
	Dim lstGame As List
	lstGame.Initialize
	
	lstGame.AddAll(Array As String("Bandstoten", "Libre", "Driebanden"))
	cmbGameType.Items.AddAll(Array As String("Bandstoten", "Libre", "Driebanden"))
End Sub

Sub lblWeek_MouseExited (EventData As MouseEvent)
	Dim lbl As Label
	lbl = Sender
	CSSUtils.SetBackgroundColor(lbl, fx.Colors.White)
	Try
		CSSUtils.SetBackgroundColor(ptop, fx.Colors.White)
		CSSUtils.SetBackgroundColor(pleft, fx.Colors.White)
	Catch
		LogDebug("")
	End Try
End Sub

Sub LblWeek_MouseEntered (EventData As MouseEvent)
	Dim lbl As Label
	lbl = Sender
	CSSUtils.SetBackgroundColor(lbl, fx.Colors.From32Bit(0xFF068BAE))
	Dim tag As String = lbl.Tag
	If tag.IndexOf("week") > -1 Then
		Dim strTag As String
		Dim str() As String
		Dim pn As Pane = ScrollPane1.InnerNode
		str = Regex.Split("-", tag)

		For Each v As B4XView In pn.GetAllViewsRecursive
			strTag = v.tag
			If strTag.IndexOf($"L${str(1)}"$) > -1 Then
				pleft = v
				HighliteSpeler(v)
				Exit
			End If
		Next
		pn = ScrollPane3.InnerNode
		For Each v As B4XView In pn.GetAllViewsRecursive
			strTag = v.tag
			If strTag.IndexOf($"T${str(2)}"$) > -1 Then
				ptop = v
				HighliteSpeler(v)
				Exit
			End If
		Next
	End If
End Sub

Private Sub HighliteSpeler(v As B4XView)
	CSSUtils.SetBackgroundColor(v, fx.Colors.From32Bit(0xFF068BAE))
End Sub

Sub ScrollPane1_VScrollChanged (Position As Double)
	ScrollPane2.VPosition = ScrollPane1.VPosition
End Sub

Sub ScrollPane2_VScrollChanged (Position As Double)
	ScrollPane1.VPosition = ScrollPane2.VPosition
End Sub

Sub ScrollPane2_HScrollChanged (Position As Double)
	ScrollPane3.HPosition = Position
End Sub

Sub lblWeek_MouseReleased (EventData As MouseEvent)
	If EventData.ClickCount <> 2 Then Return
	'If clsFUnc.DblClick = False Then Return
	
	Dim lPLayerId, tPlayerId As String
	
	LogDebug($"left-tag - ${pleft.Tag} == top tag - ${ptop.Tag}"$)
	If fx.Msgbox2(mForm, $"${pleft.Text} tegen ${ptop.text} laten spelen"$, "Score Manager", "Ja", "Nee", "", _
			fx.MSGBOX_CONFIRMATION) = fx.DialogResponse.POSITIVE Then
		GetPlayerId(pleft)
		GetPlayerId(ptop)
		Return
	End If
End Sub

Sub btnPlayer_MouseReleased (EventData As MouseEvent)
	'MainForm.RootPane.RemoveAllNodes
	'MainForm.RootPane.LoadLayout("playerlist")
	'Players.GetPlayers
	Players.ShowPlayerForm
End Sub

Sub GetPlayerId(player As Label)
	Dim strPlayer() As String
	strPlayer = Regex.Split("-", player.Tag)
End Sub

Sub btnSettings_MouseReleased (EventData As MouseEvent)
	tabSetting.InitSettings
End Sub