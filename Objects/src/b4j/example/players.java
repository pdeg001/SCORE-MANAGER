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
public static b4j.example.customlistview _clvplayer = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnclose = null;
public static b4j.example.funcclass _clsfunc = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnplayer = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblname = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblmoyenne = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblmake = null;
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
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub InitForm";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="sql.Initialize";
_sql._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="clsFunc.Initialize";
_clsfunc._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="clsFunc.ConfigureForNumbers(True, False, edtMoyen";
_clsfunc._configurefornumbers /*String*/ (null,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False,_edtmoyenne);
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="PlayerForm.Initialize(Me, -1, -1)";
_playerform.Initialize(ba,BA.ObjectToString(players.getObject()),-1,-1);
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="PlayerForm.RootPane.LoadLayout(\"playerlist\")";
_playerform.getRootPane().LoadLayout(ba,"playerlist");
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="PlayerForm.WindowHeight = 500";
_playerform.setWindowHeight(500);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="PlayerForm.WindowWidth = 500";
_playerform.setWindowWidth(500);
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="PlayerForm.Resizable = False";
_playerform.setResizable(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="PlayerForm.AlwaysOnTop = True";
_playerform.setAlwaysOnTop(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="SetScrollbarSize(clvPlayer.AsView, \"VERTICAL\", 20";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_clvplayer._asview().getObject())),"VERTICAL",20);
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="Dim n As Node = clvPlayer.sv";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clvplayer._sv.getObject()));
RDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="n.Id = \"clv1\"";
_n.setId("clv1");
RDebugUtils.currentLine=1572878;
 //BA.debugLineNum = 1572878;BA.debugLine="PlayerForm.Stylesheets.Add(File.GetUri(File.DirAs";
