
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class funcclass {
    public static RemoteObject myClass;
	public funcclass() {
	}
    public static PCBA staticBA = new PCBA(null, funcclass.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _numformat = RemoteObject.declareNull("b4j.example.b4xformatter");
public static RemoteObject _defaultformat = RemoteObject.declareNull("b4j.example.b4xformatter._b4xformatdata");
public static RemoteObject _disablecloseform = RemoteObject.createImmutable(false);
public static RemoteObject _regexpattern = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.players _players = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultFormat",_ref.getField(false, "_defaultformat"),"disableCloseForm",_ref.getField(false, "_disablecloseform"),"fx",_ref.getField(false, "_fx"),"numFormat",_ref.getField(false, "_numformat"),"RegexPattern",_ref.getField(false, "_regexpattern")};
}
}