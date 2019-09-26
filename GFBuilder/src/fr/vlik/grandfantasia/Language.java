package fr.vlik.grandfantasia;

public enum Language {
	FR(0), EN(1);
	
	public final int index;
	 
    private Language(int index) {
        this.index = index;
    }
}