package fr.vlik.grandfantasia.gameBuff;

import java.util.ArrayList;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class GuildBuff extends IconBuff {
	
	private static GuildBuff[] data = Loader.getGuildBuff();
	
	
	public GuildBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, path, effects);
	}
	
	public static GuildBuff[] getListGuildBuff(ArrayList<GuildBuff> guildBuff) {
		ArrayList<GuildBuff> result = new ArrayList<GuildBuff>();
		
		for(GuildBuff data : GuildBuff.data) {
			boolean add = true;
			
			for(int j = 0; j < guildBuff.size(); j++) {
				if(data.equals(guildBuff.get(j))) {
					add = false;
					break;
				}
			}
			
			if(add) {
				result.add(data);
			}
		}
		
		return result.toArray(new GuildBuff[result.size()]);
	}
	
	public static GuildBuff get(String name) {
		for(GuildBuff guildBuff : GuildBuff.data) {
			if(guildBuff.getName(Language.FR).equals(name)) {
				return guildBuff;
			}
		}
		
		return null;
	}

	public static GuildBuff[] getData() {
		return GuildBuff.data;
	}
}
