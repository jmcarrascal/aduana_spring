package bo.gob.aduana.operadores.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.BarrioDAO;
import bo.gob.aduana.operadores.model.Barrio;

@Repository
@Transactional
public class BarrioDAOImpl extends GenericDAOImpl<Barrio> implements BarrioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public BarrioDAOImpl() {
		super(Barrio.class);
	}

	
}
