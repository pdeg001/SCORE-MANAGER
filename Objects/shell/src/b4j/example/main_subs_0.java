package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,48);
if (RapidSub.canDelegate("application_error")) { return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 48;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
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
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,22);
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
 BA.debugLineNum = 23;BA.debugLine="sp.Initialize(\"SP\")";
Debug.ShouldStop(4194304);
parent._sp.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("SP")));
 BA.debugLineNum = 25;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(16777216);
parent._mainform = _form1;
 BA.debugLineNum = 26;BA.debugLine="MainForm.RootPane.LoadLayout(\"main\") 'Load the la";
Debug.ShouldStop(33554432);
parent._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("main")));
 BA.debugLineNum = 27;BA.debugLine="MainForm.WindowHeight = 720";
Debug.ShouldStop(67108864);
parent._mainform.runMethod(true,"setWindowHeight",BA.numberCast(double.class, 720));
 BA.debugLineNum = 28;BA.debugLine="MainForm.WindowWidth = 1024";
Debug.ShouldStop(134217728);
parent._mainform.runMethod(true,"setWindowWidth",BA.numberCast(double.class, 1024));
 BA.debugLineNum = 29;BA.debugLine="MainForm.Resizable = True";
Debug.ShouldStop(268435456);
parent._mainform.runMethod(true,"setResizable",parent.__c.getField(true,"True"));
 BA.debugLineNum = 30;BA.debugLine="MainForm.Show";
