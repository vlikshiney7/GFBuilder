package fr.vlik.grandfantasia.stats;

import fr.vlik.grandfantasia.enums.Language;
import fr.vlik.grandfantasia.enums.TypeTransformEffect;

public class TransformEffect implements Calculable {
	
	private TypeTransformEffect transform;
	
	
	public TransformEffect(TypeTransformEffect transform) {
		this.transform = transform;
	}
	
	public TransformEffect(TransformEffect transformEffect) {
		this.transform = transformEffect.getTransform();
	}
	
	public TypeTransformEffect getTransform() {
		return this.transform;
	}
	
	@Override
	public String getTooltip() {
		return "<li>Tranformation en " + this.transform.fr + "</li>";
	}

	public String toString(Language lang) {
		StringBuilder result = new StringBuilder();
		
		if(lang == Language.FR) {
			result.append(this.transform.fr);
		} else {
			result.append(this.transform.en);
		}
		
		return result.toString();
	}
}
