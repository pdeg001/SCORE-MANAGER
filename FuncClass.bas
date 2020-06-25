B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private numFormat As B4XFormatter
	Private DefaultFormat As B4XFormatData
	Private disableCloseForm As Boolean
	Private RegexPattern As String 'ignore
	Private su As StringUtils
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	numFormat.Initialize
	'DefaultFormat = numFormat.GetDefaultFormat
End Sub

Public Sub CreateplayerCurs (player_id As String, firstname As String, lastname As String, address As String, postcode As String, city As String, email As String, telephone As String,active As Int) As playerCurs
	Dim t1 As playerCurs
	
	t1.Initialize
	t1.player_id = player_id
	t1.firstname = DecryptString(firstname)
	t1.lastname = DecryptString(lastname)
	t1.address = DecryptString(address)
	t1.postcode = DecryptString(postcode)
	t1.city = DecryptString(city)
	t1.email = DecryptString(email)
	t1.telephone = DecryptString(telephone)
	t1.active = active
	Return t1
End Sub

Public Sub GetFormatNumber(number As Float, minFractions As Int, maxFractions As Int) As String
	Return SetNumberFormat(number, minFractions, maxFractions)
End Sub

Private Sub SetNumberFormat(number As Float, minFractions As Int, maxFractions As Int) As String
	Return NumberFormat2(number,1, maxFractions, maxFractions, False)
	numFormat.GetDefaultFormat.FractionPaddingChar = "0"
	DefaultFormat.MinimumFractions = minFractions
	DefaultFormat.MaximumFractions = maxFractions
	Return numFormat.Format(number)
End Sub

Public Sub GetDecimalValueToIntValue(decimal As Float) As Int
	Return SetDecimalToInt(decimal)
End Sub

Private Sub SetDecimalToInt(decimal As Float) As Int
	Return decimal*1000
End Sub

Public Sub SetDisableCloseForm(disable As Boolean)
	disableCloseForm = disable
End Sub

Public Sub GetDisableCloseForm As Boolean
	Return disableCloseForm
End Sub

Public Sub SetClvSelectedColor(clv As CustomListView, index As Int)
	Dim p As Pane
	ResetClvSelectedColor(clv)
	p = clv.GetPanel(index)
	CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Colors.LightGray)
	
End Sub

Public Sub ResetClvSelectedColor(clv As CustomListView)
	Dim p As Pane
	
	For i = 0 To clv.Size -1
		p = clv.GetPanel(i)
		CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Colors.White)	
	Next
End Sub

Sub DisplayDouble(language As String, region As String, number As Double) As String 'ignore
	Dim jo As JavaObject
	jo = jo.InitializeNewInstance("java.util.Locale.Builder", Null)
	Dim locale As JavaObject = jo.RunMethodJO("setLanguage", Array As Object(language)).RunMethodJO("setRegion", Array As Object(region)).RunMethod("build", Null)
	Dim numberFormatter As JavaObject = jo.InitializeStatic("java.text.NumberFormat").RunMethod("getNumberInstance", Array As Object(locale))
	Dim retVal As String = numberFormatter.RunMethod("format", Array As Object(number))
	Return retVal
End Sub

Public Sub ConfigureForNumbers (AllowDecimals As Boolean, AllowNegative As Boolean, edtField As TextField) 'ignore
	#if B4A
	Dim et As EditText = edtField
	If AllowDecimals Or AllowNegative Then 
		et.InputType = et.INPUT_TYPE_DECIMAL_NUMBERS 
	Else 
		et.InputType = et.INPUT_TYPE_NUMBERS
	End If
	#else if B4I
	Dim tf As TextField = TextField1
	If AllowNegative Then
		tf.KeyboardType = tf.TYPE_NUMBERS_AND_PUNCTUATIONS
	Else If AllowDecimals  Then
		tf.KeyboardType = tf.TYPE_DECIMAL_PAD
	Else
		tf.KeyboardType = tf.TYPE_NUMBER_PAD
	End If
	#end if
	'https://stackoverflow.com/a/39399503/971547
	If AllowDecimals And AllowNegative Then
		RegexPattern = "^-?(0|[1-9]\d*)?(\.\d+)?(?<=\d)$"
	Else If AllowDecimals And AllowNegative = False Then
		RegexPattern = "^(0|[1-9]\d*)?(\.\d+)?(?<=\d)$"
	Else If AllowDecimals = False And AllowNegative = True Then
		RegexPattern = "^-?(0|[1-9]\d*)$"
	Else If AllowDecimals = False And AllowNegative = False Then
		RegexPattern = "^(0|[1-9]\d*)$"
	End If
	mAllowDecimals = AllowDecimals 'ignore
End Sub

Sub SetMoyenneFormat(moyenne As String) As String
	Dim strValue As String
	
	strValue = moyenne.Replace(",", ".")
	strValue = Regex.Replace("^-?\\d*(\\.\\d+)?$", strValue, "")
	Return Regex.Replace("d", strValue, "")
End Sub

Sub GetAppIcon As Image
	Return fx.LoadImage(File.DirApp, "images/bal.png")
End Sub

Sub EncryptString(Str As String) As String
	Dim c As B4XCipher
	Return su.EncodeBase64(c.Encrypt(Str.GetBytes("UTF8"), cmVars.pincode))
End Sub

Sub DecryptString(str As String) As String
	if str = null then Return ""
	Dim c As B4XCipher
	Dim baseStr() As Byte = su.DecodeBase64(str)
	
	Try
		Dim b() As Byte = c.Decrypt(baseStr, cmVars.pincode)
	Catch
		Return "err"
	End Try
	
	Return EncryptToString(b)
End Sub

Private Sub EncryptToString(b() As Byte) As String
	Return BytesToString(b, 0, b.Length, "UTF8")
End Sub

Public Sub StringToByte(str As String) As Byte()
	Return str.GetBytes("UTF8")
End Sub

Public Sub CreateGuid As String
	Dim r As Reflector
	r.Target = r.RunStaticMethod("java.util.UUID", "randomUUID", Null, Null)
	Return r.RunMethod("toString")
'	Dim stp As String = "00000000-0000-1000-a000-000000000000"
'	Dim sb As String = ""
' 
'	For Index = 0 To stp.Length-1
'		If stp.CharAt(Index)="0" Then
'			sb=sb & "0123456789ABCDEF".CharAt(Rnd(0, 16))
'		Else
'			sb=sb & stp.CharAt(Index)
'		End If
'	Next
'	Return sb.ToLowerCase
End Sub

Sub SetCLVScrollBars(clv As CustomListView, Visible As Boolean)
	Dim nsv As ScrollPane = clv.sv
	If Visible Then
		nsv.SetVScrollVisibility("ALWAYS")
	Else
		nsv.SetVScrollVisibility("NEVER")
	End If
	Dim jo As JavaObject = clv 'ignore
	jo.SetField("_scrollbarsvisible", Visible)
	clv.Base_Resize(clv.AsView.Width, clv.AsView.Height)
End Sub

Sub RotateNode(n As Node, Degree As Double)
	Dim jo As JavaObject = n
	jo.RunMethod("setRotate", Array(Degree))
End Sub

'padText e.g. "9", padChar e.g. "0", padSide 0=left 1=right, padCount e.g. 2
Public Sub padString(padText As String ,padChr As String, padSide As Int, padCount As Int) As String
	Dim padStr As String
	
	If padText.Length = padCount Then
		Return padText
	End If
	
	For i = 1 To padCount-padText.Length
		padStr = padStr&padChr
	Next
	
	If padSide = 0 Then
		Return padStr&padText
	Else
		Return padText&padStr
	End If
	
End Sub