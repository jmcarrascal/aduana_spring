package bo.gob.aduana.operadores.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.UsuarioDAO;
import bo.gob.aduana.operadores.model.Usuario;

@Repository
@Transactional
public class UsuarioDAOImpl extends GenericDAOImpl<Usuario> implements UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public UsuarioDAOImpl() {
		super(Usuario.class);
	}

	
}
