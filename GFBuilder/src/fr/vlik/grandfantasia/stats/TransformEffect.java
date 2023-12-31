package fr.vlik.grandfantasia.stats;

import java.util.EnumMap;
import java.util.Map;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.NameTransform;

public class TransformEffect extends Calculable {
	
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
	
	public Calculable copy() {
		return new TransformEffect(this);
	}
	
	public enum TypeTransformation {
		TRANSFORMATION("Transformation", "Transformation"),
		INVOCATION("Invocation", "Invocation");
		
		public final Map<Language, String> transform;
		 
	    @SuppressWarnings("serial")
		private TypeTransformation(String fr, String en) {
	        this.transform = new EnumMap<Language, String>(Language.class) {{ put(Language.FR, fr); put(Language.EN, en); }};
	    }
	    
	    public String getName(Language lang) {
			if(this.transform == null) {
				return "";
			} else if(this.transform.get(lang) == null || this.transform.get(lang).equals("")) {
				return this.transform.get(Language.FR);
			}
			
			return this.transform.get(lang);
		}
	}
	
	public TypeTransformation getType() {
		return this.type;
	}
	
	public NameTransform getTransform() {
		return this.transform;
	}
	
	public void multiplyValue(int factor) {}
	
	public String getName(Language lang) {
		return this.type.getName(lang);
	}
	
	public String getSelectorInfo(Language lang) {
		return this.type.getName(lang);
	}
	
	public String getFullInfo(Language lang) {
		String result = "";
		
		if(lang == Language.FR) {
			if(this.type == TypeTransformation.TRANSFORMATION) {
				result = this.type.getName(lang) + " en " + this.transform.getName(lang);
			} else if(this.type == TypeTransformation.INVOCATION) {
				result = this.type.getName(lang) + " de " + this.transform.getName(lang);
			}
		} else {
			if(this.type == TypeTransformation.TRANSFORMATION) {
				result = this.type.getName(lang) + " on " + this.transform.getName(lang);
			} else if(this.type == TypeTransformation.INVOCATION) {
				result = this.type.getName(lang) + " of " + this.transform.getName(lang);
			}
		}
		
		return result;
	}
}
