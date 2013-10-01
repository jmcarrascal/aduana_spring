package bo.gob.aduana.operadores.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.UsuarioDAO;
import bo.gob.aduana.operadores.model.Usuario;
import bo.gob.aduana.operadores.services.UsuarioService;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Transactional
	public Boolean validateUsuario() {				
		return true;
	}

	@Override
	public List<Usuario> geAll() {		
		return usuarioDAO.getAll();
	}

	@Override
	public void newUser(Usuario usuario) {
		usuarioDAO.save(usuario);	
	}
	
}
