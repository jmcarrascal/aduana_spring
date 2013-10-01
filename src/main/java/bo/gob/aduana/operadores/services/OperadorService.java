package bo.gob.aduana.operadores.services;

import java.util.List;

import bo.gob.aduana.operadores.model.Barrio;
import bo.gob.aduana.operadores.model.OperadorJuridico;
import bo.gob.aduana.operadores.model.OperadorNatural;





public interface OperadorService {



	public List<OperadorJuridico> geAll();

	public List<OperadorNatural> getOperadorNaturalAll();

	public void newOperadorJuridico(OperadorJuridico operadorJuridico);

	public List<Barrio> getBarrioAll();
	

}
