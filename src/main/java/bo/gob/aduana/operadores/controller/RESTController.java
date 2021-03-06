package bo.gob.aduana.operadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import bo.gob.aduana.operadores.model.Barrio;
import bo.gob.aduana.operadores.model.JsonResult;
import bo.gob.aduana.operadores.model.OperadorJuridico;
import bo.gob.aduana.operadores.model.OperadorNatural;
import bo.gob.aduana.operadores.model.Usuario;
import bo.gob.aduana.operadores.services.OperadorService;
import bo.gob.aduana.operadores.services.UsuarioService;


@Controller
@Transactional
public class RESTController {

	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private OperadorService operadorService;
	
	
	
	@RequestMapping(value="/rest/usuario/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Usuario> getAll() {		
		List<Usuario> usuarioList = usuarioService.geAll();
		return usuarioList;
	}
	
	//@RequestMapping(method = RequestMethod.POST, value = "value="/stub", consumes = "application/json", produces = "application/json")
	@RequestMapping(value="/rest/usuario/new", method = RequestMethod.POST)
	public @ResponseBody void setNewUser(Usuario usuario) {		
		 usuarioService.newUser(usuario);
	}
	
	@RequestMapping(value="/rest/usuario/validate", method = RequestMethod.POST)
	public @ResponseBody JsonResult validateUser(Usuario usuario) {		
		 return usuarioService.validateUser(usuario);
	}
	
	@RequestMapping(value="/rest/usuario/getOperadorJuridicoAll", method = RequestMethod.GET)
	public @ResponseBody List<OperadorJuridico> getOperadorJuridicoAll() {		
		List<OperadorJuridico> operadorList = operadorService.geAll();
		return operadorList;
	} 
	
	@RequestMapping(value="/rest/usuario/getOperadorNaturalAll", method = RequestMethod.GET)
	public @ResponseBody List<OperadorNatural> getOperadorNaturalAll() {		
		List<OperadorNatural> operadorList = operadorService.getOperadorNaturalAll();
		return operadorList; 
	}
	
	@RequestMapping(value="/rest/operador/new", method = RequestMethod.POST)
	public @ResponseBody void setNewOperadorJuridico(OperadorJuridico operadorJuridico) {		
		 operadorService.newOperadorJuridico(operadorJuridico);
	}
	
	@RequestMapping(value="/rest/barrio/getAll", method = RequestMethod.GET)
	public @ResponseBody List<Barrio> getBarrioAll() {		
		List<Barrio> barrioList = operadorService.getBarrioAll();
		return barrioList;
	} 
	
	
}