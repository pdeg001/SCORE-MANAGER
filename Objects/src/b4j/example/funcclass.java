package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class funcclass extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.funcclass", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.funcclass.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.JFX _fx = null;
public b4j.example.b4xformatter _numformat = null;
public b4j.example.b4xformatter._b4xformatdata _defaultformat = null;
public boolean _disablecloseform = false;
public String _regexpattern = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.players _players = null;
public String  _initialize(b4j.example.funcclass __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="numFormat.Initialize";
__ref._numformat /*b4j.example.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisablecloseform(b4j.example.funcclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "getdisablecloseform", false))
	 {return ((Boolean) Debug.delegate(ba, "getdisablecloseform", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub GetDisableCloseForm As Boolean";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Return disableCloseForm";
if (true) return __ref._disablecloseform /*boolean*/ ;
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return false;
}
public String  _setdisablecloseform(b4j.example.funcclass __ref,boolean _disable) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "setdisablecloseform", false))
	 {return ((String) Debug.delegate(ba, "setdisablecloseform", new Object[] {_disable}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub SetDisableCloseForm(disable As Boolean)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="disableCloseForm = disable";
__ref._disablecloseform /*boolean*/  = _disable;
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return "";
}
public String  _getformatnumber(b4j.example.funcclass __ref,float _number,int _minfractions,int _maxfractions) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "getformatnumber", false))
	 {return ((String) Debug.delegate(ba, "getformatnumber", new Object[] {_number,_minfractions,_maxfractions}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub GetFormatNumber(number As Float, minFra";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return SetNumberFormat(number, minFractions, maxF";
if (true) return __ref._setnumberformat /*String*/ (null,_number,_minfractions,_maxfractions);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return "";
}
public b4j.example.main._playercurs  _createplayercurs(b4j.example.funcclass __ref,int _player_id,String _player,long _moyenne,int _to_make) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "createplayercurs", false))
	 {return ((b4j.example.main._playercurs) Debug.delegate(ba, "createplayercurs", new Object[] {_player_id,_player,_moyenne,_to_make}));}
b4j.example.main._playercurs _t1 = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub CreateplayerCurs (player_id As Int, pla";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim t1 As playerCurs";
_t1 = new b4j.example.main._playercurs();
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="t1.player_id = player_id";
_t1.player_id /*int*/  = _player_id;
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="t1.player = player";
_t1.player /*String*/  = _player;
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="t1.moyenne = moyenne";
_t1.moyenne /*float*/  = (float) (_moyenne);
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="t1.to_make = to_make";
_t1.to_make /*int*/  = _to_make;
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="End Sub";
return null;
}
public String  _setclvselectedcolor(b4j.example.funcclass __ref,b4j.example.customlistview _clv,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "setclvselectedcolor", false))
	 {return ((String) Debug.delegate(ba, "setclvselectedcolor", new Object[] {_clv,_index}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub SetClvSelectedColor(clv As CustomListVi";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="ResetClvSelectedColor(clv)";
__ref._resetclvselectedcolor /*String*/ (null,_clv);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="p = clv.GetPanel(index)";
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clv._getpanel(_index).getObject()));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Colo";
_cssutils._setbackgroundcolor(_p.GetNode((int) (0)),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.LightGray)));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="End Sub";
return "";
}
public String  _configurefornumbers(b4j.example.funcclass __ref,boolean _allowdecimals,boolean _allownegative,anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _edtfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "configurefornumbers", false))
	 {return ((String) Debug.delegate(ba, "configurefornumbers", new Object[] {_allowdecimals,_allownegative,_edtfield}));}
String _mallowdecimals = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
RDebugUtils.currentLine=3932179;
 //BA.debugLineNum = 3932179;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
RDebugUtils.currentLine=3932180;
 //BA.debugLineNum = 3932180;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=3932181;
 //BA.debugLineNum = 3932181;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
if (_allowdecimals && _allownegative==__c.False) { 
RDebugUtils.currentLine=3932182;
 //BA.debugLineNum = 3932182;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else 
{RDebugUtils.currentLine=3932183;
 //BA.debugLineNum = 3932183;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.True) { 
RDebugUtils.currentLine=3932184;
 //BA.debugLineNum = 3932184;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^-?(0|[1-9]\\d*)$";
 }else 
{RDebugUtils.currentLine=3932185;
 //BA.debugLineNum = 3932185;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
if (_allowdecimals==__c.False && _allownegative==__c.False) { 
RDebugUtils.currentLine=3932186;
 //BA.debugLineNum = 3932186;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref._regexpattern /*String*/  = "^(0|[1-9]\\d*)$";
 }}}}
;
RDebugUtils.currentLine=3932188;
 //BA.debugLineNum = 3932188;BA.debugLine="mAllowDecimals = AllowDecimals 'ignore";
