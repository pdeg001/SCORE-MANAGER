package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class players_subs_0 {


public static RemoteObject  _btnclose_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnClose_MouseReleased (players) ","players",1,players.ba,players.mostCurrent,47);
if (RapidSub.canDelegate("btnclose_mousereleased")) { return b4j.example.players.remoteMe.runUserSub(false, "players","btnclose_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 47;BA.debugLine="Sub btnClose_MouseReleased (EventData As MouseEven";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Main.paneBlockInput.Visible = False";
Debug.ShouldStop(32768);
players._main._paneblockinput /*RemoteObject*/ .runMethod(true,"setVisible",players.__c.getField(true,"False"));
 BA.debugLineNum = 49;BA.debugLine="Main.SetDisableCloseMain(False)";
Debug.ShouldStop(65536);
players._main.runVoidMethod ("_setdisableclosemain" /*RemoteObject*/ ,(Object)(players.__c.getField(true,"False")));
 BA.debugLineNum = 50;BA.debugLine="Main.InitScollPanes";
Debug.ShouldStop(131072);
players._main.runVoidMethod ("_initscollpanes" /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="PlayerForm.Close";
Debug.ShouldStop(262144);
players._playerform.runVoidMethod ("Close");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnew_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnNew_MouseReleased (players) ","players",1,players.ba,players.mostCurrent,215);
if (RapidSub.canDelegate("btnnew_mousereleased")) { return b4j.example.players.remoteMe.runUserSub(false, "players","btnnew_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 215;BA.debugLine="Sub btnNew_MouseReleased (EventData As MouseEvent)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 216;BA.debugLine="selectedIndex = 0";
Debug.ShouldStop(8388608);
players._selectedindex = BA.NumberToString(0);
 BA.debugLineNum = 217;BA.debugLine="selectedPlayerId = 0";
Debug.ShouldStop(16777216);
players._selectedplayerid = BA.NumberToString(0);
 BA.debugLineNum = 218;BA.debugLine="edtMake.Text = \"0\"";
Debug.ShouldStop(33554432);
players._edtmake.runMethod(true,"setText",BA.ObjectToString("0"));
 BA.debugLineNum = 219;BA.debugLine="edtMoyenne.Text = \"0.000\"";
Debug.ShouldStop(67108864);
players._edtmoyenne.runMethod(true,"setText",BA.ObjectToString("0.000"));
 BA.debugLineNum = 220;BA.debugLine="edtName.Text = \"\"";
Debug.ShouldStop(134217728);
players._edtname.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 222;BA.debugLine="edtName.RequestFocus";
Debug.ShouldStop(536870912);
players._edtname.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnSave_MouseReleased (players) ","players",1,players.ba,players.mostCurrent,177);
if (RapidSub.canDelegate("btnsave_mousereleased")) { return b4j.example.players.remoteMe.runUserSub(false, "players","btnsave_mousereleased", _eventdata);}
RemoteObject _nmoyenne = RemoteObject.createImmutable(0);
RemoteObject _lstplayer = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lastid = RemoteObject.createImmutable("");
RemoteObject _player = RemoteObject.declareNull("b4j.example.main._playercurs");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 177;BA.debugLine="Sub btnSave_MouseReleased (EventData As MouseEvent";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Dim nMoyenne As Double";
Debug.ShouldStop(131072);
_nmoyenne = RemoteObject.createImmutable(0);Debug.locals.put("nMoyenne", _nmoyenne);
 BA.debugLineNum = 179;BA.debugLine="If ValidateInput = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_validateinput(),players.__c.getField(true,"False"))) { 
 BA.debugLineNum = 180;BA.debugLine="If fx.Msgbox2(PlayerForm, \"Naam van de speler ma";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",players._fx.runMethodAndSync(true,"Msgbox2",(Object)(players._playerform),(Object)(BA.ObjectToString("Naam van de speler mag niet leeg zijn")),(Object)(BA.ObjectToString("Score Manager")),(Object)(BA.ObjectToString("OKE")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(players._fx.getField(false,"MSGBOX_WARNING"))),players._fx.getField(false,"DialogResponse").getField(true,"POSITIVE"))) { 
 BA.debugLineNum = 182;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 186;BA.debugLine="nMoyenne = edtMoyenne.Text";
Debug.ShouldStop(33554432);
_nmoyenne = BA.numberCast(double.class, players._edtmoyenne.runMethod(true,"getText"));Debug.locals.put("nMoyenne", _nmoyenne);
 BA.debugLineNum = 188;BA.debugLine="sql.SetPlayerData(selectedPlayerId, edtName.Text,";
Debug.ShouldStop(134217728);
players._sql.runClassMethod (b4j.example.sqlite.class, "_setplayerdata" /*RemoteObject*/ ,(Object)(players._selectedplayerid),(Object)(players._edtname.runMethod(true,"getText")),(Object)(_nmoyenne),(Object)(players._edtmake.runMethod(true,"getText")));
 BA.debugLineNum = 189;BA.debugLine="If selectedPlayerId <> 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",players._selectedplayerid,BA.NumberToString(0))) { 
 BA.debugLineNum = 190;BA.debugLine="UpdateClv";
Debug.ShouldStop(536870912);
_updateclv();
 }else {
 BA.debugLineNum = 192;BA.debugLine="Dim lstPlayer As List";
Debug.ShouldStop(-2147483648);
_lstplayer = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPlayer", _lstplayer);
 BA.debugLineNum = 193;BA.debugLine="Dim lastId As String = sql.GetLastId";
Debug.ShouldStop(1);
_lastid = players._sql.runClassMethod (b4j.example.sqlite.class, "_getlastid" /*RemoteObject*/ );Debug.locals.put("lastId", _lastid);Debug.locals.put("lastId", _lastid);
 BA.debugLineNum = 194;BA.debugLine="lstPlayer.Initialize";
Debug.ShouldStop(2);
_lstplayer.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="lstPlayer.Add(clsFunc.CreateplayerCurs(lastId, e";
Debug.ShouldStop(4);
_lstplayer.runVoidMethod ("Add",(Object)((players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_createplayercurs" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _lastid)),(Object)(players._edtname.runMethod(true,"getText")),(Object)(BA.numberCast(long.class, players._edtmoyenne.runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, players._edtmake.runMethod(true,"getText")))))));
 BA.debugLineNum = 196;BA.debugLine="For Each player As playerCurs In lstPlayer";
Debug.ShouldStop(8);
{
final RemoteObject group16 = _lstplayer;
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_player = (group16.runMethod(false,"Get",index16));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 197;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
Debug.ShouldStop(16);
players._clvplayer.runVoidMethod ("_add",(Object)(_createclv(_player)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("player", _player);
;
 };
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clvplayer_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("clvPlayer_ItemClick (players) ","players",1,players.ba,players.mostCurrent,95);
if (RapidSub.canDelegate("clvplayer_itemclick")) { return b4j.example.players.remoteMe.runUserSub(false, "players","clvplayer_itemclick", _index, _value);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _playerlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _playerdata = RemoteObject.declareNull("b4j.example.main._playercurs");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 95;BA.debugLine="Sub clvPlayer_ItemClick (Index As Int, Value As Ob";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="Dim p As Pane = clvPlayer.GetPanel(Index)";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), players._clvplayer.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 98;BA.debugLine="clsFunc.SetClvSelectedColor(clvPlayer, Index)";
Debug.ShouldStop(2);
players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_setclvselectedcolor" /*RemoteObject*/ ,(Object)(players._clvplayer),(Object)(_index));
 BA.debugLineNum = 99;BA.debugLine="selectedPlayerId = p.Tag";
Debug.ShouldStop(4);
players._selectedplayerid = BA.ObjectToString(_p.runMethod(false,"getTag"));
 BA.debugLineNum = 100;BA.debugLine="selectedIndex = Index";
Debug.ShouldStop(8);
players._selectedindex = BA.NumberToString(_index);
 BA.debugLineNum = 101;BA.debugLine="Dim playerList As List = sql.GetPlayerData(select";
Debug.ShouldStop(16);
_playerlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_playerlist = players._sql.runClassMethod (b4j.example.sqlite.class, "_getplayerdata" /*RemoteObject*/ ,(Object)(players._selectedplayerid));Debug.locals.put("playerList", _playerlist);Debug.locals.put("playerList", _playerlist);
 BA.debugLineNum = 102;BA.debugLine="Dim playerdata As playerCurs = playerList.Get(0)";
Debug.ShouldStop(32);
_playerdata = (_playerlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("playerdata", _playerdata);Debug.locals.put("playerdata", _playerdata);
 BA.debugLineNum = 104;BA.debugLine="edtName.Text = playerdata.player";
Debug.ShouldStop(128);
players._edtname.runMethod(true,"setText",_playerdata.getField(true,"player" /*RemoteObject*/ ));
 BA.debugLineNum = 105;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(playerd";
Debug.ShouldStop(256);
players._edtmoyenne.runMethod(true,"setText",players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_playerdata.getField(true,"moyenne" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 106;BA.debugLine="edtMake.Text = playerdata.to_make";
Debug.ShouldStop(512);
players._edtmake.runMethod(true,"setText",BA.NumberToString(_playerdata.getField(true,"to_make" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="edtName.RequestFocus";
Debug.ShouldStop(1024);
players._edtname.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 108;BA.debugLine="edtName.SetSelection(edtName.Text.Length,edtName.";
Debug.ShouldStop(2048);
players._edtname.runVoidMethod ("SetSelection",(Object)(players._edtname.runMethod(true,"getText").runMethod(true,"length")),(Object)(players._edtname.runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createclv(RemoteObject _player) throws Exception{
try {
		Debug.PushSubsStack("CreateClv (players) ","players",1,players.ba,players.mostCurrent,77);
if (RapidSub.canDelegate("createclv")) { return b4j.example.players.remoteMe.runUserSub(false, "players","createclv", _player);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("player", _player);
 BA.debugLineNum = 77;BA.debugLine="Private Sub CreateClv(player As playerCurs) As B4X";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = players._xui.runMethod(false,"CreatePanel",players.ba,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 79;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 0, 45)";
Debug.ShouldStop(16384);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 45)));
 BA.debugLineNum = 80;BA.debugLine="p.LoadLayout(\"clvPlayer\")";
Debug.ShouldStop(32768);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("clvPlayer")),players.ba);
 BA.debugLineNum = 81;BA.debugLine="lblName.Text = player.player";
Debug.ShouldStop(65536);
players._lblname.runMethod(true,"setText",_player.getField(true,"player" /*RemoteObject*/ ));
 BA.debugLineNum = 82;BA.debugLine="lblMoyenne.Text = clsFunc.GetFormatNumber(player.";
Debug.ShouldStop(131072);
players._lblmoyenne.runMethod(true,"setText",players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_player.getField(true,"moyenne" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/",0, 0))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))).runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("."))));
 BA.debugLineNum = 83;BA.debugLine="lblMake.Text = player.to_make";
Debug.ShouldStop(262144);
players._lblmake.runMethod(true,"setText",BA.NumberToString(_player.getField(true,"to_make" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="p.Tag = player.player_id";
Debug.ShouldStop(524288);
_p.runMethod(false,"setTag",(_player.getField(true,"player_id" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="CSSUtils.SetBackgroundColor(p, fx.Colors.Transpar";
Debug.ShouldStop(1048576);
players._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _p.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), players._fx.getField(false,"Colors").getField(false,"Transparent")));
 BA.debugLineNum = 86;BA.debugLine="Return p";
Debug.ShouldStop(2097152);
if (true) return _p;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtmake_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edtMake_TextChanged (players) ","players",1,players.ba,players.mostCurrent,154);
if (RapidSub.canDelegate("edtmake_textchanged")) { return b4j.example.players.remoteMe.runUserSub(false, "players","edtmake_textchanged", _old, _new);}
RemoteObject _update = RemoteObject.createImmutable(false);
RemoteObject _text = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 154;BA.debugLine="Sub edtMake_TextChanged(Old As String, New As Stri";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Dim update As Boolean";
Debug.ShouldStop(67108864);
_update = RemoteObject.createImmutable(false);Debug.locals.put("update", _update);
 BA.debugLineNum = 157;BA.debugLine="Try";
Debug.ShouldStop(268435456);
try { BA.debugLineNum = 158;BA.debugLine="Dim text As String = Regex.Replace(\"\\D\",New,\"\")";
Debug.ShouldStop(536870912);
_text = players.__c.getField(false,"Regex").runMethod(true,"Replace",(Object)(BA.ObjectToString("\\D")),(Object)(_new),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 159;BA.debugLine="If New <> text Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",_new,_text)) { 
 BA.debugLineNum = 160;BA.debugLine="update = True";
Debug.ShouldStop(-2147483648);
_update = players.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",players.ba, e8.toString()); BA.debugLineNum = 163;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4);
players.__c.runVoidMethod ("Log",(Object)(players.__c.runMethod(false,"LastException",players.ba).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 166;BA.debugLine="If text.Length > 15 Then   ' 15 is the max length";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_text.runMethod(true,"length"),BA.numberCast(int.class, 15))) { 
 BA.debugLineNum = 167;BA.debugLine="text = text.SubString2(0,15)";
Debug.ShouldStop(64);
_text = _text.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 15)));Debug.locals.put("text", _text);
 BA.debugLineNum = 168;BA.debugLine="update = True";
Debug.ShouldStop(128);
_update = players.__c.getField(true,"True");Debug.locals.put("update", _update);
 };
 BA.debugLineNum = 171;BA.debugLine="If update Then";
Debug.ShouldStop(1024);
if (_update.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="edtMake.Text = text";
Debug.ShouldStop(2048);
players._edtmake.runMethod(true,"setText",_text);
 BA.debugLineNum = 173;BA.debugLine="edtMake.SetSelection(text.Length,text.Length)";
Debug.ShouldStop(4096);
players._edtmake.runVoidMethod ("SetSelection",(Object)(_text.runMethod(true,"length")),(Object)(_text.runMethod(true,"length")));
 };
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtmoyenne_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("edtMoyenne_FocusChanged (players) ","players",1,players.ba,players.mostCurrent,211);
if (RapidSub.canDelegate("edtmoyenne_focuschanged")) { return b4j.example.players.remoteMe.runUserSub(false, "players","edtmoyenne_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 211;BA.debugLine="Sub edtMoyenne_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(edtMoye";
Debug.ShouldStop(524288);
players._edtmoyenne.runMethod(true,"setText",players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, players._edtmoyenne.runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edtmoyenne_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("edtMoyenne_TextChanged (players) ","players",1,players.ba,players.mostCurrent,137);
if (RapidSub.canDelegate("edtmoyenne_textchanged")) { return b4j.example.players.remoteMe.runUserSub(false, "players","edtmoyenne_textchanged", _old, _new);}
RemoteObject _strmoy = RemoteObject.createImmutable("");
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 137;BA.debugLine="Sub edtMoyenne_TextChanged (Old As String, New As";
Debug.ShouldStop(256);
 BA.debugLineNum = 149;BA.debugLine="Dim strMoy As String = edtMoyenne.Text";
Debug.ShouldStop(1048576);
_strmoy = players._edtmoyenne.runMethod(true,"getText");Debug.locals.put("strMoy", _strmoy);Debug.locals.put("strMoy", _strmoy);
 BA.debugLineNum = 150;BA.debugLine="edtMoyenne.Text = strMoy.Replace(\",\", \".\")";
Debug.ShouldStop(2097152);
players._edtmoyenne.runMethod(true,"setText",_strmoy.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("."))));
 BA.debugLineNum = 151;BA.debugLine="edtMoyenne.SetSelection(edtMoyenne.Text.Length,ed";
Debug.ShouldStop(4194304);
players._edtmoyenne.runVoidMethod ("SetSelection",(Object)(players._edtmoyenne.runMethod(true,"getText").runMethod(true,"length")),(Object)(players._edtmoyenne.runMethod(true,"getText").runMethod(true,"length")));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getplayers() throws Exception{
try {
		Debug.PushSubsStack("GetPlayers (players) ","players",1,players.ba,players.mostCurrent,64);
if (RapidSub.canDelegate("getplayers")) { return b4j.example.players.remoteMe.runUserSub(false, "players","getplayers");}
RemoteObject _lstplayers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _player = RemoteObject.declareNull("b4j.example.main._playercurs");
 BA.debugLineNum = 64;BA.debugLine="Private Sub GetPlayers";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
Debug.ShouldStop(1);
_lstplayers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstplayers = players._sql.runClassMethod (b4j.example.sqlite.class, "_getplayerlist" /*RemoteObject*/ );Debug.locals.put("lstPlayers", _lstplayers);Debug.locals.put("lstPlayers", _lstplayers);
 BA.debugLineNum = 66;BA.debugLine="clvPlayer.Clear";
Debug.ShouldStop(2);
players._clvplayer.runVoidMethod ("_clear");
 BA.debugLineNum = 67;BA.debugLine="If lstPlayers.Size <= 6 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("k",_lstplayers.runMethod(true,"getSize"),BA.numberCast(int.class, 6))) { 
 };
 BA.debugLineNum = 71;BA.debugLine="For Each player As playerCurs In lstPlayers";
Debug.ShouldStop(64);
{
final RemoteObject group5 = _lstplayers;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_player = (group5.runMethod(false,"Get",index5));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 72;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
Debug.ShouldStop(128);
players._clvplayer.runVoidMethod ("_add",(Object)(_createclv(_player)),(Object)((RemoteObject.createImmutable(""))));
 }
}Debug.locals.put("player", _player);
;
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initform() throws Exception{
try {
		Debug.PushSubsStack("InitForm (players) ","players",1,players.ba,players.mostCurrent,25);
if (RapidSub.canDelegate("initform")) { return b4j.example.players.remoteMe.runUserSub(false, "players","initform");}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 25;BA.debugLine="Public Sub InitForm";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="sql.Initialize";
Debug.ShouldStop(33554432);
players._sql.runClassMethod (b4j.example.sqlite.class, "_initialize" /*RemoteObject*/ ,players.ba);
 BA.debugLineNum = 27;BA.debugLine="clsFunc.Initialize";
Debug.ShouldStop(67108864);
players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_initialize" /*RemoteObject*/ ,players.ba);
 BA.debugLineNum = 28;BA.debugLine="clsFunc.ConfigureForNumbers(True, False, edtMoyen";
Debug.ShouldStop(134217728);
players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_configurefornumbers" /*RemoteObject*/ ,(Object)(players.__c.getField(true,"True")),(Object)(players.__c.getField(true,"False")),(Object)(players._edtmoyenne));
 BA.debugLineNum = 30;BA.debugLine="PlayerForm.Initialize(Me, -1, -1)";
Debug.ShouldStop(536870912);
players._playerform.runVoidMethod ("Initialize",players.ba,(Object)(BA.ObjectToString(players.getObject())),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 31;BA.debugLine="PlayerForm.RootPane.LoadLayout(\"playerlist\")";
Debug.ShouldStop(1073741824);
players._playerform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",players.ba,(Object)(RemoteObject.createImmutable("playerlist")));
 BA.debugLineNum = 32;BA.debugLine="PlayerForm.WindowHeight = 500";
Debug.ShouldStop(-2147483648);
players._playerform.runMethod(true,"setWindowHeight",BA.numberCast(double.class, 500));
 BA.debugLineNum = 33;BA.debugLine="PlayerForm.WindowWidth = 500";
Debug.ShouldStop(1);
players._playerform.runMethod(true,"setWindowWidth",BA.numberCast(double.class, 500));
 BA.debugLineNum = 34;BA.debugLine="PlayerForm.Resizable = False";
Debug.ShouldStop(2);
players._playerform.runMethod(true,"setResizable",players.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="PlayerForm.AlwaysOnTop = True";
Debug.ShouldStop(4);
players._playerform.runMethod(true,"setAlwaysOnTop",players.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="SetScrollbarSize(clvPlayer.AsView, \"VERTICAL\", 20";
Debug.ShouldStop(8);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), players._clvplayer.runMethod(false,"_asview").getObject()),BA.ObjectToString("VERTICAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 37;BA.debugLine="Dim n As Node = clvPlayer.sv";
Debug.ShouldStop(16);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), players._clvplayer.getField(false,"_sv").getObject());Debug.locals.put("n", _n);
 BA.debugLineNum = 38;BA.debugLine="n.Id = \"clv1\"";
Debug.ShouldStop(32);
_n.runMethod(true,"setId",BA.ObjectToString("clv1"));
 BA.debugLineNum = 39;BA.debugLine="PlayerForm.Stylesheets.Add(File.GetUri(File.DirAs";
Debug.ShouldStop(64);
players._playerform.runMethod(false,"getStylesheets").runVoidMethod ("Add",(Object)((players.__c.getField(false,"File").runMethod(true,"GetUri",(Object)(players.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("scoremanager.css"))))));
 BA.debugLineNum = 40;BA.debugLine="GetPlayers";
Debug.ShouldStop(128);
_getplayers();
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _playerform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("PlayerForm_CloseRequest (players) ","players",1,players.ba,players.mostCurrent,43);
if (RapidSub.canDelegate("playerform_closerequest")) { return b4j.example.players.remoteMe.runUserSub(false, "players","playerform_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 43;BA.debugLine="Sub PlayerForm_CloseRequest(EventData As Event)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="clsFunc.SetDisableCloseForm(False)";
Debug.ShouldStop(2048);
players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_setdisablecloseform" /*RemoteObject*/ ,(Object)(players.__c.getField(true,"False")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnplayer_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("pnPlayer_MouseReleased (players) ","players",1,players.ba,players.mostCurrent,89);
if (RapidSub.canDelegate("pnplayer_mousereleased")) { return b4j.example.players.remoteMe.runUserSub(false, "players","pnplayer_mousereleased", _eventdata);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 89;BA.debugLine="Sub pnPlayer_MouseReleased (EventData As MouseEven";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim p As Pane = Sender";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), players.__c.runMethod(false,"Sender",players.ba));Debug.locals.put("p", _p);
 BA.debugLineNum = 92;BA.debugLine="LogDebug(p.Tag)";
Debug.ShouldStop(134217728);
players.__c.runVoidMethod ("LogDebug",(Object)(BA.ObjectToString(_p.runMethod(false,"getTag"))));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private sql As Sqlite";
players._sql = RemoteObject.createNew ("b4j.example.sqlite");
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
players._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private PlayerForm As Form";
players._playerform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private clvPlayer As CustomListView";
players._clvplayer = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 10;BA.debugLine="Private btnClose As Button";
players._btnclose = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private clsFunc As FuncClass";
players._clsfunc = RemoteObject.createNew ("b4j.example.funcclass");
 //BA.debugLineNum = 12;BA.debugLine="Private pnPlayer As Pane";
players._pnplayer = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblName As B4XView";
players._lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private lblMoyenne As B4XView";
players._lblmoyenne = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private xui As XUI";
players._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 16;BA.debugLine="Private lblMake As B4XView";
players._lblmake = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private selectedPlayerId, selectedIndex As String";
players._selectedplayerid = RemoteObject.createImmutable("");
players._selectedindex = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Private edtMake As TextField";
players._edtmake = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private edtMoyenne As TextField";
players._edtmoyenne = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private edtName As TextField";
players._edtname = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnSave As Button";
players._btnsave = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnNew As Button";
players._btnnew = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setscrollbarsize(RemoteObject _parent,RemoteObject _orientation,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("SetScrollbarSize (players) ","players",1,players.ba,players.mostCurrent,230);
if (RapidSub.canDelegate("setscrollbarsize")) { return b4j.example.players.remoteMe.runUserSub(false, "players","setscrollbarsize", _parent, _orientation, _size);}
RemoteObject _arr = null;
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _barorientation = RemoteObject.createImmutable("");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Orientation", _orientation);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 230;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
Debug.ShouldStop(128);
_arr = (_parent.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("lookupAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(".scroll-bar"))}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toArray")),(Object)((players.__c.getField(false,"Null")))));Debug.locals.put("Arr", _arr);Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 234;BA.debugLine="For Each N As Node In Arr";
Debug.ShouldStop(512);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group2 = _arr;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group2.getArrayElement(false,RemoteObject.createImmutable(index2)));
Debug.locals.put("N", _n);
 BA.debugLineNum = 237;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",players.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("com.sun.javafx.scene.control.skin.VirtualScrollBar")) || RemoteObject.solveBoolean("=",players.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("javafx.scene.control.ScrollBar"))) { 
 BA.debugLineNum = 238;BA.debugLine="Dim SB As JavaObject = N";
Debug.ShouldStop(8192);
_sb = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject());Debug.locals.put("SB", _sb);
 BA.debugLineNum = 241;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
Debug.ShouldStop(65536);
_barorientation = BA.ObjectToString(_sb.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getOrientation")),(Object)((players.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((players.__c.getField(false,"Null")))));Debug.locals.put("BarOrientation", _barorientation);Debug.locals.put("BarOrientation", _barorientation);
 BA.debugLineNum = 244;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("VERTICAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 245;BA.debugLine="N.PrefWidth = Size";
Debug.ShouldStop(1048576);
_n.runMethod(true,"setPrefWidth",_size);
 };
 BA.debugLineNum = 249;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("HORIZONTAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 250;BA.debugLine="N.PrefHeight = Size";
Debug.ShouldStop(33554432);
_n.runMethod(true,"setPrefHeight",_size);
 };
 };
 }
}Debug.locals.put("N", _n);
;
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showplayerform() throws Exception{
try {
		Debug.PushSubsStack("ShowPlayerForm (players) ","players",1,players.ba,players.mostCurrent,54);
if (RapidSub.canDelegate("showplayerform")) { return b4j.example.players.remoteMe.runUserSub(false, "players","showplayerform");}
 BA.debugLineNum = 54;BA.debugLine="Public Sub ShowPlayerForm";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Main.paneBlockInput.Visible  = True";
Debug.ShouldStop(4194304);
players._main._paneblockinput /*RemoteObject*/ .runMethod(true,"setVisible",players.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="Main.SetDisableCloseMain(True)";
Debug.ShouldStop(8388608);
players._main.runVoidMethod ("_setdisableclosemain" /*RemoteObject*/ ,(Object)(players.__c.getField(true,"True")));
 BA.debugLineNum = 57;BA.debugLine="GetPlayers";
Debug.ShouldStop(16777216);
_getplayers();
 BA.debugLineNum = 58;BA.debugLine="edtMake.Text = \"\"";
Debug.ShouldStop(33554432);
players._edtmake.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 59;BA.debugLine="edtMoyenne.Text = \"\"";
Debug.ShouldStop(67108864);
players._edtmoyenne.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 60;BA.debugLine="edtName.Text = \"\"";
Debug.ShouldStop(134217728);
players._edtname.runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 61;BA.debugLine="PlayerForm.Show";
Debug.ShouldStop(268435456);
players._playerform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateclv() throws Exception{
try {
		Debug.PushSubsStack("UpdateClv (players) ","players",1,players.ba,players.mostCurrent,113);
if (RapidSub.canDelegate("updateclv")) { return b4j.example.players.remoteMe.runUserSub(false, "players","updateclv");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
 BA.debugLineNum = 113;BA.debugLine="Sub UpdateClv";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim p As Pane";
Debug.ShouldStop(131072);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 115;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 116;BA.debugLine="p = clvPlayer.GetPanel(selectedIndex)";
Debug.ShouldStop(524288);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), players._clvplayer.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, players._selectedindex))).getObject());
 BA.debugLineNum = 117;BA.debugLine="For Each v As Node In p.GetAllViewsRecursive";
Debug.ShouldStop(1048576);
_v = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group4 = _p.runMethod(false,"GetAllViewsRecursive");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group4.runMethod(false,"Get",index4));
Debug.locals.put("v", _v);
 BA.debugLineNum = 118;BA.debugLine="If v.Tag = \"name\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("name")))) { 
 BA.debugLineNum = 119;BA.debugLine="lbl = v";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _v.getObject());
 BA.debugLineNum = 120;BA.debugLine="lbl.Text = edtName.Text";
Debug.ShouldStop(8388608);
_lbl.runMethod(true,"setText",players._edtname.runMethod(true,"getText"));
 BA.debugLineNum = 121;BA.debugLine="Continue";
Debug.ShouldStop(16777216);
if (true) continue;
 };
 BA.debugLineNum = 123;BA.debugLine="If v.Tag = \"moyenne\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("moyenne")))) { 
 BA.debugLineNum = 124;BA.debugLine="lbl = v";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _v.getObject());
 BA.debugLineNum = 125;BA.debugLine="lbl.Text =clsFunc.GetFormatNumber(edtMoyenne.Te";
Debug.ShouldStop(268435456);
_lbl.runMethod(true,"setText",players._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, players._edtmoyenne.runMethod(true,"getText"))),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 126;BA.debugLine="Continue";
Debug.ShouldStop(536870912);
if (true) continue;
 };
 BA.debugLineNum = 128;BA.debugLine="If v.Tag = \"tomake\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),RemoteObject.createImmutable(("tomake")))) { 
 BA.debugLineNum = 129;BA.debugLine="lbl = v";
Debug.ShouldStop(1);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), _v.getObject());
 BA.debugLineNum = 130;BA.debugLine="lbl.Text = edtMake.Text";
Debug.ShouldStop(2);
_lbl.runMethod(true,"setText",players._edtmake.runMethod(true,"getText"));
 BA.debugLineNum = 131;BA.debugLine="Continue";
Debug.ShouldStop(4);
if (true) continue;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validateinput() throws Exception{
try {
		Debug.PushSubsStack("ValidateInput (players) ","players",1,players.ba,players.mostCurrent,202);
if (RapidSub.canDelegate("validateinput")) { return b4j.example.players.remoteMe.runUserSub(false, "players","validateinput");}
 BA.debugLineNum = 202;BA.debugLine="Sub ValidateInput As Boolean";
Debug.ShouldStop(512);
 BA.debugLineNum = 203;BA.debugLine="If edtName.Text = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",players._edtname.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 204;BA.debugLine="Return False";
Debug.ShouldStop(2048);
if (true) return players.__c.getField(true,"False");
 };
 BA.debugLineNum = 206;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) return players.__c.getField(true,"True");
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}