Debug.ShouldStop(536870912);
parent._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 33;BA.debugLine="ScrollPane1.LoadLayout(\"scrollpane\",ScrollPane1.W";
Debug.ShouldStop(1);
parent._scrollpane1.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(RemoteObject.solve(new RemoteObject[] {parent._scrollpane1.runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 34;BA.debugLine="ScrollPane2.LoadLayout(\"scrollpane\",0 ,0)";
Debug.ShouldStop(2);
parent._scrollpane2.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 35;BA.debugLine="ScrollPane3.LoadLayout(\"scrollpane\",0 ,0)";
Debug.ShouldStop(4);
parent._scrollpane3.runVoidMethodAndSync ("LoadLayout",main.ba,(Object)(BA.ObjectToString("scrollpane")),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 38;BA.debugLine="ScrollPane2.SetHScrollVisibility(\"ALWAYS\")";
Debug.ShouldStop(32);
parent._scrollpane2.runVoidMethod ("SetHScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 BA.debugLineNum = 39;BA.debugLine="ScrollPane1.SetHScrollVisibility(\"ALWAYS\")";
Debug.ShouldStop(64);
parent._scrollpane1.runVoidMethod ("SetHScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("ALWAYS"))));
 BA.debugLineNum = 41;BA.debugLine="ScrollPane1.SetVScrollVisibility(\"NEVER\")";
Debug.ShouldStop(256);
parent._scrollpane1.runVoidMethod ("SetVScrollVisibility",(Object)(BA.getEnumFromString(BA.getDeviceClass("javafx.scene.control.ScrollPane.ScrollBarPolicy"),RemoteObject.createImmutable("NEVER"))));
 BA.debugLineNum = 42;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "appstart"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 43;BA.debugLine="lblTest.Text = \"Sjaak van Duivenvoorde\"";
Debug.ShouldStop(1024);
parent._lbltest.runMethod(true,"setText",BA.ObjectToString("Sjaak van Duivenvoorde"));
 BA.debugLineNum = 44;BA.debugLine="SetLabels";
Debug.ShouldStop(2048);
_setlabels();
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _highlitespeler(RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("HighliteSpeler (main) ","main",0,main.ba,main.mostCurrent,182);
if (RapidSub.canDelegate("highlitespeler")) { return b4j.example.main.remoteMe.runUserSub(false, "main","highlitespeler", _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 182;BA.debugLine="Private Sub HighliteSpeler(v As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="CSSUtils.SetBackgroundColor(v, fx.Colors.Yellow)";
Debug.ShouldStop(4194304);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _v.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Yellow")));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Label1_MouseEntered (main) ","main",0,main.ba,main.mostCurrent,137);
if (RapidSub.canDelegate("label1_mouseentered")) { return b4j.example.main.remoteMe.runUserSub(false, "main","label1_mouseentered", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 137;BA.debugLine="Sub Label1_MouseEntered (EventData As MouseEvent)";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Label1_MouseExited (main) ","main",0,main.ba,main.mostCurrent,141);
if (RapidSub.canDelegate("label1_mouseexited")) { return b4j.example.main.remoteMe.runUserSub(false, "main","label1_mouseexited", _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 141;BA.debugLine="Sub Label1_MouseExited (EventData As MouseEvent)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("LblWeek_MouseEntered (main) ","main",0,main.ba,main.mostCurrent,154);
if (RapidSub.canDelegate("lblweek_mouseentered")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lblweek_mouseentered", _eventdata);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _tag = RemoteObject.createImmutable("");
RemoteObject _str = null;
RemoteObject _pn = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 154;BA.debugLine="Sub LblWeek_MouseEntered (EventData As MouseEvent)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(67108864);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 156;BA.debugLine="lbl = Sender";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 157;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Yellow";
Debug.ShouldStop(268435456);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Yellow")));
 BA.debugLineNum = 158;BA.debugLine="Dim tag As String = lbl.Tag";
Debug.ShouldStop(536870912);
_tag = BA.ObjectToString(_lbl.runMethod(false,"getTag"));Debug.locals.put("tag", _tag);Debug.locals.put("tag", _tag);
 BA.debugLineNum = 159;BA.debugLine="If tag.IndexOf(\"week\") > -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_tag.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("week"))),BA.numberCast(int.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 160;BA.debugLine="Dim str() As String";
Debug.ShouldStop(-2147483648);
_str = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("str", _str);
 BA.debugLineNum = 161;BA.debugLine="str = Regex.Split(\"-\", tag)";
Debug.ShouldStop(1);
_str = main.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_tag));Debug.locals.put("str", _str);
 BA.debugLineNum = 163;BA.debugLine="Dim pn As Pane = ScrollPane1.InnerNode";
Debug.ShouldStop(4);
_pn = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane1.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pn", _pn);
 BA.debugLineNum = 164;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
Debug.ShouldStop(8);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group9 = _pn.runMethod(false,"GetAllViewsRecursive");
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group9.runMethod(false,"Get",index9));
Debug.locals.put("v", _v);
 BA.debugLineNum = 165;BA.debugLine="If v.Tag = $\"speler${str(1)}L\"$ Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),((RemoteObject.concat(RemoteObject.createImmutable("speler"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str.getArrayElement(true,BA.numberCast(int.class, 1))))),RemoteObject.createImmutable("L")))))) { 
 BA.debugLineNum = 166;BA.debugLine="pleft = v";
Debug.ShouldStop(32);
main._pleft = _v;
 BA.debugLineNum = 167;BA.debugLine="HighliteSpeler(v)";
Debug.ShouldStop(64);
_highlitespeler(_v);
 BA.debugLineNum = 168;BA.debugLine="Exit";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 171;BA.debugLine="pn = ScrollPane3.InnerNode";
Debug.ShouldStop(1024);
_pn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane3.runMethod(false,"getInnerNode").getObject());
 BA.debugLineNum = 172;BA.debugLine="For Each v As B4XView In pn.GetAllViewsRecursive";
Debug.ShouldStop(2048);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group17 = _pn.runMethod(false,"GetAllViewsRecursive");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group17.runMethod(false,"Get",index17));
Debug.locals.put("v", _v);
 BA.debugLineNum = 173;BA.debugLine="If v.Tag = $\"speler${str(2)}T\"$ Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"getTag"),((RemoteObject.concat(RemoteObject.createImmutable("speler"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_str.getArrayElement(true,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable("T")))))) { 
 BA.debugLineNum = 174;BA.debugLine="ptop = v";
Debug.ShouldStop(8192);
main._ptop = _v;
 BA.debugLineNum = 175;BA.debugLine="HighliteSpeler(v)";
Debug.ShouldStop(16384);
_highlitespeler(_v);
 BA.debugLineNum = 176;BA.debugLine="Exit";
Debug.ShouldStop(32768);
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("lblWeek_MouseExited (main) ","main",0,main.ba,main.mostCurrent,145);
if (RapidSub.canDelegate("lblweek_mouseexited")) { return b4j.example.main.remoteMe.runUserSub(false, "main","lblweek_mouseexited", _eventdata);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 145;BA.debugLine="Sub lblWeek_MouseExited (EventData As MouseEvent)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 146;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 147;BA.debugLine="lbl = Sender";
Debug.ShouldStop(262144);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main.__c.runMethod(false,"Sender",main.ba));
 BA.debugLineNum = 148;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.White)";
Debug.ShouldStop(524288);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
 BA.debugLineNum = 150;BA.debugLine="CSSUtils.SetBackgroundColor(ptop, fx.Colors.White";
Debug.ShouldStop(2097152);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main._ptop.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
 BA.debugLineNum = 151;BA.debugLine="CSSUtils.SetBackgroundColor(pleft, fx.Colors.Whit";
Debug.ShouldStop(4194304);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), main._pleft.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"White")));
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

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
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
b4xformatter.myClass = BA.getDeviceClass ("b4j.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4j.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4j.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4j.example.swiftbutton");
b4jtextflow.myClass = BA.getDeviceClass ("b4j.example.b4jtextflow");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 9;BA.debugLine="Private lblTest As B4XView";
main._lbltest = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim sp As ScrollPane";
main._sp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private ScrollPane1 As ScrollPane";
main._scrollpane1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblBaseweek As Label";
main._lblbaseweek = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private ScrollPane2 As ScrollPane";
main._scrollpane2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private lblHeight As Int = 30";
main._lblheight = BA.numberCast(int.class, 30);
 //BA.debugLineNum = 16;BA.debugLine="Private ScrollPane3 As ScrollPane";
main._scrollpane3 = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private currWeek As Int";
main._currweek = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim Label1 As Label";
main._label1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ptop, pleft As B4XView' = Label1";
main._ptop = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
main._pleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scrollpane1_vscrollchanged(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("ScrollPane1_VScrollChanged (main) ","main",0,main.ba,main.mostCurrent,217);
if (RapidSub.canDelegate("scrollpane1_vscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane1_vscrollchanged", _position);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 217;BA.debugLine="Sub ScrollPane1_VScrollChanged (Position As Double";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
Debug.ShouldStop(33554432);
main._scrollpane2.runMethod(true,"setVPosition",main._scrollpane1.runMethod(true,"getVPosition"));
 BA.debugLineNum = 219;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 220;BA.debugLine="Dim p As ScrollPane = Sender";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("p", _p);
 BA.debugLineNum = 222;BA.debugLine="If p.tag = \"sp1\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("sp1")))) { 
 BA.debugLineNum = 223;BA.debugLine="ScrollPane2.VPosition = Position";
Debug.ShouldStop(1073741824);
main._scrollpane2.runMethod(true,"setVPosition",_position);
 BA.debugLineNum = 224;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
Debug.ShouldStop(-2147483648);
main._scrollpane2.runMethod(true,"setVPosition",main._scrollpane1.runMethod(true,"getVPosition"));
 BA.debugLineNum = 225;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 226;BA.debugLine="else if p.Tag = \"sp2\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("sp2")))) { 
 BA.debugLineNum = 228;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("ScrollPane2_HScrollChanged (main) ","main",0,main.ba,main.mostCurrent,247);
if (RapidSub.canDelegate("scrollpane2_hscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane2_hscrollchanged", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 247;BA.debugLine="Sub ScrollPane2_HScrollChanged (Position As Double";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="ScrollPane3.HPosition = Position";
Debug.ShouldStop(8388608);
main._scrollpane3.runMethod(true,"setHPosition",_position);
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("ScrollPane2_VScrollChanged (main) ","main",0,main.ba,main.mostCurrent,232);
if (RapidSub.canDelegate("scrollpane2_vscrollchanged")) { return b4j.example.main.remoteMe.runUserSub(false, "main","scrollpane2_vscrollchanged", _position);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 232;BA.debugLine="Sub ScrollPane2_VScrollChanged (Position As Double";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="ScrollPane1.VPosition = ScrollPane2.VPosition";
Debug.ShouldStop(256);
main._scrollpane1.runMethod(true,"setVPosition",main._scrollpane2.runMethod(true,"getVPosition"));
 BA.debugLineNum = 234;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 235;BA.debugLine="Dim p As ScrollPane = Sender";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.ScrollPaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ScrollPaneWrapper"), main.__c.runMethod(false,"Sender",main.ba));Debug.locals.put("p", _p);
 BA.debugLineNum = 237;BA.debugLine="If p.tag = \"sp1\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("sp1")))) { 
 BA.debugLineNum = 238;BA.debugLine="ScrollPane2.VPosition = Position";
Debug.ShouldStop(8192);
main._scrollpane2.runMethod(true,"setVPosition",_position);
 BA.debugLineNum = 239;BA.debugLine="ScrollPane2.VPosition = ScrollPane1.VPosition";
Debug.ShouldStop(16384);
main._scrollpane2.runMethod(true,"setVPosition",main._scrollpane1.runMethod(true,"getVPosition"));
 BA.debugLineNum = 240;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 241;BA.debugLine="else if p.Tag = \"sp2\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("sp2")))) { 
 BA.debugLineNum = 243;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabels() throws Exception{
try {
		Debug.PushSubsStack("SetLabels (main) ","main",0,main.ba,main.mostCurrent,52);
if (RapidSub.canDelegate("setlabels")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setlabels");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
RemoteObject _baselabel = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _top = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 52;BA.debugLine="Sub SetLabels";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim p As Pane= ScrollPane1.InnerNode";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane1.runMethod(false,"getInnerNode").getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 54;BA.debugLine="Dim baseLabel As Label' = lblTest";
Debug.ShouldStop(2097152);
_baselabel = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("baseLabel", _baselabel);
 BA.debugLineNum = 55;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4194304);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 56;BA.debugLine="Dim left As Int = 1'baseLabel.Left";
Debug.ShouldStop(8388608);
_left = BA.numberCast(int.class, 1);Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 57;BA.debugLine="Dim width As Int = ScrollPane1.Width-10";
Debug.ShouldStop(16777216);
_width = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {main._scrollpane1.runMethod(true,"getWidth"),RemoteObject.createImmutable(10)}, "-",1, 0));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 58;BA.debugLine="Dim top As Int = 0' baseLabel.Top + height";
Debug.ShouldStop(33554432);
_top = BA.numberCast(int.class, 0);Debug.locals.put("top", _top);Debug.locals.put("top", _top);
 BA.debugLineNum = 60;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = 30;
_i = 1 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 61;BA.debugLine="lbl = lblTest";
Debug.ShouldStop(268435456);
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main._lbltest.getObject());
 BA.debugLineNum = 62;BA.debugLine="lbl.Initialize(\"lblWeek\")";
Debug.ShouldStop(536870912);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 63;BA.debugLine="lbl.TextSize = 15";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 64;BA.debugLine="lbl.Alignment = \"CENTER_RIGHT\"";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 65;BA.debugLine="lbl.Tag = $\"speler${i}L\"$";
Debug.ShouldStop(1);
_lbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("speler"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("L")))));
 BA.debugLineNum = 66;BA.debugLine="lbl.Text = $\"SPELER ${i}\"$";
Debug.ShouldStop(2);
_lbl.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("SPELER "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 67;BA.debugLine="lbl.Style = \"-fx-padding: 0 10 0 0;\"";
Debug.ShouldStop(4);
_lbl.runMethod(true,"setStyle",BA.ObjectToString("-fx-padding: 0 10 0 0;"));
 BA.debugLineNum = 68;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
Debug.ShouldStop(8);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 4)));
 BA.debugLineNum = 69;BA.debugLine="p.AddNode(lbl, left, top, 210, 30)";
Debug.ShouldStop(16);
_p.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, 210)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 72;BA.debugLine="SetWeeks(lbl.Top, i)";
Debug.ShouldStop(128);
_setweeks(BA.numberCast(int.class, _lbl.runMethod(true,"getTop")),BA.numberCast(int.class, _i));
 BA.debugLineNum = 73;BA.debugLine="top = top + 30";
Debug.ShouldStop(256);
_top = RemoteObject.solve(new RemoteObject[] {_top,RemoteObject.createImmutable(30)}, "+",1, 1);Debug.locals.put("top", _top);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 75;BA.debugLine="SetNameRotated";
Debug.ShouldStop(1024);
_setnamerotated();
 BA.debugLineNum = 76;BA.debugLine="p.PrefHeight = (i * lblHeight) '+ 25";
Debug.ShouldStop(2048);
_p.runMethod(true,"setPrefHeight",BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),main._lblheight}, "*",0, 1))));
 BA.debugLineNum = 77;BA.debugLine="ScrollPane2.InnerNode.PrefHeight = p.PrefHeight '";
