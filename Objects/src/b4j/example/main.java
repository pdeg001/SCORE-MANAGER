package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1024, 768);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static class _playercurs{
public boolean IsInitialized;
public int player_id;
public String player;
public float moyenne;
public int to_make;
public void Initialize() {
IsInitialized = true;
player_id = 0;
player = "";
moyenne = 0f;
to_make = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _playeridforgrid{
public boolean IsInitialized;
public int player1_id;
public int player2_id;
public void Initialize() {
IsInitialized = true;
player1_id = 0;
player2_id = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static b4j.example.funcclass _clsfunc = null;
public static b4j.example.sqlite _sql = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbltest = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _sp = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblbaseweek = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane2 = null;
public static int _lblheight = 0;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane3 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _ptop = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _pleft = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _paneblockinput = null;
public static b4j.example.customlistview _clvplaying = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnplayer = null;
public static anywheresoftware.b4a.objects.collections.List _lstplayerid = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cmbgametype = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.players _players = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return false;
}
public static void  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {Debug.delegate(ba, "appstart", new Object[] {_form1,_args}); return;}
ResumableSub_AppStart rsub = new ResumableSub_AppStart(null,_form1,_args);
rsub.resume(ba, null);
}
public static class ResumableSub_AppStart extends BA.ResumableSub {
public ResumableSub_AppStart(b4j.example.main parent,anywheresoftware.b4j.objects.Form _form1,String[] _args) {
this.parent = parent;
this._form1 = _form1;
this._args = _args;
}
b4j.example.main parent;
anywheresoftware.b4j.objects.Form _form1;
String[] _args;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="Players.InitForm";
parent._players._initform /*String*/ ();
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="clsFunc.Initialize";
parent._clsfunc._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="sql.Initialize";
parent._sql._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="sp.Initialize(\"SP\")";
parent._sp.Initialize(ba,"SP");
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="MainForm = Form1";
parent._mainform = _form1;
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="MainForm.Stylesheets.Add(File.GetUri(File.DirAsse";
parent._mainform.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"scoremanager.css")));
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="MainForm.RootPane.LoadLayout(\"main\") 'Load the la";
parent._mainform.getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="MainForm.WindowHeight = 720";
parent._mainform.setWindowHeight(720);
RDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="MainForm.WindowWidth = 1028";
parent._mainform.setWindowWidth(1028);
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="MainForm.Resizable = True";
parent._mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="MainForm.Show";
parent._mainform.Show();
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="paneBlockInput.Visible = True";
parent._paneblockinput.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "appstart"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="lblTest.Text = \"Sjaak van Duivenvoorde\"";
parent._lbltest.setText("Sjaak van Duivenvoorde");
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="PopulateGameCombo";
_populategamecombo();
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="InitScollPanes";
_initscollpanes();
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _populategamecombo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "populategamecombo", false))
	 {return ((String) Debug.delegate(ba, "populategamecombo", null));}
