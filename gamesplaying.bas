B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.31
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private fx As JFX
	Private sql As Sqlite
	Private gForm As Form
	Private clsFunc As FuncClass	
	Private btnClose As Button
	Private xui As XUI
	Private lblInning As Label
	Private lblP1 As Label
	Private lblP1Caram As Label
	Private lblP2 As Label
	Private lblP2Caram As Label
	Private lblTable As Label
	Private pnGame As Pane
	Private clvGames As CustomListView
	Private lblP1Avg As Label
	Private lblP2Avg As Label
End Sub

Sub initForm
	clsFunc.Initialize
	sql.Initialize
	
	gForm.Initialize("mForm", 450, 600)
	gForm.RootPane.LoadLayout("gamesplaying")
	gForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
	gForm.AlwaysOnTop = True
	gForm.Resizable = False
	gForm.Icon =  clsFunc.GetAppIcon
	SetFormPos
End Sub

Sub ShowForm
	If gForm.IsInitialized = False Then initForm
	
	SetFormPos
	gForm.Show
	clvGames.Clear
	clsFunc.SetCLVScrollBars(clvGames, True)
	For i = 0 To 5
	clvGames.Add(GenGameList(i), "")
	Next
	
End Sub

Sub SetFormPos
	If gForm.IsInitialized = False Then Return
	Return
	Dim mainWith, screenWidth As Double
	mainWith = playermatrix.GetFormRight
	screenWidth = playermatrix.GetScreenWidth
	
	If mainWith+312 < screenWidth Then
		gForm.WindowLeft = playermatrix.GetFormLeft+2
		gForm.WindowTop = playermatrix.GetFormTop
	End If
	
End Sub

Sub btnClose_MouseReleased (EventData As MouseEvent)
	gForm.Close
End Sub

Sub clvGames_ItemClick (Index As Int, Value As Object)
	
End Sub

Private Sub GenGameList(num As Int) As B4XView
	Dim p As Pane = xui.CreatePanel("pnGame")
	
	p.LoadLayout("clvgame")
	p.SetLayoutAnimated(0, 15, 10, clvGames.AsView.Width -10, 135)
	
	num = num + 1
	lblTable.Text = "Tafel " & num
	p.Tag = lblTable.Text
	lblP1.Text = "Sjaak van Duijvenvoorde"
	lblP2.Text = "Test Speler 2"
	lblP1Caram.Text = "78"
	lblP1Avg.Text = NumberFormat2(15/5, 1, 3, 3, False)
	lblP2Caram.Text = "36"
	lblP2Avg.Text = NumberFormat2(3/13, 1, 3, 3, False)
	
	lblInning.Text = "25"
	lblP1.Style = "-fx-color: dodgerblue"
	lblP2.Style = "-fx-color: dodgerblue"
	
	'p.Style = "-fx-effect: dropshadow(three-pass-box, gray, 15, 0, 0.0, 0.6);"
	p.Style = "-fx-background-insets: 10 20 30 40; -fx-background-radius: 0; -fx-effect: dropshadow(three-pass-box, lightslategray, 10, 0, 3, 4);"
	Return p
End Sub

Sub pnGame_MouseEntered (EventData As MouseEvent)
	Dim p As Pane = Sender
	GetPanel(p.Tag, "gray")
End Sub

Sub pnGame_MouseExited (EventData As MouseEvent)
	Dim p As Pane = Sender
	GetPanel(p.Tag, "lightslategray")
	End Sub
	
Sub GetPanel(t As String, color As String)
	Dim p As Pane
	
	For i = 0 To clvGames.Size -1
		p = clvGames.GetPanel(i)
		If p.Tag = t Then
			p.Style = $"-fx-background-insets: 10 20 30 40; -fx-background-radius: 20; -fx-effect: dropshadow(three-pass-box, ${color}, 10, 0, 3, 4);"$
			Exit
		End If
	Next
End Sub