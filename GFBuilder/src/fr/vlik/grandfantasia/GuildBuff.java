package fr.vlik.grandfantasia;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;

public class GuildBuff extends IconBuff {
	
	private static GuildBuff[] data = Loader.getGuildBuff();
	
	
	public GuildBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, path, effects);
	}
	
	public static GuildBuff[] getListGuildBuff(ArrayList<String> guildBuffName) {
		ArrayList<GuildBuff> result = new ArrayList<GuildBuff>();
		
		for(int i = 0; i < GuildBuff.data.length; i++) {
			boolean add = true;
			
			for(int j = 0; j < guildBuffName.size(); j++) {
				if(guildBuffName.get(j).equals(GuildBuff.data[i].getName(Language.FR))) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(GuildBuff.data[i]);
			}
		}
		
		GuildBuff[] cast = new GuildBuff[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
	
	public static GuildBuff[] getData() {
		return GuildBuff.data;
	}
	
	public static GuildBuff get(String name) {
		for(GuildBuff guildBuff : GuildBuff.data) {
			if(guildBuff.getName(Language.FR).equals(name)) {
				return guildBuff;
			}
		}
		
		return null;
	}
}