_playerform.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"scoremanager.css")));
RDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="GetPlayers";
_getplayers();
RDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="End Sub";
return "";
}
public static String  _showplayerform() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "showplayerform", false))
	 {return ((String) Debug.delegate(ba, "showplayerform", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub ShowPlayerForm";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Main.paneBlockInput.Visible  = True";
_main._paneblockinput /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Main.SetDisableCloseMain(True)";
_main._setdisableclosemain /*String*/ (anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="GetPlayers";
_getplayers();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="edtMake.Text = \"\"";
_edtmake.setText("");
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="edtMoyenne.Text = \"\"";
_edtmoyenne.setText("");
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="edtName.Text = \"\"";
_edtname.setText("");
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="PlayerForm.Show";
_playerform.Show();
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="End Sub";
return "";
}
public static String  _btnclose_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "btnclose_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnclose_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub btnClose_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Main.paneBlockInput.Visible = False";
_main._paneblockinput /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Main.SetDisableCloseMain(False)";
_main._setdisableclosemain /*String*/ (anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Main.InitScollPanes";
_main._initscollpanes /*String*/ ();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="PlayerForm.Close";
_playerform.Close();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="End Sub";
return "";
}
public static String  _btnnew_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "btnnew_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnnew_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub btnNew_MouseReleased (EventData As MouseEvent)";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="selectedIndex = 0";
_selectedindex = BA.NumberToString(0);
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="selectedPlayerId = 0";
_selectedplayerid = BA.NumberToString(0);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="edtMake.Text = \"0\"";
_edtmake.setText("0");
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="edtMoyenne.Text = \"0.000\"";
_edtmoyenne.setText("0.000");
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="edtName.Text = \"\"";
_edtname.setText("");
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="edtName.RequestFocus";
_edtname.RequestFocus();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub btnSave_MouseReleased (EventData As MouseEvent";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim nMoyenne As Double";
_nmoyenne = 0;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If ValidateInput = False Then";
if (_validateinput()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="If fx.Msgbox2(PlayerForm, \"Naam van de speler ma";
if (_fx.Msgbox2(_playerform,"Naam van de speler mag niet leeg zijn","Score Manager","OKE","","",_fx.MSGBOX_WARNING)==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="nMoyenne = edtMoyenne.Text";
_nmoyenne = (double)(Double.parseDouble(_edtmoyenne.getText()));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="sql.SetPlayerData(selectedPlayerId, edtName.Text,";
_sql._setplayerdata /*String*/ (null,_selectedplayerid,_edtname.getText(),_nmoyenne,_edtmake.getText());
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="If selectedPlayerId <> 0 Then";
if ((_selectedplayerid).equals(BA.NumberToString(0)) == false) { 
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="UpdateClv";
_updateclv();
 }else {
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Dim lstPlayer As List";
_lstplayer = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Dim lastId As String = sql.GetLastId";
_lastid = _sql._getlastid /*String*/ (null);
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="lstPlayer.Initialize";
_lstplayer.Initialize();
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="lstPlayer.Add(clsFunc.CreateplayerCurs(lastId, e";
_lstplayer.Add((Object)(_clsfunc._createplayercurs /*b4j.example.main._playercurs*/ (null,(int)(Double.parseDouble(_lastid)),_edtname.getText(),(long)(Double.parseDouble(_edtmoyenne.getText())),(int)(Double.parseDouble(_edtmake.getText())))));
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="For Each player As playerCurs In lstPlayer";
{
final anywheresoftware.b4a.BA.IterableList group16 = _lstplayer;
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_player = (b4j.example.main._playercurs)(group16.Get(index16));
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
_clvplayer._add(_createclv(_player),(Object)(""));
 }
};
 };
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="End Sub";
return "";
}
public static boolean  _validateinput() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "validateinput", false))
	 {return ((Boolean) Debug.delegate(ba, "validateinput", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ValidateInput As Boolean";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If edtName.Text = \"\" Then";
if ((_edtname.getText()).equals("")) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="End Sub";
return false;
}
public static String  _updateclv() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "updateclv", false))
	 {return ((String) Debug.delegate(ba, "updateclv", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _v = null;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub UpdateClv";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="p = clvPlayer.GetPanel(selectedIndex)";
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clvplayer._getpanel((int)(Double.parseDouble(_selectedindex))).getObject()));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="For Each v As Node In p.GetAllViewsRecursive";
_v = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _p.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group4.Get(index4)));
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="If v.Tag = \"name\" Then";
if ((_v.getTag()).equals((Object)("name"))) { 
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="lbl.Text = edtName.Text";
_lbl.setText(_edtname.getText());
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="If v.Tag = \"moyenne\" Then";
if ((_v.getTag()).equals((Object)("moyenne"))) { 
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="lbl.Text =clsFunc.GetFormatNumber(edtMoyenne.Te";
_lbl.setText(_clsfunc._getformatnumber /*String*/ (null,(float)(Double.parseDouble(_edtmoyenne.getText())),(int) (3),(int) (3)));
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="If v.Tag = \"tomake\" Then";
if ((_v.getTag()).equals((Object)("tomake"))) { 
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="lbl = v";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_v.getObject()));
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="lbl.Text = edtMake.Text";
_lbl.setText(_edtmake.getText());
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createclv(b4j.example.main._playercurs _player) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "createclv", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createclv", new Object[] {_player}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub CreateClv(player As playerCurs) As B4X";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 0, 45)";
_p.SetLayoutAnimated((int) (0),0,0,0,45);
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="p.LoadLayout(\"clvPlayer\")";
_p.LoadLayout("clvPlayer",ba);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="lblName.Text = player.player";
_lblname.setText(_player.player /*String*/ );
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="lblMoyenne.Text = clsFunc.GetFormatNumber(player.";
_lblmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,(float) (_player.moyenne /*float*/ /(double)1000),(int) (3),(int) (3)).replace(",","."));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="lblMake.Text = player.to_make";
_lblmake.setText(BA.NumberToString(_player.to_make /*int*/ ));
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="p.Tag = player.player_id";
_p.setTag((Object)(_player.player_id /*int*/ ));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="CSSUtils.SetBackgroundColor(p, fx.Colors.Transpar";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_p.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Transparent)));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="End Sub";
return null;
}
public static String  _clvplayer_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "clvplayer_itemclick", false))
	 {return ((String) Debug.delegate(ba, "clvplayer_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.collections.List _playerlist = null;
b4j.example.main._playercurs _playerdata = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub clvPlayer_ItemClick (Index As Int, Value As Ob";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim p As Pane = clvPlayer.GetPanel(Index)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clvplayer._getpanel(_index).getObject()));
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="clsFunc.SetClvSelectedColor(clvPlayer, Index)";
_clsfunc._setclvselectedcolor /*String*/ (null,_clvplayer,_index);
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="selectedPlayerId = p.Tag";
_selectedplayerid = BA.ObjectToString(_p.getTag());
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="selectedIndex = Index";
_selectedindex = BA.NumberToString(_index);
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim playerList As List = sql.GetPlayerData(select";
_playerlist = new anywheresoftware.b4a.objects.collections.List();
_playerlist = _sql._getplayerdata /*anywheresoftware.b4a.objects.collections.List*/ (null,_selectedplayerid);
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Dim playerdata As playerCurs = playerList.Get(0)";
_playerdata = (b4j.example.main._playercurs)(_playerlist.Get((int) (0)));
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="edtName.Text = playerdata.player";
_edtname.setText(_playerdata.player /*String*/ );
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(playerd";
_edtmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,(float) (_playerdata.moyenne /*float*/ /(double)1000),(int) (3),(int) (3)));
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="edtMake.Text = playerdata.to_make";
_edtmake.setText(BA.NumberToString(_playerdata.to_make /*int*/ ));
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="edtName.RequestFocus";
_edtname.RequestFocus();
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="edtName.SetSelection(edtName.Text.Length,edtName.";
_edtname.SetSelection(_edtname.getText().length(),_edtname.getText().length());
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="End Sub";
return "";
}
public static String  _edtmake_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmake_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edtmake_textchanged", new Object[] {_old,_new}));}
boolean _update = false;
String _text = "";
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub edtMake_TextChanged(Old As String, New As Stri";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim update As Boolean";
_update = false;
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="Dim text As String = Regex.Replace(\"\\D\",New,\"\")";
_text = anywheresoftware.b4a.keywords.Common.Regex.Replace("\\D",_new,"");
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="If New <> text Then";
if ((_new).equals(_text) == false) { 
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="update = True";
_update = anywheresoftware.b4a.keywords.Common.True;
 };
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage());
 };
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="If text.Length > 15 Then   ' 15 is the max length";
if (_text.length()>15) { 
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="text = text.SubString2(0,15)";
_text = _text.substring((int) (0),(int) (15));
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="update = True";
_update = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=2228241;
 //BA.debugLineNum = 2228241;BA.debugLine="If update Then";
if (_update) { 
RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="edtMake.Text = text";
_edtmake.setText(_text);
RDebugUtils.currentLine=2228243;
 //BA.debugLineNum = 2228243;BA.debugLine="edtMake.SetSelection(text.Length,text.Length)";
_edtmake.SetSelection(_text.length(),_text.length());
 };
RDebugUtils.currentLine=2228245;
 //BA.debugLineNum = 2228245;BA.debugLine="End Sub";
return "";
}
public static String  _edtmoyenne_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmoyenne_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "edtmoyenne_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub edtMoyenne_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="edtMoyenne.Text = clsFunc.GetFormatNumber(edtMoye";
_edtmoyenne.setText(_clsfunc._getformatnumber /*String*/ (null,(float)(Double.parseDouble(_edtmoyenne.getText())),(int) (3),(int) (3)));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="End Sub";
return "";
}
public static String  _edtmoyenne_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "edtmoyenne_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edtmoyenne_textchanged", new Object[] {_old,_new}));}
String _strmoy = "";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub edtMoyenne_TextChanged (Old As String, New As";
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="Dim strMoy As String = edtMoyenne.Text";
_strmoy = _edtmoyenne.getText();
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="edtMoyenne.Text = strMoy.Replace(\",\", \".\")";
_edtmoyenne.setText(_strmoy.replace(",","."));
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="edtMoyenne.SetSelection(edtMoyenne.Text.Length,ed";
_edtmoyenne.SetSelection(_edtmoyenne.getText().length(),_edtmoyenne.getText().length());
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="End Sub";
return "";
}
public static String  _getplayers() throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "getplayers", false))
	 {return ((String) Debug.delegate(ba, "getplayers", null));}
