package ar.gob.gba.sg.dpsit.sueldos.dao;

import java.util.List;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;



public interface SueConceptoDAO extends GenericDAO<SueConcepto> {
	
	public List<SueConcepto> getSueConceptoAll();


	
}
