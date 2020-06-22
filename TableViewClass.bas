B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.31
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private cForm As Form
	Private table As TableView
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(form As Form, tb As TableView)
	cForm = form
	table = tb
End Sub

Sub GetLabel(RowIndex As Int, CellIndex As Int) As Label
	Dim row() As Object = table.Items.Get(RowIndex)
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
	Dim jo As JavaObject = table
	Dim Column As JavaObject = jo.RunMethodJO("getColumns", Null).RunMethod("get", Array(Index))
	Column.RunMethod("setStyle", Array(Style))
End Sub