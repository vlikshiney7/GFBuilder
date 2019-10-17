package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.interfaces.Iconable;

public class GuildBuff extends Buff implements Iconable {
	
	private static GuildBuff[] data;
	static {
		loadData();
	}
	
	private Icon icon;

	public GuildBuff(String name, String path, ArrayList<Effect> effects) {
		super(name, effects);
		setIcon(path);
	}
	
	@Override
	public Icon getIcon() {
		return this.icon;
	}
	
	@Override
	public void setIcon(String path) {
		ImageIcon object = null;
		
		try {
			object = new ImageIcon(GuildBuff.class.getResource(Tools.RESOURCE + "guild/" + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	public static void loadData() {
		ArrayList<GuildBuff> list = new ArrayList<GuildBuff>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					GuildBuff.class.getResourceAsStream(Tools.RESOURCE + "guild/guildBuff.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				list.add(new GuildBuff(lineSplit[0], path, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + GuildBuff.class.getClass().getSimpleName() + " class");
		}
		
		GuildBuff.data = new GuildBuff[list.size()];
		for(int i = 0; i < data.length; i++) {
			data[i] = list.get(i);
		}
	}
	
	public static GuildBuff[] getListGuildBuff(ArrayList<String> guildBuffName) {
		ArrayList<GuildBuff> result = new ArrayList<GuildBuff>();
		
		for(int i = 0; i < GuildBuff.data.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < guildBuffName.size(); j++) {
				if(guildBuffName.get(j).equals(GuildBuff.data[i].getName())) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(GuildBuff.data[i]);
			}
		}
		
		GuildBuff[] cast = new GuildBuff[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static GuildBuff[] getData() {
		return GuildBuff.data;
	}
}
