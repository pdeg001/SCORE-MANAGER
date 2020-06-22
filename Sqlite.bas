B4J=true
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
	qry = "SELECT player_id, firstname, lastname, moyenne, to_make FROM player where club_id = ?"
	rs = sql.ExecQuery2(qry, Array As String(cmVars.clubId))

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
		lstPlayer.Add(clsFunc.CreateplayerCurs(rs.GetString("player_id"), rs.GetString("firstname"), rs.GetString("lastname"), rs.GetInt("moyenne"), rs.GetInt("to_make")))
	Loop
	rs.Close
	lstPlayer.SortType("lastname", True)
	Return lstPlayer
End Sub

Sub SetPlayerData(player_id As String, name As String, lastname As String, moyenne As Double, to_make As String)
	InitSql
	If player_id <> "0" Then
		qry = "UPDATE player set firstname = ?, lastname = ?, moyenne = ?, to_make = ? WHERE player_id = ?"
		sql.ExecNonQuery2(qry, Array As String(name, lastname, moyenne*1000, to_make, player_id))
	Else
		'Log(clsFunc.CreateGuid)
		'Sleep(1)
		qry = "INSERT INTO player (player_id, club_id, firstname, lastname, moyenne, to_make) VALUES (?,?,?,?,?,?)"
		sql.ExecNonQuery2(qry, Array As String(clsFunc.CreateGuid, cmVars.clubId, name, lastname, moyenne*1000, to_make))
	End If
End Sub

Sub GetLastId As String
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

Sub GetClubList As List
	Dim lst As List
	InitSql
	qry = "select * from club order by name asc"
	rs = sql.ExecQuery(qry)
	lst.Initialize
	Do While rs.NextRow
		lst.Add(rs.GetString("name"))
	Loop
	
	rs.Close
	Return lst
End Sub

Sub ValidateClub(name As String) As Boolean
	Dim loc As String
	InitSql
	qry = "select location from club where name = ?"
	rs = sql.ExecQuery2(qry, Array As String(name))
	
	
	Do While rs.NextRow
		loc = rs.GetString("location")
		
		If clsFunc.DecryptString(loc) = name Then
			rs.Close
			Return True
		End If
	Loop
	
	Return False	
End Sub

Sub GetClubId(name As String)
	Dim rowCount As Int
	InitSql
	qry = "select club_id, count(*) as count from club where name = ?"
	rs = sql.ExecQuery2(qry, Array As String(name))
	rowCount = rs.GetInt("count")
	
	If rowCount = 0 Then
		
	End If
	
	If rowCount > 1 Then
		
	End If
	
	
	Do While rs.NextRow
		cmVars.clubId = rs.GetString("club_id")
	Loop
	rs.Close
End Sub

Sub CreateClub(name As String) As Boolean
	If ClubExists(name) Then
		rs.Close
		Return True
	End If
	
	InitSql
	qry = "insert into club (club_id, name, location) values (?,?,?)"
	sql.ExecNonQuery2(qry, Array As String(clsFunc.CreateGuid, name, clsFunc.EncryptString(name)))
	rs.Close
	Return True
End Sub

Sub ClubExists(name As String) As Boolean
	InitSql
	qry = "select count(*) as found from club where lower(name) = ?"
	rs = sql.ExecQuery2(qry, Array As String(name.ToLowerCase))
	
	Do While rs.NextRow
		If rs.GetInt("found") > 0 Then
			rs.Close
			Return True
		End If
	Loop
	rs.Close
	Return False
End Sub

Sub CheckPlayerExists(name As String) As Boolean
	Dim str As String
	str = clsFunc.DecryptString(name)
	LogDebug(str)
	InitSql
	qry = "select player as count from player where player = ? and club_id = ?"
	LogDebug(clsFunc.EncryptString(name))
	rs = sql.ExecQuery2(qry, Array As String(name, cmVars.clubId))
	
	Do While rs.NextRow
		If clsFunc.DecryptString(rs.GetString("player")) = name Then
			Return True
		End If
	Loop
	Return False
End Sub

Sub GetClubInfo As String
	Dim info, day, month, year As String
	Dim dateNow As Long = DateTime.Now
	
	day = $"${clsFunc.padString(DateTime.GetDayOfMonth(dateNow),"0", 0, 2)}"$
	month = $"${clsFunc.padString(DateTime.GetMonth(dateNow),"0", 0, 2)}"$
	year = DateTime.GetYear(dateNow)
	InitSql
	qry = "Select name from club where club_id = ?"
	rs = sql.ExecQuery2(qry, Array As String(cmVars.clubId))
	
	Do While rs.NextRow
		info = $"${rs.GetString("name")} ${day}-${month}-${year}"$
	Loop
	Return info
End Sub