package fr.vlik.grandfantasia;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import fr.vlik.gfbuilder.Effect;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.Weapon.WeaponType;
import fr.vlik.gfbuilder.Effect.TypeEffect;

public class Mount {
	
	private static Mount[] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private Effect depla;
	private boolean reinca;
	private BufferedImage img;
	
	public Mount(String name, int lvl, int depla, boolean reinca, String path) {
		this.name = name;
		this.lvl = lvl;
		this.depla = new Effect(TypeEffect.Depla, false, depla, false, WeaponType.NONE, null);
		this.reinca = reinca;
		this.img = setIcon(path);
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLvl() {
		return this.lvl;
	}
	
	public Effect getDepla() {
		return new Effect(this.depla);
	}
	
	public boolean isReinca() {
		return this.reinca;
	}
	
	public BufferedImage getIcon() {
		return this.img;
	}
	
	private BufferedImage setIcon(String path) {
		BufferedImage back = null;
		BufferedImage object = null;
		
		try {
			back = ImageIO.read(MainFrame.class.getResource("/fr/vlik/gfbuilder/images/32-4.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			object = ImageIO.read(MainFrame.class.getResource("/fr/vlik/grandfantasia/resources/montures/" + path));
		} catch (IOException e) {
			System.out.println("Image non charg� : " + path);
		} catch (IllegalArgumentException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		Graphics g = back.getGraphics();
		if(object != null) {
			g.drawImage(object, 0, 0, null);
		}
		
		return back;
	}
	
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder("- Statistique -");
		
		tooltip.append("<br>");
		tooltip.append(this.depla.getTooltip());
		
		return "<html>" + tooltip + "</html>";
	}
	
	public static void loadData() {
		ArrayList<Mount> list = new ArrayList<Mount>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/grandfantasia/resources/montures/monture.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				list.add(new Mount(lineSplit[0], Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + Mount.class.getClass().getSimpleName() + " class");
		}
		
		Mount.data = new Mount[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static Mount[] getPossibleMount(int lvl, boolean reinca) {
		ArrayList<Mount> result = new ArrayList<Mount>();
		
		if(reinca) {
			for(Mount mount : Mount.data) {
				if(mount.getLvl() <= lvl) {
					result.add(mount);
				}
			}
		} else {
			for(Mount mount : Mount.data) {
				if(mount.getLvl() <= lvl && !mount.isReinca()) {
					result.add(mount);
				}
			}
		}
		
		Mount[] cast = new Mount[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
}