Debug.ShouldStop(4096);
main._scrollpane2.runMethod(false,"getInnerNode").runMethod(true,"setPrefHeight",_p.runMethod(true,"getPrefHeight"));
 BA.debugLineNum = 78;BA.debugLine="ScrollPane2.InnerNode.PrefWidth = (39 * 31) + 10";
Debug.ShouldStop(8192);
main._scrollpane2.runMethod(false,"getInnerNode").runMethod(true,"setPrefWidth",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(39),RemoteObject.createImmutable(31)}, "*",0, 1)),RemoteObject.createImmutable(10)}, "+",1, 1)));
 BA.debugLineNum = 79;BA.debugLine="ScrollPane3.InnerNode.PrefWidth = (39 * 31) + 10";
Debug.ShouldStop(16384);
main._scrollpane3.runMethod(false,"getInnerNode").runMethod(true,"setPrefWidth",BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(39),RemoteObject.createImmutable(31)}, "*",0, 1)),RemoteObject.createImmutable(10)}, "+",1, 1)));
 BA.debugLineNum = 80;BA.debugLine="SetScrollbarSize(ScrollPane2, \"VERTICAL\", 20)";
Debug.ShouldStop(32768);
_setscrollbarsize(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), main._scrollpane2.getObject()),BA.ObjectToString("VERTICAL"),BA.numberCast(double.class, 20));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnamerotated() throws Exception{
try {
		Debug.PushSubsStack("SetNameRotated (main) ","main",0,main.ba,main.mostCurrent,83);
if (RapidSub.canDelegate("setnamerotated")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setnamerotated");}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _baselbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _pw1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
int _i = 0;
 BA.debugLineNum = 83;BA.debugLine="Private Sub SetNameRotated";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim left As Int";
Debug.ShouldStop(524288);
_left = RemoteObject.createImmutable(0);Debug.locals.put("left", _left);
 BA.debugLineNum = 85;BA.debugLine="Label1.Initialize(\"lblWeek\")";
Debug.ShouldStop(1048576);
main._label1.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 86;BA.debugLine="Dim baseLbl As B4XView = Label1";
Debug.ShouldStop(2097152);
_baselbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_baselbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._label1.getObject());Debug.locals.put("baseLbl", _baselbl);
 BA.debugLineNum = 88;BA.debugLine="Dim pw1 As Pane= ScrollPane3.InnerNode";
Debug.ShouldStop(8388608);
_pw1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pw1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane3.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pw1", _pw1);
 BA.debugLineNum = 89;BA.debugLine="left = 5";
Debug.ShouldStop(16777216);
_left = BA.numberCast(int.class, 5);Debug.locals.put("left", _left);
 BA.debugLineNum = 91;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(67108864);
{
final int step6 = 1;
final int limit6 = 30;
_i = 1 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 92;BA.debugLine="Label1.Initialize(\"lblWeek\")";
Debug.ShouldStop(134217728);
main._label1.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 BA.debugLineNum = 93;BA.debugLine="Label1.Alignment = \"CENTER_RIGHT\"";
Debug.ShouldStop(268435456);
main._label1.runMethod(true,"setAlignment",BA.ObjectToString("CENTER_RIGHT"));
 BA.debugLineNum = 94;BA.debugLine="baseLbl = Label1";
Debug.ShouldStop(536870912);
_baselbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), main._label1.getObject());
 BA.debugLineNum = 95;BA.debugLine="baseLbl.Rotation = 90";
Debug.ShouldStop(1073741824);
_baselbl.runMethod(true,"setRotation",BA.numberCast(double.class, 90));
 BA.debugLineNum = 96;BA.debugLine="CSSUtils.SetBorder(baseLbl, 1, fx.Colors.Gray, 4";
Debug.ShouldStop(-2147483648);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _baselbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 4)));
 BA.debugLineNum = 98;BA.debugLine="baseLbl= baseLbl";
