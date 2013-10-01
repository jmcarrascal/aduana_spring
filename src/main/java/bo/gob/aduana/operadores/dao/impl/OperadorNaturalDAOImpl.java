package bo.gob.aduana.operadores.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.OperadorNaturalDAO;
import bo.gob.aduana.operadores.model.OperadorNatural;

@Repository
@Transactional
public class OperadorNaturalDAOImpl extends GenericDAOImpl<OperadorNatural> implements OperadorNaturalDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public OperadorNaturalDAOImpl() {
		super(OperadorNatural.class);
	}

	
}
