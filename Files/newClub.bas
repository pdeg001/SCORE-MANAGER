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
	Private clsFunc As FuncClass
	Private clsForm As FormClass
	Private formPosList As List
	Private cutils As ControlsUtils
	
	Private ncForm As Form
	Private iconFont As Font
	Private btnSaveClub As Button
	Private edtNameClub As TextField
	Private edtPincode As TextField
	Private edtPincode1 As TextField
	Private lblExit As Label
End Sub

Sub initForm
	clsFunc.Initialize
	sql.Initialize
	formPosList = Main.GetFormPos
	
	iconFont = fx.LoadFont(File.DirAssets, "materialdesignicons-webfont.ttf", 30)
	
	ncForm.Initialize("ncForm", -1, -1)
	ncForm.RootPane.LoadLayout("newclub") 
	ncForm.Stylesheets.Add(File.GetUri(File.DirAssets, "scoremanager.css"))
	ncForm.BackColor = fx.Colors.Transparent
	ncForm.WindowHeight = 300
	ncForm.WindowWidth = 300
	
	ncForm.Resizable = False
	ncForm.Icon =  clsFunc.GetAppIcon
	ncForm.SetFormStyle("TRANSPARENT")
	
	clsForm.Initialize(ncForm)
	
	lblExit.Font = iconFont
	lblExit.Text = Chr(0xf5fd)
	ncForm.WindowLeft = formPosList.Get(0)
	ncForm.WindowTop = formPosList.Get(1)
	
	
	ncForm.Show
	
End Sub

Sub lblExit_MouseReleased (EventData As MouseEvent)
	ncForm.Close
	Main.ShowForm
End Sub

Sub btnSaveClub_MouseReleased (EventData As MouseEvent)
	Dim msg As String
	If CheckPin = False Then
		Return
	End If
	
	If sql.ClubExists(edtNameClub.Text) Then
		cutils.ShowNotification3(cmVars.appName, "Naam vereniging bestaat reeds", cutils.ICON_INFORMATION, _
		ncForm, "BOTTOM_CENTER", 2000)
		Return
	End If
	
	msg = $"Bewaar de pincode op een veilige plaats.${CRLF}Zonder deze code is de verenigings data onbruikbaar${CRLF}Ook wij kunnen de data NIET terug halen!!"$
	If fx.Msgbox2(ncForm, msg, cmVars.appName, "Oke", "", "Terug", _
	fx.MSGBOX_WARNING) = fx.DialogResponse.NEGATIVE Then
		Return
	End If
	
	cmVars.pincode = edtPincode.Text
	sql.CreateClub(edtNameClub.Text)
	Main.GetClubs
	ncForm.Close
	Main.ShowForm
	
End Sub

Private Sub CheckPin As Boolean
	If edtNameClub.Text = "" Then
		cutils.ShowNotification3(cmVars.appName, "Naam vereniging mag niet leeg zijn", cutils.ICON_INFORMATION, _
		ncForm, "BOTTOM_CENTER", 2000)
		Return True
	End If
	
	If edtPincode.Text = "" Or edtPincode1.Text = "" Then
		cutils.ShowNotification3(cmVars.appName, "Pincode mag niet leeg zijn", cutils.ICON_INFORMATION, _
		ncForm, "BOTTOM_CENTER", 2000)
		Return False
	End If
	
	If edtPincode.Text <> edtPincode1.Text Then
		cutils.ShowNotification3(cmVars.appName, "Pincodes zijn niet gelijk", cutils.ICON_WARNING, _
		ncForm, "BOTTOM_CENTER", 2000)
		Return False
	End If
	
	Return True
	
End Sub

Sub edtNameClub_Action
'	If CheckClubName Then
'		ClubExistsMsg
'	End If
End Sub

Sub edtNameClub_FocusChanged (HasFocus As Boolean)
'	If HasFocus Then Return
'	If CheckClubName Then
'		If fx.Msgbox2(ncForm, "Verenigings naam bestaat reeds", "", "Oke", "", "", _
'				fx.MSGBOX_INFORMATION) = fx.DialogResponse.POSITIVE Then
'		End If
'		edtNameClub.RequestFocus
'	End If
End Sub

Sub SetWinPos(left As Double, top As Double)
	ncForm.WindowLeft = left
	ncForm.WindowTop = top
End Sub

Sub ncForm_MousePressed (EventData As MouseEvent)
'	clsForm.MainForm_MousePressed (EventData)
End Sub

Sub ncForm_MouseDragged (EventData As MouseEvent)
'	clsForm.MainForm_MouseDragged (EventData)
End Sub