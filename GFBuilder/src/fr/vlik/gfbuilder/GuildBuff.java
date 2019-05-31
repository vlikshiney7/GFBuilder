package fr.vlik.gfbuilder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class GuildBuff extends Buff {
	
	private BufferedImage img;

	public GuildBuff(String name, String path, ArrayList<Effect> effects) {
		super(name, effects);
		this.img = setIcon(path);
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage object = null;
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/resources/guild/" + path));
		} catch (IOException e) {
			System.out.println("Image non chargé : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		return object;
	}
}
