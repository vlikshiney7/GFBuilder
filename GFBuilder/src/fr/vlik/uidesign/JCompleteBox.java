package fr.vlik.uidesign;

import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Filterable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.ProcEffect;

public class JCompleteBox<T> extends JCustomComboBox<T> implements JUpdateLang {

	private static final long serialVersionUID = 1L;
	public static final String FILTER16 = "filter16";
	public static final String FILTER24 = "filter24";
	public static final String FILTER32 = "filter32";
	
	public static final String[] PROC16 = new String[] { "procOn16", "procOff16" };
	public static final String[] PROC24 = new String[] { "procOn24", "procOff24" };
	public static final String[] PROC32 = new String[] { "procOn32", "procOff32" };
	
	private JCustomDialog filterDialog;
	private JCustomCheckBox<ProcEffect> proc;
	
	public JCompleteBox(Class<T> clazz, T[] object, String iconFilter, String[] iconProc, int gridValue, Filterable[]... filters) {
		super(clazz, object);
		this.filterDialog = new JCustomDialog(iconFilter, gridValue, filters);
		
		this.proc = new JCustomCheckBox<>(new ProcEffect((Buff) this.getSelectedItem()));
		this.proc.setIconUI(iconProc[0], iconProc[1]);
		this.proc.setVisible(false);
	}
	
	public JCompleteBox(Class<T> clazz, T[] object, String iconFilter, int gridValue, Filterable[]... filters) {
		super(clazz, object);
		this.filterDialog = new JCustomDialog(iconFilter, gridValue, filters);
	}
	
	public JCustomButton getButton() {
		return this.filterDialog.getButton();
	}
	
	public JCustomCheckBox<ProcEffect> getProc() {
		return this.proc;
	}
	
	@Override
	public boolean setItems(T[] tabItems) {
		boolean result = false;
		boolean memoryProc = isProcActive();
		
		if(super.setItems(tabItems)) {
			if(this.proc != null) {
				this.proc.setSelected(memoryProc);
			}
			
			result = true;
		}
		
		return result;
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		this.filterDialog.getButton().setVisible(visible);
		
		if(this.proc != null) {
			activeProc();
		}
	}
	
	public void addProcActionListener(ActionListener onAction) {
		this.proc.addActionListener(onAction);
	}
	
	public void updateLanguage(Language lang) {
		this.filterDialog.updateLanguage(lang);
	}
	
	public String getSearch() {
		return this.filterDialog.getSearch();
	}
	
	public boolean isAndValue() {
		return this.filterDialog.isAndValue();
	}
	
	public Filterable[] getFilters() {
		return this.filterDialog.getFilters();
	}
	
	public void popoff() {
		this.filterDialog.popoff();
	}
	
	public boolean isDialogVisible() {
		return this.filterDialog.isVisible();
	}
	
	public boolean isProcActive() {
		return this.proc != null && this.proc.isVisible() && this.proc.isSelected();
	}
	
	public void activeProc() {
		ProcEffect procEffect = new ProcEffect((Buff) this.getSelectedItem());
		
		if(procEffect.getEffects().length > 0) {
			this.getProc().setItem(procEffect);
			this.getProc().setVisible(true);
		} else {
			this.getProc().setVisible(false);
		}
		
		this.getProc().setSelected(false);
	}
	
	@Override
	public Map<String, String> getSaveConfig() {
		Map<String, String> config = new LinkedHashMap<>();
		
		T item = this.getSelectedItem();
		
		String value = item instanceof Buff ? ((Buff) item).getName(Language.FR) : "";
		config.put(this.saveKey, value);
		
		if(this.proc != null) {
			config.put(this.saveKey + "Proc", "" + this.proc.isSelected());
		}
		
		return config;
	}
}
