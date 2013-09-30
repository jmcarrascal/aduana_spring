package ar.gob.gba.sg.dpsit.sueldos.dao;

import java.util.List;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoTipo;



public interface SueConceptoTipoDAO extends GenericDAO<SueConceptoTipo> {
	public List<SueConceptoTipo> getSueConceptoTipoAll() ;
	
}
