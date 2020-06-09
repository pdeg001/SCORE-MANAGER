package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class players extends Object{
public static players mostCurrent = new players();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.players", null);
		ba.loadHtSubs(players.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.players", ba);
		}
	}
    public static Class<?> getObject() {
		return players.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.sqlite _sql = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _playerform = null;
public static b4j.example.b4xfloattextfield _fledtplayername = null;
public static b4j.example.customlistview _clvplayer = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnclose = null;
public static b4j.example.funcclass _clsfunc = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnplayer = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblname = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblmoyenne = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblmake = null;
public static b4j.example.b4xfloattextfield _fledtplayermoyenne = null;
public static b4j.example.b4xfloattextfield _fledtplayermake = null;
public static String _selectedplayerid = "";
public static String _selectedindex = "";
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtmake = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtmoyenne = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtname = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnsave = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnnew = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.main _main = null;
public static String  _initform() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "initform", false))
	 {return ((String) Debug.delegate(ba, "initform", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub InitForm";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="sql.Initialize";
_sql._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="clsFunc.Initialize";
_clsfunc._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="clsFunc.ConfigureForNumbers(True, False, edtMoyen";
_clsfunc._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,_edtmoyenne);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="PlayerForm.Initialize(Me, -1, -1)";
_playerform.Initialize(ba,BA.ObjectToString(players.getObject()),-1,-1);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="PlayerForm.RootPane.LoadLayout(\"playerlist\")";
_playerform.getRootPane().LoadLayout(ba,"playerlist");
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="PlayerForm.WindowHeight = 500";
_playerform.setWindowHeight(500);
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="PlayerForm.WindowWidth = 500";
_playerform.setWindowWidth(500);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="PlayerForm.Resizable = False";
_playerform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="PlayerForm.AlwaysOnTop = True";
_playerform.setAlwaysOnTop(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="GetPlayers";
_getplayers();
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="End Sub";
return "";
}
public static String  _showplayerform() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "showplayerform", false))
	 {return ((String) Debug.delegate(ba, "showplayerform", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub ShowPlayerForm";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Main.paneBlockInput.Visible  = True";
_main._paneblockinput /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Main.SetDisableCloseMain(True)";
_main._setdisableclosemain /*String*/ (anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="GetPlayers";
_getplayers();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="edtMake.Text = \"\"";
_edtmake.setText("");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="edtMoyenne.Text = \"\"";
_edtmoyenne.setText("");
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="edtName.Text = \"\"";
_edtname.setText("");
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="PlayerForm.Show";
_playerform.Show();
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "btnclose_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnclose_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub btnClose_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Main.paneBlockInput.Visible = False";
_main._paneblockinput /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Main.SetDisableCloseMain(False)";
_main._setdisableclosemain /*String*/ (anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Main.InitScollPanes";
_main._initscollpanes /*String*/ ();
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="PlayerForm.Close";
_playerform.Close();
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="End Sub";
return "";
}
public static String  _btnnew_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "btnnew_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnnew_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub btnNew_MouseReleased (EventData As MouseEvent)";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="selectedIndex = 0";
_selectedindex = BA.NumberToString(0);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="selectedPlayerId = 0";
_selectedplayerid = BA.NumberToString(0);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="edtMake.Text = \"0\"";
_edtmake.setText("0");
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="edtMoyenne.Text = \"0.000\"";
_edtmoyenne.setText("0.000");
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="edtName.Text = \"\"";
_edtname.setText("");
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="edtName.RequestFocus";
_edtname.RequestFocus();
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "btnsave_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnsave_mousereleased", new Object[] {_eventdata}));}
double _nmoyenne = 0;
anywheresoftware.b4a.objects.collections.List _lstplayer = null;
String _lastid = "";
b4j.example.main._playercurs _player = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnSave_MouseReleased (EventData As MouseEvent";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim nMoyenne As Double";
_nmoyenne = 0;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If ValidateInput = False Then";
if (_validateinput()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If fx.Msgbox2(PlayerForm, \"Naam van de speler ma";
if (_fx.Msgbox2(_playerform,"Naam van de speler mag niet leeg zijn","Score Manager","OKE","","",_fx.MSGBOX_WARNING)==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="nMoyenne = edtMoyenne.Text";
_nmoyenne = (double)(Double.parseDouble(_edtmoyenne.getText()));
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="sql.SetPlayerData(selectedPlayerId, edtName.Text,";
_sql._setplayerdata /*String*/ (null,_selectedplayerid,_edtname.getText(),_nmoyenne,_edtmake.getText());
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="If selectedPlayerId <> 0 Then";
if ((_selectedplayerid).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="UpdateClv";
_updateclv();
 }else {
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="Dim lstPlayer As List";
_lstplayer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="Dim lastId As String = sql.GetLastId";
_lastid = _sql._getlastid /*String*/ (null);
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="lstPlayer.Initialize";
_lstplayer.Initialize();
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="lstPlayer.Add(clsFunc.CreateplayerCurs(lastId, e";
_lstplayer.Add((Object)(_clsfunc._createplayercurs /*b4j.example.main._playercurs*/ (null,(int)(Double.parseDouble(_lastid)),_edtname.getText(),(long)(Double.parseDouble(_edtmoyenne.getText())),(int)(Double.parseDouble(_edtmake.getText())))));
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="For Each player As playerCurs In lstPlayer";
{
final anywheresoftware.b4a.BA.IterableList group16 = _lstplayer;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_player = (b4j.example.main._playercurs)(group16.Get(index16));
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
_clvplayer._add(_createclv(_player),(Object)(""));
 }
};
 };
RDebugUtils.currentLine=2162711;
 //BA.debugLineNum = 2162711;BA.debugLine="End Sub";
return "";
}
public static boolean  _validateinput() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "validateinput", false))
	 {return ((Boolean) Debug.delegate(ba, "validateinput", null));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub ValidateInput As Boolean";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If edtName.Text = \"\" Then";
if ((_edtname.getText()).equals("")) { 
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="End Sub";
return false;
}
public static String  _updateclv() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "updateclv", false))
	 {return ((String) Debug.delegate(ba, "updateclv", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _v = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub UpdateClv";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="p = clvPlayer.GetPanel(selectedIndex)";
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clvplayer._getpanel((int)(Double.parseDouble(_selectedindex))).getObject()));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="For Each v As Node In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group4.Get(index4)));
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="If v.Tag = \"name\" Then";
if ((_v.getTag()).equals((Object)("name"))) { 
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="lbl.Text = edtName.Text";
_lbl.setText(_edtname.getText());
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="If v.Tag = \"moyenne\" Then";
if ((_v.getTag()).equals((Object)("moyenne"))) { 
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="lbl.Text =clsFunc.GetFormatNumber(edtMoyenne.Te";
_lbl.setText(_clsfunc._getformatnumber /*String*/ (null,(float)(Double.parseDouble(_edtmoyenne.getText())),(int) (3),(int) (3)));
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="If v.Tag = \"tomake\" Then";
if ((_v.getTag()).equals((Object)("tomake"))) { 
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="lbl.Text = edtMake.Text";
_lbl.setText(_edtmake.getText());
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createclv(b4j.example.main._playercurs _player) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "createclv", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createclv", new Object[] {_player}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Private Sub CreateClv(player As playerCurs) As B4X";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 0, 45)";
_p.SetLayoutAnimated((int) (0),0,0,0,45);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="p.LoadLayout(\"clvPlayer\")";
_p.LoadLayout("clvPlayer",ba);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="lblName.Text = player.player";
_lblname.setText(_player.player /*String*/ );
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="lblMoyenne.Text = clsFunc.GetFormatNumber(player.";
_lblmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,_player.moyenne /*float*/ ,(int) (3),(int) (3)).replace(",","."));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="lblMake.Text = player.to_make";
_lblmake.setText(BA.NumberToString(_player.to_make /*int*/ ));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="p.Tag = player.player_id";
_p.setTag((Object)(_player.player_id /*int*/ ));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="CSSUtils.SetBackgroundColor(p, fx.Colors.Transpar";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_p.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Transparent)));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="End Sub";
return null;
}
public static String  _clvplayer_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "clvplayer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvplayer_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.collections.List _playerlist = null;
b4j.example.main._playercurs _playerdata = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub clvPlayer_ItemClick (Index As Int, Value As Ob";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim p As Pane = clvPlayer.GetPanel(Index)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clvplayer._getpanel(_index).getObject()));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="clsFunc.SetClvSelectedColor(clvPlayer, Index)";
_clsfunc._setclvselectedcolor /*String*/ (null,_clvplayer,_index);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="selectedPlayerId = p.Tag";
_selectedplayerid = BA.ObjectToString(_p.getTag());
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="selectedIndex = Index";
_selectedindex = BA.NumberToString(_index);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Dim playerList As List = sql.GetPlayerData(select";
_playerlist = new anywheresoftware.b4a.objects.collections.List();
_playerlist = _sql._getplayerdata /*anywheresoftware.b4a.objects.collections.List*/ (null,_selectedplayerid);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim playerdata As playerCurs = playerList.Get(0)";
_playerdata = (b4j.example.main._playercurs)(_playerlist.Get((int) (0)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="edtName.Text = playerdata.player";
_edtname.setText(_playerdata.player /*String*/ );
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(playerd";
_edtmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,(float) (_playerdata.moyenne /*float*/ /(double)1000),(int) (3),(int) (3)));
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="edtMake.Text = playerdata.to_make";
_edtmake.setText(BA.NumberToString(_playerdata.to_make /*int*/ ));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="edtName.RequestFocus";
_edtname.RequestFocus();
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="edtName.SetSelection(edtName.Text.Length,edtName.";
_edtname.SetSelection(_edtname.getText().length(),_edtname.getText().length());
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="End Sub";
return "";
}
public static String  _edtmake_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmake_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edtmake_textchanged", new Object[] {_old,_new}));}
boolean _update = false;
String _text = "";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub edtMake_TextChanged(Old As String, New As Stri";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Try";
try {RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim text As String = Regex.Replace(\"\\D\",New,\"\")";
_text = anywheresoftware.b4a.keywords.Common.Regex.Replace("\\D",_new,"");
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="If New <> text Then";
if ((_new).equals(_text) == false) { 
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="update = True";
_update = anywheresoftware.b4a.keywords.Common.True;
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="If text.Length > 15 Then   ' 15 is the max length";
if (_text.length()>15) { 
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="text = text.SubString2(0,15)";
_text = _text.substring((int) (0),(int) (15));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="update = True";
_update = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="edtMake.Text = text";
_edtmake.setText(_text);
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="edtMake.SetSelection(text.Length,text.Length)";
_edtmake.SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="End Sub";
return "";
}
public static String  _edtmoyenne_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmoyenne_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "edtmoyenne_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub edtMoyenne_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(edtMoye";
_edtmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,(float)(Double.parseDouble(_edtmoyenne.getText())),(int) (3),(int) (3)));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public static String  _edtmoyenne_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmoyenne_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edtmoyenne_textchanged", new Object[] {_old,_new}));}
String _strmoy = "";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub edtMoyenne_TextChanged (Old As String, New As";
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim strMoy As String = edtMoyenne.Text";
_strmoy = _edtmoyenne.getText();
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="edtMoyenne.Text = strMoy.Replace(\",\", \".\")";
_edtmoyenne.setText(_strmoy.replace(",","."));
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="edtMoyenne.SetSelection(edtMoyenne.Text.Length,ed";
_edtmoyenne.SetSelection(_edtmoyenne.getText().length(),_edtmoyenne.getText().length());
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="End Sub";
return "";
}
public static String  _getplayers() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "getplayers", false))
	 {return ((String) Debug.delegate(ba, "getplayers", null));}
anywheresoftware.b4a.objects.collections.List _lstplayers = null;
b4j.example.main._playercurs _player = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Private Sub GetPlayers";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
_lstplayers = new anywheresoftware.b4a.objects.collections.List();
_lstplayers = _sql._getplayerlist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="clvPlayer.Clear";
_clvplayer._clear();
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="If lstPlayers.Size <= 6 Then";
if (_lstplayers.getSize()<=6) { 
 };
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="For Each player As playerCurs In lstPlayers";
{
final anywheresoftware.b4a.BA.IterableList group5 = _lstplayers;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_player = (b4j.example.main._playercurs)(group5.Get(index5));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
_clvplayer._add(_createclv(_player),(Object)(""));
 }
};
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="End Sub";
return "";
}
public static String  _playerform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "playerform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "playerform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub PlayerForm_CloseRequest(EventData As Event)";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="clsFunc.SetDisableCloseForm(False)";
_clsfunc._setdisablecloseform /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public static String  _pnplayer_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "pnplayer_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "pnplayer_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub pnPlayer_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim p As Pane = Sender";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="LogDebug(p.Tag)";
anywheresoftware.b4a.keywords.Common.LogDebug(BA.ObjectToString(_p.getTag()));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
}