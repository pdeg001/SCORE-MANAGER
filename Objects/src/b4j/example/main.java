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
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lbltest = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _sp = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblbaseweek = null;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane2 = null;
public static int _lblheight = 0;
public static anywheresoftware.b4j.objects.ScrollPaneWrapper _scrollpane3 = null;
public static int _currweek = 0;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _ptop = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _pleft = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 65537;BA.debugLine="sp.Initialize(\"SP\")";
parent._sp.Initialize(ba,"SP");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm = Form1";
parent._mainform = _form1;
RDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="MainForm.RootPane.LoadLayout(\"main\") 'Load the la";
parent._mainform.getRootPane().LoadLayout(ba,"main");
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="MainForm.WindowHeight = 720";
parent._mainform.setWindowHeight(720);
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="MainForm.WindowWidth = 1024";
parent._mainform.setWindowWidth(1024);
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="MainForm.Resizable = True";
parent._mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="MainForm.Show";
parent._mainform.Show();
RDebugUtils.currentLine=65547;
 //BA.debugLineNum = 65547;BA.debugLine="ScrollPane1.LoadLayout(\"scrollpane\",ScrollPane1.W";
parent._scrollpane1.LoadLayout(ba,"scrollpane",parent._scrollpane1.getWidth()-10,0);
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="ScrollPane2.LoadLayout(\"scrollpane\",0 ,0)";
parent._scrollpane2.LoadLayout(ba,"scrollpane",0,0);
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="ScrollPane3.LoadLayout(\"scrollpane\",0 ,0)";
parent._scrollpane3.LoadLayout(ba,"scrollpane",0,0);
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="ScrollPane2.SetHScrollVisibility(\"ALWAYS\")";
parent._scrollpane2.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="ScrollPane1.SetHScrollVisibility(\"ALWAYS\")";
parent._scrollpane1.SetHScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
RDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="ScrollPane1.SetVScrollVisibility(\"NEVER\")";
parent._scrollpane1.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "appstart"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="lblTest.Text = \"Sjaak van Duivenvoorde\"";
parent._lbltest.setText("Sjaak van Duivenvoorde");
RDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="SetLabels";
_setlabels();
RDebugUtils.currentLine=65559;
 //BA.debugLineNum = 65559;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setlabels() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setlabels", false))
	 {return ((String) Debug.delegate(ba, "setlabels", null));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _baselabel = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _left = 0;
int _width = 0;
int _top = 0;
int _i = 0;
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub SetLabels";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim p As Pane= ScrollPane1.InnerNode";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane1.getInnerNode().getObject()));
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim baseLabel As Label' = lblTest";
_baselabel = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim left As Int = 1'baseLabel.Left";
_left = (int) (1);
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Dim width As Int = ScrollPane1.Width-10";
_width = (int) (_scrollpane1.getWidth()-10);
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Dim top As Int = 0' baseLabel.Top + height";
_top = (int) (0);
RDebugUtils.currentLine=196616;
 //BA.debugLineNum = 196616;BA.debugLine="For i = 1 To 30";
{
final int step7 = 1;
final int limit7 = (int) (30);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="lbl = lblTest";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbltest.getObject()));
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="lbl.Initialize(\"lblWeek\")";
_lbl.Initialize(ba,"lblWeek");
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="lbl.TextSize = 15";
_lbl.setTextSize(15);
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="lbl.Alignment = \"CENTER_RIGHT\"";
_lbl.setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="lbl.Tag = $\"speler${i}L\"$";
_lbl.setTag((Object)(("speler"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"L")));
RDebugUtils.currentLine=196622;
 //BA.debugLineNum = 196622;BA.debugLine="lbl.Text = $\"SPELER ${i}\"$";
