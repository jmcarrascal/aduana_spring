package bo.gob.aduana.operadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bo.gob.aduana.operadores.model.Usuario;
import bo.gob.aduana.operadores.services.UsuarioService;


@Controller
@Transactional
public class RESTController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@RequestMapping(value="/rest/usuario/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Usuario> getAll() {		
		List<Usuario> usuarioList = usuarioService.geAll();
		return usuarioList;
	}
	
	@RequestMapping(value="/rest/usuario/new", method = RequestMethod.POST)
	public @ResponseBody void setNewUser(Usuario usuario) {		
		 usuarioService.newUser(usuario);
	}
	
	
	
}