package fr.vlik.grandfantasia;

public enum Quality {
	GREY(0), WHITE(1),
	GREEN(2), BLUE(3),
	ORANGE(4), GOLD(5),
	PURPLE(6), RED(7),
	P8TITLE(8);
	
	public final int index;
	 
    private Quality(int index) {
        this.index = index;
    }
}
