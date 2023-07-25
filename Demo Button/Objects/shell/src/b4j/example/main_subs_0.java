package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _appstart(RemoteObject _form1,RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,17);
if (RapidSub.canDelegate("appstart")) { return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _form1, _args);}
Debug.locals.put("Form1", _form1);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="MainForm = Form1";
Debug.ShouldStop(131072);
main._mainform = _form1;
 BA.debugLineNum = 19;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
Debug.ShouldStop(262144);
main._mainform.runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",main.ba,(Object)(RemoteObject.createImmutable("Layout1")));
 BA.debugLineNum = 20;BA.debugLine="MainForm.Show";
Debug.ShouldStop(524288);
main._mainform.runVoidMethodAndSync ("Show");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.ba,main.mostCurrent,24);
if (RapidSub.canDelegate("button1_click")) { return b4j.example.main.remoteMe.runUserSub(false, "main","button1_click");}
RemoteObject _filechooser = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
 BA.debugLineNum = 24;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Dim fileChooser As FileChooser";
Debug.ShouldStop(16777216);
_filechooser = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fileChooser", _filechooser);
 BA.debugLineNum = 26;BA.debugLine="fileChooser.Initialize";
Debug.ShouldStop(33554432);
_filechooser.runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="fileChooser.Title = \"Choose file\"";
Debug.ShouldStop(67108864);
_filechooser.runMethod(true,"setTitle",BA.ObjectToString("Choose file"));
 BA.debugLineNum = 28;BA.debugLine="fileChooser.SetExtensionFilter(\"Rich Text Format\"";
Debug.ShouldStop(134217728);
_filechooser.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Rich Text Format")),(Object)(main.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable(("*.rtf")),(RemoteObject.createImmutable("*.RTF"))})))));
 BA.debugLineNum = 30;BA.debugLine="Success = fileChooser.ShowOpen(MainForm)";
Debug.ShouldStop(536870912);
main._success = _filechooser.runMethodAndSync(true,"ShowOpen",(Object)(main._mainform));
 BA.debugLineNum = 32;BA.debugLine="If Success.Length > 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",main._success.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 33;BA.debugLine="fileChooser_Result(True)";
