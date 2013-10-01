package bo.gob.aduana.operadores.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bo.gob.aduana.operadores.dao.BarrioDAO;
import bo.gob.aduana.operadores.dao.DomicilioDAO;
import bo.gob.aduana.operadores.dao.OperadorJuridicoDAO;
import bo.gob.aduana.operadores.dao.OperadorNaturalDAO;
import bo.gob.aduana.operadores.model.Barrio;
import bo.gob.aduana.operadores.model.Domicilio;
import bo.gob.aduana.operadores.model.OperadorJuridico;
import bo.gob.aduana.operadores.model.OperadorNatural;
import bo.gob.aduana.operadores.services.OperadorService;


@Service
public class OperadorServiceImpl implements OperadorService{


	
	@Autowired
	private OperadorJuridicoDAO operadorJuridicoDAO;

	@Autowired
	private BarrioDAO barrioDAO;
	
	@Autowired
	private OperadorNaturalDAO operadorNaturalDAO;
	
	@Autowired
	private DomicilioDAO domicilioDAO;

	@Override
	public List<OperadorJuridico> geAll() {
		return operadorJuridicoDAO.getAll();
	}
	

	public List<OperadorNatural> getOperadorNaturalAll() {
		return operadorNaturalDAO.getAll();
	}


	public List<Barrio> getBarrioAll() {
		return barrioDAO.getAll();
	}

	
	@Override
	public void newOperadorJuridico(OperadorJuridico operadorJuridico) {
		//Armar OBJ Domicilio
		Domicilio domicilioLegal = operadorJuridico.getDomicilioLegal();
		//Persistir Domicilio
		domicilioDAO.save(domicilioLegal);
		//Guardar Domicilio en Operador
		operadorJuridico.setDomicilioLegal(domicilioLegal);
		//Guardar Operador
		operadorJuridicoDAO.save(operadorJuridico);
	} 
	
	
}
