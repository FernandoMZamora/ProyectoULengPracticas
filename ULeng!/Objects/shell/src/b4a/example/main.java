
package b4a.example;

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
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _s = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _btnregistro = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblregistrar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelregistro = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _etxnusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etxcorreo = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etxcrearcontraseña = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etxvericontraseña = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etxusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _etxcontraseña = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _imga = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imge = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgf = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgh = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgi = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgj = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgk = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgl = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgm = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgn_ = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgq = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgs = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgt = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgx = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgy = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgz = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btnabcregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _imgabecedario = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _imgnumeros = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _img10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btnnumregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnzregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnyregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnxregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnwregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnvregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnuregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btntregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnrregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnqregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnpregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnoregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnn_regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnnregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnkregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnjregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btniregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnhregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btngregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnfregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btneregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnaregresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn10regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn9regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn8regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn7regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn6regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn5regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn4regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn3regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn2regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn1regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btn0regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelcatabecedario = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelcatnumero = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelz = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panely = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelx = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelw = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelv = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelt = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panels = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelr = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelq = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelñ = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneln = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelm = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panell = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelk = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelj = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneli = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelh = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelg = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelf = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panele = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneld = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelc = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelb = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panela = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum10 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelnum0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btncerrarsesion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btn0Regresar",main.mostCurrent._btn0regresar,"btn10Regresar",main.mostCurrent._btn10regresar,"btn1Regresar",main.mostCurrent._btn1regresar,"btn2Regresar",main.mostCurrent._btn2regresar,"btn3Regresar",main.mostCurrent._btn3regresar,"btn4Regresar",main.mostCurrent._btn4regresar,"btn5Regresar",main.mostCurrent._btn5regresar,"btn6Regresar",main.mostCurrent._btn6regresar,"btn7Regresar",main.mostCurrent._btn7regresar,"btn8Regresar",main.mostCurrent._btn8regresar,"btn9Regresar",main.mostCurrent._btn9regresar,"btnABCRegresar",main.mostCurrent._btnabcregresar,"btnARegresar",main.mostCurrent._btnaregresar,"btnBRegresar",main.mostCurrent._btnbregresar,"btnCerrarSesion",main.mostCurrent._btncerrarsesion,"btnCRegresar",main.mostCurrent._btncregresar,"btnDRegresar",main.mostCurrent._btndregresar,"btnERegresar",main.mostCurrent._btneregresar,"btnFRegresar",main.mostCurrent._btnfregresar,"btnGRegresar",main.mostCurrent._btngregresar,"btnHRegresar",main.mostCurrent._btnhregresar,"btnIRegresar",main.mostCurrent._btniregresar,"btnJRegresar",main.mostCurrent._btnjregresar,"btnKRegresar",main.mostCurrent._btnkregresar,"btnLogin",main.mostCurrent._btnlogin,"btnLRegresar",main.mostCurrent._btnlregresar,"btnMRegresar",main.mostCurrent._btnmregresar,"btnN_Regresar",main.mostCurrent._btnn_regresar,"btnNRegresar",main.mostCurrent._btnnregresar,"btnNUMRegresar",main.mostCurrent._btnnumregresar,"btnORegresar",main.mostCurrent._btnoregresar,"btnPRegresar",main.mostCurrent._btnpregresar,"btnQRegresar",main.mostCurrent._btnqregresar,"btnRegistro",main.mostCurrent._btnregistro,"btnRRegresar",main.mostCurrent._btnrregresar,"btnSRegresar",main.mostCurrent._btnsregresar,"btnTRegresar",main.mostCurrent._btntregresar,"btnURegresar",main.mostCurrent._btnuregresar,"btnVRegresar",main.mostCurrent._btnvregresar,"btnWRegresar",main.mostCurrent._btnwregresar,"btnXRegresar",main.mostCurrent._btnxregresar,"btnYRegresar",main.mostCurrent._btnyregresar,"btnZRegresar",main.mostCurrent._btnzregresar,"c",main._c,"etxContraseña",main.mostCurrent._etxcontraseña,"etxCorreo",main.mostCurrent._etxcorreo,"etxCrearContraseña",main.mostCurrent._etxcrearcontraseña,"etxNUsuario",main.mostCurrent._etxnusuario,"etxUsuario",main.mostCurrent._etxusuario,"etxVeriContraseña",main.mostCurrent._etxvericontraseña,"img0",main.mostCurrent._img0,"img1",main.mostCurrent._img1,"img10",main.mostCurrent._img10,"img2",main.mostCurrent._img2,"img3",main.mostCurrent._img3,"img4",main.mostCurrent._img4,"img5",main.mostCurrent._img5,"img6",main.mostCurrent._img6,"img7",main.mostCurrent._img7,"img8",main.mostCurrent._img8,"img9",main.mostCurrent._img9,"imgA",main.mostCurrent._imga,"imgAbecedario",main.mostCurrent._imgabecedario,"imgB",main.mostCurrent._imgb,"imgC",main.mostCurrent._imgc,"imgD",main.mostCurrent._imgd,"imgE",main.mostCurrent._imge,"imgF",main.mostCurrent._imgf,"imgG",main.mostCurrent._imgg,"imgH",main.mostCurrent._imgh,"imgI",main.mostCurrent._imgi,"imgJ",main.mostCurrent._imgj,"imgK",main.mostCurrent._imgk,"imgL",main.mostCurrent._imgl,"imgM",main.mostCurrent._imgm,"imgN",main.mostCurrent._imgn,"imgN_",main.mostCurrent._imgn_,"imgNumeros",main.mostCurrent._imgnumeros,"imgO",main.mostCurrent._imgo,"imgP",main.mostCurrent._imgp,"imgQ",main.mostCurrent._imgq,"imgR",main.mostCurrent._imgr,"imgS",main.mostCurrent._imgs,"imgT",main.mostCurrent._imgt,"imgU",main.mostCurrent._imgu,"imgV",main.mostCurrent._imgv,"imgW",main.mostCurrent._imgw,"imgX",main.mostCurrent._imgx,"imgY",main.mostCurrent._imgy,"imgZ",main.mostCurrent._imgz,"lblRegistrar",main.mostCurrent._lblregistrar,"PanelA",main.mostCurrent._panela,"PanelB",main.mostCurrent._panelb,"PanelC",main.mostCurrent._panelc,"PanelCATABECEDARIO",main.mostCurrent._panelcatabecedario,"PanelCATEGORIA",main.mostCurrent._panelcategoria,"PanelCATNUMERO",main.mostCurrent._panelcatnumero,"PanelD",main.mostCurrent._paneld,"PanelE",main.mostCurrent._panele,"PanelF",main.mostCurrent._panelf,"PanelG",main.mostCurrent._panelg,"PanelH",main.mostCurrent._panelh,"PanelI",main.mostCurrent._paneli,"PanelJ",main.mostCurrent._panelj,"PanelK",main.mostCurrent._panelk,"PanelL",main.mostCurrent._panell,"PanelLOGIN",main.mostCurrent._panellogin,"PanelM",main.mostCurrent._panelm,"PanelN",main.mostCurrent._paneln,"PanelÑ",main.mostCurrent._panelñ,"PanelNum0",main.mostCurrent._panelnum0,"PanelNum1",main.mostCurrent._panelnum1,"PanelNum10",main.mostCurrent._panelnum10,"PanelNum2",main.mostCurrent._panelnum2,"PanelNum3",main.mostCurrent._panelnum3,"PanelNum4",main.mostCurrent._panelnum4,"PanelNum5",main.mostCurrent._panelnum5,"PanelNum6",main.mostCurrent._panelnum6,"PanelNum7",main.mostCurrent._panelnum7,"PanelNum8",main.mostCurrent._panelnum8,"PanelNum9",main.mostCurrent._panelnum9,"PanelO",main.mostCurrent._panelo,"PanelP",main.mostCurrent._panelp,"PanelQ",main.mostCurrent._panelq,"PanelR",main.mostCurrent._panelr,"PanelREGISTRO",main.mostCurrent._panelregistro,"PanelS",main.mostCurrent._panels,"PanelT",main.mostCurrent._panelt,"PanelU",main.mostCurrent._panelu,"PanelV",main.mostCurrent._panelv,"PanelW",main.mostCurrent._panelw,"PanelX",main.mostCurrent._panelx,"PanelY",main.mostCurrent._panely,"PanelZ",main.mostCurrent._panelz,"s",main._s,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}