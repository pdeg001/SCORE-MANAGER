package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sqlite extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.sqlite", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.sqlite.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.SQL _sql = null;
public anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
public String _qry = "";
public b4j.example.funcclass _clsfunc = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.players _players = null;
public String  _initialize(b4j.example.sqlite __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="clsFunc.Initialize";
__ref._clsfunc /*b4j.example.funcclass*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getplayerlist(b4j.example.sqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "getplayerlist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getplayerlist", null));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub GetPlayerList As List";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="InitSql";
__ref._initsql /*String*/ (null);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="qry = \"SELECT player_id, player, moyenne, to_make";
__ref._qry /*String*/  = "SELECT player_id, player, moyenne, to_make FROM player ORDER BY LOWER(player) ASC";
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="rs = sql.ExecQuery(qry)";
__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/  = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(__ref._qry /*String*/ );
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Return CreatePlayerDataList";
if (true) return __ref._createplayerdatalist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return null;
}
public String  _setplayerdata(b4j.example.sqlite __ref,String _player_id,String _player,double _moyenne,String _to_make) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "setplayerdata", false))
	 {return ((String) Debug.delegate(ba, "setplayerdata", new Object[] {_player_id,_player,_moyenne,_to_make}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub SetPlayerData(player_id As String, player As S";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="InitSql";
__ref._initsql /*String*/ (null);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If player_id <> 0 Then";
if ((_player_id).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="qry = \"UPDATE player set player = ?, moyenne = ?";
__ref._qry /*String*/  = "UPDATE player set player = ?, moyenne = ?, to_make = ? WHERE player_id = ?";
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(player, m";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(__ref._qry /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_player,BA.NumberToString(_moyenne*1000),_to_make,_player_id}));
 }else {
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="qry = \"INSERT INTO player (player, moyenne, to_m";
__ref._qry /*String*/  = "INSERT INTO player (player, moyenne, to_make) VALUES (?,?,?)";
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="sql.ExecNonQuery2(qry, Array As String(player, m";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(__ref._qry /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_player,BA.NumberToString(_moyenne*1000),_to_make}));
 };
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="End Sub";
return "";
}
public String  _getlastid(b4j.example.sqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "getlastid", false))
	 {return ((String) Debug.delegate(ba, "getlastid", null));}
String _lastid = "";
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub GetLastId as String";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim lastId As String";
_lastid = "";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="InitSql";
__ref._initsql /*String*/ (null);
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="qry = \"Select last_insert_rowid() AS lastid\"";
__ref._qry /*String*/  = "Select last_insert_rowid() AS lastid";
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="rs = sql.ExecQuery(qry)";
__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/  = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(__ref._qry /*String*/ );
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Do While rs.NextRow";
while (__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .NextRow()) {
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="lastId = rs.GetString(\"lastid\")";
_lastid = __ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString("lastid");
 }
;
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="rs.Close";
__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .Close();
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Return lastId";
if (true) return _lastid;
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getplayerdata(b4j.example.sqlite __ref,String _player_id) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "getplayerdata", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getplayerdata", new Object[] {_player_id}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub GetPlayerData(player_id As String) As List";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="InitSql";
__ref._initsql /*String*/ (null);
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="qry = \"SELECT * FROM player WHERE player_id = ?\"";
__ref._qry /*String*/  = "SELECT * FROM player WHERE player_id = ?";
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="rs = sql.ExecQuery2(qry, Array As String(player_i";
__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/  = __ref._sql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(__ref._qry /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_player_id}));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Return CreatePlayerDataList";
if (true) return __ref._createplayerdatalist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.sqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Private sql As SQL";
_sql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Private rs As ResultSet";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Private qry As String";
_qry = "";
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Private clsFunc As FuncClass";
_clsfunc = new b4j.example.funcclass();
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createplayerdatalist(b4j.example.sqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "createplayerdatalist", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createplayerdatalist", null));}
anywheresoftware.b4a.objects.collections.List _lstplayer = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub CreatePlayerDataList As List";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim lstPlayer As List";
_lstplayer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="lstPlayer.Initialize";
_lstplayer.Initialize();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Do While rs.NextRow";
while (__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .NextRow()) {
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="lstPlayer.Add(clsFunc.CreateplayerCurs( rs.GetSt";
_lstplayer.Add((Object)(__ref._clsfunc /*b4j.example.funcclass*/ ._createplayercurs /*b4j.example.main._playercurs*/ (null,(int)(Double.parseDouble(__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString("player_id"))),__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetString("player"),(long) (__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetInt("moyenne")),__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .GetInt("to_make"))));
 }
;
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="rs.Close";
__ref._rs /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ .Close();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Return lstPlayer";
if (true) return _lstplayer;
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="End Sub";
return null;
}
public String  _initsql(b4j.example.sqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sqlite";
if (Debug.shouldDelegate(ba, "initsql", false))
	 {return ((String) Debug.delegate(ba, "initsql", null));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Private Sub InitSql";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If sql.IsInitialized = False Then";
if (__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="sql.InitializeSQLite(File.DirApp, \"managerdb.db\"";
__ref._sql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__c.File.getDirApp(),"managerdb.db",__c.False);
 };
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="End Sub";
return "";
}
}