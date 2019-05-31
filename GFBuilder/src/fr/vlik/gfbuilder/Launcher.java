/* DEBUT DE PROJET : 13 / 01 / 19 */

package fr.vlik.gfbuilder;

import java.io.File;
import java.io.IOException;

import javax.swing.UIManager;

public class Launcher {
	private static int minMaxHeap = 425;
	
	public static void main(String[] args) throws IOException {
		long max = Runtime.getRuntime().maxMemory() / 1024L / 1024L;
		if (max < minMaxHeap) {
			try {
				String path = new File(MainFrame.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getAbsolutePath();
				if (path.toLowerCase().endsWith(".jar")) {
					ProcessBuilder pb = new ProcessBuilder(new String[] { "java", "-Xmx512m", "-jar", "\"" + path + "\"" });
					int result = pb.start().waitFor();
					if (result == 0) {
						return;
					}
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.err.println("WARNING: Look and feel code failed");
		}
		
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}
