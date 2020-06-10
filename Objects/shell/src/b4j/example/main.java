
package b4j.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.example.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.example.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _clsfunc = RemoteObject.declareNull("b4j.example.funcclass");
public static RemoteObject _sql = RemoteObject.declareNull("b4j.example.sqlite");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mainform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _lbltest = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
public static RemoteObject _scrollpane1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
public static RemoteObject _lblbaseweek = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _scrollpane2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
public static RemoteObject _lblheight = RemoteObject.createImmutable(0);
public static RemoteObject _scrollpane3 = RemoteObject.declareNull("anywheresoftware.b4j.objects.ScrollPaneWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _ptop = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pleft = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _paneblockinput = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _clvplaying = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _btnplayer = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lstplayerid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cmbgametype = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.players _players = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnPlayer",main._btnplayer,"clsFunc",main._clsfunc,"clvPlaying",main._clvplaying,"cmbGameType",main._cmbgametype,"CSSUtils",main._cssutils,"DateUtils",main._dateutils,"fx",main._fx,"Label1",main._label1,"lblBaseweek",main._lblbaseweek,"lblHeight",main._lblheight,"lblTest",main._lbltest,"lstPlayerId",main._lstplayerid,"MainForm",main._mainform,"paneBlockInput",main._paneblockinput,"Players",Debug.moduleToString(b4j.example.players.class),"pleft",main._pleft,"ptop",main._ptop,"ScrollPane1",main._scrollpane1,"ScrollPane2",main._scrollpane2,"ScrollPane3",main._scrollpane3,"sp",main._sp,"sql",main._sql};
}
}