package ar.gob.gba.sg.dpsit.sueldos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoAplicacionDAO;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoAplicacion;

@Repository
@Transactional
public class SueConceptoAplicacionDAOImpl extends GenericDAOImpl<SueConceptoAplicacion> implements SueConceptoAplicacionDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SueConceptoAplicacionDAOImpl() {
		super(SueConceptoAplicacion.class);
	}

	
}
