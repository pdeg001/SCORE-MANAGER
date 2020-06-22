B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.31
@EndOfDesignText@

Sub Process_Globals
	Private fx As JFX
	Private sForm As Form
	Private tabSettings As TabPane
	Private clsfunc As FuncClass
End Sub

Sub InitSettings
	clsfunc.Initialize
	
	sForm.Initialize("sForm", 1050, 750)
	sForm.RootPane.LoadLayout("tabsettings")
	sForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
	sForm.Resizable = True
	sForm.Icon =  clsfunc.GetAppIcon
	
	tabSettings.LoadLayout("newclub", "Nieuwe speler")
	tabSettings.LoadLayout("playerlist", "spelers")
	
	Players.InitForm
	Players.GetPlayers
	sForm.Show
	
	
End Sub