_lbl.setText(("SPELER "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+""));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="lbl.Style = \"-fx-padding: 0 10 0 0;\"";
_lbl.setStyle("-fx-padding: 0 10 0 0;");
RDebugUtils.currentLine=196624;
 //BA.debugLineNum = 196624;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),4);
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="p.AddNode(lbl, left, top, 210, 30)";
_p.AddNode((javafx.scene.Node)(_lbl.getObject()),_left,_top,210,30);
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="SetWeeks(lbl.Top, i)";
_setweeks((int) (_lbl.getTop()),_i);
RDebugUtils.currentLine=196629;
 //BA.debugLineNum = 196629;BA.debugLine="top = top + 30";
_top = (int) (_top+30);
 }
};
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="SetNameRotated";
_setnamerotated();
RDebugUtils.currentLine=196632;
 //BA.debugLineNum = 196632;BA.debugLine="p.PrefHeight = (i * lblHeight) '+ 25";
_p.setPrefHeight((_i*_lblheight));
RDebugUtils.currentLine=196633;
 //BA.debugLineNum = 196633;BA.debugLine="ScrollPane2.InnerNode.PrefHeight = p.PrefHeight '";
_scrollpane2.getInnerNode().setPrefHeight(_p.getPrefHeight());
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="ScrollPane2.InnerNode.PrefWidth = (39 * 31) + 10";
_scrollpane2.getInnerNode().setPrefWidth((39*31)+10);
RDebugUtils.currentLine=196635;
 //BA.debugLineNum = 196635;BA.debugLine="ScrollPane3.InnerNode.PrefWidth = (39 * 31) + 10";
_scrollpane3.getInnerNode().setPrefWidth((39*31)+10);
RDebugUtils.currentLine=196636;
 //BA.debugLineNum = 196636;BA.debugLine="SetScrollbarSize(ScrollPane2, \"VERTICAL\", 20)";
_setscrollbarsize((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_scrollpane2.getObject())),"VERTICAL",20);
RDebugUtils.currentLine=196637;
 //BA.debugLineNum = 196637;BA.debugLine="End Sub";
return "";
}
public static String  _highlitespeler(anywheresoftware.b4a.objects.B4XViewWrapper _v) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "highlitespeler", false))
	 {return ((String) Debug.delegate(ba, "highlitespeler", new Object[] {_v}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Private Sub HighliteSpeler(v As B4XView)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="CSSUtils.SetBackgroundColor(v, fx.Colors.Yellow)";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_v.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Yellow)));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public static String  _label1_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "label1_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "label1_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Label1_MouseEntered (EventData As MouseEvent)";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _label1_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "label1_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "label1_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Label1_MouseExited (EventData As MouseEvent)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public static String  _lblweek_mouseentered(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lblweek_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lblweek_mouseentered", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
