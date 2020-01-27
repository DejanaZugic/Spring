package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recept database table.
 * 
 */
@Entity
@NamedQuery(name="Recept.findAll", query="SELECT r FROM Recept r")
public class Recept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idRecept;

	@Temporal(TemporalType.DATE)
	private Date datumPravljena;

	private String imeRecepta;

	private String napomena;

	//bi-directional many-to-many association to Omiljenakategorija
	@ManyToMany(mappedBy="recepts")
	private List<Omiljenakategorija> omiljenakategorijas;

	//bi-directional many-to-one association to Kategorija
	@ManyToOne
	private Kategorija kategorija;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	@JoinColumn(name="Korisnika_idKorisnika1")
	private Korisnika korisnika;

	//bi-directional many-to-one association to Sastojak
	@OneToMany(mappedBy="recept")
	private List<Sastojak> sastojaks;

	//bi-directional many-to-one association to Slika
	@OneToMany(mappedBy="recept")
	private List<Slika> slikas;

	public Recept() {
	}

	public int getIdRecept() {
		return this.idRecept;
	}

	public void setIdRecept(int idRecept) {
		this.idRecept = idRecept;
	}

	public Date getDatumPravljena() {
		return this.datumPravljena;
	}

	public void setDatumPravljena(Date datumPravljena) {
		this.datumPravljena = datumPravljena;
	}

	public String getImeRecepta() {
		return this.imeRecepta;
	}

	public void setImeRecepta(String imeRecepta) {
		this.imeRecepta = imeRecepta;
	}

	public String getNapomena() {
		return this.napomena;
	}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
	}

	public List<Omiljenakategorija> getOmiljenakategorijas() {
		return this.omiljenakategorijas;
	}

	public void setOmiljenakategorijas(List<Omiljenakategorija> omiljenakategorijas) {
		this.omiljenakategorijas = omiljenakategorijas;
	}

	public Kategorija getKategorija() {
		return this.kategorija;
	}

	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}

	public Korisnika getKorisnika() {
		return this.korisnika;
	}

	public void setKorisnika(Korisnika korisnika) {
		this.korisnika = korisnika;
	}

	public List<Sastojak> getSastojaks() {
		return this.sastojaks;
	}

	public void setSastojaks(List<Sastojak> sastojaks) {
		this.sastojaks = sastojaks;
	}

	public Sastojak addSastojak(Sastojak sastojak) {
		getSastojaks().add(sastojak);
		sastojak.setRecept(this);

		return sastojak;
	}

	public Sastojak removeSastojak(Sastojak sastojak) {
		getSastojaks().remove(sastojak);
		sastojak.setRecept(null);

		return sastojak;
	}

	public List<Slika> getSlikas() {
		return this.slikas;
	}

	public void setSlikas(List<Slika> slikas) {
		this.slikas = slikas;
	}

	public Slika addSlika(Slika slika) {
		getSlikas().add(slika);
		slika.setRecept(this);

		return slika;
	}

	public Slika removeSlika(Slika slika) {
		getSlikas().remove(slika);
		slika.setRecept(null);

		return slika;
	}

}