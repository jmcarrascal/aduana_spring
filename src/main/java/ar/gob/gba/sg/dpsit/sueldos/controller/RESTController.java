package ar.gob.gba.sg.dpsit.sueldos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoAplicacion;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoCaracter;
import ar.gob.gba.sg.dpsit.sueldos.services.ConceptoService;

@Controller
@Transactional
public class RESTController {

	@Autowired
	private ConceptoService conceptoService;
	
	
	@RequestMapping(value="/rest/getAll", method = RequestMethod.GET)
	public @ResponseBody List<SueConcepto> getAll() {		
		List<SueConcepto> sueConceptoList = conceptoService.getSueConceptoAll();
		
//		for(SueConcepto sueConcepto:sueConceptoList){
//			System.out.println(sueConcepto.getSueConceptoTipo().getDescrip());
//		}
		
		return sueConceptoList;
	}
	 
	
	@RequestMapping(value="/rest/getSueCaracterAll", method = RequestMethod.GET)
	public @ResponseBody List<SueConceptoCaracter> getSueCaracterAll() {		
		List<SueConceptoCaracter> sueConceptoCaracterList = conceptoService.getSueConceptoCaracterAll();
		return sueConceptoCaracterList;
	}
	
	
	@RequestMapping(value="/rest/getSueAplicacionAll", method = RequestMethod.GET)
	public @ResponseBody List<SueConceptoAplicacion> getSueAplicacionAll() {		
		List<SueConceptoAplicacion> sueConceptoAplicacionList = conceptoService.getSueConceptoAplicacionAll();
		return sueConceptoAplicacionList;
	}
	
	
	
}