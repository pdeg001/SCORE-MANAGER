package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,65);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 65;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,34);
if (RapidSub.canDelegate("appstart")) { b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args); return;}
ResumableSub_AppStart rsub = new ResumableSub_AppStart(null,_form1,_args);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AppStart extends BA.ResumableSub {
public ResumableSub_AppStart(b4j.example.main parent,RemoteObject _form1,RemoteObject _args) {
this.parent = parent;
this._form1 = _form1;
this._args = _args;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _form1;
RemoteObject _args;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,34);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 35;BA.debugLine="Players.InitForm";
Debug.ShouldStop(4);
parent._players.runVoidMethod ("_initform" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="clsFunc.Initialize";
Debug.ShouldStop(8);
parent._clsfunc.runClassMethod (b4j.example.funcclass.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 37;BA.debugLine="sql.Initialize";
Debug.ShouldStop(16);
parent._sql.runClassMethod (b4j.example.sqlite.class, "_initialize" /*RemoteObject*/ ,main.ba);
 BA.debugLineNum = 38;BA.debugLine="sp.Initialize(\"SP\")";
Debug.ShouldStop(32);
parent._sp.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("SP")));
 BA.debugLineNum = 40;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(128);
parent._mainform = _form1;
 BA.debugLineNum = 41;BA.debugLine="MainForm.RootPane.LoadLayout(\"main\") 'Load the la";
Debug.ShouldStop(256);
parent._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 42;BA.debugLine="MainForm.WindowHeight = 720";
Debug.ShouldStop(512);
parent._mainform.runMethod(true,"setWindowHeight",BA.numberCast(double.class, 720));
 BA.debugLineNum = 43;BA.debugLine="MainForm.WindowWidth = 1024";
Debug.ShouldStop(1024);
parent._mainform.runMethod(true,"setWindowWidth",BA.numberCast(double.class, 1024));
 BA.debugLineNum = 44;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(2048);
parent._mainform.runMethod(true,"setResizable",parent.__c.getField(true,"True"));
 BA.debugLineNum = 45;BA.debugLine="MainForm.Show";
Debug.ShouldStop(4096);
parent._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 46;BA.debugLine="paneBlockInput.Visible = True";
Debug.ShouldStop(8192);
parent._paneblockinput.runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="Sleep(0)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "appstart"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 49;BA.debugLine="lblTest.Text = \"Sjaak van Duivenvoorde\"";
Debug.ShouldStop(65536);
parent._lbltest.runMethod(true,"setText",BA.ObjectToString("Sjaak van Duivenvoorde"));
 BA.debugLineNum = 50;BA.debugLine="InitScollPanes";
Debug.ShouldStop(131072);
_initscollpanes();
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnplayer_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("btnPlayer_MouseReleased (main) ","main",0,main.ba,main.mostCurrent,329);
if (RapidSub.canDelegate("btnplayer_mousereleased")) { return b4j.example.main.remoteMe.runUserSub(false, "main","btnplayer_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 329;BA.debugLine="Sub btnPlayer_MouseReleased (EventData As MouseEve";
Debug.ShouldStop(256);
 BA.debugLineNum = 330;BA.debugLine="Players.ShowPlayerForm";
Debug.ShouldStop(512);
main._players.runVoidMethod ("_showplayerform" /*RemoteObject*/ );
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _highlitespeler(RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("HighliteSpeler (main) ","main",0,main.ba,main.mostCurrent,264);
if (RapidSub.canDelegate("highlitespeler")) { return b4j.example.main.remoteMe.runUserSub(false, "main","highlitespeler", _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 264;BA.debugLine="Private Sub HighliteSpeler(v As B4XView)";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="CSSUtils.SetBackgroundColor(v, fx.Colors.Yellow)";
Debug.ShouldStop(256);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _v.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Yellow")));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initscollpanes() throws Exception{
try {
		Debug.PushSubsStack("InitScollPanes (main) ","main",0,main.ba,main.mostCurrent,69);
if (RapidSub.canDelegate("initscollpanes")) { return b4j.example.main.remoteMe.runUserSub(false, "main","initscollpanes");}
 BA.debugLineNum = 69;BA.debugLine="Sub InitScollPanes";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="ScrollPane1.LoadLayout(\"scrollpane\",200,0)";
Debug.ShouldStop(32);
main._scrollpane1.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(BA.numberCast(double.class, 200)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 71;BA.debugLine="ScrollPane2.LoadLayout(\"scrollpane\",0 ,0)";
Debug.ShouldStop(64);
main._scrollpane2.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="ScrollPane3.LoadLayout(\"scrollpane\",0 ,160)";
Debug.ShouldStop(128);
main._scrollpane3.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 160)));
 BA.debugLineNum = 74;BA.debugLine="ScrollPane2.SetHScrollVisibility(\"ALWAYS\")";
Debug.ShouldStop(512);
main._scrollpane2.runVoidMethod ("SetHScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 BA.debugLineNum = 75;BA.debugLine="ScrollPane1.SetHScrollVisibility(\"ALWAYS\")";
Debug.ShouldStop(1024);
main._scrollpane1.runVoidMethod ("SetHScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 BA.debugLineNum = 76;BA.debugLine="ScrollPane1.SetVScrollVisibility(\"NEVER\")";
Debug.ShouldStop(2048);
main._scrollpane1.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("NEVER"))));
 BA.debugLineNum = 78;BA.debugLine="SetVerticalNames";
Debug.ShouldStop(8192);
_setverticalnames();
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_mouseentered(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Label1_MouseEntered (main) ","main",0,main.ba,main.mostCurrent,213);
if (RapidSub.canDelegate("label1_mouseentered")) { return b4j.example.main.remoteMe.runUserSub(false, "main","label1_mouseentered", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 213;BA.debugLine="Sub Label1_MouseEntered (EventData As MouseEvent)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_mouseexited(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("Label1_MouseExited (main) ","main",0,main.ba,main.mostCurrent,217);
if (RapidSub.canDelegate("label1_mouseexited")) { return b4j.example.main.remoteMe.runUserSub(false, "main","label1_mouseexited", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 217;BA.debugLine="Sub Label1_MouseExited (EventData As MouseEvent)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblweek_mouseentered(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("LblWeek_MouseEntered (main) ","main",0,main.ba,main.mostCurrent,233);
if (RapidSub.canDelegate("lblweek_mouseentered")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lblweek_mouseentered", _eventdata);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _strtag = RemoteObject.createImmutable("");
RemoteObject _str = null;
RemoteObject _pn = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 233;BA.debugLine="Sub LblWeek_MouseEntered (EventData As MouseEvent)";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(512);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 235;BA.debugLine="lbl = Sender";
Debug.ShouldStop(1024);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 236;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Yellow";
Debug.ShouldStop(2048);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Yellow")));
 BA.debugLineNum = 237;BA.debugLine="Dim tag As String = lbl.Tag";
Debug.ShouldStop(4096);
_tag = BA.ObjectToString(_lbl.runMethod(false,"getTag"));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 238;BA.debugLine="If tag.IndexOf(\"week\") > -1 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_tag.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("week"))),BA.numberCast(int.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 239;BA.debugLine="Dim strTag As String";
Debug.ShouldStop(16384);
_strtag = RemoteObject.createImmutable("");Debug.locals.put("strTag", _strtag);
 BA.debugLineNum = 240;BA.debugLine="Dim str() As String";
Debug.ShouldStop(32768);
_str = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("str", _str);
 BA.debugLineNum = 241;BA.debugLine="Dim pn As Pane = ScrollPane1.InnerNode";
Debug.ShouldStop(65536);
_pn = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane1.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pn", _pn);
 BA.debugLineNum = 242;BA.debugLine="str = Regex.Split(\"-\", tag)";
Debug.ShouldStop(131072);
_str = main.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_tag));Debug.locals.put("str", _str);
 BA.debugLineNum = 244;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
Debug.ShouldStop(524288);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group10 = _pn.runMethod(false,"GetAllViewsRecursive");
final int groupLen10 = group10.runMethod(true,"getSize").<Integer>get()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group10.runMethod(false,"Get",index10));
Debug.locals.put("v", _v);
 BA.debugLineNum = 245;BA.debugLine="strTag = v.tag";
Debug.ShouldStop(1048576);
_strtag = BA.ObjectToString(_v.runMethod(false,"getTag"));Debug.locals.put("strTag", _strtag);
 BA.debugLineNum = 246;BA.debugLine="If strTag.IndexOf($\"L${str(1)}\"$) > -1 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_strtag.runMethod(true,"indexOf",(Object)((RemoteObject.concat(RemoteObject.createImmutable("L"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str.getArrayElement(true,BA.numberCast(int.class, 1))))),RemoteObject.createImmutable(""))))),BA.numberCast(int.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 247;BA.debugLine="pleft = v";
Debug.ShouldStop(4194304);
main._pleft = _v;
 BA.debugLineNum = 248;BA.debugLine="HighliteSpeler(v)";
Debug.ShouldStop(8388608);
_highlitespeler(_v);
 BA.debugLineNum = 249;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 252;BA.debugLine="pn = ScrollPane3.InnerNode";
Debug.ShouldStop(134217728);
_pn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane3.runMethod(false,"getInnerNode").getObject());
 BA.debugLineNum = 253;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
Debug.ShouldStop(268435456);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group19 = _pn.runMethod(false,"GetAllViewsRecursive");
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group19.runMethod(false,"Get",index19));
Debug.locals.put("v", _v);
 BA.debugLineNum = 254;BA.debugLine="strTag = v.tag";
Debug.ShouldStop(536870912);
_strtag = BA.ObjectToString(_v.runMethod(false,"getTag"));Debug.locals.put("strTag", _strtag);
 BA.debugLineNum = 255;BA.debugLine="If strTag.IndexOf($\"T${str(2)}\"$) > -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_strtag.runMethod(true,"indexOf",(Object)((RemoteObject.concat(RemoteObject.createImmutable("T"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str.getArrayElement(true,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable(""))))),BA.numberCast(int.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 256;BA.debugLine="ptop = v";
Debug.ShouldStop(-2147483648);
main._ptop = _v;
 BA.debugLineNum = 257;BA.debugLine="HighliteSpeler(v)";
Debug.ShouldStop(1);
_highlitespeler(_v);
 BA.debugLineNum = 258;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblweek_mouseexited(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblWeek_MouseExited (main) ","main",0,main.ba,main.mostCurrent,221);
if (RapidSub.canDelegate("lblweek_mouseexited")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lblweek_mouseexited", _eventdata);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 221;BA.debugLine="Sub lblWeek_MouseExited (EventData As MouseEvent)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(536870912);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 223;BA.debugLine="lbl = Sender";
Debug.ShouldStop(1073741824);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 224;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.White)";
Debug.ShouldStop(-2147483648);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
 BA.debugLineNum = 225;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 226;BA.debugLine="CSSUtils.SetBackgroundColor(ptop, fx.Colors.Whit";
Debug.ShouldStop(2);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main._ptop.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
 BA.debugLineNum = 227;BA.debugLine="CSSUtils.SetBackgroundColor(pleft, fx.Colors.Whi";
Debug.ShouldStop(4);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main._pleft.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e8.toString()); BA.debugLineNum = 229;BA.debugLine="LogDebug(\"\")";
Debug.ShouldStop(16);
main.__c.runVoidMethod ("LogDebug",(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblweek_mousereleased(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblWeek_MouseReleased (main) ","main",0,main.ba,main.mostCurrent,322);
if (RapidSub.canDelegate("lblweek_mousereleased")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lblweek_mousereleased", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 322;BA.debugLine="Sub lblWeek_MouseReleased (EventData As MouseEvent";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="If fx.Msgbox2(MainForm, $\"${pleft.Text} tegen ${p";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main._fx.runMethodAndSync(true,"Msgbox2",(Object)(main._mainform),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._pleft.runMethod(true,"getText")))),RemoteObject.createImmutable(" tegen "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._ptop.runMethod(true,"getText")))),RemoteObject.createImmutable(" laten spelen")))),(Object)(BA.ObjectToString("Score Manager")),(Object)(BA.ObjectToString("JA")),(Object)(BA.ObjectToString("NEE")),(Object)(BA.ObjectToString("")),(Object)(main._fx.getField(false,"MSGBOX_CONFIRMATION"))),main._fx.getField(false,"DialogResponse").getField(true,"POSITIVE"))) { 
 BA.debugLineNum = 325;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_closerequest(RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("MainForm_CloseRequest (main) ","main",0,main.ba,main.mostCurrent,53);
if (RapidSub.canDelegate("mainform_closerequest")) { return b4j.example.main.remoteMe.runUserSub(false, "main","mainform_closerequest", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 53;BA.debugLine="Sub MainForm_CloseRequest(EventData As Event)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If clsFunc.GetDisableCloseForm = True Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",main._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getdisablecloseform" /*RemoteObject*/ ),main.__c.getField(true,"True"))) { 
 BA.debugLineNum = 55;BA.debugLine="EventData.Consume";
Debug.ShouldStop(4194304);
_eventdata.runVoidMethod ("Consume");
 };
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
players_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
players.myClass = BA.getDeviceClass ("b4j.example.players");
sqlite.myClass = BA.getDeviceClass ("b4j.example.sqlite");
funcclass.myClass = BA.getDeviceClass ("b4j.example.funcclass");
b4xformatter.myClass = BA.getDeviceClass ("b4j.example.b4xformatter");
animatedcounter.myClass = BA.getDeviceClass ("b4j.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4j.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4j.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4j.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4j.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4j.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4j.example.b4xfloattextfield");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4j.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4j.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4j.example.b4xplusminus");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4j.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4j.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4j.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4j.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4j.example.madewithlove");
roundslider.myClass = BA.getDeviceClass ("b4j.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.example.swiftbutton");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.example.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Type playerCurs(player_id As Int, player As Strin";
;
 //BA.debugLineNum = 10;BA.debugLine="Type playerIdForGrid(player1_id As Int, player2_i";
;
 //BA.debugLineNum = 12;BA.debugLine="Private clsFunc As FuncClass";
main._clsfunc = RemoteObject.createNew ("b4j.example.funcclass");
 //BA.debugLineNum = 13;BA.debugLine="Private sql As Sqlite";
main._sql = RemoteObject.createNew ("b4j.example.sqlite");
 //BA.debugLineNum = 14;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 15;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 16;BA.debugLine="Private lblTest As B4XView";
main._lbltest = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Dim sp As ScrollPane";
main._sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ScrollPane1 As ScrollPane";
main._scrollpane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lblBaseweek As Label";
main._lblbaseweek = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ScrollPane2 As ScrollPane";
main._scrollpane2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblHeight As Int = 30";
main._lblheight = BA.numberCast(int.class, 30);
 //BA.debugLineNum = 24;BA.debugLine="Private ScrollPane3 As ScrollPane";
main._scrollpane3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim Label1 As Label 'ignore";
main._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ptop, pleft As B4XView' = Label1";
main._ptop = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
main._pleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Public paneBlockInput As Pane";
main._paneblockinput = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private clvPlaying As CustomListView";
main._clvplaying = RemoteObject.createNew ("b4j.example.customlistview");
 //BA.debugLineNum = 30;BA.debugLine="Private btnPlayer As Button";
main._btnplayer = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lstPlayerId As List";
main._lstplayerid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scrollpane1_vscrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollPane1_VScrollChanged (main) ","main",0,main.ba,main.mostCurrent,299);
if (RapidSub.canDelegate("scrollpane1_vscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane1_vscrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 299;BA.debugLine="Sub ScrollPane1_VScrollChanged (Position As Double";
Debug.ShouldStop(1024);
 BA.debugLineNum = 300;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
Debug.ShouldStop(2048);
main._scrollpane2.runMethod(true,"setVPosition",main._scrollpane1.runMethod(true,"getVPosition"));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrollpane2_hscrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollPane2_HScrollChanged (main) ","main",0,main.ba,main.mostCurrent,307);
if (RapidSub.canDelegate("scrollpane2_hscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane2_hscrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 307;BA.debugLine="Sub ScrollPane2_HScrollChanged (Position As Double";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="ScrollPane3.HPosition = Position";
Debug.ShouldStop(524288);
main._scrollpane3.runMethod(true,"setHPosition",_position);
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrollpane2_vscrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollPane2_VScrollChanged (main) ","main",0,main.ba,main.mostCurrent,303);
if (RapidSub.canDelegate("scrollpane2_vscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane2_vscrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 303;BA.debugLine="Sub ScrollPane2_VScrollChanged (Position As Double";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="ScrollPane1.VPosition = ScrollPane2.VPosition";
Debug.ShouldStop(32768);
main._scrollpane1.runMethod(true,"setVPosition",main._scrollpane2.runMethod(true,"getVPosition"));
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisableclosemain(RemoteObject _disable) throws Exception{
try {
		Debug.PushSubsStack("SetDisableCloseMain (main) ","main",0,main.ba,main.mostCurrent,59);
if (RapidSub.canDelegate("setdisableclosemain")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setdisableclosemain", _disable);}
Debug.locals.put("disable", _disable);
 BA.debugLineNum = 59;BA.debugLine="Sub SetDisableCloseMain(disable As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="clsFunc.SetDisableCloseForm(disable)";
Debug.ShouldStop(134217728);
main._clsfunc.runClassMethod (b4j.example.funcclass.class, "_setdisablecloseform" /*RemoteObject*/ ,(Object)(_disable));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethorizontalnames() throws Exception{
try {
		Debug.PushSubsStack("SetHorizontalNames (main) ","main",0,main.ba,main.mostCurrent,135);
if (RapidSub.canDelegate("sethorizontalnames")) { return b4j.example.main.remoteMe.runUserSub(false, "main","sethorizontalnames");}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _loopcount = RemoteObject.createImmutable(0);
RemoteObject _loopid = RemoteObject.createImmutable(0);
RemoteObject _baselbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pw1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lstplayers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _player = RemoteObject.declareNull("b4j.example.main._playercurs");
RemoteObject _playerid = RemoteObject.declareNull("b4j.example.main._playeridforgrid");
 BA.debugLineNum = 135;BA.debugLine="Private Sub SetHorizontalNames";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim left, loopCount, loopId As Int";
Debug.ShouldStop(128);
_left = RemoteObject.createImmutable(0);Debug.locals.put("left", _left);
_loopcount = RemoteObject.createImmutable(0);Debug.locals.put("loopCount", _loopcount);
_loopid = RemoteObject.createImmutable(0);Debug.locals.put("loopId", _loopid);
 BA.debugLineNum = 137;BA.debugLine="Label1.Initialize(\"lblWeek\")";
Debug.ShouldStop(256);
main._label1.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 138;BA.debugLine="Dim baseLbl As B4XView = Label1";
Debug.ShouldStop(512);
_baselbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_baselbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._label1.getObject());Debug.locals.put("baseLbl", _baselbl);
 BA.debugLineNum = 139;BA.debugLine="Dim pw1 As Pane= ScrollPane3.InnerNode";
Debug.ShouldStop(1024);
_pw1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pw1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane3.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pw1", _pw1);
 BA.debugLineNum = 140;BA.debugLine="left = 5";
Debug.ShouldStop(2048);
_left = BA.numberCast(int.class, 5);Debug.locals.put("left", _left);
 BA.debugLineNum = 141;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
Debug.ShouldStop(4096);
_lstplayers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstplayers = main._sql.runClassMethod (b4j.example.sqlite.class, "_getplayerlist" /*RemoteObject*/ );Debug.locals.put("lstPlayers", _lstplayers);Debug.locals.put("lstPlayers", _lstplayers);
 BA.debugLineNum = 142;BA.debugLine="loopCount = lstPlayers.Size -1";
Debug.ShouldStop(8192);
_loopcount = RemoteObject.solve(new RemoteObject[] {_lstplayers.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("loopCount", _loopcount);
 BA.debugLineNum = 143;BA.debugLine="loopId = 0";
Debug.ShouldStop(16384);
_loopid = BA.numberCast(int.class, 0);Debug.locals.put("loopId", _loopid);
 BA.debugLineNum = 145;BA.debugLine="For Each player As playerCurs In lstPlayers";
Debug.ShouldStop(65536);
{
final RemoteObject group9 = _lstplayers;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_player = (group9.runMethod(false,"Get",index9));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 146;BA.debugLine="loopId = loopId +1";
Debug.ShouldStop(131072);
_loopid = RemoteObject.solve(new RemoteObject[] {_loopid,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("loopId", _loopid);
 BA.debugLineNum = 147;BA.debugLine="Dim playerId As playerIdForGrid";
Debug.ShouldStop(262144);
_playerid = RemoteObject.createNew ("b4j.example.main._playeridforgrid");Debug.locals.put("playerId", _playerid);
 BA.debugLineNum = 148;BA.debugLine="playerId.Initialize";
Debug.ShouldStop(524288);
_playerid.runVoidMethod ("Initialize");
 BA.debugLineNum = 149;BA.debugLine="playerId = lstPlayerId.Get(loopCount)";
Debug.ShouldStop(1048576);
_playerid = (main._lstplayerid.runMethod(false,"Get",(Object)(_loopcount)));Debug.locals.put("playerId", _playerid);
 BA.debugLineNum = 150;BA.debugLine="playerId.player2_id = player.player_id";
Debug.ShouldStop(2097152);
_playerid.setField ("player2_id" /*RemoteObject*/ ,_player.getField(true,"player_id" /*RemoteObject*/ ));
 BA.debugLineNum = 152;BA.debugLine="Label1.Initialize(\"lblWeek\")";
Debug.ShouldStop(8388608);
main._label1.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 153;BA.debugLine="Label1.Alignment = \"CENTER_RIGHT\"";
Debug.ShouldStop(16777216);
main._label1.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 154;BA.debugLine="Label1.Style = \"-fx-padding: 0 10 0 0;\"";
Debug.ShouldStop(33554432);
main._label1.runMethod(true,"setStyle",BA.ObjectToString("-fx-padding: 0 10 0 0;"));
 BA.debugLineNum = 155;BA.debugLine="Label1.TooltipText = $\"Moyenne ${clsFunc.GetForm";
Debug.ShouldStop(67108864);
main._label1.runMethod(true,"setTooltipText",(RemoteObject.concat(RemoteObject.createImmutable("Moyenne "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(_player.getField(true,"moyenne" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))).runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(".")))))),RemoteObject.createImmutable(" Maken "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_player.getField(true,"to_make" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 156;BA.debugLine="baseLbl = Label1";
Debug.ShouldStop(134217728);
_baselbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._label1.getObject());
 BA.debugLineNum = 157;BA.debugLine="baseLbl.Rotation = 90";
Debug.ShouldStop(268435456);
_baselbl.runMethod(true,"setRotation",BA.numberCast(double.class, 90));
 BA.debugLineNum = 159;BA.debugLine="SetToolTip(baseLbl, $\"Moyenne ${clsFunc.GetForma";
Debug.ShouldStop(1073741824);
_settooltip(_baselbl,(RemoteObject.concat(RemoteObject.createImmutable("Moyenne "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(_player.getField(true,"moyenne" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))).runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(".")))))),RemoteObject.createImmutable(" Maken "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_player.getField(true,"to_make" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 160;BA.debugLine="CSSUtils.SetBorder(baseLbl, 1, fx.Colors.Gray, 4";
Debug.ShouldStop(-2147483648);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _baselbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 4)));
 BA.debugLineNum = 162;BA.debugLine="baseLbl= baseLbl";
Debug.ShouldStop(2);
_baselbl = _baselbl;Debug.locals.put("baseLbl", _baselbl);
 BA.debugLineNum = 163;BA.debugLine="baseLbl.Tag = $\"speler-${player.player_id}-T${lo";
Debug.ShouldStop(4);
_baselbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("speler-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_player.getField(true,"player_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("-T"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_loopid))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 165;BA.debugLine="baseLbl.Text = player.player 'player.player'$\"SP";
Debug.ShouldStop(16);
_baselbl.runMethod(true,"setText",_player.getField(true,"player" /*RemoteObject*/ ));
 BA.debugLineNum = 166;BA.debugLine="baseLbl.TextSize = lblTest.TextSize";
Debug.ShouldStop(32);
_baselbl.runMethod(true,"setTextSize",main._lbltest.runMethod(true,"getTextSize"));
 BA.debugLineNum = 169;BA.debugLine="pw1.AddNode(baseLbl, left-75, 76, 180, 30)";
Debug.ShouldStop(256);
_pw1.runVoidMethod ("AddNode",(Object)((_baselbl.getObject())),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(75)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 76)),(Object)(BA.numberCast(double.class, 180)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 170;BA.debugLine="left = left+31";
Debug.ShouldStop(512);
_left = RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("left", _left);
 BA.debugLineNum = 171;BA.debugLine="loopCount = loopCount - 1";
Debug.ShouldStop(1024);
_loopcount = RemoteObject.solve(new RemoteObject[] {_loopcount,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("loopCount", _loopcount);
 }
}Debug.locals.put("player", _player);
;
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollbarsize(RemoteObject _parent,RemoteObject _orientation,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("SetScrollbarSize (main) ","main",0,main.ba,main.mostCurrent,272);
if (RapidSub.canDelegate("setscrollbarsize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setscrollbarsize", _parent, _orientation, _size);}
RemoteObject _arr = null;
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _barorientation = RemoteObject.createImmutable("");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Orientation", _orientation);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 272;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
Debug.ShouldStop(32768);
 BA.debugLineNum = 274;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
Debug.ShouldStop(131072);
_arr = (_parent.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("lookupAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(".scroll-bar"))}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toArray")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("Arr", _arr);Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 276;BA.debugLine="For Each N As Node In Arr";
Debug.ShouldStop(524288);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group2 = _arr;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group2.getArrayElement(false,RemoteObject.createImmutable(index2)));
Debug.locals.put("N", _n);
 BA.debugLineNum = 279;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("com.sun.javafx.scene.control.skin.VirtualScrollBar")) || RemoteObject.solveBoolean("=",main.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("javafx.scene.control.ScrollBar"))) { 
 BA.debugLineNum = 280;BA.debugLine="Dim SB As JavaObject = N";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject());Debug.locals.put("SB", _sb);
 BA.debugLineNum = 283;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
Debug.ShouldStop(67108864);
_barorientation = BA.ObjectToString(_sb.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getOrientation")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("BarOrientation", _barorientation);Debug.locals.put("BarOrientation", _barorientation);
 BA.debugLineNum = 286;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("VERTICAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 287;BA.debugLine="N.PrefWidth = Size";
Debug.ShouldStop(1073741824);
_n.runMethod(true,"setPrefWidth",_size);
 };
 BA.debugLineNum = 291;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("HORIZONTAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 292;BA.debugLine="N.PrefHeight = Size";
Debug.ShouldStop(8);
_n.runMethod(true,"setPrefHeight",_size);
 };
 };
 }
}Debug.locals.put("N", _n);
;
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settooltip(RemoteObject _x,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetToolTip (main) ","main",0,main.ba,main.mostCurrent,128);
if (RapidSub.canDelegate("settooltip")) { return b4j.example.main.remoteMe.runUserSub(false, "main","settooltip", _x, _text);}
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper");
Debug.locals.put("x", _x);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 128;BA.debugLine="Sub SetToolTip (x As B4XView, Text As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="If x Is Control Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("i",_x.getObjectOrNull(), RemoteObject.createImmutable("javafx.scene.control.Control"))) { 
 BA.debugLineNum = 130;BA.debugLine="Dim c As Control = x";
Debug.ShouldStop(2);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper");
_c = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper"), _x.getObject());Debug.locals.put("c", _c);
 BA.debugLineNum = 131;BA.debugLine="c.TooltipText = Text";
Debug.ShouldStop(4);
_c.runMethod(true,"setTooltipText",_text);
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setverticalnames() throws Exception{
try {
		Debug.PushSubsStack("SetVerticalNames (main) ","main",0,main.ba,main.mostCurrent,81);
if (RapidSub.canDelegate("setverticalnames")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setverticalnames");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
RemoteObject _lstplayers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _loopcount = RemoteObject.createImmutable(0);
RemoteObject _player = RemoteObject.declareNull("b4j.example.main._playercurs");
RemoteObject _playerid = RemoteObject.declareNull("b4j.example.main._playeridforgrid");
 BA.debugLineNum = 81;BA.debugLine="Sub SetVerticalNames";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="Dim p As Pane= ScrollPane1.InnerNode";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane1.runMethod(false,"getInnerNode").getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 86;BA.debugLine="Dim left As Int = 1'baseLabel.Left";
Debug.ShouldStop(2097152);
_left = BA.numberCast(int.class, 1);Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 88;BA.debugLine="Dim top As Int = 0' baseLabel.Top + height";
Debug.ShouldStop(8388608);
_top = BA.numberCast(int.class, 0);Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 89;BA.debugLine="Dim lstPlayers As List = sql.GetPlayerList";
Debug.ShouldStop(16777216);
_lstplayers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstplayers = main._sql.runClassMethod (b4j.example.sqlite.class, "_getplayerlist" /*RemoteObject*/ );Debug.locals.put("lstPlayers", _lstplayers);Debug.locals.put("lstPlayers", _lstplayers);
 BA.debugLineNum = 90;BA.debugLine="Dim loopCount As Int = 0";
Debug.ShouldStop(33554432);
_loopcount = BA.numberCast(int.class, 0);Debug.locals.put("loopCount", _loopcount);Debug.locals.put("loopCount", _loopcount);
 BA.debugLineNum = 92;BA.debugLine="lstPlayerId.Initialize";
Debug.ShouldStop(134217728);
main._lstplayerid.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="For Each player As playerCurs In lstPlayers";
Debug.ShouldStop(268435456);
{
final RemoteObject group8 = _lstplayers;
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_player = (group8.runMethod(false,"Get",index8));Debug.locals.put("player", _player);
Debug.locals.put("player", _player);
 BA.debugLineNum = 94;BA.debugLine="Dim playerId As playerIdForGrid";
Debug.ShouldStop(536870912);
_playerid = RemoteObject.createNew ("b4j.example.main._playeridforgrid");Debug.locals.put("playerId", _playerid);
 BA.debugLineNum = 95;BA.debugLine="playerId.player1_id = player.player_id";
Debug.ShouldStop(1073741824);
_playerid.setField ("player1_id" /*RemoteObject*/ ,_player.getField(true,"player_id" /*RemoteObject*/ ));
 BA.debugLineNum = 96;BA.debugLine="lstPlayerId.Add(playerId)";
Debug.ShouldStop(-2147483648);
main._lstplayerid.runVoidMethod ("Add",(Object)((_playerid)));
 BA.debugLineNum = 97;BA.debugLine="loopCount = loopCount + 1";
Debug.ShouldStop(1);
_loopcount = RemoteObject.solve(new RemoteObject[] {_loopcount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("loopCount", _loopcount);
 BA.debugLineNum = 100;BA.debugLine="lbl = lblTest";
Debug.ShouldStop(8);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main._lbltest.getObject());
 BA.debugLineNum = 101;BA.debugLine="lbl.TooltipText = $\"Moyenne ${clsFunc.GetFormatN";
Debug.ShouldStop(16);
_lbl.runMethod(true,"setTooltipText",(RemoteObject.concat(RemoteObject.createImmutable("Moyenne "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((main._clsfunc.runClassMethod (b4j.example.funcclass.class, "_getformatnumber" /*RemoteObject*/ ,(Object)(_player.getField(true,"moyenne" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 3))).runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable(".")))))),RemoteObject.createImmutable(" Maken "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_player.getField(true,"to_make" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 102;BA.debugLine="lbl.Initialize(\"lblWeek\")";
Debug.ShouldStop(32);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 103;BA.debugLine="lbl.TextSize = 15";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 104;BA.debugLine="lbl.Alignment = \"CENTER_RIGHT\"";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 105;BA.debugLine="lbl.Tag = $\"speler-${player.player_id}-L${loopCo";
Debug.ShouldStop(256);
_lbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("speler-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_player.getField(true,"player_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("-L"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_loopcount))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 106;BA.debugLine="lbl.Text = player.player";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setText",_player.getField(true,"player" /*RemoteObject*/ ));
 BA.debugLineNum = 107;BA.debugLine="lbl.Style = \"-fx-padding: 0 10 0 0;\"";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setStyle",BA.ObjectToString("-fx-padding: 0 10 0 0;"));
 BA.debugLineNum = 108;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
Debug.ShouldStop(2048);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 4)));
 BA.debugLineNum = 109;BA.debugLine="p.AddNode(lbl, left, top, 210, 30)";
Debug.ShouldStop(4096);
_p.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, 210)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 111;BA.debugLine="top = top + 31";
Debug.ShouldStop(16384);
_top = RemoteObject.solve(new RemoteObject[] {_top,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("top", _top);
 }
}Debug.locals.put("player", _player);
;
 BA.debugLineNum = 114;BA.debugLine="SetHorizontalNames";
Debug.ShouldStop(131072);
_sethorizontalnames();
 BA.debugLineNum = 115;BA.debugLine="SetWeeks(lbl.Top, lstPlayers.Size)";
Debug.ShouldStop(262144);
_setweeks(BA.numberCast(int.class, _lbl.runMethod(true,"getTop")),_lstplayers.runMethod(true,"getSize"));
 BA.debugLineNum = 118;BA.debugLine="p.PrefHeight = (lstPlayers.Size * lblHeight) '+ 2";
Debug.ShouldStop(2097152);
_p.runMethod(true,"setPrefHeight",BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {_lstplayers.runMethod(true,"getSize"),main._lblheight}, "*",0, 1))));
 BA.debugLineNum = 119;BA.debugLine="ScrollPane2.InnerNode.PrefHeight = p.PrefHeight '";
Debug.ShouldStop(4194304);
main._scrollpane2.runMethod(false,"getInnerNode").runMethod(true,"setPrefHeight",_p.runMethod(true,"getPrefHeight"));
 BA.debugLineNum = 120;BA.debugLine="ScrollPane2.InnerNode.PrefWidth = (lstPlayers.Siz";
Debug.ShouldStop(8388608);
main._scrollpane2.runMethod(false,"getInnerNode").runMethod(true,"setPrefWidth",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_lstplayers.runMethod(true,"getSize"),RemoteObject.createImmutable(31)}, "*",0, 1)),RemoteObject.createImmutable(10)}, "+",1, 1)));
 BA.debugLineNum = 121;BA.debugLine="ScrollPane3.InnerNode.PrefWidth = (lstPlayers.Siz";
Debug.ShouldStop(16777216);
main._scrollpane3.runMethod(false,"getInnerNode").runMethod(true,"setPrefWidth",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_lstplayers.runMethod(true,"getSize"),RemoteObject.createImmutable(31)}, "*",0, 1)),RemoteObject.createImmutable(10)}, "+",1, 1)));
 BA.debugLineNum = 122;BA.debugLine="SetScrollbarSize(ScrollPane1, \"HORIZONTAL\", 20)";
Debug.ShouldStop(33554432);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._scrollpane1.getObject()),BA.ObjectToString("HORIZONTAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 123;BA.debugLine="SetScrollbarSize(ScrollPane2, \"VERTICAL\", 20)";
Debug.ShouldStop(67108864);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._scrollpane2.getObject()),BA.ObjectToString("VERTICAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 124;BA.debugLine="SetScrollbarSize(ScrollPane2, \"HORIZONTAL\", 20)";
Debug.ShouldStop(134217728);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._scrollpane2.getObject()),BA.ObjectToString("HORIZONTAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 125;BA.debugLine="SetScrollbarSize(ScrollPane3, \"VERTICAL\", 20)";
Debug.ShouldStop(268435456);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._scrollpane3.getObject()),BA.ObjectToString("VERTICAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setweeks(RemoteObject _top,RemoteObject _playercount) throws Exception{
try {
		Debug.PushSubsStack("SetWeeks (main) ","main",0,main.ba,main.mostCurrent,177);
if (RapidSub.canDelegate("setweeks")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setweeks", _top, _playercount);}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _playerid = RemoteObject.declareNull("b4j.example.main._playeridforgrid");
RemoteObject _pw = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
int _i = 0;
int _j = 0;
Debug.locals.put("top", _top);
Debug.locals.put("playerCount", _playercount);
 BA.debugLineNum = 177;BA.debugLine="Private Sub SetWeeks(top As Int, playerCount As In";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Dim left As Int";
Debug.ShouldStop(131072);
_left = RemoteObject.createImmutable(0);Debug.locals.put("left", _left);
 BA.debugLineNum = 179;BA.debugLine="Dim lbl As Label = lblTest";
Debug.ShouldStop(262144);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main._lbltest.getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 180;BA.debugLine="Dim playerId As playerIdForGrid";
Debug.ShouldStop(524288);
_playerid = RemoteObject.createNew ("b4j.example.main._playeridforgrid");Debug.locals.put("playerId", _playerid);
 BA.debugLineNum = 181;BA.debugLine="Dim pw As Pane= ScrollPane2.InnerNode";
Debug.ShouldStop(1048576);
_pw = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane2.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pw", _pw);
 BA.debugLineNum = 182;BA.debugLine="left = 5";
Debug.ShouldStop(2097152);
_left = BA.numberCast(int.class, 5);Debug.locals.put("left", _left);
 BA.debugLineNum = 183;BA.debugLine="top = 0";
Debug.ShouldStop(4194304);
_top = BA.numberCast(int.class, 0);Debug.locals.put("top", _top);
 BA.debugLineNum = 184;BA.debugLine="playerId.Initialize";
Debug.ShouldStop(8388608);
_playerid.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="For i = 1 To playerCount";
Debug.ShouldStop(33554432);
{
final int step8 = 1;
final int limit8 = _playercount.<Integer>get().intValue();
_i = 1 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="left = 5";
Debug.ShouldStop(67108864);
_left = BA.numberCast(int.class, 5);Debug.locals.put("left", _left);
 BA.debugLineNum = 188;BA.debugLine="For j = 1 To playerCount";
Debug.ShouldStop(134217728);
{
final int step10 = 1;
final int limit10 = _playercount.<Integer>get().intValue();
_j = 1 ;
for (;(step10 > 0 && _j <= limit10) || (step10 < 0 && _j >= limit10) ;_j = ((int)(0 + _j + step10))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 189;BA.debugLine="playerId = lstPlayerId.Get(j-1)";
Debug.ShouldStop(268435456);
_playerid = (main._lstplayerid.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_j),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("playerId", _playerid);
 BA.debugLineNum = 191;BA.debugLine="lbl.id = \"lbl\"&i&\"\"&DateTime.GetYear(DateTime.N";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setId",RemoteObject.concat(RemoteObject.createImmutable("lbl"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(""),main.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 192;BA.debugLine="If i <> j Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),BA.numberCast(int.class, _j))) { 
 BA.debugLineNum = 193;BA.debugLine="lbl.Initialize(\"lblWeek\")";
Debug.ShouldStop(1);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 }else {
 BA.debugLineNum = 195;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(4);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 196;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Lig";
Debug.ShouldStop(8);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"LightGray")));
 };
 BA.debugLineNum = 199;BA.debugLine="lbl.Tag = $\"week-${i}-${j}\"$";
Debug.ShouldStop(64);
_lbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("week-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_j)))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 200;BA.debugLine="lbl.TextSize = lblTest.TextSize";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setTextSize",main._lbltest.runMethod(true,"getTextSize"));
 BA.debugLineNum = 201;BA.debugLine="lbl.Alignment = \"CENTER\"";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 202;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 2)";
Debug.ShouldStop(512);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 2)));
 BA.debugLineNum = 204;BA.debugLine="pw.AddNode(lbl, left, top, 30, 30)";
Debug.ShouldStop(2048);
_pw.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, 30)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 205;BA.debugLine="left = left+31";
Debug.ShouldStop(4096);
_left = RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("left", _left);
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 207;BA.debugLine="top = top + 31";
Debug.ShouldStop(16384);
_top = RemoteObject.solve(new RemoteObject[] {_top,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("top", _top);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}