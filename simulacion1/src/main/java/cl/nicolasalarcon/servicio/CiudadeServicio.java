package cl.nicolasalarcon.servicio;

import java.util.List;

import cl.nicolasalarcon.entidades.Ciudade;

public interface CiudadeServicio {
	
	Ciudade findCiudadeById(int ciudadid);
	List <Ciudade> listaCiudade();
	void addCiudade(Ciudade ciu);
	void deleteCiudade(int ciudadid);
	void updateCiudade(Ciudade ciu);

}