_mallowdecimals = BA.ObjectToString(_allowdecimals);
RDebugUtils.currentLine=3932189;
 //BA.debugLineNum = 3932189;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.funcclass __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Private numFormat As B4XFormatter";
_numformat = new b4j.example.b4xformatter();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Private DefaultFormat As B4XFormatData";
_defaultformat = new b4j.example.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Private disableCloseForm As Boolean";
_disablecloseform = false;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Private RegexPattern As String 'ignore";
_regexpattern = "";
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="End Sub";
return "";
}
public String  _displaydouble(b4j.example.funcclass __ref,String _language,String _region,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "displaydouble", false))
	 {return ((String) Debug.delegate(ba, "displaydouble", new Object[] {_language,_region,_number}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _locale = null;
anywheresoftware.b4j.object.JavaObject _numberformatter = null;
String _retval = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub DisplayDouble(language As String, region As St";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="jo = jo.InitializeNewInstance(\"java.util.Locale.B";
_jo = _jo.InitializeNewInstance("java.util.Locale.Builder",(Object[])(__c.Null));
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim locale As JavaObject = jo.RunMethodJO(\"setLan";
_locale = new anywheresoftware.b4j.object.JavaObject();
_locale = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("setLanguage",new Object[]{(Object)(_language)}).RunMethodJO("setRegion",new Object[]{(Object)(_region)}).RunMethod("build",(Object[])(__c.Null))));
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Dim numberFormatter As JavaObject = jo.Initialize";
_numberformatter = new anywheresoftware.b4j.object.JavaObject();
_numberformatter = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeStatic("java.text.NumberFormat").RunMethod("getNumberInstance",new Object[]{(Object)(_locale.getObject())})));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Dim retVal As String = numberFormatter.RunMethod(";
_retval = BA.ObjectToString(_numberformatter.RunMethod("format",new Object[]{(Object)(_number)}));
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="Return retVal";
if (true) return _retval;
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="End Sub";
return "";
}
public int  _getdecimalvaluetointvalue(b4j.example.funcclass __ref,float _decimal) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "getdecimalvaluetointvalue", false))
	 {return ((Integer) Debug.delegate(ba, "getdecimalvaluetointvalue", new Object[] {_decimal}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub GetDecimalValueToIntValue(decimal As Fl";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Return SetDecimalToInt(decimal)";
if (true) return __ref._setdecimaltoint /*int*/ (null,_decimal);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="End Sub";
return 0;
}
public int  _setdecimaltoint(b4j.example.funcclass __ref,float _decimal) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "setdecimaltoint", false))
	 {return ((Integer) Debug.delegate(ba, "setdecimaltoint", new Object[] {_decimal}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Private Sub SetDecimalToInt(decimal As Float) As I";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return decimal*1000";
if (true) return (int) (_decimal*1000);
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return 0;
}
public String  _setnumberformat(b4j.example.funcclass __ref,float _number,int _minfractions,int _maxfractions) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "setnumberformat", false))
	 {return ((String) Debug.delegate(ba, "setnumberformat", new Object[] {_number,_minfractions,_maxfractions}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub SetNumberFormat(number As Float, minFr";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="numFormat.GetDefaultFormat.FractionPaddingChar =";
__ref._numformat /*b4j.example.b4xformatter*/ ._getdefaultformat /*b4j.example.b4xformatter._b4xformatdata*/ (null).FractionPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="DefaultFormat.MinimumFractions = minFractions";
__ref._defaultformat /*b4j.example.b4xformatter._b4xformatdata*/ .MinimumFractions /*int*/  = _minfractions;
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="DefaultFormat.MaximumFractions = maxFractions";
__ref._defaultformat /*b4j.example.b4xformatter._b4xformatdata*/ .MaximumFractions /*int*/  = _maxfractions;
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Return numFormat.Format(number)";
if (true) return __ref._numformat /*b4j.example.b4xformatter*/ ._format /*String*/ (null,_number);
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="End Sub";
return "";
}
public String  _resetclvselectedcolor(b4j.example.funcclass __ref,b4j.example.customlistview _clv) throws Exception{
__ref = this;
RDebugUtils.currentModule="funcclass";
if (Debug.shouldDelegate(ba, "resetclvselectedcolor", false))
	 {return ((String) Debug.delegate(ba, "resetclvselectedcolor", new Object[] {_clv}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
int _i = 0;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub ResetClvSelectedColor(clv As CustomList";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="For i = 0 To clv.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (_clv._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="p = clv.GetPanel(i)";
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_clv._getpanel(_i).getObject()));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="CSSUtils.SetBackgroundColor(p.GetNode(0), fx.Col";
_cssutils._setbackgroundcolor(_p.GetNode((int) (0)),(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.White)));
 }
};
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
return "";
}
}