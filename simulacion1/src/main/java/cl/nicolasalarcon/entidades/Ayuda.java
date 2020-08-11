package cl.nicolasalarcon.entidades;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the AYUDAS database table.
 * 
 */
@Entity
@Table(name="AYUDAS")
@NamedQuery(name="Ayuda.findAll", query="SELECT a FROM Ayuda a")
public class Ayuda implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ayudaid;

	private int beneficiarioid;

	private int monto;

	private String motivo;

	//bi-directional many-to-one association to Beneficiario
	@ManyToOne
	@JoinColumn(name="BENEFICIARIOS_BENEFICIARIOID")
	private Beneficiario beneficiario;

	public Ayuda() {
	}

	public int getAyudaid() {
		return this.ayudaid;
	}

	public void setAyudaid(int ayudaid) {
		this.ayudaid = ayudaid;
	}

	public int getBeneficiarioid() {
		return this.beneficiarioid;
	}

	public void setBeneficiarioid(int beneficiarioid) {
		this.beneficiarioid = beneficiarioid;
	}

	public int getMonto() {
		return this.monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Beneficiario getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

}