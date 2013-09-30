package ar.gob.gba.sg.dpsit.sueldos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoTipo;
import ar.gob.gba.sg.dpsit.sueldos.services.ConceptoService;
import ar.gob.gba.sg.dpsit.sueldos.validator.SueConceptoValidator;

@Controller
@RequestMapping(value="/concepto")
public class ConceptoController {

	private SueConceptoValidator validator = null;
	
	@Autowired
	private ConceptoService conceptoService;
	
	public SueConceptoValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(SueConceptoValidator validator) {
		this.validator = validator;
	}
	
	
	@RequestMapping(method=RequestMethod.GET)
	@Transactional
	public String showForm(ModelMap model){
		List<SueConceptoTipo> sueConceptoTipoList = conceptoService.getConceptoTipoAll();
		model.addAttribute("sueConceptoTipoList", sueConceptoTipoList);
		model.addAttribute("sueConcepto", new SueConcepto());
		return "views/sueConcepto/preparedCrudSueConcepto";
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value="sueConcepto") SueConcepto sueConcepto, BindingResult result){
		System.out.println(sueConcepto.getSueConceptoTipo().getTipoConceptoId());
		validator.validate(sueConcepto, result);
		ModelAndView mv = new ModelAndView("views/sueConcepto/sueConceptoList");
		if(!result.hasErrors()){
			//conceptoService.saveSueConcepto(sueConcepto);
//			user = new User();
//			user.setId(UUID.randomUUID().toString());
			mv.addObject("sueConcepto", sueConcepto);
		}
		//List<SueConcepto> sueConceptoList = conceptoService.getSueConceptoAll();
//		for(SueConcepto sueConcepto1: sueConceptoList){
//			System.out.println(sueConcepto1.getSueConceptoAplicacion().getDescrip());
//		}
		mv.addObject("sueConceptoList", conceptoService.getSueConceptoAll());
		return mv;
	}
	
}