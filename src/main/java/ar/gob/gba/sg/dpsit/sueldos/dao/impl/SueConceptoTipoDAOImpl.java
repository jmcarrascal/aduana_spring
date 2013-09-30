package ar.gob.gba.sg.dpsit.sueldos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoTipoDAO;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoTipo;

@Repository
@Transactional
public class SueConceptoTipoDAOImpl extends GenericDAOImpl<SueConceptoTipo> implements SueConceptoTipoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SueConceptoTipoDAOImpl() {
		super(SueConceptoTipo.class);
	}
	
	
	@Transactional
	public List<SueConceptoTipo> getSueConceptoTipoAll() {
		
		List<SueConceptoTipo> sueConceptoTipoList = new ArrayList<SueConceptoTipo>();
		
		sueConceptoTipoList = sessionFactory.getCurrentSession()
		.createQuery("select s from SueConceptoTipo s ").list();
		
		
		return sueConceptoTipoList;
	}
	

}
