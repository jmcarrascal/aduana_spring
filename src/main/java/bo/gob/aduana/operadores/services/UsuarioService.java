package bo.gob.aduana.operadores.services;

import java.util.List;

import bo.gob.aduana.operadores.model.Usuario;





public interface UsuarioService {

	public Boolean validateUsuario();

	public List<Usuario> geAll();

	public void newUser(Usuario usuario);

}