String _tag = "";
String[] _str = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pn = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub LblWeek_MouseEntered (EventData As MouseEvent)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="lbl = Sender";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Yellow";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Yellow)));
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Dim tag As String = lbl.Tag";
_tag = BA.ObjectToString(_lbl.getTag());
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="If tag.IndexOf(\"week\") > -1 Then";
if (_tag.indexOf("week")>-1) { 
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="str = Regex.Split(\"-\", tag)";
_str = anywheresoftware.b4a.keywords.Common.Regex.Split("-",_tag);
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Dim pn As Pane = ScrollPane1.InnerNode";
_pn = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pn = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane1.getInnerNode().getObject()));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group9 = _pn.GetAllViewsRecursive();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9.Get(index9)));
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="If v.Tag = $\"speler${str(1)}L\"$ Then";
if ((_v.getTag()).equals((Object)(("speler"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_str[(int) (1)]))+"L")))) { 
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="pleft = v";
_pleft = _v;
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="HighliteSpeler(v)";
_highlitespeler(_v);
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="pn = ScrollPane3.InnerNode";
_pn = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane3.getInnerNode().getObject()));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group17 = _pn.GetAllViewsRecursive();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group17.Get(index17)));
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="If v.Tag = $\"speler${str(2)}T\"$ Then";
if ((_v.getTag()).equals((Object)(("speler"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_str[(int) (2)]))+"T")))) { 
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="ptop = v";
_ptop = _v;
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="HighliteSpeler(v)";
_highlitespeler(_v);
RDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="End Sub";
return "";
}
public static String  _lblweek_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "lblweek_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lblweek_mouseexited", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub lblWeek_MouseExited (EventData As MouseEvent)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="lbl = Sender";
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.White)";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="CSSUtils.SetBackgroundColor(ptop, fx.Colors.White";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_ptop.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="CSSUtils.SetBackgroundColor(pleft, fx.Colors.Whit";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_pleft.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.White)));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane1_vscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane1_vscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane1_vscrollchanged", new Object[] {_position}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _p = null;
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Sub ScrollPane1_VScrollChanged (Position As Double";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
_scrollpane2.setVPosition(_scrollpane1.getVPosition());
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="Dim p As ScrollPane = Sender";
_p = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_p = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="If p.tag = \"sp1\" Then";
if ((_p.getTag()).equals((Object)("sp1"))) { 
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="ScrollPane2.VPosition = Position";
_scrollpane2.setVPosition(_position);
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
_scrollpane2.setVPosition(_scrollpane1.getVPosition());
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=20709385;
 //BA.debugLineNum = 20709385;BA.debugLine="else if p.Tag = \"sp2\" Then";
if ((_p.getTag()).equals((Object)("sp2"))) { 
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=20709389;
 //BA.debugLineNum = 20709389;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane2_hscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane2_hscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane2_hscrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Sub ScrollPane2_HScrollChanged (Position As Double";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="ScrollPane3.HPosition = Position";
_scrollpane3.setHPosition(_position);
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="End Sub";
return "";
}
public static String  _scrollpane2_vscrollchanged(double _position) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "scrollpane2_vscrollchanged", false))
	 {return ((String) Debug.delegate(ba, "scrollpane2_vscrollchanged", new Object[] {_position}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _p = null;
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Sub ScrollPane2_VScrollChanged (Position As Double";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="ScrollPane1.VPosition = ScrollPane2.VPosition";
_scrollpane1.setVPosition(_scrollpane2.getVPosition());
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="Dim p As ScrollPane = Sender";
_p = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_p = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="If p.tag = \"sp1\" Then";
if ((_p.getTag()).equals((Object)("sp1"))) { 
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="ScrollPane2.VPosition = Position";
_scrollpane2.setVPosition(_position);
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
_scrollpane2.setVPosition(_scrollpane1.getVPosition());
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=20774921;
 //BA.debugLineNum = 20774921;BA.debugLine="else if p.Tag = \"sp2\" Then";
if ((_p.getTag()).equals((Object)("sp2"))) { 
RDebugUtils.currentLine=20774923;
 //BA.debugLineNum = 20774923;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="End Sub";
return "";
}
public static String  _setweeks(int _top,int _num) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setweeks", false))
	 {return ((String) Debug.delegate(ba, "setweeks", new Object[] {_top,_num}));}
int _left = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pw = null;
int _i = 0;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub SetWeeks(top As Int, num As Int)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim left As Int";
_left = 0;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim lbl As Label = lblTest";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_lbltest.getObject()));
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim pw As Pane= ScrollPane2.InnerNode";
_pw = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pw = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane2.getInnerNode().getObject()));
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="left = 5";
_left = (int) (5);
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="For i = 1 To 30";
{
final int step5 = 1;
final int limit5 = (int) (30);
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="lbl.id = \"lbl\"&i&\"\"&DateTime.GetYear(DateTime.No";
_lbl.setId("lbl"+BA.NumberToString(_i)+""+BA.NumberToString(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow())));
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="If i <> num Then";
if (_i!=_num) { 
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="lbl.Initialize(\"lblWeek\")";
_lbl.Initialize(ba,"lblWeek");
 }else {
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Ligh";
_cssutils._setbackgroundcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.LightGray)));
 };
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="lbl.Tag = $\"week-${num}-${i}\"$";
_lbl.setTag((Object)(("week-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_num))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"")));
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="lbl.TextSize = lblTest.TextSize";
_lbl.setTextSize(_lbltest.getTextSize());
RDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="lbl.Alignment = \"CENTER\"";
_lbl.setAlignment("CENTER");
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_lbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),4);
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="pw.AddNode(lbl, left, top, 30, 30)";
_pw.AddNode((javafx.scene.Node)(_lbl.getObject()),_left,_top,30,30);
RDebugUtils.currentLine=327701;
 //BA.debugLineNum = 327701;BA.debugLine="left = left+31";
_left = (int) (_left+31);
 }
};
RDebugUtils.currentLine=327703;
 //BA.debugLineNum = 327703;BA.debugLine="End Sub";
return "";
}
public static String  _setnamerotated() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "setnamerotated", false))
	 {return ((String) Debug.delegate(ba, "setnamerotated", null));}
