package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the omiljenakategorija database table.
 * 
 */
@Entity
@NamedQuery(name="Omiljenakategorija.findAll", query="SELECT o FROM Omiljenakategorija o")
public class Omiljenakategorija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idOmiljenaKategorija;

	private String imeKategorije;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	private Korisnika korisnika;

	//bi-directional many-to-many association to Recept
	@ManyToMany
	@JoinTable(
		name="omiljenakategorija_recept"
		, joinColumns={
			@JoinColumn(name="OmiljenaKategorija_idOmiljenaKategorija")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Recept_idRecept")
			}
		)
	private List<Recept> recepts;

	public Omiljenakategorija() {
	}

	public int getIdOmiljenaKategorija() {
		return this.idOmiljenaKategorija;
	}

	public void setIdOmiljenaKategorija(int idOmiljenaKategorija) {
		this.idOmiljenaKategorija = idOmiljenaKategorija;
	}

	public String getImeKategorije() {
		return this.imeKategorije;
	}

	public void setImeKategorije(String imeKategorije) {
		this.imeKategorije = imeKategorije;
	}

	public Korisnika getKorisnika() {
		return this.korisnika;
	}

	public void setKorisnika(Korisnika korisnika) {
		this.korisnika = korisnika;
	}

	public List<Recept> getRecepts() {
		return this.recepts;
	}

	public void setRecepts(List<Recept> recepts) {
		this.recepts = recepts;
	}

}