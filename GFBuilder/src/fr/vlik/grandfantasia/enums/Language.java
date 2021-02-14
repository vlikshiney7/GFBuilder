package fr.vlik.grandfantasia.enums;

public enum Language {
	FR("Français"), EN("English"), ES("Español"), PT("Português");
	
	public final String name;
	 
    private Language(String name) {
        this.name = name;
    }
}