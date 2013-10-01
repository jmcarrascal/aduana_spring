package bo.gob.aduana.operadores.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.aduana.operadores.dao.OperadorJuridicoDAO;
import bo.gob.aduana.operadores.dao.UsuarioDAO;
import bo.gob.aduana.operadores.model.OperadorJuridico;
import bo.gob.aduana.operadores.model.Usuario;
import bo.gob.aduana.operadores.services.OperadorService;


@Service
public class OperadorServiceImpl implements OperadorService{


	
	@Autowired
	private OperadorJuridicoDAO operadorJuridicoDAO;

	@Override
	public List<OperadorJuridico> geAll() {
		return operadorJuridicoDAO.getAll();
	}
	


	
}
