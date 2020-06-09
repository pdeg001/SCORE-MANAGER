﻿B4J=true
Group=Sql
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
Sub Class_Globals
	Private sql As SQL
	Private rs As ResultSet
	Private qry As String
	Private clsFunc As FuncClass
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	clsFunc.Initialize
End Sub

Private Sub InitSql
	If sql.IsInitialized = False Then
		sql.InitializeSQLite(File.DirApp, "managerdb.db", False)
	End If
End Sub

Sub GetPlayerList As List
	InitSql
	qry = "SELECT player_id, player, moyenne, to_make FROM player ORDER BY LOWER(player) ASC"
	rs = sql.ExecQuery(qry)

	Return CreatePlayerDataList
End Sub

Sub GetPlayerData(player_id As String) As List
	InitSql
	qry = "SELECT * FROM player WHERE player_id = ?"
	rs = sql.ExecQuery2(qry, Array As String(player_id))

	Return CreatePlayerDataList
End Sub

Private Sub CreatePlayerDataList As List
	Dim lstPlayer As List
	lstPlayer.Initialize
	Do While rs.NextRow
		lstPlayer.Add(clsFunc.CreateplayerCurs( rs.GetString("player_id"), rs.GetString("player"), rs.GetInt("moyenne"), rs.GetInt("to_make")))
	Loop
	rs.Close
	Return lstPlayer
End Sub

Sub SetPlayerData(player_id As String, player As String, moyenne As Double, to_make As String)
	InitSql
	If player_id <> 0 Then
		qry = "UPDATE player set player = ?, moyenne = ?, to_make = ? WHERE player_id = ?"
		sql.ExecNonQuery2(qry, Array As String(player, moyenne*1000, to_make, player_id))
	Else
		qry = "INSERT INTO player (player, moyenne, to_make) VALUES (?,?,?)"
		sql.ExecNonQuery2(qry, Array As String(player, moyenne*1000, to_make))
	End If
End Sub

Sub GetLastId as String
	Dim lastId As String
	InitSql
	qry = "Select last_insert_rowid() AS lastid"
	rs = sql.ExecQuery(qry)
	Do While rs.NextRow
		lastId = rs.GetString("lastid")
	Loop
	rs.Close
	Return lastId
End Sub