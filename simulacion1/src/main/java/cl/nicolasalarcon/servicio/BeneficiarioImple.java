package cl.nicolasalarcon.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.nicolasalarcon.entidades.Beneficiario;
import cl.nicolasalarcon.entidades.BeneficiarioRepositorio;
@Service
public class BeneficiarioImple implements BeneficiarioServicio{

	@Autowired
	BeneficiarioRepositorio benefi;
	
	@Override
	public Beneficiario findBeneficiarioById(int beneficiarioid) {
		
		return benefi.findOne(beneficiarioid);
	}

	@Override
	public List<Beneficiario> listaBeneficiario() {
		
		return (List<Beneficiario>) benefi.findAll();
	}

	@Override
	public void addBenificario(Beneficiario bene) {
		benefi.save(bene);
		
	}

	@Override
	public void deleteBeneficiario(int beneficiarioid) {
		benefi.delete(beneficiarioid);
		
	}

	@Override
	public void updateBeneficiario(Beneficiario bene) {
		benefi.save(bene);
		
	}

}
