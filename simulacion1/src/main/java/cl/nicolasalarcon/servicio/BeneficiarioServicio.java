package cl.nicolasalarcon.servicio;

import java.util.List;

import cl.nicolasalarcon.entidades.Beneficiario;

public interface BeneficiarioServicio {

	Beneficiario findBeneficiarioById(int beneficiarioid);
	List<Beneficiario> listaBeneficiario();
	void addBenificario(Beneficiario bene);
	void deleteBeneficiario(int beneficiarioid);
	void updateBeneficiario(Beneficiario bene);
	
}