Debug.ShouldStop(2);
_baselbl = _baselbl;Debug.locals.put("baseLbl", _baselbl);
 BA.debugLineNum = 99;BA.debugLine="baseLbl.Tag = $\"speler${i}T\"$";
Debug.ShouldStop(4);
_baselbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("speler"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("T")))));
 BA.debugLineNum = 101;BA.debugLine="baseLbl.Text = $\"SPELER ${i} \"$";
Debug.ShouldStop(16);
_baselbl.runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable("SPELER "),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(" "))));
 BA.debugLineNum = 102;BA.debugLine="baseLbl.TextSize = lblTest.TextSize";
Debug.ShouldStop(32);
_baselbl.runMethod(true,"setTextSize",main._lbltest.runMethod(true,"getTextSize"));
 BA.debugLineNum = 104;BA.debugLine="pw1.AddNode(baseLbl, left-70, 70, 170, 30)";
Debug.ShouldStop(128);
_pw1.runVoidMethod ("AddNode",(Object)((_baselbl.getObject())),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(70)}, "-",1, 1))),(Object)(BA.numberCast(double.class, 70)),(Object)(BA.numberCast(double.class, 170)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 105;BA.debugLine="left = left+31";
Debug.ShouldStop(256);
_left = RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("left", _left);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("SetScrollbarSize (main) ","main",0,main.ba,main.mostCurrent,190);
if (RapidSub.canDelegate("setscrollbarsize")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setscrollbarsize", _parent, _orientation, _size);}
RemoteObject _arr = null;
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _barorientation = RemoteObject.createImmutable("");
Debug.locals.put("Parent", _parent);
Debug.locals.put("Orientation", _orientation);
Debug.locals.put("Size", _size);
 BA.debugLineNum = 190;BA.debugLine="Public Sub SetScrollbarSize(Parent As JavaObject,";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 192;BA.debugLine="Dim Arr() As Object = Parent.RunMethodJO(\"lookupA";
Debug.ShouldStop(-2147483648);
_arr = (_parent.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("lookupAll")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(".scroll-bar"))}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toArray")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("Arr", _arr);Debug.locals.put("Arr", _arr);
 BA.debugLineNum = 194;BA.debugLine="For Each N As Node In Arr";
Debug.ShouldStop(2);
_n = RemoteObject.createNew ("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper");
{
final RemoteObject group2 = _arr;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_n = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), group2.getArrayElement(false,RemoteObject.createImmutable(index2)));
Debug.locals.put("N", _n);
 BA.debugLineNum = 197;BA.debugLine="If GetType(N) = \"com.sun.javafx.scene.control.sk";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("com.sun.javafx.scene.control.skin.VirtualScrollBar")) || RemoteObject.solveBoolean("=",main.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("javafx.scene.control.ScrollBar"))) { 
 BA.debugLineNum = 198;BA.debugLine="Dim SB As JavaObject = N";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_sb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _n.getObject());Debug.locals.put("SB", _sb);
 BA.debugLineNum = 201;BA.debugLine="Dim BarOrientation As String = SB.RunMethodJO(\"";
