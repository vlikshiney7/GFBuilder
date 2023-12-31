package fr.vlik.uidesign;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Writable;

public class JCustomComboBox<T> extends JComboBox<T> {
	
	private static final long serialVersionUID = 1L;
	
	protected final String saveKey;
	protected ToolTipDetail<T> detail;
	
	public JCustomComboBox(Class<T> clazz) {
		super();
		this.saveKey = clazz.getSimpleName();
		this.detail = new ToolTipDetail<>();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
		updateTooltip();
	}
	
	public JCustomComboBox(Class<T> clazz, ComboBoxModel<T> object) {
		super(object);
		this.saveKey = clazz.getSimpleName();
		this.detail = new ToolTipDetail<>();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
		updateTooltip();
	}
	
	public JCustomComboBox(Class<T> clazz, T[] object) {
		super(object);
		this.saveKey = clazz.getSimpleName();
		this.detail = new ToolTipDetail<>();
		
		this.setFont(Design.TEXT);
		this.setRenderer(new CustomListCellRenderer());
		setBlackUI();
		updateTooltip();
	}
	
	public String getSaveKey() {
		return this.saveKey;
	}
	
	public void placeItems(T[] tabItems) {
		this.setModel(new DefaultComboBoxModel<>(tabItems));
		updateTooltip();
	}
	
	public boolean setItems(T[] tabItems) {
		T memory = this.getSelectedItem();
		
		this.setModel(new DefaultComboBoxModel<>(tabItems));
		
		if(memory != null) {
			this.setSelectedItem(memory);
		} else {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		}
		
		boolean result = false;
		if(memory == this.getSelectedItem() || (memory != null && memory.equals(this.getSelectedItem()))) {
			result = true;
		}
		
		updateTooltip();
		
		return result;
	}
	
	public void setItems(T[] tabItems, T item) {
		this.setModel(new DefaultComboBoxModel<>(tabItems));
		
		if(item != null) {
			this.setSelectedItem(item);
		} else {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		}
		
		updateTooltip();
	}
	
	public void updateTooltip() {
		this.detail.setItems(this.getSelectedItem());
	}
	
	@Override
	public void setSelectedItem(Object item) {
		if(item == null) {
			if(this.getItemCount() > 0) {
				this.setSelectedIndex(0);
			}
		} else {
			super.setSelectedItem(item);
		}
	}
	
	private Component get() {
		return this;
	}
	
	public void setBlackUI() {
		this.setBackground(Design.UIColor[0]);
		this.setBorder(null);
		this.setForeground(Design.FontColor[0]);
		this.setOpaque(false);
		
		this.addActionListener(e -> updateTooltip() );
		
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseEntered(MouseEvent e) {
				detail.popup(get());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				detail.popoff();
			}
			
			@Override public void mouseReleased(MouseEvent e) { /* vide */ }
			@Override public void mousePressed(MouseEvent e) { /* vide */ }
			@Override public void mouseClicked(MouseEvent e) { /* vide */ }
		});
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T getSelectedItem() {
		return (T) super.getSelectedItem();
	}
	
	public Map<String, String> getSaveConfig() {
		Map<String, String> config = new LinkedHashMap<>();
		
		T item = this.getSelectedItem();
		
		String value = item instanceof Writable ? ((Writable) item).getName(Language.FR) : "";
		config.put(this.saveKey, value);
		
		return config;
	}
}
