package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sastojak database table.
 * 
 */
@Entity
@NamedQuery(name="Sastojak.findAll", query="SELECT s FROM Sastojak s")
public class Sastojak implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSastojak;

	private String imeSastojka;

	private double kolicina;

	//bi-directional many-to-one association to Recept
	@ManyToOne
	private Recept recept;

	public Sastojak() {
	}

	public int getIdSastojak() {
		return this.idSastojak;
	}

	public void setIdSastojak(int idSastojak) {
		this.idSastojak = idSastojak;
	}

	public String getImeSastojka() {
		return this.imeSastojka;
	}

	public void setImeSastojka(String imeSastojka) {
		this.imeSastojka = imeSastojka;
	}

	public double getKolicina() {
		return this.kolicina;
	}

	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}

	public Recept getRecept() {
		return this.recept;
	}

	public void setRecept(Recept recept) {
		this.recept = recept;
	}

}