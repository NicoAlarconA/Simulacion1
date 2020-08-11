package cl.nicolasalarcon.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
	 * 
	 */
	

/**
 * The persistent class for the BENEFICIARIOS database table.
 * 
 */
@Entity
@Table(name="BENEFICIARIOS")
@NamedQuery(name="Beneficiario.findAll", query="SELECT b FROM Beneficiario b")
public class Beneficiario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int beneficiarioid;

	private int ciudad;

	private int edad;

	private String nombre;

	//bi-directional many-to-one association to Ayuda
	@OneToMany(mappedBy="beneficiario")
	private List<Ayuda> ayudas;

	//bi-directional many-to-one association to Ciudade
	@ManyToOne
	@JoinColumn(name="CIUDADES_CIUDADID")
	private Ciudade ciudade;

	public Beneficiario() {
	}

	public int getBeneficiarioid() {
		return this.beneficiarioid;
	}

	public void setBeneficiarioid(int beneficiarioid) {
		this.beneficiarioid = beneficiarioid;
	}

	public int getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Ayuda> getAyudas() {
		return this.ayudas;
	}

	public void setAyudas(List<Ayuda> ayudas) {
		this.ayudas = ayudas;
	}

	public Ayuda addAyuda(Ayuda ayuda) {
		getAyudas().add(ayuda);
		ayuda.setBeneficiario(this);

		return ayuda;
	}

	public Ayuda removeAyuda(Ayuda ayuda) {
		getAyudas().remove(ayuda);
		ayuda.setBeneficiario(null);

		return ayuda;
	}

	public Ciudade getCiudade() {
		return this.ciudade;
	}

	public void setCiudade(Ciudade ciudade) {
		this.ciudade = ciudade;
	}

}