anywheresoftware.b4a.objects.collections.List _lstgame = null;
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub PopulateGameCombo";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim lstGame As List";
_lstgame = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="lstGame.Initialize";
_lstgame.Initialize();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="lstGame.AddAll(Array As String(\"Bandstoten\", \"Lib";
_lstgame.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Bandstoten","Libre","Driebanden"}));
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="cmbGameType.Items.AddAll(Array As String(\"Bandsto";
_cmbgametype.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Bandstoten","Libre","Driebanden"}));
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="End Sub";
return "";
}
public static String  _initscollpanes() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "initscollpanes", false))
	 {return ((String) Debug.delegate(ba, "initscollpanes", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub InitScollPanes";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="ScrollPane1.LoadLayout(\"scrollpane\",200,0)";
_scrollpane1.LoadLayout(ba,"scrollpane",200,0);
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ScrollPane2.LoadLayout(\"scrollpane\",0 ,0)";
_scrollpane2.LoadLayout(ba,"scrollpane",0,0);
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="ScrollPane3.LoadLayout(\"scrollpane\",0 ,160)";
_scrollpane3.LoadLayout(ba,"scrollpane",0,160);
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="ScrollPane2.SetHScrollVisibility(\"ALWAYS\")";
_scrollpane2.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="ScrollPane1.SetHScrollVisibility(\"ALWAYS\")";
_scrollpane1.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="ScrollPane1.SetVScrollVisibility(\"NEVER\")";
_scrollpane1.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="SetVerticalNames";
_setverticalnames();
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="End Sub";
return "";
}
public static String  _btnplayer_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "btnplayer_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnplayer_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub btnPlayer_MouseReleased (EventData As MouseEve";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Players.ShowPlayerForm";
_players._showplayerform /*String*/ ();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public static String  _cmbgametype_selectedindexchanged(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "cmbgametype_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "cmbgametype_selectedindexchanged", new Object[] {_index,_value}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub cmbGameType_SelectedIndexChanged(Index As Int,";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public static String  _highlitespeler(anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "highlitespeler", false))
	 {return ((String) Debug.delegate(ba, "highlitespeler", new Object[] {_v}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub HighliteSpeler(v As B4XView)";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="CSSUtils.SetBackgroundColor(v, fx.Colors.Yellow)";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_v.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Yellow)));
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public static String  _setverticalnames() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setverticalnames", false))
	 {return ((String) Debug.delegate(ba, "setverticalnames", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _left = 0;
int _top = 0;
anywheresoftware.b4a.objects.collections.List _lstplayers = null;
int _loopcount = 0;
b4j.example.main._playercurs _player = null;
b4j.example.main._playeridforgrid _playerid = null;
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub SetVerticalNames";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="Dim p As Pane= ScrollPane1.InnerNode";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane1.getInnerNode().getObject()));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="Dim left As Int = 1'baseLabel.Left";
_left = (int) (1);
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="Dim top As Int = 0' baseLabel.Top + height";
_top = (int) (0);
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
_lstplayers = new anywheresoftware.b4a.objects.collections.List();
_lstplayers = _sql._getplayerlist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="Dim loopCount As Int = 0";
_loopcount = (int) (0);
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="lstPlayerId.Initialize";
_lstplayerid.Initialize();
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="For Each player As playerCurs In lstPlayers";
{
final anywheresoftware.b4a.BA.IterableList group8 = _lstplayers;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_player = (b4j.example.main._playercurs)(group8.Get(index8));
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="Dim playerId As playerIdForGrid";
_playerid = new b4j.example.main._playeridforgrid();
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="playerId.player1_id = player.player_id";
_playerid.player1_id /*int*/  = _player.player_id /*int*/ ;
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="lstPlayerId.Add(playerId)";
_lstplayerid.Add((Object)(_playerid));
RDebugUtils.currentLine=393232;
 //BA.debugLineNum = 393232;BA.debugLine="loopCount = loopCount + 1";
_loopcount = (int) (_loopcount+1);
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="lbl = lblTest";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbltest.getObject()));
RDebugUtils.currentLine=393236;
 //BA.debugLineNum = 393236;BA.debugLine="lbl.TooltipText = $\"Moyenne ${clsFunc.GetFormatN";
_lbl.setTooltipText(("Moyenne "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clsfunc._getformatnumber /*String*/ (null,_player.moyenne /*float*/ ,(int) (3),(int) (3)).replace(",",".")))+" Maken "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_player.to_make /*int*/ ))+""));
RDebugUtils.currentLine=393238;
 //BA.debugLineNum = 393238;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=393239;
 //BA.debugLineNum = 393239;BA.debugLine="lbl.TextSize = 15";
_lbl.setTextSize(15);
RDebugUtils.currentLine=393240;
 //BA.debugLineNum = 393240;BA.debugLine="lbl.Alignment = \"CENTER_RIGHT\"";
_lbl.setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=393241;
 //BA.debugLineNum = 393241;BA.debugLine="lbl.Tag = $\"speler-${player.player_id}-L${loopCo";
_lbl.setTag((Object)(("speler-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_player.player_id /*int*/ ))+"-L"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_loopcount))+"")));
RDebugUtils.currentLine=393242;
 //BA.debugLineNum = 393242;BA.debugLine="lbl.Text = player.player";
_lbl.setText(_player.player /*String*/ );
RDebugUtils.currentLine=393243;
 //BA.debugLineNum = 393243;BA.debugLine="lbl.Style = \"-fx-padding: 0 10 0 0;\"";
_lbl.setStyle("-fx-padding: 0 10 0 0;");
RDebugUtils.currentLine=393244;
 //BA.debugLineNum = 393244;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),4);
RDebugUtils.currentLine=393245;
 //BA.debugLineNum = 393245;BA.debugLine="p.AddNode(lbl, left, top, 210, 30)";
_p.AddNode((javafx.scene.Node)(_lbl.getObject()),_left,_top,210,30);
RDebugUtils.currentLine=393247;
 //BA.debugLineNum = 393247;BA.debugLine="top = top + 31";
_top = (int) (_top+31);
 }
};
RDebugUtils.currentLine=393250;
 //BA.debugLineNum = 393250;BA.debugLine="SetHorizontalNames";
_sethorizontalnames();
RDebugUtils.currentLine=393251;
 //BA.debugLineNum = 393251;BA.debugLine="SetWeeks(lbl.Top, lstPlayers.Size)";
_setweeks((int) (_lbl.getTop()),_lstplayers.getSize());
RDebugUtils.currentLine=393254;
 //BA.debugLineNum = 393254;BA.debugLine="p.PrefHeight = (lstPlayers.Size * lblHeight) '+ 2";
_p.setPrefHeight((_lstplayers.getSize()*_lblheight));
RDebugUtils.currentLine=393255;
 //BA.debugLineNum = 393255;BA.debugLine="ScrollPane2.InnerNode.PrefHeight = p.PrefHeight '";
_scrollpane2.getInnerNode().setPrefHeight(_p.getPrefHeight());
RDebugUtils.currentLine=393256;
 //BA.debugLineNum = 393256;BA.debugLine="ScrollPane2.InnerNode.PrefWidth = (lstPlayers.Siz";
_scrollpane2.getInnerNode().setPrefWidth((_lstplayers.getSize()*31)+10);
RDebugUtils.currentLine=393257;
 //BA.debugLineNum = 393257;BA.debugLine="ScrollPane3.InnerNode.PrefWidth = (lstPlayers.Siz";
_scrollpane3.getInnerNode().setPrefWidth((_lstplayers.getSize()*31)+10);
RDebugUtils.currentLine=393258;
 //BA.debugLineNum = 393258;BA.debugLine="SetScrollbarSize(ScrollPane1, \"HORIZONTAL\", 20)";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_scrollpane1.getObject())),"HORIZONTAL",20);
RDebugUtils.currentLine=393259;
 //BA.debugLineNum = 393259;BA.debugLine="SetScrollbarSize(ScrollPane2, \"VERTICAL\", 20)";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_scrollpane2.getObject())),"VERTICAL",20);
RDebugUtils.currentLine=393260;
 //BA.debugLineNum = 393260;BA.debugLine="SetScrollbarSize(ScrollPane2, \"HORIZONTAL\", 20)";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_scrollpane2.getObject())),"HORIZONTAL",20);
RDebugUtils.currentLine=393261;
 //BA.debugLineNum = 393261;BA.debugLine="SetScrollbarSize(ScrollPane3, \"VERTICAL\", 20)";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_scrollpane3.getObject())),"VERTICAL",20);
RDebugUtils.currentLine=393262;
 //BA.debugLineNum = 393262;BA.debugLine="End Sub";
return "";
}
public static String  _label1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "label1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "label1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Label1_MouseEntered (EventData As MouseEvent)";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public static String  _label1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "label1_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "label1_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Label1_MouseExited (EventData As MouseEvent)";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public static String  _lblweek_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lblweek_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lblweek_mouseentered", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
String _tag = "";
String _strtag = "";
String[] _str = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub LblWeek_MouseEntered (EventData As MouseEvent)";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="lbl = Sender";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Yellow";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Yellow)));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Dim tag As String = lbl.Tag";
_tag = BA.ObjectToString(_lbl.getTag());
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If tag.IndexOf(\"week\") > -1 Then";
if (_tag.indexOf("week")>-1) { 
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim strTag As String";
_strtag = "";
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Dim pn As Pane = ScrollPane1.InnerNode";
_pn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pn = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane1.getInnerNode().getObject()));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="str = Regex.Split(\"-\", tag)";
_str = anywheresoftware.b4a.keywords.Common.Regex.Split("-",_tag);
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group10 = _pn.GetAllViewsRecursive();
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group10.Get(index10)));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="strTag = v.tag";
_strtag = BA.ObjectToString(_v.getTag());
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="If strTag.IndexOf($\"L${str(1)}\"$) > -1 Then";
if (_strtag.indexOf(("L"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_str[(int) (1)]))+""))>-1) { 
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="pleft = v";
_pleft = _v;
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="HighliteSpeler(v)";
_highlitespeler(_v);
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="pn = ScrollPane3.InnerNode";
_pn = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane3.getInnerNode().getObject()));
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group19 = _pn.GetAllViewsRecursive();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group19.Get(index19)));
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="strTag = v.tag";
_strtag = BA.ObjectToString(_v.getTag());
RDebugUtils.currentLine=917526;
 //BA.debugLineNum = 917526;BA.debugLine="If strTag.IndexOf($\"T${str(2)}\"$) > -1 Then";
