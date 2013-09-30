package ar.gob.gba.sg.dpsit.sueldos.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoDAO;
import ar.gob.gba.sg.dpsit.sueldos.model.Parametrizacion;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;

@Repository
@Transactional
public class SueConceptoDAOImpl extends GenericDAOImpl<SueConcepto> implements SueConceptoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SueConceptoDAOImpl() {
		super(SueConcepto.class);
	}

	
	@Transactional
	public List<SueConcepto> getSueConceptoAll() {
		
		List<SueConcepto> sueConceptoList = new ArrayList<SueConcepto>();
		
		sueConceptoList = sessionFactory.getCurrentSession()
		.createQuery("select s from SueConcepto s ").list();
		
		
		return sueConceptoList;
	}

}
