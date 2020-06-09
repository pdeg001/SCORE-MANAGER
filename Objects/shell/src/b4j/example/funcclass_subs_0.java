package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funcclass_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
funcclass._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",funcclass._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private numFormat As B4XFormatter";
funcclass._numformat = RemoteObject.createNew ("b4j.example.b4xformatter");__ref.setField("_numformat",funcclass._numformat);
 //BA.debugLineNum = 4;BA.debugLine="Private DefaultFormat As B4XFormatData";
funcclass._defaultformat = RemoteObject.createNew ("b4j.example.b4xformatter._b4xformatdata");__ref.setField("_defaultformat",funcclass._defaultformat);
 //BA.debugLineNum = 5;BA.debugLine="Private disableCloseForm As Boolean";
funcclass._disablecloseform = RemoteObject.createImmutable(false);__ref.setField("_disablecloseform",funcclass._disablecloseform);
 //BA.debugLineNum = 6;BA.debugLine="Private RegexPattern As String 'ignore";
funcclass._regexpattern = RemoteObject.createImmutable("");__ref.setField("_regexpattern",funcclass._regexpattern);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configurefornumbers(RemoteObject __ref,RemoteObject _allowdecimals,RemoteObject _allownegative,RemoteObject _edtfield) throws Exception{
try {
		Debug.PushSubsStack("ConfigureForNumbers (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("configurefornumbers")) { return __ref.runUserSub(false, "funcclass","configurefornumbers", __ref, _allowdecimals, _allownegative, _edtfield);}
RemoteObject _mallowdecimals = RemoteObject.createImmutable("");
Debug.locals.put("AllowDecimals", _allowdecimals);
Debug.locals.put("AllowNegative", _allownegative);
Debug.locals.put("edtField", _edtfield);
 BA.debugLineNum = 78;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
Debug.ShouldStop(8192);
 BA.debugLineNum = 97;BA.debugLine="If AllowDecimals And AllowNegative Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean(".",_allownegative)) { 
 BA.debugLineNum = 98;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
Debug.ShouldStop(2);
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 99;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean("=",_allownegative,funcclass.__c.getField(true,"False"))) { 
 BA.debugLineNum = 100;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
Debug.ShouldStop(8);
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 101;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_allowdecimals,funcclass.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,funcclass.__c.getField(true,"True"))) { 
 BA.debugLineNum = 102;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
Debug.ShouldStop(32);
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)$"));
 }else 
{ BA.debugLineNum = 103;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_allowdecimals,funcclass.__c.getField(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,funcclass.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
Debug.ShouldStop(128);
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)$"));
 }}}}
;
 BA.debugLineNum = 106;BA.debugLine="mAllowDecimals = AllowDecimals 'ignore";
Debug.ShouldStop(512);
_mallowdecimals = BA.ObjectToString(_allowdecimals);Debug.locals.put("mallowdecimals", _mallowdecimals);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createplayercurs(RemoteObject __ref,RemoteObject _player_id,RemoteObject _player,RemoteObject _moyenne,RemoteObject _to_make) throws Exception{
try {
		Debug.PushSubsStack("CreateplayerCurs (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("createplayercurs")) { return __ref.runUserSub(false, "funcclass","createplayercurs", __ref, _player_id, _player, _moyenne, _to_make);}
RemoteObject _t1 = RemoteObject.declareNull("b4j.example.main._playercurs");
Debug.locals.put("player_id", _player_id);
Debug.locals.put("player", _player);
Debug.locals.put("moyenne", _moyenne);
Debug.locals.put("to_make", _to_make);
 BA.debugLineNum = 15;BA.debugLine="Public Sub CreateplayerCurs (player_id As Int, pla";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Dim t1 As playerCurs";
Debug.ShouldStop(32768);
_t1 = RemoteObject.createNew ("b4j.example.main._playercurs");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 17;BA.debugLine="t1.Initialize";
Debug.ShouldStop(65536);
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 18;BA.debugLine="t1.player_id = player_id";
Debug.ShouldStop(131072);
_t1.setField ("player_id" /*RemoteObject*/ ,_player_id);
 BA.debugLineNum = 19;BA.debugLine="t1.player = player";
Debug.ShouldStop(262144);
_t1.setField ("player" /*RemoteObject*/ ,_player);
 BA.debugLineNum = 20;BA.debugLine="t1.moyenne = moyenne";
Debug.ShouldStop(524288);
_t1.setField ("moyenne" /*RemoteObject*/ ,BA.numberCast(float.class, _moyenne));
 BA.debugLineNum = 21;BA.debugLine="t1.to_make = to_make";
Debug.ShouldStop(1048576);
_t1.setField ("to_make" /*RemoteObject*/ ,_to_make);
 BA.debugLineNum = 22;BA.debugLine="Return t1";
Debug.ShouldStop(2097152);
if (true) return _t1;
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _displaydouble(RemoteObject __ref,RemoteObject _language,RemoteObject _region,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("DisplayDouble (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("displaydouble")) { return __ref.runUserSub(false, "funcclass","displaydouble", __ref, _language, _region, _number);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _locale = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _numberformatter = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _retval = RemoteObject.createImmutable("");
Debug.locals.put("language", _language);
Debug.locals.put("region", _region);
Debug.locals.put("number", _number);
 BA.debugLineNum = 69;BA.debugLine="Sub DisplayDouble(language As String, region As St";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(32);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 71;BA.debugLine="jo = jo.InitializeNewInstance(\"java.util.Locale.B";
Debug.ShouldStop(64);
_jo = _jo.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("java.util.Locale.Builder")),(Object)((funcclass.__c.getField(false,"Null"))));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 72;BA.debugLine="Dim locale As JavaObject = jo.RunMethodJO(\"setLan";
Debug.ShouldStop(128);
_locale = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_locale = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("setLanguage")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_language)}))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("setRegion")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_region)}))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("build")),(Object)((funcclass.__c.getField(false,"Null")))));Debug.locals.put("locale", _locale);
 BA.debugLineNum = 73;BA.debugLine="Dim numberFormatter As JavaObject = jo.Initialize";
