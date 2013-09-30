package ar.gob.gba.sg.dpsit.sueldos.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.gob.gba.sg.dpsit.sueldos.dao.SueConceptoCaracterDAO;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConcepto;
import ar.gob.gba.sg.dpsit.sueldos.model.SueConceptoCaracter;

@Repository
public class SueConceptoCaracterDAOImpl extends GenericDAOImpl<SueConceptoCaracter> implements SueConceptoCaracterDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SueConceptoCaracterDAOImpl() {
		super(SueConceptoCaracter.class);
	}
	

}
