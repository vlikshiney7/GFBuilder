package fr.vlik.gfbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

import fr.vlik.gfbuilder.Effect.TypeEffect;
import fr.vlik.uidesign.JCustomRadioButton;

public class GameStuff {
	private ArrayList<MultiEffect> listMultiEffects = new ArrayList<MultiEffect>();
	
	private ArrayList<Title> listTitle = new ArrayList<Title>();
	private ArrayList<Yggdrasil> listYggdrasil = new ArrayList<Yggdrasil>(8);
	private ArrayList<Archive> listArchive = new ArrayList<Archive>(39);
	
	private ArrayList<ArrayList<Weapon>> listWeapon = new ArrayList<ArrayList<Weapon>>();
	private ArrayList<Bullet> listBullet = new ArrayList<Bullet>();
	private ArrayList<ArrayList<Armor>> listArmor = new ArrayList<ArrayList<Armor>>(5);
	private ArrayList<Cape> listCape = new ArrayList<Cape>();
	private ArrayList<Ring> listRing = new ArrayList<Ring>();
	private ArrayList<EquipSet> listEquipSet = new ArrayList<EquipSet>();
	
	private ArrayList<Pearl> listWeaponPearl = new ArrayList<Pearl>();
	private ArrayList<Pearl> listArmorPearl = new ArrayList<Pearl>();
	private ArrayList<ArrayList<XpStuff>> listXpStuff = new ArrayList<ArrayList<XpStuff>>(6);
	private ArrayList<Enchantment> listEnchantment = new ArrayList<Enchantment>();

	private ArrayList<Mount> listMount = new ArrayList<Mount>();
	private ArrayList<ArrayList<Genki>> listGenki = new ArrayList<ArrayList<Genki>>(5);
	
	private ArrayList<ArrayList<Costume>> listCostume = new ArrayList<ArrayList<Costume>>(4);
	private ArrayList<Runway> listRunway = new ArrayList<Runway>(11);
	private ArrayList<Pearl> listWeaponCostPearl = new ArrayList<Pearl>();
	private ArrayList<Pearl> listArmorCostPearl = new ArrayList<Pearl>();

	private ArrayList<ArrayList<Talent>> listTalent = new ArrayList<ArrayList<Talent>>(12);
	private ArrayList<ArrayList<CombiTalent>> listCombiTalent = new ArrayList<ArrayList<CombiTalent>>(12);
	
	private ArrayList<ArrayList<Speciality>> listSpeciality = new ArrayList<ArrayList<Speciality>>(12);
	
	private ArrayList<ArrayList<Skill>> listSkill = new ArrayList<ArrayList<Skill>>(13);
	private ArrayList<ArrayList<ProSkill>> listProSkill = new ArrayList<ArrayList<ProSkill>>(12);
	
	private ArrayList<Blason> listBlason = new ArrayList<Blason>();
	private ArrayList<Buff> listBuff = new ArrayList<Buff>();
	
	private ArrayList<GuildBuff> listGuildBuff = new ArrayList<GuildBuff>();
	
	private ArrayList<Bague> listBague = new ArrayList<Bague>(3);
	private ArrayList<Anima> listAnima = new ArrayList<Anima>();
	
	private ArrayList<ArrayList<Nucleus>> listNucleus = new ArrayList<ArrayList<Nucleus>>(6);
	private ArrayList<Energy> listEnergy = new ArrayList<Energy>(6);
	
