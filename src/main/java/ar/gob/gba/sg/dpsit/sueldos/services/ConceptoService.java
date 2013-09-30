package ar.gob.gba.sg.dpsit.sueldos.services;

import java.util.List;

import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoAplicacion;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoCaracter;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoTipo;



public interface ConceptoService {

	public List<SueConcepto> getSueConceptoAll();

	public List<SueConceptoCaracter> getSueConceptoCaracterAll();

	public List<SueConceptoTipo> getConceptoTipoAll();

	public void saveSueConcepto(SueConcepto sueConcepto);

	public List<SueConceptoAplicacion> getSueConceptoAplicacionAll();

}
