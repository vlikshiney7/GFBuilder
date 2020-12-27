package fr.vlik.uidesign;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import fr.vlik.grandfantasia.enums.Filtrable;
import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.Quality;
import fr.vlik.grandfantasia.enums.Tag;

public class JCustomDialog extends JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private JCustomCheckBox[][] check;

	public JCustomDialog(Tag[] tags, Quality[] qualities) {
		super();
		this.setBlackUI();
		this.setUndecorated(true);
		this.setSize(500, 120);
		
		this.check = new JCustomCheckBox[2][];
		
		JCustomCheckBox[] tabTag = new JCustomCheckBox[tags.length];
		for(int i = 0; i < tags.length; i++) {
			tabTag[i] = new JCustomCheckBox(tags[i]);
			tabTag[i].setSelected(true);
			tabTag[i].setForeground(Design.FontColor[0]);
		}
		this.check[0] = tabTag;
		
		JCustomCheckBox[] tabQuality = new JCustomCheckBox[qualities.length];
		for(int i = 0; i < qualities.length; i++) {
			tabQuality[i] = new JCustomCheckBox(qualities[i]);
			tabQuality[i].setSelected(true);
		}
		this.check[1] = tabQuality;
		
		JPanel page = new JPanel();
		page.setLayout(new BoxLayout(page, BoxLayout.Y_AXIS));
		page.setBackground(Design.UIColor[2]);
		page.setBorder(new LineBorder(Design.UIColor[0], 3));
		
		JPanel listTag = new JPanel();
		listTag.setBackground(Design.UIColor[2]);
		for(int i = 0; i < this.check[0].length; i++) {
			listTag.add(this.check[0][i]);
		}
		
		JPanel listQuality = new JPanel();
		listQuality.setBackground(Design.UIColor[2]);
		for(int i = 0; i < this.check[1].length; i++) {
			listQuality.add(this.check[1][i]);
		}
		
		page.add(listTag);
		page.add(listQuality);
		
		this.add(page);
		
		this.setVisible(false);
	}
	
	public void updateLanguage(Language lang) {
		for(JCustomCheckBox[] checkBoxTab : this.check) {
			for(JCustomCheckBox checkBox : checkBoxTab) {
				checkBox.updateText(lang);
			}
		}
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
		
		this.setVisible(true);
	}
	
	public void popoff() {
		this.setVisible(false);
	}
	
	public Filtrable[] getFilters() {
		ArrayList<Filtrable> result = new ArrayList<Filtrable>();
		
		for(JCustomCheckBox[] tabCheck : this.check) {
			for(JCustomCheckBox checkBox : tabCheck) {
				if(checkBox.isSelected()) {
					Filtrable filter = (Filtrable) checkBox.getObject();
					result.add(filter);
				}
			}
		}
		
		Filtrable[] cast = new Filtrable[result.size()];
		cast = result.toArray(cast);
		
		return cast;
	}
}