Debug.ShouldStop(256);
_numberformatter = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_numberformatter = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("java.text.NumberFormat"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getNumberInstance")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_locale.getObject())}))));Debug.locals.put("numberFormatter", _numberformatter);
 BA.debugLineNum = 74;BA.debugLine="Dim retVal As String = numberFormatter.RunMethod(";
Debug.ShouldStop(512);
_retval = BA.ObjectToString(_numberformatter.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_number)}))));Debug.locals.put("retVal", _retval);Debug.locals.put("retVal", _retval);
 BA.debugLineNum = 75;BA.debugLine="Return retVal";
Debug.ShouldStop(1024);
if (true) return _retval;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdecimalvaluetointvalue(RemoteObject __ref,RemoteObject _decimal) throws Exception{
try {
		Debug.PushSubsStack("GetDecimalValueToIntValue (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("getdecimalvaluetointvalue")) { return __ref.runUserSub(false, "funcclass","getdecimalvaluetointvalue", __ref, _decimal);}
Debug.locals.put("decimal", _decimal);
 BA.debugLineNum = 36;BA.debugLine="Public Sub GetDecimalValueToIntValue(decimal As Fl";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return SetDecimalToInt(decimal)";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4j.example.funcclass.class, "_setdecimaltoint" /*RemoteObject*/ ,(Object)(_decimal));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdisablecloseform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDisableCloseForm (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("getdisablecloseform")) { return __ref.runUserSub(false, "funcclass","getdisablecloseform", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Public Sub GetDisableCloseForm As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Return disableCloseForm";
Debug.ShouldStop(65536);
if (true) return __ref.getField(true,"_disablecloseform" /*RemoteObject*/ );
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
public static RemoteObject  _getformatnumber(RemoteObject __ref,RemoteObject _number,RemoteObject _minfractions,RemoteObject _maxfractions) throws Exception{
try {
		Debug.PushSubsStack("GetFormatNumber (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("getformatnumber")) { return __ref.runUserSub(false, "funcclass","getformatnumber", __ref, _number, _minfractions, _maxfractions);}
Debug.locals.put("number", _number);
Debug.locals.put("minFractions", _minfractions);
Debug.locals.put("maxFractions", _maxfractions);
 BA.debugLineNum = 25;BA.debugLine="Public Sub GetFormatNumber(number As Float, minFra";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Return SetNumberFormat(number, minFractions, maxF";
Debug.ShouldStop(33554432);
if (true) return __ref.runClassMethod (b4j.example.funcclass.class, "_setnumberformat" /*RemoteObject*/ ,(Object)(_number),(Object)(_minfractions),(Object)(_maxfractions));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "funcclass","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="numFormat.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_numformat" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetclvselectedcolor(RemoteObject __ref,RemoteObject _clv) throws Exception{
try {
		Debug.PushSubsStack("ResetClvSelectedColor (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("resetclvselectedcolor")) { return __ref.runUserSub(false, "funcclass","resetclvselectedcolor", __ref, _clv);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
int _i = 0;
Debug.locals.put("clv", _clv);
 BA.debugLineNum = 60;BA.debugLine="Public Sub ResetClvSelectedColor(clv As CustomList";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Dim p As Pane";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 63;BA.debugLine="For i = 0 To clv.Size -1";
Debug.ShouldStop(1073741824);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_clv.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 64;BA.debugLine="p = clv.GetPanel(i)";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _clv.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 65;BA.debugLine="CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Col";
Debug.ShouldStop(1);
funcclass._cssutils.runVoidMethod ("_setbackgroundcolor",(Object)(_p.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"White")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclvselectedcolor(RemoteObject __ref,RemoteObject _clv,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SetClvSelectedColor (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setclvselectedcolor")) { return __ref.runUserSub(false, "funcclass","setclvselectedcolor", __ref, _clv, _index);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
Debug.locals.put("clv", _clv);
Debug.locals.put("index", _index);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetClvSelectedColor(clv As CustomListVi";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim p As Pane";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 54;BA.debugLine="ResetClvSelectedColor(clv)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.example.funcclass.class, "_resetclvselectedcolor" /*RemoteObject*/ ,(Object)(_clv));
 BA.debugLineNum = 55;BA.debugLine="p = clv.GetPanel(index)";
Debug.ShouldStop(4194304);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper"), _clv.runMethod(false,"_getpanel",(Object)(_index)).getObject());
 BA.debugLineNum = 56;BA.debugLine="CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Colo";
Debug.ShouldStop(8388608);
funcclass._cssutils.runVoidMethod ("_setbackgroundcolor",(Object)(_p.runMethod(false,"GetNode",(Object)(BA.numberCast(int.class, 0)))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.JFX.PaintWrapper"), __ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Colors").getField(false,"LightGray")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdecimaltoint(RemoteObject __ref,RemoteObject _decimal) throws Exception{
try {
		Debug.PushSubsStack("SetDecimalToInt (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setdecimaltoint")) { return __ref.runUserSub(false, "funcclass","setdecimaltoint", __ref, _decimal);}
Debug.locals.put("decimal", _decimal);
 BA.debugLineNum = 40;BA.debugLine="Private Sub SetDecimalToInt(decimal As Float) As I";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Return decimal*1000";
Debug.ShouldStop(256);
if (true) return BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_decimal,RemoteObject.createImmutable(1000)}, "*",0, 0));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisablecloseform(RemoteObject __ref,RemoteObject _disable) throws Exception{
try {
		Debug.PushSubsStack("SetDisableCloseForm (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setdisablecloseform")) { return __ref.runUserSub(false, "funcclass","setdisablecloseform", __ref, _disable);}
Debug.locals.put("disable", _disable);
 BA.debugLineNum = 44;BA.debugLine="Public Sub SetDisableCloseForm(disable As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="disableCloseForm = disable";
Debug.ShouldStop(4096);
__ref.setField ("_disablecloseform" /*RemoteObject*/ ,_disable);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberformat(RemoteObject __ref,RemoteObject _number,RemoteObject _minfractions,RemoteObject _maxfractions) throws Exception{
try {
		Debug.PushSubsStack("SetNumberFormat (funcclass) ","funcclass",3,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setnumberformat")) { return __ref.runUserSub(false, "funcclass","setnumberformat", __ref, _number, _minfractions, _maxfractions);}
Debug.locals.put("number", _number);
Debug.locals.put("minFractions", _minfractions);
Debug.locals.put("maxFractions", _maxfractions);
 BA.debugLineNum = 29;BA.debugLine="Private Sub SetNumberFormat(number As Float, minFr";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="numFormat.GetDefaultFormat.FractionPaddingChar =";
Debug.ShouldStop(536870912);
__ref.getField(false,"_numformat" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_getdefaultformat" /*RemoteObject*/ ).setField ("FractionPaddingChar" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 31;BA.debugLine="DefaultFormat.MinimumFractions = minFractions";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_defaultformat" /*RemoteObject*/ ).setField ("MinimumFractions" /*RemoteObject*/ ,_minfractions);
 BA.debugLineNum = 32;BA.debugLine="DefaultFormat.MaximumFractions = maxFractions";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_defaultformat" /*RemoteObject*/ ).setField ("MaximumFractions" /*RemoteObject*/ ,_maxfractions);
 BA.debugLineNum = 33;BA.debugLine="Return numFormat.Format(number)";
Debug.ShouldStop(1);
if (true) return __ref.getField(false,"_numformat" /*RemoteObject*/ ).runClassMethod (b4j.example.b4xformatter.class, "_format" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _number)));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}