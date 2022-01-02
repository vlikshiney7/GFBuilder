package fr.vlik.uidesign;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Filtrable;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomDialog extends JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private JCustomTextField search;
	private JCustomButtonGroup<Logic> orAnd;
	
	private ArrayList<ArrayList<JCustomCheckBox<Filtrable>>> check;
	
	private JCustomButton uncheck;
	private JCustomButton allcheck;
	private JCustomButton close;
	
	private JCustomButton filter;
	
	private JLangLabel[] label;
	
	public JCustomDialog(String icon, int gridValue, Filtrable[]... filters) {
		this.setLayout(new BorderLayout());
		this.setBlackUI();
		this.setUndecorated(true);
		
		this.filter = new JCustomButton(icon, icon, icon, Design.GREY_COLOR);
		this.filter.setBorder(Design.UIColor[3]);
		this.filter.setToolTipText("Filtre");
		
		this.filter.addActionListener(e -> {
			this.popup(this.filter);
		});
		
		this.label = Lang.getDataLabel(7);
		
		this.check = new ArrayList<ArrayList<JCustomCheckBox<Filtrable>>>(filters.length);
		for(Filtrable[] filterGroup : filters) {
			this.check.add(toList(filterGroup));
		}
		
		this.search = new JCustomTextField();
		this.search.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		this.orAnd = new JCustomButtonGroup<Logic>();
		for(int i = 0; i < Logic.values().length; i++) {
			JCustomRadioButton<Logic> logic = new JCustomRadioButton<Logic>(Logic.values()[i]);
			logic.addActionListener(e -> {
				
			});
			this.orAnd.add(logic);
		}
		this.orAnd.setSelectedItem(Logic.OR);
		
		this.uncheck = new JCustomButton(this.label[0].getLang(), Design.RED_COLOR);
		this.uncheck.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.uncheck.setMinimumSize(new Dimension(0, 30));
		this.uncheck.addActionListener(e -> {
			setCheck(false);
		});
		
		this.allcheck = new JCustomButton(this.label[1].getLang(), Design.GREEN_COLOR);
		this.allcheck.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.allcheck.setMinimumSize(new Dimension(0, 30));
		this.allcheck.addActionListener(e -> {
			setCheck(true);
		});
		
		this.close = new JCustomButton(this.label[2].getLang(), Design.YELLOW_COLOR);
		this.close.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.close.setMinimumSize(new Dimension(0, 30));
		this.close.addActionListener(e -> {
			MainFrame.getInstance().requestFocus();
		});
		
		
		int nbLigne = 0;
		
		JCustomPanel page = new JCustomPanel(BoxLayout.Y_AXIS);
		page.setBackground(Design.UIColor[2]);
		page.setBorder(new LineBorder(Design.UIColor[0], 2));
		
		JCustomPanel panelSearch = new JCustomPanel(BoxLayout.X_AXIS, new EmptyBorder(10, 10, 10, 10));
		panelSearch.setBackground(Design.UIColor[2]);
		panelSearch.addAll(this.search, Box.createHorizontalStrut(5));
		panelSearch.addAll(this.orAnd);
		
		page.add(panelSearch);
		
		for(ArrayList<JCustomCheckBox<Filtrable>> filterGroup : this.check) {
			JCustomPanel panelFilter = new JCustomPanel(new GridLayout(filterGroup.size() / gridValue + (filterGroup.size() % gridValue == 0 ? 0 : 1), gridValue), new EmptyBorder(0, 10, 10, 10));
			panelFilter.setBackground(Design.UIColor[2]);
			
			panelFilter.addAll(filterGroup);
			
			if(filterGroup.size() % gridValue != 0) {
				for(int i = 0; i < gridValue - (filterGroup.size() % gridValue); i++) {
					JCustomPanel fake = new JCustomPanel();
					fake.setVisible(false);
					panelFilter.add(fake);
				}
			}
			
			page.add(panelFilter);
			
			nbLigne += filterGroup.size() / gridValue + (filterGroup.size() % gridValue == 0 ? 0 : 1);
		}
		
		JCustomPanel panelButton = new JCustomPanel(new GridLayout(1, 3, 10, 5), new EmptyBorder(0, 10, 10, 10));
		panelButton.setBackground(Design.UIColor[2]);
		panelButton.addAll(this.uncheck, this.allcheck, this.close);
		page.add(panelButton);
		
		this.add(page);
		
		this.setVisible(false);
		
		this.setSize(Math.max(110 * gridValue, 410), 115 + nbLigne * 19 + 10 * (filters.length - 1));
	}
	
	@SuppressWarnings("serial")
	public static enum Logic implements Writable {
		OR(new HashMap<Language, String>() {{ put(Language.FR, "OU"); put(Language.EN, "OR"); }}),
		AND(new HashMap<Language, String>() {{ put(Language.FR, "ET"); put(Language.EN, "AND"); }});
		
		public Map<Language, String> lang;
		
		private Logic(Map<Language, String> lang) {
	        this.lang = lang;
	    }
		
		@Override
		public String getInfo(Language lang) {
			return this.lang.get(lang);
		}
		
		@Override
		public String getTooltip() {
			return this.lang.get(Language.FR);
		}
		
	}
	
	public JCustomButton getButton() {
		return this.filter;
	}
	
	public boolean isAndValue() {
		return this.orAnd.getSelectedItem() == Logic.AND;
	}
	
	private ArrayList<JCustomCheckBox<Filtrable>> toList(Filtrable[] filter) {
		ArrayList<JCustomCheckBox<Filtrable>> listFilter = new ArrayList<JCustomCheckBox<Filtrable>>(filter.length);
		for(int i = 0; i < filter.length; i++) {
			listFilter.add(new JCustomCheckBox<Filtrable>(filter[i]));
			listFilter.get(i).setSelected(true);
		}
		
		return listFilter;
	}
	
	public void updateLanguage(Language lang) {
		this.orAnd.updateText(lang);
		
		for(ArrayList<JCustomCheckBox<Filtrable>> checkBoxList : this.check) {
			for(JCustomCheckBox<Filtrable> checkBox : checkBoxList) {
				checkBox.updateText(lang);
			}
		}
		
		this.uncheck.updateText(lang);
		this.allcheck.updateText(lang);
		this.close.updateText(lang);
	}
	
	private void setBlackUI() {
		this.setFont(Design.SUBTITLE);
		this.setForeground(Design.FontColor[0]);
	}
	
	public void popup(Component parent) {
		this.setLocation(parent.getLocationOnScreen().x, parent.getLocationOnScreen().y - this.getHeight());
		
		if(this.getY() < 0) {
			this.setLocation(this.getX(), 0);
		}
		
		this.search.requestFocus();
		this.setVisible(true);
	}
	
	public void popoff() {
		this.setVisible(false);
	}
	
	public String getSearch() {
		return this.search.getText();
	}
	
	public Filtrable[] getFilters() {
		ArrayList<Filtrable> result = new ArrayList<Filtrable>();
		
		for(ArrayList<JCustomCheckBox<Filtrable>> checkBoxList : this.check) {
			for(JCustomCheckBox<Filtrable> checkBox : checkBoxList) {
				if(checkBox.isSelected()) {
					result.add(checkBox.getItem());
				}
			}
		}
		
		return result.toArray(new Filtrable[result.size()]);
	}
	
	private void setCheck(boolean toCheck) {
		for(ArrayList<JCustomCheckBox<Filtrable>> checkBoxList : this.check) {
			for(JCustomCheckBox<Filtrable> checkBox : checkBoxList) {
				checkBox.setSelected(toCheck);
			}
		}
	}
}
