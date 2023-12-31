package fr.vlik.grandfantasia.gamebuff;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.loader.Loader;
import fr.vlik.grandfantasia.stats.Calculable;
import fr.vlik.grandfantasia.template.IconBuff;

public class GuildBuff extends IconBuff {
	
	@SuppressWarnings("serial")
	public static final Map<Language, String> CLASS_NAME = new EnumMap<Language, String>(Language.class) {{
		put(Language.FR, "Buff de guilde");
		put(Language.EN, "Guild buff");
	}};
	
	private static GuildBuff[] data = Loader.getGuildBuff();
	
	public GuildBuff(Map<Language, String> name, String path, Calculable[] effects) {
		super(name, path, effects);
	}
	
	public static GuildBuff[] getListGuildBuff(List<GuildBuff> guildBuff) {
		List<GuildBuff> result = new ArrayList<>();
		
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
		return get(GuildBuff.data, name, Language.FR);
	}

	public static GuildBuff[] getData() {
		return GuildBuff.data;
	}
}
