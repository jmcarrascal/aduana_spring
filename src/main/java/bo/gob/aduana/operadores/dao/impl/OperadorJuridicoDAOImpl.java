package bo.gob.aduana.operadores.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.OperadorJuridicoDAO;
import bo.gob.aduana.operadores.model.OperadorJuridico;

@Repository
@Transactional
public class OperadorJuridicoDAOImpl extends GenericDAOImpl<OperadorJuridico> implements OperadorJuridicoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public OperadorJuridicoDAOImpl() {
		super(OperadorJuridico.class);
	}

	
}
