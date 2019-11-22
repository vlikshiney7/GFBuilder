package fr.vlik.grandfantasia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import fr.vlik.grandfantasia.interfaces.Iconable;

public class BuffIcon extends Buff implements Iconable {
	
	private static BuffIcon[] dataGuild;
	private static BuffIcon[] dataLove;
	static {
		loadData();
	}
	
	private Icon icon;

	public BuffIcon(String name, String path, ArrayList<Effect> effects) {
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
			object = new ImageIcon(BuffIcon.class.getResource(Tools.RESOURCE + "bufficon/" + path));
		} catch (NullPointerException e) {
			System.out.println("Image introuvable : " + path);
		}
		
		this.icon = object;
	}
	
	public static void loadData() {
		ArrayList<BuffIcon> guild = new ArrayList<BuffIcon>();
		ArrayList<BuffIcon> love = new ArrayList<BuffIcon>();
		
		try (
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					BuffIcon.class.getResourceAsStream(Tools.RESOURCE + "bufficon/bufficon.txt"), "UTF-8"));
		) {
			String line = reader.readLine();
			while (!line.equals("")) {
				String[] lineSplit = line.split("/");
				
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				guild.add(new BuffIcon(lineSplit[0], path, effects));
				
				line = reader.readLine();
			}
			
			line = reader.readLine();
			
			while (line != null) {
				String[] lineSplit = line.split("/");
				
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				love.add(new BuffIcon(lineSplit[0], path, effects));
				
				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error with " + BuffIcon.class.getClass().getSimpleName() + " class");
		}
		
		BuffIcon.dataGuild = new BuffIcon[guild.size()];
		for(int i = 0; i < dataGuild.length; i++) {
			dataGuild[i] = guild.get(i);
		}
		
		BuffIcon.dataLove = new BuffIcon[love.size()];
		for(int i = 0; i < dataLove.length; i++) {
			dataLove[i] = love.get(i);
		}
	}
	
	public static BuffIcon[] getListGuildBuff(ArrayList<String> guildBuffName) {
		ArrayList<BuffIcon> result = new ArrayList<BuffIcon>();
		
		for(int i = 0; i < BuffIcon.dataGuild.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < guildBuffName.size(); j++) {
				if(guildBuffName.get(j).equals(BuffIcon.dataGuild[i].getName())) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(BuffIcon.dataGuild[i]);
			}
		}
		
		BuffIcon[] cast = new BuffIcon[result.size()];
		for(int i = 0; i < cast.length; i++) {
			cast[i] = result.get(i);
		}
		
		return cast;
	}
	
	public static BuffIcon[] getDataGuild() {
		return BuffIcon.dataGuild;
	}
	
	public static BuffIcon[] getDataLove() {
		return BuffIcon.dataLove;
	}
}