anywheresoftware.b4a.objects.collections.List _lstplayers = null;
b4j.example.main._playercurs _player = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub GetPlayers";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
_lstplayers = new anywheresoftware.b4a.objects.collections.List();
_lstplayers = _sql._getplayerlist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="clvPlayer.Clear";
_clvplayer._clear();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="If lstPlayers.Size <= 6 Then";
if (_lstplayers.getSize()<=6) { 
 };
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="For Each player As playerCurs In lstPlayers";
{
final anywheresoftware.b4a.BA.IterableList group5 = _lstplayers;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_player = (b4j.example.main._playercurs)(group5.Get(index5));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="clvPlayer.Add(CreateClv(player), \"\")";
_clvplayer._add(_createclv(_player),(Object)(""));
 }
};
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="End Sub";
return "";
}
public static String  _setscrollbarsize(anywheresoftware.b4j.object.JavaObject _parent,String _orientation,double _size) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "setscrollbarsize", false))
	 {return ((String) Debug.delegate(ba, "setscrollbarsize", new Object[] {_parent,_orientation,_size}));}
Object[] _arr = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.object.JavaObject _sb = null;
String _barorientation = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
_arr = (Object[])(_parent.RunMethodJO("lookupAll",new Object[]{(Object)(".scroll-bar")}).RunMethod("toArray",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="For Each N As Node In Arr";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final Object[] group2 = _arr;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group2[index2]));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
if ((anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("com.sun.javafx.scene.control.skin.VirtualScrollBar") || (anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("javafx.scene.control.ScrollBar")) { 
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Dim SB As JavaObject = N";
_sb = new anywheresoftware.b4j.object.JavaObject();
_sb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()));
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
_barorientation = BA.ObjectToString(_sb.RunMethodJO("getOrientation",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
if ((_barorientation).equals("VERTICAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="N.PrefWidth = Size";
_n.setPrefWidth(_size);
 };
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
if ((_barorientation).equals("HORIZONTAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="N.PrefHeight = Size";
_n.setPrefHeight(_size);
 };
 };
 }
};
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="End Sub";
return "";
}
public static String  _playerform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "playerform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "playerform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub PlayerForm_CloseRequest(EventData As Event)";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="clsFunc.SetDisableCloseForm(False)";
_clsfunc._setdisablecloseform /*String*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
public static String  _pnplayer_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="players";
if (Debug.shouldDelegate(ba, "pnplayer_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "pnplayer_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub pnPlayer_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim p As Pane = Sender";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="LogDebug(p.Tag)";
anywheresoftware.b4a.keywords.Common.LogDebug(BA.ObjectToString(_p.getTag()));
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="End Sub";
return "";
}
}