package fr.vlik.grandfantasia.interfaces;

import fr.vlik.grandfantasia.enums.Language;

public interface Writable {
	
	public static final String TAB = "&emsp;&emsp;";
	public static final String LINE = "<br>";
	
	public String getName(Language lang);
	
	public String getSelectorInfo(Language lang);
	
	public String getFullInfo(Language lang);
	
	default String toHTML(String html) {
		return "<html>" + html.replace("<html>", "").replace("</html>", "").replaceAll("^<br>", "") + "</html>";
	}
	
	default String toHTML(StringBuilder html) {
		return toHTML(html.toString());
	}
	
	public static String noHTML(String html) {
		return html.replace("<html>", "").replace("</html>", "").replace(LINE, "\n").replace("&emsp;", "    ");
	}
}