Debug.ShouldStop(1);
_filechooser_result(main.__c.getField(true,"True"));
 };
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _filechooser_result(RemoteObject _successs) throws Exception{
try {
		Debug.PushSubsStack("fileChooser_Result (main) ","main",0,main.ba,main.mostCurrent,38);
if (RapidSub.canDelegate("filechooser_result")) { b4j.example.main.remoteMe.runUserSub(false, "main","filechooser_result", _successs); return;}
ResumableSub_fileChooser_Result rsub = new ResumableSub_fileChooser_Result(null,_successs);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_fileChooser_Result extends BA.ResumableSub {
public ResumableSub_fileChooser_Result(b4j.example.main parent,RemoteObject _successs) {
this.parent = parent;
this._successs = _successs;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4j.example.main parent;
RemoteObject _successs;
RemoteObject _ff = RemoteObject.declareNull("b4j.example.jstringfunctions");
RemoteObject _inputpath = RemoteObject.createImmutable("");
RemoteObject _outputpath = RemoteObject.createImmutable("");
RemoteObject _shell = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _pandocexecutable = RemoteObject.createImmutable("");
RemoteObject _pandocarguments = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("fileChooser_Result (main) ","main",0,main.ba,main.mostCurrent,38);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Successs", _successs);
 BA.debugLineNum = 39;BA.debugLine="If Successs = True Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_successs,parent.__c.getField(true,"True"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 40;BA.debugLine="Dim ff As JStringFunctions";
Debug.ShouldStop(128);
_ff = RemoteObject.createNew ("b4j.example.jstringfunctions");Debug.locals.put("ff", _ff);
 BA.debugLineNum = 41;BA.debugLine="ff.Initialize";
Debug.ShouldStop(256);
_ff.runVoidMethod ("_initialize",main.ba);
 BA.debugLineNum = 42;BA.debugLine="Dim inputPath As String = Success";
Debug.ShouldStop(512);
_inputpath = parent._success;Debug.locals.put("inputPath", _inputpath);Debug.locals.put("inputPath", _inputpath);
 BA.debugLineNum = 43;BA.debugLine="Dim outputPath As String = ff.Stuff(Success, \"pd";
Debug.ShouldStop(1024);
_outputpath = _ff.runMethod(true,"_stuff",(Object)(parent._success),(Object)(BA.ObjectToString("pdf")),(Object)(RemoteObject.createImmutable("rtf")));Debug.locals.put("outputPath", _outputpath);Debug.locals.put("outputPath", _outputpath);
 BA.debugLineNum = 44;BA.debugLine="Dim Shell As Shell";
Debug.ShouldStop(2048);
_shell = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("Shell", _shell);
 BA.debugLineNum = 45;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
 BA.debugLineNum = 47;BA.debugLine="Dim pandocExecutable As String = \"<C:\\Users\\Dev";
Debug.ShouldStop(16384);
_pandocexecutable = BA.ObjectToString("<C:\\Users\\Devel\\Desktop\\Demo Work\\Pandoc\\pandoc.exe>");Debug.locals.put("pandocExecutable", _pandocexecutable);Debug.locals.put("pandocExecutable", _pandocexecutable);
 BA.debugLineNum = 48;BA.debugLine="Dim pandocArguments As String = \"-f rtf -t pdf";
Debug.ShouldStop(32768);
_pandocarguments = RemoteObject.concat(RemoteObject.createImmutable("-f rtf -t pdf -o \""),_outputpath,RemoteObject.createImmutable("\" \""),_inputpath,RemoteObject.createImmutable("\""));Debug.locals.put("pandocArguments", _pandocarguments);Debug.locals.put("pandocArguments", _pandocarguments);
 BA.debugLineNum = 50;BA.debugLine="Shell.Initialize(\"PandocShell\", pandocExecutabl";
Debug.ShouldStop(131072);
_shell.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("PandocShell")),(Object)(_pandocexecutable),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pandocarguments)})))));
 BA.debugLineNum = 53;BA.debugLine="Wait For (Shell) Shell_Completed (Successs As B";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","shell_completed", main.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "filechooser_result"), (_shell));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_successs = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Successs", _successs);
;
 BA.debugLineNum = 55;BA.debugLine="If Successs Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 12;
if (_successs.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 56;BA.debugLine="xui.MsgboxAsync(\"Conversion completed.\" & CRLF";
Debug.ShouldStop(8388608);
parent._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Conversion completed."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Output file: "),_outputpath)),(Object)(RemoteObject.createImmutable("Conversion Completed")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 58;BA.debugLine="xui.MsgboxAsync(\"An error occurred during conv";
Debug.ShouldStop(33554432);
parent._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("An error occurred during conversion.")),(Object)(RemoteObject.createImmutable("Conversion Error")));
 if (true) break;

case 12:
//C
this.state = 15;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 61;BA.debugLine="xui.MsgboxAsync(\"An error occurred during conve";
Debug.ShouldStop(268435456);
parent._xui.runVoidMethod ("MsgboxAsync",main.ba,(Object)(BA.ObjectToString("An error occurred during conversion.")),(Object)(RemoteObject.createImmutable("Conversion Error")));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",main.ba, e0.toString());}
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
public static void  _shell_completed(RemoteObject _successs) throws Exception{
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
main._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 9;BA.debugLine="Private MainForm As Form";
main._mainform = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
main._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="Private Button1 As B4XView";
main._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Public Success As String = \"\"";
main._success = BA.ObjectToString("");
 //BA.debugLineNum = 13;BA.debugLine="Public filename As String";
main._filename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}