package bo.gob.aduana.operadores.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.DomicilioDAO;
import bo.gob.aduana.operadores.model.Domicilio;

@Repository
@Transactional
public class DomicilioDAOImpl extends GenericDAOImpl<Domicilio> implements DomicilioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public DomicilioDAOImpl() {
		super(Domicilio.class);
	}

	
}
