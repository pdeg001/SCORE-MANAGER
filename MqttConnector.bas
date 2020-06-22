﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.801
@EndOfDesignText@
Sub Class_Globals
	Private client As MqttClient
	Public connected As Boolean
	Private serializator As B4XSerializator
	Private host As String = "pdeg3005.mynetgear.com"
	Private const port As Int = 1883
	Private pubName, pubHost, pubTable As String
End Sub

Public Sub Initialize
End Sub

Public Sub SetSub
	pubName = $"${cmVars.mqttName}${cmVars.mqttbase}${cmVars.mqttTable}"$
End Sub

Public Sub Connect ()
	If client.Connected Then client.Close
	
	client.Initialize("client", $"tcp://${host}:${port}"$, "x" & Rnd(1, 10000000))
	Dim mo As MqttConnectOptions
	mo.Initialize("", "")
	'this message will be sent if the client is disconnected unexpectedly.
	mo.SetLastWill("pubname", serializator.ConvertObjectToBytes("x"), 0, False)
'	Log($"lastwill ${Starter.subDisconnectString}"$)
	client.Connect2(mo)
End Sub

Private Sub client_Connected (Success As Boolean)
		If pubName = "" Then
			Return
		End If
	Try

		If Success Then
			connected = True
			client.Subscribe(pubName, 0)
		Else
			ProcessConnectError
		End If
	Catch
		Log($"Error caught : " ${LastException}"$)
		ProcessConnectError
	End Try
End Sub

Public Sub Disconnect
	connected = False
	If client.connected Then
'		client.Unsubscribe(Starter.SubString)
		client.Close
	End If
End Sub

Private Sub client_MessageArrived (Topic As Object, Payload() As Byte)
'	Try
	Dim passedTopic As String =$"${Topic}"$
	Dim receivedObject As Object = serializator.ConvertBytesToObject(Payload)
	'Dim m As Message = receivedObject
	'Dim m As pubBordData = receivedObject
	Dim m As Message = receivedObject
	Dim strFrom As String = $"${m.From}"$
	Log(m.Body)
Log(Topic)
	If strFrom.IndexOf("recvdied") > -1 Then
	'	CallSubDelayed(ServerBoard, "BordDied")
		Return
	End If
	
	If m.Body = "data please" Then Return
	
	If m.From.IndexOf("game-ended") > -1 Then
	'	CallSub(ServerBoard, "GamedEnded")
		Return
	End If
	
	If passedTopic.IndexOf("recvdata") > -1 Then
	'	ServerBoard.lastMessageTime = DateTime.Now
''		CallSubDelayed(ServerBoard, "GamedInProgress")
	'	CallSub2(ServerBoard, "UpdateBordWhenClient", m)
	End If
	
	If passedTopic.IndexOf("pubbord") > -1 Then
	'	Log($"Bord Exists $Time{DateTime.Now}"$)
	'	CallSub2(Main, "CheckBordExists", m)
	End If
'	Catch
'		Log("-")
'	End Try
End Sub

Public Sub SendMessage(Body As String)
	If connected Then
		'client.Publish2(Starter.SubString, CreateMessage(Body), 0, False)
	End If
End Sub

Private Sub CreateMessage(Body As String) As Byte()
	Dim m As Message
	m.Initialize
	m.Body = Body
	m.From = "x"
	Return serializator.ConvertObjectToBytes(m)
End Sub

Sub GetClientConnected As Boolean
	Return client.Connected
End Sub

Sub ProcessConnectError
'	If Starter.SubString.IndexOf("pubbord") > -1 Then
'		CallSub(Main, "ConnectionError")
'	End If
End Sub

