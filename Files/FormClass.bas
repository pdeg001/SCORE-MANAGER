B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.31
@EndOfDesignText@
Sub Class_Globals
	Private fx As JFX
	Private form As Form
	Private ox, oy As Double
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(pForm As Form)
	form = pForm
End Sub

Sub MainForm_MousePressed (EventData As MouseEvent)
	ox = EventData.X
	oy = EventData.Y
End Sub

Sub MainForm_MouseDragged (EventData As MouseEvent)
	Dim jo As JavaObject = EventData
	form.WindowLeft = jo.RunMethod("getScreenX", Null) - ox
	form.WindowTop = jo.RunMethod("getScreenY", Null) - oy
End Sub