Debug.ShouldStop(256);
_barorientation = BA.ObjectToString(_sb.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getOrientation")),(Object)((main.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((main.__c.getField(false,"Null")))));Debug.locals.put("BarOrientation", _barorientation);Debug.locals.put("BarOrientation", _barorientation);
 BA.debugLineNum = 204;BA.debugLine="If BarOrientation = \"VERTICAL\" And (Orientation";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("VERTICAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 205;BA.debugLine="N.PrefWidth = Size";
Debug.ShouldStop(4096);
_n.runMethod(true,"setPrefWidth",_size);
 };
 BA.debugLineNum = 209;BA.debugLine="If BarOrientation = \"HORIZONTAL\" And (Orientati";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_barorientation,BA.ObjectToString("HORIZONTAL")) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_orientation,_barorientation) || RemoteObject.solveBoolean("=",_orientation,RemoteObject.createImmutable("BOTH")))))) { 
 BA.debugLineNum = 210;BA.debugLine="N.PrefHeight = Size";
Debug.ShouldStop(131072);
_n.runMethod(true,"setPrefHeight",_size);
 };
 };
 }
}Debug.locals.put("N", _n);
;
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
public static RemoteObject  _setweeks(RemoteObject _top,RemoteObject _num) throws Exception{
try {
		Debug.PushSubsStack("SetWeeks (main) ","main",0,main.ba,main.mostCurrent,111);
if (RapidSub.canDelegate("setweeks")) { return b4j.example.main.remoteMe.runUserSub(false, "main","setweeks", _top, _num);}
RemoteObject _left = RemoteObject.createImmutable(0);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _pw = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
int _i = 0;
Debug.locals.put("top", _top);
Debug.locals.put("num", _num);
 BA.debugLineNum = 111;BA.debugLine="Private Sub SetWeeks(top As Int, num As Int)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 112;BA.debugLine="Dim left As Int";
Debug.ShouldStop(32768);
_left = RemoteObject.createImmutable(0);Debug.locals.put("left", _left);
 BA.debugLineNum = 113;BA.debugLine="Dim lbl As Label = lblTest";
Debug.ShouldStop(65536);
_lbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), main._lbltest.getObject());Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 114;BA.debugLine="Dim pw As Pane= ScrollPane2.InnerNode";
Debug.ShouldStop(131072);
_pw = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
_pw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), main._scrollpane2.runMethod(false,"getInnerNode").getObject());Debug.locals.put("pw", _pw);
 BA.debugLineNum = 115;BA.debugLine="left = 5";
