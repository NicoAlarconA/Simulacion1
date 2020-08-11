package cl.nicolasalarcon.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.nicolasalarcon.entidades.Ciudade;
import cl.nicolasalarcon.entidades.CiudadeRepositorio;
@Service
public class CiudadeImple implements CiudadeServicio{

	@Autowired
	CiudadeRepositorio ciurepo;
	
	@Override
	public Ciudade findCiudadeById(int ciudadid) {
		
		return ciurepo.findOne(ciudadid);
	}

	@Override
	public List<Ciudade> listaCiudade() {
		
		return (List<Ciudade>) ciurepo.findAll();
	}

	@Override
	public void addCiudade(Ciudade ciu) {
		ciurepo.save(ciu);
		
	}

	@Override
	public void deleteCiudade(int ciudadid) {
		ciurepo.delete(ciudadid);
		
	}

	@Override
	public void updateCiudade(Ciudade ciu) {
		ciurepo.save(ciu);
		
	}

}
