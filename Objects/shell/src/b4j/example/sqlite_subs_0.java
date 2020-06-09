package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sqlite_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private sql As SQL";
sqlite._sql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_sql",sqlite._sql);
 //BA.debugLineNum = 3;BA.debugLine="Private rs As ResultSet";
sqlite._rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");__ref.setField("_rs",sqlite._rs);
 //BA.debugLineNum = 4;BA.debugLine="Private qry As String";
sqlite._qry = RemoteObject.createImmutable("");__ref.setField("_qry",sqlite._qry);
 //BA.debugLineNum = 5;BA.debugLine="Private clsFunc As FuncClass";
sqlite._clsfunc = RemoteObject.createNew ("b4j.example.funcclass");__ref.setField("_clsfunc",sqlite._clsfunc);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createplayerdatalist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreatePlayerDataList (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("createplayerdatalist")) { return __ref.runUserSub(false, "sqlite","createplayerdatalist", __ref);}
RemoteObject _lstplayer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 35;BA.debugLine="Private Sub CreatePlayerDataList As List";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Dim lstPlayer As List";
Debug.ShouldStop(8);
_lstplayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPlayer", _lstplayer);
 BA.debugLineNum = 37;BA.debugLine="lstPlayer.Initialize";
Debug.ShouldStop(16);
_lstplayer.runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(32);
while (__ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 39;BA.debugLine="lstPlayer.Add(clsFunc.CreateplayerCurs( rs.GetSt";
Debug.ShouldStop(64);
_lstplayer.runVoidMethod ("Add",(Object)((__ref.getField(false,"_clsfunc" /*RemoteObject*/ ).runClassMethod (b4j.example.funcclass.class, "_createplayercurs" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("player_id"))))),(Object)(__ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("player")))),(Object)(BA.numberCast(long.class, __ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("moyenne"))))),(Object)(__ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("to_make"))))))));
 }
;
 BA.debugLineNum = 41;BA.debugLine="rs.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_rs" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 42;BA.debugLine="Return lstPlayer";
Debug.ShouldStop(512);
if (true) return _lstplayer;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetLastId (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("getlastid")) { return __ref.runUserSub(false, "sqlite","getlastid", __ref);}
RemoteObject _lastid = RemoteObject.createImmutable("");
 BA.debugLineNum = 56;BA.debugLine="Sub GetLastId as String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim lastId As String";
Debug.ShouldStop(16777216);
_lastid = RemoteObject.createImmutable("");Debug.locals.put("lastId", _lastid);
 BA.debugLineNum = 58;BA.debugLine="InitSql";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.example.sqlite.class, "_initsql" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="qry = \"Select last_insert_rowid() AS lastid\"";
Debug.ShouldStop(67108864);
__ref.setField ("_qry" /*RemoteObject*/ ,BA.ObjectToString("Select last_insert_rowid() AS lastid"));
 BA.debugLineNum = 60;BA.debugLine="rs = sql.ExecQuery(qry)";
Debug.ShouldStop(134217728);
__ref.setField ("_rs" /*RemoteObject*/ ,__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(__ref.getField(true,"_qry" /*RemoteObject*/ ))));
 BA.debugLineNum = 61;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(268435456);
while (__ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 62;BA.debugLine="lastId = rs.GetString(\"lastid\")";
Debug.ShouldStop(536870912);
_lastid = __ref.getField(false,"_rs" /*RemoteObject*/ ).runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("lastid")));Debug.locals.put("lastId", _lastid);
 }
;
 BA.debugLineNum = 64;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_rs" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 65;BA.debugLine="Return lastId";
Debug.ShouldStop(1);
if (true) return _lastid;
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplayerdata(RemoteObject __ref,RemoteObject _player_id) throws Exception{
try {
		Debug.PushSubsStack("GetPlayerData (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("getplayerdata")) { return __ref.runUserSub(false, "sqlite","getplayerdata", __ref, _player_id);}
Debug.locals.put("player_id", _player_id);
 BA.debugLineNum = 27;BA.debugLine="Sub GetPlayerData(player_id As String) As List";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="InitSql";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.example.sqlite.class, "_initsql" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="qry = \"SELECT * FROM player WHERE player_id = ?\"";
Debug.ShouldStop(268435456);
__ref.setField ("_qry" /*RemoteObject*/ ,BA.ObjectToString("SELECT * FROM player WHERE player_id = ?"));
 BA.debugLineNum = 30;BA.debugLine="rs = sql.ExecQuery2(qry, Array As String(player_i";
Debug.ShouldStop(536870912);
__ref.setField ("_rs" /*RemoteObject*/ ,__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(__ref.getField(true,"_qry" /*RemoteObject*/ )),(Object)(sqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_player_id}))))));
 BA.debugLineNum = 32;BA.debugLine="Return CreatePlayerDataList";