Debug.ShouldStop(262144);
_left = BA.numberCast(int.class, 5);Debug.locals.put("left", _left);
 BA.debugLineNum = 117;BA.debugLine="For i = 1 To 30";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = 30;
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 118;BA.debugLine="lbl.id = \"lbl\"&i&\"\"&DateTime.GetYear(DateTime.No";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setId",RemoteObject.concat(RemoteObject.createImmutable("lbl"),RemoteObject.createImmutable(_i),RemoteObject.createImmutable(""),main.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(main.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 119;BA.debugLine="If i <> num Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(_i),_num)) { 
 BA.debugLineNum = 120;BA.debugLine="lbl.Initialize(\"lblWeek\")";
Debug.ShouldStop(8388608);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("lblWeek")));
 }else {
 BA.debugLineNum = 123;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(67108864);
_lbl.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 124;BA.debugLine="CSSUtils.SetBackgroundColor(lbl, fx.Colors.Ligh";
Debug.ShouldStop(134217728);
main._cssutils.runVoidMethod ("_setbackgroundcolor",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"LightGray")));
 };
 BA.debugLineNum = 126;BA.debugLine="lbl.Tag = $\"week-${num}-${i}\"$";
Debug.ShouldStop(536870912);
_lbl.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable("week-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_num))),RemoteObject.createImmutable("-"),main.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 127;BA.debugLine="lbl.TextSize = lblTest.TextSize";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextSize",main._lbltest.runMethod(true,"getTextSize"));
 BA.debugLineNum = 128;BA.debugLine="lbl.Alignment = \"CENTER\"";
