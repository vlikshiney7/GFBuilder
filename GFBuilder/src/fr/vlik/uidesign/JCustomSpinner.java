package fr.vlik.uidesign;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

public class JCustomSpinner extends JSpinner {

	private static final long serialVersionUID = 1L;

	public JCustomSpinner(SpinnerNumberModel spinnerNumberModel) {
		super(spinnerNumberModel);
		
		setBlackUI();
	}
	
	public void setModel(SpinnerModel spinnerModel) {
		super.setModel(spinnerModel);
		
		setBlackUI();
	}
	
	private void setBlackUI() {
		for(Component c : this.getEditor().getComponents()) {
			c.setFont(Design.EDIT);
			c.setBackground(Design.UIColor[0]);
			c.setForeground(Design.FontColor[0]);
		}
		
		this.putClientProperty("caretWidth", 2);
		this.setBorder(new LineBorder(new Color(199, 199, 199), 2));
		((JSpinner.DefaultEditor) this.getEditor()).getTextField().setHorizontalAlignment(JTextField.LEFT);
	}

	public int getIntValue() {
		return (int) this.getValue();
	}
}
