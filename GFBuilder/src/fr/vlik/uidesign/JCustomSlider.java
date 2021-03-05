package fr.vlik.uidesign;

import javax.swing.JSlider;

public class JCustomSlider extends JSlider {
	
	private static final long serialVersionUID = 1L;
	private static double factor = 10.0;

	public JCustomSlider(double min, double max, double middle) {
		super();
		this.setFont(Design.TEXT);
		this.setMinorTickSpacing((int) factor);
		this.setPaintTicks(true);
		
		setDoubleMinimum(min);
		setDoubleMaximum(max);
		setDoubleValue(middle);
		
		setBlackUI();
	}

	private void setBlackUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Design.FontColor[0]);
		this.setOpaque(false);
	}
	
	public double getDoubleValue() {
		return(this.getValue()/factor);
    }
	
	public void setDoubleMinimum(double min) {
    	this.setMinimum((int) (min*factor));
    }
	
	public void setDoubleMaximum(double max) {
    	this.setMaximum((int) (max*factor + 0.1));
    }
	
	public void setDoubleValue(double val) {
    	this.setValue((int) (val*factor));
    	this.setToolTipText(Double.toString(val));
    }
}
