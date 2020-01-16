package fr.vlik.grandfantasia;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeEffect;
import fr.vlik.grandfantasia.equipable.Anima;
import fr.vlik.grandfantasia.equipable.Weapon.WeaponType;
import fr.vlik.grandfantasia.interfaces.FullRenderer;

public class Mount implements FullRenderer {
	
	public static String PATH = Tools.RESOURCE + Mount.class.getSimpleName().toLowerCase() + "/";
	private static Map<String, ImageIcon> ICONS = new HashMap<String, ImageIcon>();
	private static Mount[] data;
	static {
		loadData();
	}
	
	private String name;
	private int lvl;
	private Effect depla;
	private boolean reinca;
	private Icon icon;
	
	public Mount(String name, int lvl, int depla, boolean reinca, String path) {
		this.name = name;
		this.lvl = lvl;
		this.depla = new Effect(TypeEffect.Depla, false, depla, false, WeaponType.NONE, null);
		this.reinca = reinca;
		this.icon = setIcon(path);
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
	
	@Override
	public Color getColor() {
		return this.name.equals("Rien") ? Tools.itemColor[0] : Tools.itemColor[4];
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public Icon setIcon(String path) {
		ImageIcon back = new ImageIcon(Anima.class.getResource(Tools.PATH32 + "4.png"));
		ImageIcon object = ICONS.get(path);
		
		if(object == null) {
			try {
				object = new ImageIcon(Anima.class.getResource(PATH + path + Tools.PNG));
				ICONS.put(path, object);
			} catch (NullPointerException e) {
				System.out.println("Image introuvable : " + path);
			}
		}
		
		return (object != null) ? Tools.constructIcon(back, object) : back;
	}
	
	@Override
	public String getInfo(Language lang) {
		return "Lvl " + this.lvl + " - " + this.name;
	}
	
	@Override
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
					Mount.class.getResourceAsStream(PATH + "monture.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				String path =  lineSplit[lineSplit.length-1];
				
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
	
	public static Mount get(String name) {
		for(Mount mount : Mount.data) {
			if(mount.getName().equals(name)) {
				return mount;
			}
		}
		
		return null;
	}
	
	public static Mount[] getPossibleMount(int lvl, Reinca reinca) {
		ArrayList<Mount> result = new ArrayList<Mount>();
		
		if(reinca.getLvl() > 0) {
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
