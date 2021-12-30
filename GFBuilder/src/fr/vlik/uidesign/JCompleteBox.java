package fr.vlik.uidesign;

import java.awt.event.ActionListener;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.interfaces.Filtrable;
import fr.vlik.grandfantasia.template.Buff;
import fr.vlik.grandfantasia.template.ProcEffect;
import fr.vlik.uidesign.JCustomDialog.Logic;

public class JCompleteBox<E> extends JCustomComboBox<E> {

	private static final long serialVersionUID = 1L;
	public static final String FILTER16 = "filter16";
	public static final String FILTER24 = "filter24";
	public static final String FILTER32 = "filter32";
	
	public static final String[] PROC16 = new String[] { "procOn16", "procOff16" };
	public static final String[] PROC24 = new String[] { "procOn24", "procOff24" };
	public static final String[] PROC32 = new String[] { "procOn32", "procOff32" };
	
	private JCustomDialog filterDialog;
	private JCustomCheckBox<ProcEffect> proc;
	
	public JCompleteBox(E[] object, String iconFilter, String[] iconProc, int gridValue, Filtrable[]... filters) {
		super(object);
		this.filterDialog = new JCustomDialog(iconFilter, gridValue, filters);
		
		this.proc = new JCustomCheckBox<ProcEffect>(new ProcEffect((Buff) this.getSelectedItem()));
		this.proc.setIconUI(iconProc[0], iconProc[1]);
		this.proc.setVisible(false);
	}
	
	public JCompleteBox(E[] object, String iconFilter, int gridValue, Filtrable[]... filters) {
		super(object);
		this.filterDialog = new JCustomDialog(iconFilter, gridValue, filters);
	}
	
	public JCustomButton getButton() {
		return this.filterDialog.getButton();
	}
	
	public JCustomCheckBox<ProcEffect> getProc() {
		return this.proc;
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
	
	public Logic getLogic() {
		return this.filterDialog.getLogic();
	}
	
	public Filtrable[] getFilters() {
		return this.filterDialog.getFilters();
	}
	
	public void popoff() {
		this.filterDialog.popoff();
	}
	
	public boolean isDialogVisible() {
		return this.filterDialog.isVisible();
	}
	
	public boolean isProcActive() {
		return this.proc.isVisible() && this.proc.isSelected();
	}
	
	public void activeProc() {
		ProcEffect proc = new ProcEffect((Buff) this.getSelectedItem());
		
		if(proc.getEffects().length > 0) {
			this.getProc().setItem(proc);
			this.getProc().setVisible(true);
		} else {
			this.getProc().setVisible(false);
		}
		
		this.getProc().setSelected(false);
	}
}