int _left = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _baselbl = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pw1 = null;
int _i = 0;
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub SetNameRotated";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Dim left As Int";
_left = 0;
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="Label1.Initialize(\"lblWeek\")";
_label1.Initialize(ba,"lblWeek");
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="Dim baseLbl As B4XView = Label1";
_baselbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_baselbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_label1.getObject()));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Dim pw1 As Pane= ScrollPane3.InnerNode";
_pw1 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pw1 = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_scrollpane3.getInnerNode().getObject()));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="left = 5";
_left = (int) (5);
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="For i = 1 To 30";
{
final int step6 = 1;
final int limit6 = (int) (30);
_i = (int) (1) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Label1.Initialize(\"lblWeek\")";
_label1.Initialize(ba,"lblWeek");
RDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="Label1.Alignment = \"CENTER_RIGHT\"";
_label1.setAlignment("CENTER_RIGHT");
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="baseLbl = Label1";
_baselbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_label1.getObject()));
RDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="baseLbl.Rotation = 90";
_baselbl.setRotation(90);
RDebugUtils.currentLine=262157;
 //BA.debugLineNum = 262157;BA.debugLine="CSSUtils.SetBorder(baseLbl, 1, fx.Colors.Gray, 4";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_baselbl.getObject())),1,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(_fx.Colors.Gray)),4);
RDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="baseLbl= baseLbl";
_baselbl = _baselbl;
RDebugUtils.currentLine=262160;
 //BA.debugLineNum = 262160;BA.debugLine="baseLbl.Tag = $\"speler${i}T\"$";
_baselbl.setTag((Object)(("speler"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"T")));
RDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="baseLbl.Text = $\"SPELER ${i} \"$";
_baselbl.setText(("SPELER "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+" "));
RDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="baseLbl.TextSize = lblTest.TextSize";
_baselbl.setTextSize(_lbltest.getTextSize());
RDebugUtils.currentLine=262165;
 //BA.debugLineNum = 262165;BA.debugLine="pw1.AddNode(baseLbl, left-70, 70, 170, 30)";
_pw1.AddNode((javafx.scene.Node)(_baselbl.getObject()),_left-70,70,170,30);
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="left = left+31";
_left = (int) (_left+31);
 }
};
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
_arr = (Object[])(_parent.RunMethodJO("lookupAll",new Object[]{(Object)(".scroll-bar")}).RunMethod("toArray",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="For Each N As Node In Arr";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final Object[] group2 = _arr;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group2[index2]));
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
if ((anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("com.sun.javafx.scene.control.skin.VirtualScrollBar") || (anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject()))).equals("javafx.scene.control.ScrollBar")) { 
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim SB As JavaObject = N";
_sb = new anywheresoftware.b4j.object.JavaObject();
_sb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
_barorientation = BA.ObjectToString(_sb.RunMethodJO("getOrientation",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
if ((_barorientation).equals("VERTICAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="N.PrefWidth = Size";
_n.setPrefWidth(_size);
 };
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
if ((_barorientation).equals("HORIZONTAL") && ((_orientation).equals(_barorientation) || (_orientation).equals("BOTH"))) { 
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="N.PrefHeight = Size";
_n.setPrefHeight(_size);
 };
 };
 }
};
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="End Sub";
return "";
}
}