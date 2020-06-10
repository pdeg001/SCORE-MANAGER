package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4jtextflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.b4jtextflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.b4jtextflow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public b4j.example.main _main = null;
public b4j.example.players _players = null;
public String  _initialize(b4j.example.b4jtextflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Reset";
__ref._reset /*b4j.example.b4jtextflow*/ (null);
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4jtextflow  _reset(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub Reset As B4JTextFlow";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="texts.Initialize";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _append(b4j.example.b4jtextflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "append", new Object[] {_text}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="texts.Add(lastItem)";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .getObject()));
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setcolor(b4j.example.b4jtextflow __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setcolor", new Object[] {_color}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(_color))});
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "createtextflow", true))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null));}
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
_tf.RunMethod("setTextAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setfont(b4j.example.b4jtextflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setfont", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setfont", new Object[] {_font}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="End Sub";
return "";
}
public b4j.example.b4jtextflow  _setstrikethrough(b4j.example.b4jtextflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setstrikethrough", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="End Sub";
return null;
}
public b4j.example.b4jtextflow  _setunderline(b4j.example.b4jtextflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setunderline", true))
	 {return ((b4j.example.b4jtextflow) Debug.delegate(ba, "setunderline", new Object[] {_underline}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="Return Me";
if (true) return (b4j.example.b4jtextflow)(this);
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="End Sub";
return null;
}
}