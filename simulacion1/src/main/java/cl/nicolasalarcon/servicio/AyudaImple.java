package cl.nicolasalarcon.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.nicolasalarcon.entidades.Ayuda;
import cl.nicolasalarcon.entidades.AyudaRepositorio;
@Service
public class AyudaImple implements AyudaServicio{

	@Autowired
	AyudaRepositorio ayurepo;
	
	@Override
	public Ayuda findAyudaByid(int ayudaid) {
		
		return ayurepo.findOne(ayudaid);
	}

	@Override
	public List<Ayuda> listaAyuda() {
		
		return (List<Ayuda>) ayurepo.findAll();
	}

	@Override
	public void addAyuda(Ayuda ayu) {
		ayurepo.save(ayu);
		
	}

	@Override
	public void deleteAyuda(int ayudaid) {
		ayurepo.delete(ayudaid);
		
	}

	@Override
	public void updateAyuda(Ayuda ayu) {
		ayurepo.save(ayu);
	
	}

}
