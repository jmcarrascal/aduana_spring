package ar.gob.gba.sg.dpsit.sueldos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoAplicacionDAO;
import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoCaracterDAO;
import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoDAO;
import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoTipoDAO;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoAplicacion;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoCaracter;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoTipo;
import ar.gob.gba.sg.dpsit.sueldos.services.ConceptoService;

@Service
public class ConceptoServiceImpl implements ConceptoService{

	@Autowired
	private SueConceptoDAO sueConceptoDAO;
	


	@Autowired
	private SueConceptoCaracterDAO sueConceptoCaracterDAO;

	@Autowired
	private SueConceptoTipoDAO sueConceptoTipoDAO;

	@Autowired
	private SueConceptoAplicacionDAO sueConceptoAplicacionDAO;

	
	@Transactional
	public List<SueConcepto> getSueConceptoAll() {		
		List<SueConcepto> sueConceptoList = sueConceptoDAO.getAll();
		return sueConceptoList;
	}

	
	public List<SueConceptoCaracter> getSueConceptoCaracterAll() {		
		return sueConceptoCaracterDAO.getAll();
	}

	public List<SueConceptoTipo> getConceptoTipoAll() {
		return sueConceptoTipoDAO.getSueConceptoTipoAll();
	}

	public void saveSueConcepto(SueConcepto sueConcepto) {
		sueConceptoDAO.save(sueConcepto);
	}



	public List<SueConceptoAplicacion> getSueConceptoAplicacionAll() {		
		return sueConceptoAplicacionDAO.getAll();
	}
	
}
