package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;

public class TransformEffect implements Calculable {
	
	private TypeTransformation type;
	private NameTransform transform;
	
	
	public TransformEffect(TypeTransformation type, NameTransform transform) {
		this.type = type;
		this.transform = transform;
	}
	
	public TransformEffect(TransformEffect transformEffect) {
		this.type = transformEffect.getType();
		this.transform = transformEffect.getTransform();
	}
	
	public static enum TypeTransformation {
		TRANSFORMATION("Transformation", "Transformation"),
		INVOCATION("Invocation", "Invocation");
		
		public final String fr;
		public final String en;
		 
	    private TypeTransformation(String fr, String en) {
	        this.fr = fr;
	        this.en = en;
	    }
	}
	
	public TypeTransformation getType() {
		return this.type;
	}
	
	public NameTransform getTransform() {
		return this.transform;
	}
	
	@Override
	public void multiplyValue(int factor) {}
	
	@Override
	public String getTooltip() {
		StringBuilder tooltip = new StringBuilder();
		
		if(this.type == TypeTransformation.TRANSFORMATION) {
			tooltip.append(this.type.fr + " en " + this.transform.fr);
		} else if(this.type == TypeTransformation.INVOCATION) {
			tooltip.append(this.type.fr + " de " + this.transform.fr);
		}
		
		return "<li>" + tooltip + "</li>";
	}

	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			result.append(this.type.fr + " : " + this.transform.fr);
		} else {
			result.append(this.type.en + ": " + this.transform.en);
		}
		
		return result.toString();
	}
}