Debug.ShouldStop(-2147483648);
if (true) return __ref.runClassMethod (b4j.example.sqlite.class, "_createplayerdatalist" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplayerlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetPlayerList (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("getplayerlist")) { return __ref.runUserSub(false, "sqlite","getplayerlist", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub GetPlayerList As List";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="InitSql";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.example.sqlite.class, "_initsql" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="qry = \"SELECT player_id, player, moyenne, to_make";
Debug.ShouldStop(1048576);
__ref.setField ("_qry" /*RemoteObject*/ ,BA.ObjectToString("SELECT player_id, player, moyenne, to_make FROM player ORDER BY LOWER(player) ASC"));
 BA.debugLineNum = 22;BA.debugLine="rs = sql.ExecQuery(qry)";
Debug.ShouldStop(2097152);
__ref.setField ("_rs" /*RemoteObject*/ ,__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(__ref.getField(true,"_qry" /*RemoteObject*/ ))));
 BA.debugLineNum = 24;BA.debugLine="Return CreatePlayerDataList";
Debug.ShouldStop(8388608);
if (true) return __ref.runClassMethod (b4j.example.sqlite.class, "_createplayerdatalist" /*RemoteObject*/ );
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sqlite","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="clsFunc.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_clsfunc" /*RemoteObject*/ ).runClassMethod (b4j.example.funcclass.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initsql(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitSql (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initsql")) { return __ref.runUserSub(false, "sqlite","initsql", __ref);}
 BA.debugLineNum = 13;BA.debugLine="Private Sub InitSql";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="If sql.IsInitialized = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sql" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),sqlite.__c.getField(true,"False"))) { 
 BA.debugLineNum = 15;BA.debugLine="sql.InitializeSQLite(File.DirApp, \"managerdb.db\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(sqlite.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(BA.ObjectToString("managerdb.db")),(Object)(sqlite.__c.getField(true,"False")));
 };
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplayerdata(RemoteObject __ref,RemoteObject _player_id,RemoteObject _player,RemoteObject _moyenne,RemoteObject _to_make) throws Exception{
try {
		Debug.PushSubsStack("SetPlayerData (sqlite) ","sqlite",2,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setplayerdata")) { return __ref.runUserSub(false, "sqlite","setplayerdata", __ref, _player_id, _player, _moyenne, _to_make);}
Debug.locals.put("player_id", _player_id);
Debug.locals.put("player", _player);
Debug.locals.put("moyenne", _moyenne);
Debug.locals.put("to_make", _to_make);
 BA.debugLineNum = 45;BA.debugLine="Sub SetPlayerData(player_id As String, player As S";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="InitSql";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.sqlite.class, "_initsql" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="If player_id <> 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_player_id,BA.NumberToString(0))) { 
 BA.debugLineNum = 48;BA.debugLine="qry = \"UPDATE player set player = ?, moyenne = ?";
Debug.ShouldStop(32768);
__ref.setField ("_qry" /*RemoteObject*/ ,BA.ObjectToString("UPDATE player set player = ?, moyenne = ?, to_make = ? WHERE player_id = ?"));
 BA.debugLineNum = 49;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(player, m";
Debug.ShouldStop(65536);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_qry" /*RemoteObject*/ )),(Object)(sqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {_player,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_moyenne,RemoteObject.createImmutable(1000)}, "*",0, 0)),_to_make,_player_id})))));
 }else {
 BA.debugLineNum = 51;BA.debugLine="qry = \"INSERT INTO player (player, moyenne, to_m";
Debug.ShouldStop(262144);
__ref.setField ("_qry" /*RemoteObject*/ ,BA.ObjectToString("INSERT INTO player (player, moyenne, to_make) VALUES (?,?,?)"));
 BA.debugLineNum = 52;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(player, m";
Debug.ShouldStop(524288);
__ref.getField(false,"_sql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(__ref.getField(true,"_qry" /*RemoteObject*/ )),(Object)(sqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {_player,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_moyenne,RemoteObject.createImmutable(1000)}, "*",0, 0)),_to_make})))));
 };
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}