package fr.vlik.gfbuilder;

public class ExtractData {
	public static void main(String[] args) {
		System.out.println("--- Extract Data ---");
		
		ExtractTitleData.launch();
		ExtractRideData.launch();
		ExtractSpriteData.launch();
		
		System.out.println("--- Finish ---");
	}
}
