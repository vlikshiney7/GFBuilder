/*
 * All credits to KaBe, source here : https://stackoverflow.com/a/35863653/15599820
 * */

package fr.vlik.gfbuilder;

//import com.sun.jna.platform.win32.Kernel32;
//import com.sun.jna.platform.win32.Shell32;

public class JavaElevator {
	/**
	 * If requested, elevates the Java process started with the given arguments to administrator level.
	 */
	/*public static void elevate() {
		// Get the command.
		String command = System.getProperty("sun.java.command");
		
		// Get class path and default java home.
		String classPath = System.getProperty("java.class.path");
		String javaHome = System.getProperty("java.home");
		String vm = javaHome + "\\bin\\java.exe";
		
		// Check for alternate VM for elevation. Full path to the VM may be passed with: -Delevation.vm=...
		if(System.getProperties().contains("elevation.vm")) {
			vm = System.getProperty("elevation.vm");
		}
		
		String parameters = "-cp " + classPath;
		parameters += " " + command;
		System.out.println("runas " + vm + " " + parameters);
		Shell32.INSTANCE.ShellExecute(null, "runas", vm, parameters, null, 0);
		
		if(Kernel32.INSTANCE.GetLastError() != 0) {
			System.exit(0);
		}
	}*/
	
	public static void main(String[] args) {
		//JavaElevator.elevate();
		MainFrame.getInstance().init();
	}
}