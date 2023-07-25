package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.shell.ShellBA.delegateBA = new anywheresoftware.b4j.objects.FxBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _button1 = null;
public static String _success = "";
public static String _filename = "";
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart", false))
	 {return ((String) Debug.delegate(ba, "appstart", new Object[] {_form1,_args}));}
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
RDebugUtils.currentLine=65537;
 //BA.debugLineNum = 65537;BA.debugLine="MainForm = Form1";
_mainform = _form1;
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="MainForm.RootPane.LoadLayout(\"Layout1\")";
_mainform.getRootPane().LoadLayout(ba,"Layout1");
RDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="MainForm.Show";
_mainform.Show();
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {return ((String) Debug.delegate(ba, "button1_click", null));}
anywheresoftware.b4j.objects.FileChooserWrapper _filechooser = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Dim fileChooser As FileChooser";
_filechooser = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="fileChooser.Initialize";
_filechooser.Initialize();
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="fileChooser.Title = \"Choose file\"";
_filechooser.setTitle("Choose file");
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="fileChooser.SetExtensionFilter(\"Rich Text Format\"";
_filechooser.SetExtensionFilter("Rich Text Format",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*.rtf"),(Object)("*.RTF")}));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="Success = fileChooser.ShowOpen(MainForm)";
_success = _filechooser.ShowOpen(_mainform);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="If Success.Length > 0 Then";
if (_success.length()>0) { 
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="fileChooser_Result(True)";
_filechooser_result(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="End Sub";
return "";
}
public static void  _filechooser_result(boolean _successs) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "filechooser_result", false))
	 {Debug.delegate(ba, "filechooser_result", new Object[] {_successs}); return;}
ResumableSub_fileChooser_Result rsub = new ResumableSub_fileChooser_Result(null,_successs);
rsub.resume(ba, null);
}
public static class ResumableSub_fileChooser_Result extends BA.ResumableSub {
public ResumableSub_fileChooser_Result(b4j.example.main parent,boolean _successs) {
this.parent = parent;
this._successs = _successs;
}
b4j.example.main parent;
boolean _successs;
b4j.example.jstringfunctions _ff = null;
String _inputpath = "";
String _outputpath = "";
anywheresoftware.b4j.objects.Shell _shell = null;
String _pandocexecutable = "";
String _pandocarguments = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="If Successs = True Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_successs==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim ff As JStringFunctions";
_ff = new b4j.example.jstringfunctions();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="ff.Initialize";
_ff._initialize(ba);
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim inputPath As String = Success";
_inputpath = parent._success;
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="Dim outputPath As String = ff.Stuff(Success, \"pd";
_outputpath = _ff._stuff(parent._success,"pdf","rtf");
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="Dim Shell As Shell";
_shell = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=196615;
 //BA.debugLineNum = 196615;BA.debugLine="Try";
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
RDebugUtils.currentLine=196617;
 //BA.debugLineNum = 196617;BA.debugLine="Dim pandocExecutable As String = \"<C:\\Users\\Dev";
_pandocexecutable = "<C:\\Users\\Devel\\Desktop\\Demo Work\\Pandoc\\pandoc.exe>";
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="Dim pandocArguments As String = \"-f rtf -t pdf";
_pandocarguments = "-f rtf -t pdf -o \""+_outputpath+"\" \""+_inputpath+"\"";
RDebugUtils.currentLine=196620;
 //BA.debugLineNum = 196620;BA.debugLine="Shell.Initialize(\"PandocShell\", pandocExecutabl";
_shell.Initialize("PandocShell",_pandocexecutable,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_pandocarguments)}));
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="Wait For (Shell) Shell_Completed (Successs As B";
anywheresoftware.b4a.keywords.Common.WaitFor("shell_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "filechooser_result"), (Object)(_shell));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_successs = (boolean) result[0];
;
RDebugUtils.currentLine=196625;
 //BA.debugLineNum = 196625;BA.debugLine="If Successs Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_successs) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=196626;
 //BA.debugLineNum = 196626;BA.debugLine="xui.MsgboxAsync(\"Conversion completed.\" & CRLF";
parent._xui.MsgboxAsync(ba,"Conversion completed."+anywheresoftware.b4a.keywords.Common.CRLF+"Output file: "+_outputpath,"Conversion Completed");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=196628;
 //BA.debugLineNum = 196628;BA.debugLine="xui.MsgboxAsync(\"An error occurred during conv";
parent._xui.MsgboxAsync(ba,"An error occurred during conversion.","Conversion Error");
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=196631;
 //BA.debugLineNum = 196631;BA.debugLine="xui.MsgboxAsync(\"An error occurred during conve";
parent._xui.MsgboxAsync(ba,"An error occurred during conversion.","Conversion Error");
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
RDebugUtils.currentLine=196634;
 //BA.debugLineNum = 196634;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
}