if (_strtag.indexOf(("T"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_str[(int) (2)]))+""))>-1) { 
RDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="ptop = v";
_ptop = _v;
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="HighliteSpeler(v)";
_highlitespeler(_v);
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="End Sub";
return "";
}
public static String  _lblweek_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lblweek_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lblweek_mouseexited", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub lblWeek_MouseExited (EventData As MouseEvent)";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="lbl = Sender";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.White)";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Try";
try {RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="CSSUtils.SetBackgroundColor(ptop, fx.Colors.Whit";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_ptop.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="CSSUtils.SetBackgroundColor(pleft, fx.Colors.Whi";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pleft.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="LogDebug(\"\")";
anywheresoftware.b4a.keywords.Common.LogDebug("");
 };
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="End Sub";
return "";
}
public static String  _lblweek_mousereleased(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lblweek_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lblweek_mousereleased", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub lblWeek_MouseReleased (EventData As MouseEvent";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If fx.Msgbox2(MainForm, $\"${pleft.Text} tegen ${p";
if (_fx.Msgbox2(_mainform,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_pleft.getText()))+" tegen "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ptop.getText()))+" laten spelen"),"Score Manager","JA","NEE","",_fx.MSGBOX_CONFIRMATION)==_fx.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "mainform_closerequest", false))
	 {return ((String) Debug.delegate(ba, "mainform_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub MainForm_CloseRequest(EventData As Event)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="If clsFunc.GetDisableCloseForm = True Then";
if (_clsfunc._getdisablecloseform /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 };
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane1_vscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane1_vscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane1_vscrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub ScrollPane1_VScrollChanged (Position As Double";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
_scrollpane2.setVPosition(_scrollpane1.getVPosition());
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane2_hscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane2_hscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane2_hscrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub ScrollPane2_HScrollChanged (Position As Double";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="ScrollPane3.HPosition = Position";
_scrollpane3.setHPosition(_position);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane2_vscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane2_vscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane2_vscrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub ScrollPane2_VScrollChanged (Position As Double";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="ScrollPane1.VPosition = ScrollPane2.VPosition";
_scrollpane1.setVPosition(_scrollpane2.getVPosition());
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _setdisableclosemain(boolean _disable) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setdisableclosemain", false))
	 {return ((String) Debug.delegate(ba, "setdisableclosemain", new Object[] {_disable}));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub SetDisableCloseMain(disable As Boolean)";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="clsFunc.SetDisableCloseForm(disable)";
_clsfunc._setdisablecloseform /*String*/ (null,_disable);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _sethorizontalnames() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "sethorizontalnames", false))
	 {return ((String) Debug.delegate(ba, "sethorizontalnames", null));}
int _left = 0;
int _loopcount = 0;
int _loopid = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _baselbl = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pw1 = null;
anywheresoftware.b4a.objects.collections.List _lstplayers = null;
b4j.example.main._playercurs _player = null;
b4j.example.main._playeridforgrid _playerid = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub SetHorizontalNames";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim left, loopCount, loopId As Int";
_left = 0;
_loopcount = 0;
_loopid = 0;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Label1.Initialize(\"lblWeek\")";
_label1.Initialize(ba,"lblWeek");
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim baseLbl As B4XView = Label1";
_baselbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_baselbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_label1.getObject()));
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim pw1 As Pane= ScrollPane3.InnerNode";
_pw1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pw1 = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane3.getInnerNode().getObject()));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="left = 5";
_left = (int) (5);
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
_lstplayers = new anywheresoftware.b4a.objects.collections.List();
_lstplayers = _sql._getplayerlist /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="loopCount = lstPlayers.Size -1";
_loopcount = (int) (_lstplayers.getSize()-1);
RDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="loopId = 0";
_loopid = (int) (0);
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="For Each player As playerCurs In lstPlayers";
{
final anywheresoftware.b4a.BA.IterableList group9 = _lstplayers;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_player = (b4j.example.main._playercurs)(group9.Get(index9));
RDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="loopId = loopId +1";
_loopid = (int) (_loopid+1);
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Dim playerId As playerIdForGrid";
_playerid = new b4j.example.main._playeridforgrid();
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="playerId.Initialize";
_playerid.Initialize();
RDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="playerId = lstPlayerId.Get(loopCount)";
_playerid = (b4j.example.main._playeridforgrid)(_lstplayerid.Get(_loopcount));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="playerId.player2_id = player.player_id";
_playerid.player2_id /*int*/  = _player.player_id /*int*/ ;
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Label1.Initialize(\"\")";
_label1.Initialize(ba,"");
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="Label1.Alignment = \"CENTER_RIGHT\"";
_label1.setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="Label1.Style = \"-fx-padding: 0 10 0 0;\"";
_label1.setStyle("-fx-padding: 0 10 0 0;");
RDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="Label1.TooltipText = $\"Moyenne ${clsFunc.GetForm";
_label1.setTooltipText(("Moyenne "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clsfunc._getformatnumber /*String*/ (null,_player.moyenne /*float*/ ,(int) (3),(int) (3)).replace(",",".")))+" Maken "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_player.to_make /*int*/ ))+""));
RDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="baseLbl = Label1";
_baselbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_label1.getObject()));
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="baseLbl.Rotation = 90";
_baselbl.setRotation(90);
RDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="SetToolTip(baseLbl, $\"Moyenne ${clsFunc.GetForma";
_settooltip(_baselbl,("Moyenne "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clsfunc._getformatnumber /*String*/ (null,(float) (_player.moyenne /*float*/ /(double)1000),(int) (3),(int) (3)).replace(",",".")))+" Maken "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_player.to_make /*int*/ ))+""));
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="CSSUtils.SetBorder(baseLbl, 1, fx.Colors.Gray, 4";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_baselbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),4);
RDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="baseLbl= baseLbl";
_baselbl = _baselbl;
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="baseLbl.Tag = $\"speler-${player.player_id}-T${lo";
_baselbl.setTag((Object)(("speler-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_player.player_id /*int*/ ))+"-T"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_loopid))+"")));
RDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="baseLbl.Text = player.player 'player.player'$\"SP";
_baselbl.setText(_player.player /*String*/ );
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="baseLbl.TextSize = lblTest.TextSize";
_baselbl.setTextSize(_lbltest.getTextSize());
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="pw1.AddNode(baseLbl, left-75, 76, 180, 30)";
_pw1.AddNode((javafx.scene.Node)(_baselbl.getObject()),_left-75,76,180,30);
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="left = left+31";
_left = (int) (_left+31);
RDebugUtils.currentLine=524325;
 //BA.debugLineNum = 524325;BA.debugLine="loopCount = loopCount - 1";
_loopcount = (int) (_loopcount-1);
 }
};
RDebugUtils.currentLine=524328;
 //BA.debugLineNum = 524328;BA.debugLine="End Sub";
return "";
}
public static String  _settooltip(anywheresoftware.b4a.objects.B4XViewWrapper _x,String _text) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "settooltip", false))
	 {return ((String) Debug.delegate(ba, "settooltip", new Object[] {_x,_text}));}
anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _c = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub SetToolTip (x As B4XView, Text As String)";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="If x Is Control Then";
if (_x.getObjectOrNull() instanceof javafx.scene.control.Control) { 
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Dim c As Control = x";
_c = new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper();
_c = (anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper(), (javafx.scene.control.Control)(_x.getObject()));
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="c.TooltipText = Text";
_c.setTooltipText(_text);
 };
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="End Sub";
return "";
}
public static String  _setscrollbarsize(anywheresoftware.b4j.object.JavaObject _parent,String _orientation,double _size) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setscrollbarsize", false))
	 {return ((String) Debug.delegate(ba, "setscrollbarsize", new Object[] {_parent,_orientation,_size}));}
Object[] _arr = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.object.JavaObject _sb = null;
String _barorientation = "";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
_arr = (Object[])(_parent.RunMethodJO("lookupAll",new Object[]{(Object)(".scroll-bar")}).RunMethod("toArray",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="For Each N As Node In Arr";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final Object[] group2 = _arr;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group2[index2]));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
if ((anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("com.sun.javafx.scene.control.skin.VirtualScrollBar") || (anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("javafx.scene.control.ScrollBar")) { 
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Dim SB As JavaObject = N";
_sb = new anywheresoftware.b4j.object.JavaObject();
_sb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()));
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
_barorientation = BA.ObjectToString(_sb.RunMethodJO("getOrientation",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
if ((_barorientation).equals("VERTICAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="N.PrefWidth = Size";
_n.setPrefWidth(_size);
 };
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
if ((_barorientation).equals("HORIZONTAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="N.PrefHeight = Size";
_n.setPrefHeight(_size);
 };
 };
 }
};
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="End Sub";
return "";
}
public static String  _setweeks(int _top,int _playercount) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setweeks", false))
	 {return ((String) Debug.delegate(ba, "setweeks", new Object[] {_top,_playercount}));}
int _left = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
b4j.example.main._playeridforgrid _playerid = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pw = null;
int _i = 0;
int _j = 0;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Private Sub SetWeeks(top As Int, playerCount As In";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim left As Int";
_left = 0;
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim lbl As Label = lblTest";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbltest.getObject()));
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Dim playerId As playerIdForGrid";
_playerid = new b4j.example.main._playeridforgrid();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim pw As Pane= ScrollPane2.InnerNode";
_pw = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pw = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane2.getInnerNode().getObject()));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="left = 5";
_left = (int) (5);
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="top = 0";
_top = (int) (0);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="playerId.Initialize";
_playerid.Initialize();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="For i = 1 To playerCount";
{
final int step8 = 1;
final int limit8 = _playercount;
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="left = 5";
_left = (int) (5);
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="For j = 1 To playerCount";
{
final int step10 = 1;
final int limit10 = _playercount;
_j = (int) (1) ;
for (;_j <= limit10 ;_j = _j + step10 ) {
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="playerId = lstPlayerId.Get(j-1)";
_playerid = (b4j.example.main._playeridforgrid)(_lstplayerid.Get((int) (_j-1)));
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="lbl.id = \"lbl\"&i&\"\"&DateTime.GetYear(DateTime.N";
_lbl.setId("lbl"+BA.NumberToString(_i)+""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow())));
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="If i <> j Then";
if (_i!=_j) { 
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="lbl.Initialize(\"lblWeek\")";
_lbl.Initialize(ba,"lblWeek");
 }else {
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Lig";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.LightGray)));
 };
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="lbl.Tag = $\"week-${i}-${j}\"$";
_lbl.setTag((Object)(("week-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_j))+"")));
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="lbl.TextSize = lblTest.TextSize";
_lbl.setTextSize(_lbltest.getTextSize());
RDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="lbl.Alignment = \"CENTER\"";
_lbl.setAlignment("CENTER");
RDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 2)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),2);
RDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="pw.AddNode(lbl, left, top, 30, 30)";
_pw.AddNode((javafx.scene.Node)(_lbl.getObject()),_left,_top,30,30);
RDebugUtils.currentLine=589852;
 //BA.debugLineNum = 589852;BA.debugLine="left = left+31";
_left = (int) (_left+31);
 }
};
RDebugUtils.currentLine=589854;
 //BA.debugLineNum = 589854;BA.debugLine="top = top + 31";
_top = (int) (_top+31);
 }
};
RDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="End Sub";
return "";
}
}