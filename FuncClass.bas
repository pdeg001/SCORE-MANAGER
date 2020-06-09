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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	numFormat.Initialize
	'DefaultFormat = numFormat.GetDefaultFormat
End Sub

Public Sub CreateplayerCurs (player_id As Int, player As String, moyenne As Long, to_make As Int) As playerCurs
	Dim t1 As playerCurs
	t1.Initialize
	t1.player_id = player_id
	t1.player = player
	t1.moyenne = moyenne
	t1.to_make = to_make
	Return t1
End Sub

Public Sub GetFormatNumber(number As Float, minFractions As Int, maxFractions As Int) As String
	Return SetNumberFormat(number, minFractions, maxFractions)
End Sub

Private Sub SetNumberFormat(number As Float, minFractions As Int, maxFractions As Int) As String
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