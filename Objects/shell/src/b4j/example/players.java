
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

public class players implements IRemote{
	public static players mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public players() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new players();
		remoteMe = RemoteObject.declareNull("b4j.example.players");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("players"), "b4j.example.players");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, players.class);
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
		pcBA = new PCBA(this, players.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("b4j.example.sqlite");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _playerform = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _fledtplayername = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _clvplayer = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _btnclose = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _clsfunc = RemoteObject.declareNull("b4j.example.funcclass");
public static RemoteObject _pnplayer = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblmoyenne = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _lblmake = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _fledtplayermoyenne = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _fledtplayermake = RemoteObject.declareNull("b4j.example.b4xfloattextfield");
public static RemoteObject _selectedplayerid = RemoteObject.createImmutable("");
public static RemoteObject _selectedindex = RemoteObject.createImmutable("");
public static RemoteObject _edtmake = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _edtmoyenne = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _edtname = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnnew = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static b4j.example.main _main = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnClose",players._btnclose,"btnNew",players._btnnew,"btnSave",players._btnsave,"clsFunc",players._clsfunc,"clvPlayer",players._clvplayer,"CSSUtils",players._cssutils,"DateUtils",players._dateutils,"edtMake",players._edtmake,"edtMoyenne",players._edtmoyenne,"edtName",players._edtname,"flEdtPlayerMake",players._fledtplayermake,"flEdtPlayerMoyenne",players._fledtplayermoyenne,"flEdtPlayerName",players._fledtplayername,"fx",players._fx,"lblMake",players._lblmake,"lblMoyenne",players._lblmoyenne,"lblName",players._lblname,"Main",Debug.moduleToString(b4j.example.main.class),"PlayerForm",players._playerform,"pnPlayer",players._pnplayer,"selectedIndex",players._selectedindex,"selectedPlayerId",players._selectedplayerid,"sql",players._sql,"xui",players._xui};
}
}