package fr.vlik.grandfantasia.enums;

public enum Target {
	SELF("soi", "self"),
	ALLY("allié", "ally"),
	SPRITE("sprite", "sprite"),
	OPPONENT("ennemi", "opponent");
	
	public final String fr;
	public final String en;
	 
    private Target(String fr, String en) {
        this.fr = fr;
        this.en = en;
    }
}
