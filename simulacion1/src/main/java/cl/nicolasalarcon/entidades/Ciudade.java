package cl.nicolasalarcon.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CIUDADES database table.
 * 
 */
@Entity
@Table(name="CIUDADES")
@NamedQuery(name="Ciudade.findAll", query="SELECT c FROM Ciudade c")
public class Ciudade implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ciudadid;

	private String nombreciudad;

	//bi-directional many-to-one association to Beneficiario
	@OneToMany(mappedBy="ciudade")
	private List<Beneficiario> beneficiarios;

	public Ciudade() {
	}

	public int getCiudadid() {
		return this.ciudadid;
	}

	public void setCiudadid(int ciudadid) {
		this.ciudadid = ciudadid;
	}

	public String getNombreciudad() {
		return this.nombreciudad;
	}

	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public List<Beneficiario> getBeneficiarios() {
		return this.beneficiarios;
	}

	public void setBeneficiarios(List<Beneficiario> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}

	public Beneficiario addBeneficiario(Beneficiario beneficiario) {
		getBeneficiarios().add(beneficiario);
		beneficiario.setCiudade(this);

		return beneficiario;
	}

	public Beneficiario removeBeneficiario(Beneficiario beneficiario) {
		getBeneficiarios().remove(beneficiario);
		beneficiario.setCiudade(null);

		return beneficiario;
	}

}