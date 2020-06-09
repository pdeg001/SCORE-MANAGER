
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class sqlite {
    public static RemoteObject myClass;
	public sqlite() {
	}
    public static PCBA staticBA = new PCBA(null, sqlite.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
public static RemoteObject _qry = RemoteObject.createImmutable("");
public static RemoteObject _clsfunc = RemoteObject.declareNull("b4j.example.funcclass");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
public static b4j.example.players _players = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clsFunc",_ref.getField(false, "_clsfunc"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"qry",_ref.getField(false, "_qry"),"rs",_ref.getField(false, "_rs"),"sql",_ref.getField(false, "_sql")};
}
}