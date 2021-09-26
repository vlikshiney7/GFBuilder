package fr.vlik.uidesign;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.gfbuilder.MainFrame;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;
import fr.vlik.grandfantasia.interfaces.Filtrable;

public class JCustomDialog extends JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private JCustomTextField search;
	private ArrayList<ArrayList<JCustomCheckBox<Filtrable>>> check;
	private JCustomButton uncheck;
	private JCustomButton allcheck;
	private JCustomButton close;
	
	private JLangLabel[] label;

	public JCustomDialog(Tag[] tags, Quality[] qualities, boolean searchable, int gridValue) {
		this.setLayout(new BorderLayout());
		this.setBlackUI();
		this.setUndecorated(true);
		this.setSize(500, 220);
		
		this.label = Lang.getDataLabel(7);
		
		this.check = new ArrayList<ArrayList<JCustomCheckBox<Filtrable>>>(2);
		this.check.add(toList(tags));
		this.check.add(toList(qualities));
		
		if(searchable) {
			this.search = new JCustomTextField();
			this.search.setBorder(new EmptyBorder(10, 10, 10, 10));
		}
		
		this.uncheck = new JCustomButton(this.label[0].getLang(), Design.RED_COLOR);
		this.uncheck.addActionListener(e -> {
			setCheck(false);
		});
		this.uncheck.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.uncheck.setMinimumSize(new Dimension(0, 30));
		
		this.allcheck = new JCustomButton(this.label[1].getLang(), Design.GREEN_COLOR);
		this.allcheck.addActionListener(e -> {
			setCheck(true);
		});
		this.allcheck.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.allcheck.setMinimumSize(new Dimension(0, 30));
		
		this.close = new JCustomButton(this.label[2].getLang(), Design.YELLOW_COLOR);
		this.close.addActionListener(e -> {
			MainFrame.getInstance().requestFocus();
		});
		this.close.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.close.setMinimumSize(new Dimension(0, 30));
		
		
		JPanel panelSearch = new JPanel();
		panelSearch.setLayout(new BoxLayout(panelSearch, BoxLayout.Y_AXIS));
		panelSearch.setBackground(Design.UIColor[2]);
		panelSearch.setBorder(new EmptyBorder(10, 10, 10, 10));
		panelSearch.add(this.search);
		
		JPanel panelTag = new JPanel(new GridLayout(tags.length / gridValue +1, gridValue));
		panelTag.setBackground(Design.UIColor[2]);
		panelTag.setBorder(new EmptyBorder(0, 10, 10, 10));
		for(JCustomCheckBox<Filtrable> filter : this.check.get(0)) {
			panelTag.add(filter);
		}
		for(int i = 0; i < gridValue - (tags.length % gridValue); i++) {
			JPanel fake = new JPanel();
			fake.setVisible(false);
			panelTag.add(fake);
		}
		
		JPanel panelQuality = new JPanel(new GridLayout(qualities.length / gridValue +1, gridValue));
		panelQuality.setBackground(Design.UIColor[2]);
		panelQuality.setBorder(new EmptyBorder(0, 10, 10, 10));
		for(JCustomCheckBox<Filtrable> filter : this.check.get(1)) {
			panelQuality.add(filter);
		}
		for(int i = 0; i < gridValue - (qualities.length % gridValue); i++) {
			JPanel fake = new JPanel();
			fake.setVisible(false);
			panelQuality.add(fake);
		}
		
		JPanel panelButton = new JPanel(new GridLayout(1, 3, 10, 5));
		panelButton.setBackground(Design.UIColor[2]);
		panelButton.setBorder(new EmptyBorder(0, 10, 10, 10));
		panelButton.add(this.uncheck);
		panelButton.add(this.allcheck);
		panelButton.add(this.close);
		
		
		JPanel page = new JPanel();
		page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
		page.setBackground(Design.UIColor[2]);
		page.setBorder(new LineBorder(Design.UIColor[0], 2));
		
		if(searchable) {
			page.add(panelSearch);
		}
		page.add(panelTag);
		page.add(panelQuality);
		page.add(panelButton);
		
		this.add(page);
		
		this.setVisible(false);
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
		for(ArrayList<JCustomCheckBox<Filtrable>> checkBoxList : this.check) {
			for(JCustomCheckBox<Filtrable> checkBox : checkBoxList) {
				checkBox.updateText(lang);
			}
		}
		
		this.uncheck.updateText(lang);
		this.allcheck.updateText(lang);
	}
	
	public void setBlackUI() {
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