	public GameStuff() throws IOException {
		System.out.println("Chargement des données");
		long start = Calendar.getInstance().getTimeInMillis();
		
		/* MULTIEFFECT */
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/multiEffect.txt")));
		String line = reader.readLine();
		while (line != null) {
			String[] lineInfoSplit = line.split("/");
			ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(Integer.parseInt(lineInfoSplit[2]));
			
			for(int i = 0; i < Integer.parseInt(lineInfoSplit[2]); i++) {
				effects.add(new ArrayList<Effect>(Integer.parseInt(lineInfoSplit[1])));
			}
			
			for(int i = 0; i < Integer.parseInt(lineInfoSplit[1]); i++) {
				line = reader.readLine();
				
				String[] lineSplit = line.split("/");
				TypeEffect typeEffect = TypeEffect.valueOf(lineSplit[0]);
				boolean isPercent = Boolean.parseBoolean(lineSplit[1]);
				String[] values = lineSplit[2].split(",");
				boolean isReinca = Boolean.parseBoolean(lineSplit[3]);
				int withWeapon = Integer.parseInt(lineSplit[4]);
				
				for(int j = 0; j < values.length; j++) {
					effects.get(j).add(new Effect(typeEffect, isPercent, Double.parseDouble(values[j]), isReinca, withWeapon, null));
				}
			}
			
			this.listMultiEffects.add(new MultiEffect(lineInfoSplit[0], effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* TITLE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/title.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String[] effects = new String[Integer.parseInt(lineSplit[4])];
			
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];
			
			this.listTitle.add(new Title(lineSplit[0], Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* YGGDRASIL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/yggdrasil.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String[] effects = new String[Integer.parseInt(lineSplit[1])];
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+2];
			
			this.listYggdrasil.add(new Yggdrasil(lineSplit[0], effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* NUCLEUS */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/nucleus/nucleus.txt")));
		line = reader.readLine();
		while(line != null) {
			int numLine = Integer.parseInt(line);
			ArrayList<Nucleus> array = new ArrayList<Nucleus>(numLine);
			for(int j = 0; j < numLine; j++) {
				line = reader.readLine();
				
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int k = 0; k < Integer.parseInt(lineSplit[2]); k++)
					effects.add(new Effect(lineSplit[k+3]));
				
				array.add(new Nucleus(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
			}
			this.listNucleus.add(array);
			
			line = reader.readLine();
		}
		reader.close();
		
		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* WEAPON */
		String[] weaponFile = { "epee1M", "marteau1M", "hache1M", "epee2M", "marteau2M", "hache2M", "meca1M", "meca2M", "arc", "gun", "canon", "relique", "baton", "lame", "cle", "bouclier" };
		this.listWeapon.add(new ArrayList<Weapon>());
		this.listWeapon.get(0).add(new Weapon());
		for(int i = 0; i < weaponFile.length; i++) {
			reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/weapons/" + weaponFile[i] + "/" + weaponFile[i] + ".txt")));
			this.listWeapon.add(new ArrayList<Weapon>());
			line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String classes[] = lineSplit[1].split(",");
				int classesSplit[] = new int[classes.length];
				for(int c = 0; c < classes.length; c++) classesSplit[c] = Integer.parseInt(classes[c]);
				String path =  weaponFile[i] + "/" + lineSplit[lineSplit.length-1] + ".png";
				
				String[] effectSplit = lineSplit[7].split(",");
				
				assert lineSplit.length == Integer.parseInt(effectSplit[0]) + Integer.parseInt(effectSplit[1]) + Integer.parseInt(effectSplit[2]) + 9
						: weaponFile[i] + " line " + this.listWeapon.get(i+1).size();
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
				for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
					effects.add(new Effect(lineSplit[j+8]));
				
				ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
				for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
					bonusXP.add(new Effect(lineSplit[j+8+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
				
				Weapon weapon = new Weapon(
						lineSplit[0], classesSplit, Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[3]), Boolean.parseBoolean(lineSplit[4]),
						 i, Boolean.parseBoolean(lineSplit[5]), Boolean.parseBoolean(lineSplit[6]), path, effects, bonusXP
						 );
				this.listWeapon.get(i+1).add(weapon);
				
				line = reader.readLine();
			}
			reader.close();
		}

		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* WEAPON PEARL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/weapons/pearl.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			String[] effects = new String[Integer.parseInt(lineSplit[4])];
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];
			
			Pearl pearl = new Pearl(lineSplit[0], Integer.parseInt(lineSplit[1]), Boolean.parseBoolean(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path, effects);
			this.listWeaponPearl.add(pearl);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* WEAPON XP */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/weapons/xp.txt")));
		line = reader.readLine();
		for(int i = 0; i < weaponFile.length; i++) {
			this.listXpStuff.add(new ArrayList<XpStuff>());
			for(int j = 0; j < 5; j++) {
				String[] lineSplit = line.split("/");
				double[] values = new double[Integer.parseInt(lineSplit[1])];
				for(int k = 0; k < values.length; k++) values[k] = Double.parseDouble(lineSplit[k+2]);
				
				this.listXpStuff.get(i).add(new XpStuff(lineSplit[0], values));
				
				line = reader.readLine();
			}
			line = reader.readLine();
		}
		reader.close();
		
		/* BULLET */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/bullet/bullet.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[3]));
			for(int i = 0; i < Integer.parseInt(lineSplit[3]); i++)
				effects.add(new Effect(lineSplit[i+4]));
			
			Bullet bullet = new Bullet(lineSplit[0], Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), path, effects);
			this.listBullet.add(bullet);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ARMOR */
		String[] armorFile = { "casques", "torses", "pantalons", "gants", "bottes" };
		for(int i = 0; i < armorFile.length; i++) {
			reader = new BufferedReader(new InputStreamReader(
					MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/armors/" + armorFile[i] + "/" + armorFile[i] + ".txt")));
			this.listArmor.add(new ArrayList<Armor>());
			line = reader.readLine();
			while (line != null) {
				String[] lineSplit = line.split("/");
				String classes[] = lineSplit[1].split(",");
				int classesSplit[] = new int[classes.length];
				for(int c = 0; c < classes.length; c++) classesSplit[c] = Integer.parseInt(classes[c]);
				String path =  armorFile[i] + "/" + lineSplit[lineSplit.length-1] + ".png";
				
				String[] effectSplit = lineSplit[6].split(",");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
				for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
					effects.add(new Effect(lineSplit[j+7]));
				
				ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
				for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
					bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
				
				
				Armor armor = new Armor(
						lineSplit[0], classesSplit, Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[4]), Boolean.parseBoolean(lineSplit[5]),
						lineSplit[3], path, effects, bonusXP
						);
				this.listArmor.get(i).add(armor);
				
				line = reader.readLine();
			}
			reader.close();
		}
		
		/* ARMOR PEARL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/armors/pearl.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			String[] effects = new String[Integer.parseInt(lineSplit[4])];
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];

			Pearl pearl = new Pearl(lineSplit[0], Integer.parseInt(lineSplit[1]), Boolean.parseBoolean(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path, effects);
			this.listArmorPearl.add(pearl);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ARMOR XP */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/armors/xp.txt")));
		line = reader.readLine();
		for(int i = 0; i < armorFile.length; i++) {
			this.listXpStuff.add(new ArrayList<XpStuff>());
			for(int j = 0; j < 5; j++) {
				String[] lineSplit = line.split("/");
				double[] values = new double[Integer.parseInt(lineSplit[1])];
				for(int k = 0; k < values.length; k++) values[k] = Double.parseDouble(lineSplit[k+2]);
				
				this.listXpStuff.get(i+16).add(new XpStuff(lineSplit[0], values));
				
				line = reader.readLine();
			}
			line = reader.readLine();
		}
		reader.close();
		
		/* SET ARMOR */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/armors/set.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String[] nbBonus = lineSplit[2].split(",");
			String[] with3 = new String[Integer.parseInt(nbBonus[0])];
			String[] with4 = new String[Integer.parseInt(nbBonus[1])];
			String[] with5 = new String[Integer.parseInt(nbBonus[2])];
			for(int i = 0; i < with3.length; i++) with3[i] = lineSplit[i+3];
			for(int i = 0; i < with4.length; i++) with4[i] = lineSplit[i+3+with3.length];
			for(int i = 0; i < with5.length; i++) with5[i] = lineSplit[i+3+with3.length+with4.length];
			
			this.listEquipSet.add(new EquipSet(lineSplit[0], lineSplit[1], with3, with4, with5));
			
			line = reader.readLine();
		}
		reader.close();
		
		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* CAPES */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/capering/cape/cape.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String classes[] = lineSplit[1].split(",");
			int classesSplit[] = new int[classes.length];
			for(int c = 0; c < classes.length; c++) classesSplit[c] = Integer.parseInt(classes[c]);
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			String[] effectSplit = lineSplit[6].split(",");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
			for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
				effects.add(new Effect(lineSplit[j+7]));
			
			ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
			for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
				bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
			
			
			Cape cape = new Cape(
					lineSplit[0], classesSplit, Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[4]), Boolean.parseBoolean(lineSplit[5]),
					lineSplit[3], path, effects, bonusXP
					);
			this.listCape.add(cape);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* RINGS */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/capering/ring/ring.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			String[] effectSplit = lineSplit[6].split(",");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
			for(int j = 0; j < Integer.parseInt(effectSplit[0]); j++)
				effects.add(new Effect(lineSplit[j+7]));
			
			ArrayList<Effect> bonusXP = new ArrayList<Effect>(Integer.parseInt(effectSplit[2]));
			for(int j = 0; j < Integer.parseInt(effectSplit[2]); j++)
				bonusXP.add(new Effect(lineSplit[j+7+Integer.parseInt(effectSplit[0])+Integer.parseInt(effectSplit[1])]));
			
			
			Ring ring = new Ring(
					lineSplit[0], Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[3]), Boolean.parseBoolean(lineSplit[4]),
					lineSplit[2], Boolean.parseBoolean(lineSplit[5]), path, effects, bonusXP
					);
			this.listRing.add(ring);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* XP CAPE RING */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/capering/xp.txt")));
		line = reader.readLine();
		for(int i = 0; i < 2; i++) {
			this.listXpStuff.add(new ArrayList<XpStuff>());
			for(int j = 0; j < 5; j++) {
				String[] lineSplit = line.split("/");
				double[] values = new double[Integer.parseInt(lineSplit[1])];
				for(int k = 0; k < values.length; k++) values[k] = Double.parseDouble(lineSplit[k+2]);
				
				this.listXpStuff.get(i+21).add(new XpStuff(lineSplit[0], values));
				if(i == 1) {
					this.listXpStuff.add(new ArrayList<XpStuff>());
					this.listXpStuff.get(i+22).add(new XpStuff(lineSplit[0], values));
				}
				
				line = reader.readLine();
			}
			line = reader.readLine();
		}
		reader.close();
		
		/* ENCHANTMENT */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/enchantement.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
			for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
				effects.add(new Effect(lineSplit[j+3]));
			
			this.listEnchantment.add(new Enchantment(lineSplit[0], Boolean.parseBoolean(lineSplit[1]), effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* MONTURE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/montures/monture.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			this.listMount.add(new Mount(lineSplit[0], Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* XP MONTURE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/xpride.txt")));
		line = reader.readLine();
		this.listXpStuff.add(new ArrayList<XpStuff>());
		for(int i = 0; i < 14; i++) {
			String[] lineSplit = line.split("/");
			double[] values = new double[Integer.parseInt(lineSplit[1])];
			for(int j = 0; j < values.length; j++) values[j] = Double.parseDouble(lineSplit[j+2]);
			
			this.listXpStuff.get(24).add(new XpStuff(lineSplit[0], values));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* GENKI */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/genki.txt")));
		line = reader.readLine();
		for(int i = 0; i < 5; i++) this.listGenki.add(new ArrayList<Genki>());
		while (line != null) {
			String[] lineInfoSplit = line.split("/");
			for(int i = 0; i < Integer.parseInt(lineInfoSplit[2]); i++) {
				line = reader.readLine();
				String[] lineSplit = line.split("/");
				String[] effects = new String[Integer.parseInt(lineSplit[1])];
				for(int j = 0; j < effects.length; j++) effects[j] = lineSplit[j+2];
				
				Genki genki = new Genki(lineInfoSplit[0], Integer.parseInt(lineSplit[0]), Integer.parseInt(lineInfoSplit[1]), effects);
				this.listGenki.get(Integer.parseInt(lineSplit[0])-1).add(genki);
			}
			line = reader.readLine();
		}
		reader.close();
		
		/* COSTUME */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/costumes/costume.txt")));
		line = reader.readLine();
		for(int i = 0; i < 4; i++) this.listCostume.add(new ArrayList<Costume>());
		while (line != null) {
			String[] lineInfoSplit = line.split("/");
			for(int i = 0; i < Integer.parseInt(lineInfoSplit[2]); i++) {
				line = reader.readLine();
				String[] lineSplit = line.split("/");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
				for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
					effects.add(new Effect(lineSplit[j+2]));
				
				Costume cost = new Costume(lineInfoSplit[0], Integer.parseInt(lineSplit[0]), Integer.parseInt(lineInfoSplit[1]), effects);
				this.listCostume.get(4 - (Integer.parseInt(lineInfoSplit[2])-i)).add(cost);
			}
			line = reader.readLine();
		}
		reader.close();
		
		/* RUNWAY */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/runway.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
			for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
				effects.add(new Effect(lineSplit[j+2]));
			
			this.listRunway.add(new Runway(lineSplit[0], effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* WEAPON COST PEARL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/costumes/pearlWeapon.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			String[] effects = new String[Integer.parseInt(lineSplit[4])];
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];

			Pearl pearl = new Pearl(lineSplit[0], Integer.parseInt(lineSplit[1]), Boolean.parseBoolean(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path, effects);
			this.listWeaponCostPearl.add(pearl);
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ARMOR COST PEARL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/costumes/pearlArmor.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			String[] effects = new String[Integer.parseInt(lineSplit[4])];
			for(int i = 0; i < effects.length; i++) effects[i] = lineSplit[i+5];

			Pearl pearl = new Pearl(lineSplit[0], Integer.parseInt(lineSplit[1]), Boolean.parseBoolean(lineSplit[2]), Boolean.parseBoolean(lineSplit[3]), path, effects);
			this.listArmorCostPearl.add(pearl);
			
			line = reader.readLine();
		}
		reader.close();
		
		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* TALENT */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/talent/talent.txt")));
		line = reader.readLine();
		for(int i = 0; i < 12; i++) {
			this.listTalent.add(new ArrayList<Talent>());
			for(int j = 0; j < 24; j++) {
				String[] lineSplit = line.split("/");
				String[] strTalent = lineSplit[1].split(",");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				int[] lvlTalent = new int[strTalent.length];
				for(int k = 0; k < lvlTalent.length; k++) {
					lvlTalent[k] = Integer.parseInt(strTalent[k]);
				}
				
				ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(lvlTalent.length);
				for(int k = 0; k < lvlTalent.length; k++) {
					ArrayList<Effect> simpleTalent = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
					for(int l = 0; l < Integer.parseInt(lineSplit[2]); l++) {
						simpleTalent.add(new Effect(lineSplit[l+k*Integer.parseInt(lineSplit[2])+3]));
					}
					effects.add(simpleTalent);
				}
				
				this.listTalent.get(i).add(new Talent(lineSplit[0], lvlTalent, path, effects));
				
				line = reader.readLine();
			}
			line = reader.readLine();
		}
		reader.close();

		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* COMBI TALENT */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/combi.txt")));
		line = reader.readLine();
		while (line != null) {
			int num = Integer.parseInt(line);
			ArrayList<CombiTalent> currentList = new ArrayList<CombiTalent>(num);
			for(int i = 0; i < num; i++) {
				line = reader.readLine();
				String[] lineSplit = line.split("/");
				String code[] = lineSplit[1].split(",");
				int codeSplit[] = new int[code.length];
				for(int c = 0; c < code.length; c++) codeSplit[c] = Integer.parseInt(code[c]);
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
					effects.add(new Effect(lineSplit[j+3]));
				
				currentList.add(new CombiTalent(lineSplit[0], codeSplit, effects));
			}
			this.listCombiTalent.add(currentList);
			line = reader.readLine();
		}

		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* SPECIALITY */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/speciality/speciality.txt")));
		line = reader.readLine();
		for(int i = 0; i < 12; i++) {
			this.listSpeciality.add(new ArrayList<Speciality>());
			for(int j = 0; j < 20; j++) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				String[] effects = new String[Integer.parseInt(lineSplit[2])];
				for(int k = 0; k < effects.length; k++) effects[k] = lineSplit[k+3];
				
				this.listSpeciality.get(i).add(new Speciality(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
				
				line = reader.readLine();
			}
			line = reader.readLine();
		}
		reader.close();
		
		System.out.println("Item : " + (Calendar.getInstance().getTimeInMillis() - start));
		
		/* SKILL */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/skill/skill.txt")));
		line = reader.readLine();
		
		for(int i = 0; i < 13; i++) {
			this.listSkill.add(new ArrayList<Skill>());
		}
		for(ArrayList<Skill> list : this.listSkill) {
			int lineSplitInfo = Integer.parseInt(line);
			line = reader.readLine();
			for(int i = 0; i < lineSplitInfo; i++) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				String[] lvlSkill = lineSplit[2].split(",");
				int[] lvl = new int[lvlSkill.length];
				
				ArrayList<ArrayList<Effect>> effects = new ArrayList<ArrayList<Effect>>(lvlSkill.length);
				for(int j = 0; j < lvlSkill.length; j++) {
					int nbEffect = Integer.parseInt(lineSplit[3]);
					effects.add(new ArrayList<Effect>(nbEffect));
					lvl[j] = Integer.parseInt(lvlSkill[j]);
					for(int k = 0; k < nbEffect; k++) {
						effects.get(j).add(new Effect(lineSplit[j*nbEffect+k+4]));
					}
				}
				
				list.add(new Skill(lineSplit[0], lvl, Boolean.parseBoolean(lineSplit[1]), path, effects));
				
				line = reader.readLine();
			}
		}
		reader.close();
		
		/* SKILL PRO */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/pro/pro.txt")));
		line = reader.readLine();
		
		for(int i = 0; i < 12; i++) {
			ArrayList<ProSkill> skills = new ArrayList<ProSkill>(9);
			for(int j = 0; j < 9; j++) {
				String[] lineSplit = line.split("/");
				String path =  lineSplit[lineSplit.length-1] + ".png";
				
				String[] effectSplit = lineSplit[2].split(",");
				
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(effectSplit[0]));
				for(int k = 0; k < Integer.parseInt(effectSplit[0]); k++)
					effects.add(new Effect(lineSplit[k+3]));
				
				skills.add(new ProSkill(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
				
				line = reader.readLine();
			}
			
			this.listProSkill.add(skills);
			line = reader.readLine();
		}
		reader.close();
		
		/* BLASON */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/sprites/blasons.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[3]));
			for(int j = 0; j < Integer.parseInt(lineSplit[3]); j++)
				effects.add(new Effect(lineSplit[j+4]));
			
			this.listBlason.add(new Blason(lineSplit[0], Integer.parseInt(lineSplit[1]), Boolean.parseBoolean(lineSplit[2]), effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ILE SPRITE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/sprites/isle.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
			for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
				effects.add(new Effect(lineSplit[j+2]));
			
			this.listBuff.add(new Buff(lineSplit[0], effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* BUFF GUILDE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/guild/guildBuff.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
			for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
				effects.add(new Effect(lineSplit[j+2]));
			
			this.listGuildBuff.add(new GuildBuff(lineSplit[0], path, effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* BAGUE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/bague/bague.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
			for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
				effects.add(new Effect(lineSplit[j+3]));
			
			this.listBague.add(new Bague(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ANIMA */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/anima/anima.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			if(Integer.parseInt(lineSplit[2]) > -1) {
				ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
				for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
					effects.add(new Effect(lineSplit[j+3]));
				
				this.listAnima.add(new Anima(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
			} else {
				MultiEffect effects = getFromCode(lineSplit[3]);
				
				this.listAnima.add(new Anima(lineSplit[0], Integer.parseInt(lineSplit[1]), path, effects));
			}
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ENERGY */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/energy/energy.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			String path =  lineSplit[lineSplit.length-1] + ".png";
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[1]));
			for(int j = 0; j < Integer.parseInt(lineSplit[1]); j++)
				effects.add(new Effect(lineSplit[j+2]));
			
			this.listEnergy.add(new Energy(lineSplit[0], path, effects));
			
			line = reader.readLine();
		}
		reader.close();
		
		/* ARCHIVE */
		reader = new BufferedReader(new InputStreamReader(
				MainFrame.class.getResourceAsStream("/fr/vlik/gfbuilder/resources/archive.txt")));
		line = reader.readLine();
		while (line != null) {
			String[] lineSplit = line.split("/");
			
			ArrayList<Effect> effects = new ArrayList<Effect>(Integer.parseInt(lineSplit[2]));
			for(int j = 0; j < Integer.parseInt(lineSplit[2]); j++)
				effects.add(new Effect(lineSplit[j+3]));
			
			this.listArchive.add(new Archive(lineSplit[0], Integer.parseInt(lineSplit[1]), effects));
			
			line = reader.readLine();
		}
		reader.close();
	}
	
	public ArrayList<Title> getListTitle() {
		return this.listTitle;
	}
	
	public ArrayList<Yggdrasil> getListYggdrasil() {
		return this.listYggdrasil;
	}
	
	public ArrayList<ArrayList<Weapon>> getListWeapon() {
		return this.listWeapon;
	}
	
	public ArrayList<ArrayList<Armor>> getListArmor() {
		return this.listArmor;
	}
	
	public ArrayList<Cape> getListCape() {
		return this.listCape;
	}
	
	public ArrayList<Ring> getListRing() {
		return this.listRing;
	}
	
	public ArrayList<Pearl> getListWeaponPearl() {
		return this.listWeaponPearl;
	}
	
	public ArrayList<Pearl> getListArmorPearl() {
		return this.listArmorPearl;
	}
	
	public ArrayList<Pearl> getListWeaponCostPearl() {
		return this.listWeaponCostPearl;
	}
	
	public ArrayList<Pearl> getListArmorCostPearl() {
		return this.listArmorCostPearl;
	}
	
	public ArrayList<EquipSet> getListEquipSet() {
		return this.listEquipSet;
	}
	
	public ArrayList<ArrayList<XpStuff>> getListXpStuff() {
		return this.listXpStuff;
	}
	
	public ArrayList<ArrayList<CombiTalent>> getListCombiTalent() {
		return this.listCombiTalent;
	}
	
	public ArrayList<ArrayList<Talent>> getListTalent() {
		return this.listTalent;
	}
	
	public ArrayList<ArrayList<Speciality>> getListSpeciality() {
		return this.listSpeciality;
	}
	
	public ArrayList<ArrayList<Skill>> getListSkill() {
		return this.listSkill;
	}
	
	public ProSkill[] getListProSkill(int idClass, int lvl) {
		ArrayList<ProSkill> result = new ArrayList<ProSkill>();
		
		for(ProSkill proSkill : this.listProSkill.get(idClass)) {
			if(proSkill.getLvl() <= lvl) result.add(proSkill);
		}
		
		ProSkill[] cast = new ProSkill[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public ArrayList<Blason> getListBlason() {
		return this.listBlason;
	}
	
	public MultiEffect getFromCode(String code) {
		for(MultiEffect multi : this.listMultiEffects) {
			if(multi.getCode().equals(code)) return multi;
		}
		
		return null;
	}
	
	public Buff[] getListBuff() {
		Buff[] cast = new Buff[this.listBuff.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = this.listBuff.get(i);
		
		return cast;
	}
	
	public Bague[] getListBague() {
		Bague[] cast = new Bague[this.listBague.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = this.listBague.get(i);
		
		return cast;
	}
	
	public Anima[] getListAnima(int lvl) {
		Anima[] cast = new Anima[this.listAnima.size()];
		for(int i = 0; i < cast.length; i++) {
			if(this.listAnima.get(i).isMultiEffect()) {
				int index = lvl > 66 ? 65 : lvl-1;
				this.listAnima.get(i).setEffects(index);
			}
			cast[i] = this.listAnima.get(i);
		}
		
		return cast;
	}
	
	public ArrayList<Energy> getListEnergy() {
		return this.listEnergy;
	}
	
	public ArrayList<Runway> getListRunway() {
		return this.listRunway;
	}
	
	public ArrayList<Archive> getListArchive() {
		return this.listArchive;
	}
	
	public GuildBuff[] getListGuildBuff() {
		GuildBuff[] cast = new GuildBuff[this.listGuildBuff.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = this.listGuildBuff.get(i);
		
		return cast;
	}
	
	public GuildBuff[] getListGuildBuff(ArrayList<String> guildBuffName) {
		ArrayList<GuildBuff> result = new ArrayList<GuildBuff>();
		
		for(int i = 0; i < this.listGuildBuff.size(); i++) {
			boolean add = true;
			for(int j = 0; j < guildBuffName.size(); j++) {
				if(guildBuffName.get(j).equals(this.listGuildBuff.get(i).getName())) {
					add = false;
					break;
				}
			}
			if(add) result.add(this.listGuildBuff.get(i));
		}
		
		GuildBuff[] cast = new GuildBuff[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Nucleus[] getListNucleus(int idList) {
		ArrayList<Nucleus> result = new ArrayList<Nucleus>();
		
		for(Nucleus nucleus : this.listNucleus.get(idList)) {
			result.add(nucleus);
		}
		
		Nucleus[] cast = new Nucleus[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Nucleus[] getListNucleus(ArrayList<String> stoneName) {
		ArrayList<Nucleus> result = new ArrayList<Nucleus>();
		
		ArrayList<Nucleus> getter = this.listNucleus.get(6);
		
		for(int i = 0; i < getter.size(); i++) {
			boolean add = true;
			for(int j = 0; j < stoneName.size(); j++) {
				if(stoneName.get(j).equals(getter.get(i).getName())) {
					add = false;
					break;
				}
			}
			if(add) result.add(getter.get(i));
		}
		
		Nucleus[] cast = new Nucleus[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Title[] getPossibleTitle(int idClass, int lvl, boolean isReinca) {
		ArrayList<Title> result = new ArrayList<Title>();
		
		if(isReinca) {
			lvl += 100;
			for(int i = 0; i < this.listTitle.size(); i++) {
				if(this.listTitle.get(i).getLvl() <= lvl && (this.listTitle.get(i).getIdClass() == -1 || this.listTitle.get(i).getIdClass() == idClass))
					result.add(this.listTitle.get(i));
			}
		} else {
			for(int i = 0; i < this.listTitle.size(); i++) {
				if(this.listTitle.get(i).getQuality() == 7) continue;
				if(this.listTitle.get(i).getIdClass() == -1 || this.listTitle.get(i).getIdClass() == idClass) {
					if(this.listTitle.get(i).getLvl() <= lvl) {
						result.add(this.listTitle.get(i));
					} else if(this.listTitle.get(i).getLvl() > 100 && this.listTitle.get(i).getLvl()-100 <= lvl)
						result.add(this.listTitle.get(i));
				}
			}
		}
		
		Title[] cast = new Title[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Mount[] getPossibleMount(int lvl, boolean isReinca) {
		ArrayList<Mount> result = new ArrayList<Mount>();
		
		if(isReinca) {
			for(Mount mount : this.listMount) {
				if(mount.getLvl() <= lvl) result.add(mount);
			}
		} else {
			for(Mount mount : this.listMount) {
				if(mount.getLvl() <= lvl && !mount.isReinca()) result.add(mount);
			}
		}
		
		Mount[] cast = new Mount[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Genki[] getPossibleGenki(ArrayList<JCustomRadioButton> quality, int star) {
		ArrayList<Genki> result = new ArrayList<Genki>();
		
		for(int i = 0; i < quality.size(); i++) {
			if(quality.get(i).isSelected()) {
				if(i == 0) return null;
				for(int j = 0; j < this.listGenki.get(i-1).size(); j++) {
					if(this.listGenki.get(i-1).get(j).getStar() == star) {
						result.add(this.listGenki.get(i-1).get(j));
					}
				}
				break;
			}
		}
		
		Genki[] cast = new Genki[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Weapon[] getPossibleWeapon(int idList, int idClass, int lvl, Weapon toIgnore) {
		ArrayList<Weapon> result = new ArrayList<Weapon>();
		int[] weapon = null;
		switch (idList) {
			case 0 : weapon = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 12, 13 };	break;
			case 1 : weapon = new int[] { 0, 1, 2, 6 };						break;
			case 2 : weapon = new int[] { 8, 9, 10, 11, 14, 15 };			break;
		}
		
		result.add(this.listWeapon.get(0).get(0));
		for(int i = 0; i < weapon.length; i++) {
			if(weapon[i] != 11) {
				if(!this.listWeapon.get(weapon[i]+1).get(0).containIdClass(idClass)) continue;
				for(int j = 0; j < this.listWeapon.get(weapon[i]+1).size(); j++) {
					if(this.listWeapon.get(weapon[i]+1).get(j).getLvl() <= lvl) {
						result.add(this.listWeapon.get(weapon[i]+1).get(j));
					}
				}
			} else {
				for(int j = 0; j < this.listWeapon.get(weapon[i]+1).size(); j++) {
					if(!this.listWeapon.get(weapon[i]+1).get(j).containIdClass(idClass)) continue;
					if(this.listWeapon.get(weapon[i]+1).get(j).getLvl() <= lvl) {
						result.add(this.listWeapon.get(weapon[i]+1).get(j));
					}
				}
			}
		}
		
		if(toIgnore != null && toIgnore.getIsUnique()) result.remove(toIgnore);
		
		Weapon[] cast = new Weapon[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Bullet[] getPossibleBullet(int lvl) {
		ArrayList<Bullet> result = new ArrayList<Bullet>();
		
		for(Bullet bullet : this.listBullet) {
			if(bullet.getLvl() <= lvl) result.add(bullet);
		}
		
		Bullet[] cast = new Bullet[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Armor[] getPossibleArmor(int idList, int idClass, int lvl) {
		ArrayList<Armor> result = new ArrayList<Armor>();
		
		for(Armor armor : this.listArmor.get(idList)) {
			if(armor.getLvl() <= lvl && armor.containIdClass(idClass)) {
				result.add(armor);
			}
		}
		
		Armor[] cast = new Armor[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}

	public Pearl[] getPossibleWeaponPearl(int quality) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		if(quality <= 1) {
			result.addAll(this.listWeaponPearl);
		} else {
			for(int i = 0; i < this.listWeaponPearl.size(); i++) {
				if(this.listWeaponPearl.get(i).isPurpulOnly()) continue;
				result.add(this.listWeaponPearl.get(i));
			}
		}
		
		Pearl[] cast = new Pearl[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}

	public Pearl[] getPossibleArmorPearl(int quality) {
		ArrayList<Pearl> result = new ArrayList<Pearl>();
		
		if(quality <= 1) {
			result.addAll(this.listArmorPearl);
		} else {
			for(int i = 0; i < this.listArmorPearl.size(); i++) {
				if(this.listArmorPearl.get(i).isPurpulOnly()) continue;
				result.add(this.listArmorPearl.get(i));
			}
		}
		
		Pearl[] cast = new Pearl[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Cape[] getPossibleCape(int idClass, int lvl) {
		ArrayList<Cape> result = new ArrayList<Cape>();
		
		for(Cape cape : this.listCape) {
			if(cape.getLvl() <= lvl && cape.containIdClass(idClass)) {
				result.add(cape);
			}
		}
		
		Cape[] cast = new Cape[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Ring[] getPossibleRing(int lvl, Ring toIgnore) {
		ArrayList<Ring> result = new ArrayList<Ring>();
		
		for(Ring ring : this.listRing) {
			if(ring.getLvl() <= lvl) {
				result.add(ring);
			}
		}
		
		if(toIgnore != null && toIgnore.getIsUnique()) result.remove(toIgnore);
		
		Ring[] cast = new Ring[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Enchantment[] getPossibleWeaponEnchant(int quality, int type) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		if(type < 8) {
			if(quality == 4 || quality == 5) {
				for(int index : Enchantment.EpMaHaMe45) {
					result.add(this.listEnchantment.get(index));
				}
			} else if(quality == 6) {
				for(int index : Enchantment.EpMaHaMe6) {
					result.add(this.listEnchantment.get(index));
				}
			}
		} else if(type < 11 || type == 14) {
			if(quality == 4 || quality == 5) {
				for(int index : Enchantment.ArcGunCanCle45) {
					result.add(this.listEnchantment.get(index));
				}
			} else if(quality == 6) {
				for(int index : Enchantment.ArcGunCanCle6) {
					result.add(this.listEnchantment.get(index));
				}
			}
		} else if(type == 11) {
			if(quality == 4 || quality == 5) {
				for(int index : Enchantment.Rel45) {
					result.add(this.listEnchantment.get(index));
				}
			} else if(quality == 6) {
				for(int index : Enchantment.Rel6) {
					result.add(this.listEnchantment.get(index));
				}
			}
		} else if(type < 14) {
			if(quality == 4 || quality == 5) {
				for(int index : Enchantment.BatonLame45) {
					result.add(this.listEnchantment.get(index));
				}
			} else if(quality == 6) {
				for(int index : Enchantment.BatonLame6) {
					result.add(this.listEnchantment.get(index));
				}
			}
		} else if(type == 15) {
			if(quality == 4 || quality == 5) {
				for(int index : Enchantment.Bou45) {
					result.add(this.listEnchantment.get(index));
				}
			} else if(quality == 6) {
				for(int index : Enchantment.Bou6) {
					result.add(this.listEnchantment.get(index));
				}
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Enchantment[] getPossibleArmorEnchant(int quality) {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		if(quality == 4 || quality == 5) {
			for(int index : Enchantment.Armor45) {
				result.add(this.listEnchantment.get(index));
			}
		} else if(quality == 6) {
			for(int index : Enchantment.Armor6) {
				result.add(this.listEnchantment.get(index));
			}
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Enchantment[] getPossibleCapeRingEnchant() {
		ArrayList<Enchantment> result = new ArrayList<Enchantment>();
		result.add(new Enchantment());
		
		for(int index : Enchantment.CapeRing) {
			result.add(this.listEnchantment.get(index));
		}
		
		Enchantment[] cast = new Enchantment[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Costume[] getPossibleCostume(int quality, int type) {
		if(quality == 0) return null;
		
		ArrayList<Costume> result = new ArrayList<Costume>();
		if(quality == 1) result.add(new Costume());
		
		for(Costume cost : this.listCostume.get(quality-1)) {
			if(cost.getType() == -1 || cost.getType() == type) {
				result.add(cost);
			}
		}
		
		Costume[] cast = new Costume[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
	}
	
	public Blason[] getPossibleBlason(int lvl, boolean type) {
		ArrayList<Blason> result = new ArrayList<Blason>();
		
		result.add(new Blason());
		
		for(Blason blason : this.listBlason) {
			if(blason.getLvl() <= lvl && blason.isAggressive() == type) {
				result.add(blason);
			}
		}
		
		Blason[] cast = new Blason[result.size()];
		for(int i = 0; i < cast.length; i++) cast[i] = result.get(i);
		
		return cast;
		
		
		
	}
	
	public String getTooltipRunway(int[] idRunway) {
		StringBuilder tooltip = new StringBuilder("<strong>Bonus :</strong>");
		
		for(int i = 0; i < idRunway.length; i++) {
			tooltip.append("<br>");
			tooltip.append(this.listRunway.get(idRunway[i]).getTooltip());
		}
		
		return "<html>" + tooltip + "</html>";
	}
	
	
	public ArrayList<ArrayList<Talent>> getPossibleTalent(int idClass, int lvl) {
		ArrayList<ArrayList<Talent>> result = new ArrayList<ArrayList<Talent>>();
		for(int i = 0; i < 24; i++) {
			result.add(new ArrayList<Talent>());
			Talent currentTalent = this.listTalent.get(idClass).get(i);
			for(int j = 0; j < currentTalent.getLvl().length; j++) {
				if(currentTalent.getLvl()[j] <= lvl) {
					result.get(i).add(new Talent(currentTalent, j));
				} else {
					break;
				}
			}
		}
		
		return result;
	}
	
	public CombiTalent getCombiTalent(int idClass, int[] code) {
		CombiTalent result = new CombiTalent();
		for(CombiTalent combi : this.listCombiTalent.get(idClass)) {
			boolean verif = true;
			for(int i = 0; i < combi.getCode().length; i++) {
				if(combi.getCode()[i] != code[i]) {
					verif = !verif;
					break;
				}
			}
			
			if(verif) {
				result = combi;
				break;
			}
		}
		
		return result;
	}
	
	public Speciality[] getSpeFromClass(int idClass) {
		Speciality[] cast = new Speciality[this.listSpeciality.get(idClass).size()];
		for(int i = 0; i < cast.length; i++) cast[i] = this.listSpeciality.get(idClass).get(i);
		
		return cast;
	}
}
