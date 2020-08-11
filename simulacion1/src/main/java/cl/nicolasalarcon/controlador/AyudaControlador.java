package cl.nicolasalarcon.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.nicolasalarcon.entidades.Ayuda;
import cl.nicolasalarcon.servicio.AyudaServicio;

@Controller
public class AyudaControlador {
	
	@Autowired
	AyudaServicio as;

	@RequestMapping("/")
	public String verclientes(Model m) {
		List<Ayuda> listaayuda = as.listaAyuda();
		m.addAttribute("layuda", listaayuda);
		
		return "vista";
	}
	
}


