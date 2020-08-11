package cl.nicolasalarcon.servicio;

import java.util.List;

import cl.nicolasalarcon.entidades.Ayuda;

public interface AyudaServicio {

	Ayuda findAyudaByid(int ayudaid);
	List<Ayuda> listaAyuda();
	void addAyuda(Ayuda ayu);
	void deleteAyuda(int ayudaid);
	void updateAyuda(Ayuda ayu);
	
}