Debug.ShouldStop(-2147483648);
_lbl.runMethod(true,"setAlignment",BA.ObjectToString("CENTER"));
 BA.debugLineNum = 129;BA.debugLine="CSSUtils.SetBorder(lbl, 1, fx.Colors.Gray, 4)";
Debug.ShouldStop(1);
main._cssutils.runVoidMethod ("_setborder",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _lbl.getObject()),(Object)(BA.numberCast(double.class, 1)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), main._fx.getField(false,"Colors").getField(false,"Gray")),(Object)(BA.numberCast(double.class, 4)));
 BA.debugLineNum = 131;BA.debugLine="pw.AddNode(lbl, left, top, 30, 30)";
Debug.ShouldStop(4);
_pw.runVoidMethod ("AddNode",(Object)((_lbl.getObject())),(Object)(BA.numberCast(double.class, _left)),(Object)(BA.numberCast(double.class, _top)),(Object)(BA.numberCast(double.class, 30)),(Object)(BA.numberCast(double.class, 30)));
 BA.debugLineNum = 132;BA.debugLine="left = left+31";
Debug.ShouldStop(8);
_left = RemoteObject.solve(new RemoteObject[] {_left,RemoteObject.createImmutable(31)}, "+",1, 1);Debug.locals.put("left", _left);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}