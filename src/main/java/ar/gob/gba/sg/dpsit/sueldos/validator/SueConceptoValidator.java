package ar.gob.gba.sg.dpsit.sueldos.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;


@Component
public class SueConceptoValidator implements Validator {


	public boolean supports(Class<?> c) {
		return SueConcepto.class.isAssignableFrom(c);
	}

	
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descripGral", "field.name.empty");
		SueConcepto sueConceptoBean = (SueConcepto)command;
	
	}

	
}
