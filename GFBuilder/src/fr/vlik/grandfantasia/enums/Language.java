package fr.vlik.grandfantasia.enums;

public enum Language {
	FR("Français"), EN("English"), ES("Español"), PT("Português");
	
	public final String lang;
	 
    private Language(String lang) {
        this.lang = lang;
    }
}