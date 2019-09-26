package fr.vlik.gfbuilder.page;

import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import fr.vlik.gfbuilder.Lang;
import fr.vlik.grandfantasia.Language;
import fr.vlik.uidesign.Design;
import fr.vlik.uidesign.JCustomLabel;

public class PageOption extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private static PageOption INSTANCE = new PageOption();
	
	private JTextPane parameter = new JTextPane();
	
	private JLabel[] label;
	
	public static PageOption getInstance() {
		return INSTANCE;
	}
	
	private PageOption() {
		super();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setLabel(Language.FR);
		
		this.parameter.setEditable(false);
		this.parameter.setText(Lang.getDataCredit(Language.FR));
		this.parameter.setFont(new Font("Open Sans", Font.PLAIN, 14));
		this.parameter.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.parameter.setBackground(Design.UIColor[1]);
		this.parameter.setForeground(Design.FontColor[0]);
		
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setBackground(Design.UIColor[1]);
		this.add(this.label[0]);
		this.add(Box.createVerticalStrut(10));
		this.label[1].setFont(new Font("Open Sans", Font.BOLD, 14));
		this.add(this.label[1]);
		this.add(Box.createVerticalStrut(5));
		this.add(this.parameter);
	}
	
	protected void setLabel(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 12);
		this.label = new JLabel[getter.length];
		for(int i = 0; i < getter.length; i++) {
			this.label[i] = JCustomLabel.getSimpleLabel(getter[i]);
		}
	}
	
	public void updateLanguage(Language lang) {
		String[] getter = Lang.getDataLabel(lang, 12);
		for(int i = 0; i < getter.length; i++) {
			this.label[i].setText(getter[i]);
		}
		
		this.parameter.setText(Lang.getDataCredit(lang));
	}
}
