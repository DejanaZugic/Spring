package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the korisnika database table.
 * 
 */
@Entity
@NamedQuery(name="Korisnika.findAll", query="SELECT k FROM Korisnika k")
public class Korisnika implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKorisnika;

	@Temporal(TemporalType.DATE)
	private Date datumR;

	private String imeKorisnika;

	private String sifraKorisnika;

	private String tipKorisnika;

	//bi-directional many-to-one association to Omiljenakategorija
	@OneToMany(mappedBy="korisnika")
	private List<Omiljenakategorija> omiljenakategorijas;

	//bi-directional many-to-one association to Poruka
	@OneToMany(mappedBy="korisnika1")
	private List<Poruka> porukas1;

	//bi-directional many-to-one association to Poruka
	@OneToMany(mappedBy="korisnika2")
	private List<Poruka> porukas2;

	//bi-directional many-to-one association to Prijatelji
	@OneToMany(mappedBy="korisnika1")
	private List<Prijatelji> prijateljis1;

	//bi-directional many-to-one association to Prijatelji
	@OneToMany(mappedBy="korisnika2")
	private List<Prijatelji> prijateljis2;

	//bi-directional many-to-one association to Recept
	@OneToMany(mappedBy="korisnika")
	private List<Recept> recepts;

	public Korisnika() {
	}

	public int getIdKorisnika() {
		return this.idKorisnika;
	}

	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}

	public Date getDatumR() {
		return this.datumR;
	}

	public void setDatumR(Date datumR) {
		this.datumR = datumR;
	}

	public String getImeKorisnika() {
		return this.imeKorisnika;
	}

	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public String getSifraKorisnika() {
		return this.sifraKorisnika;
	}

	public void setSifraKorisnika(String sifraKorisnika) {
		this.sifraKorisnika = sifraKorisnika;
	}

	public String getTipKorisnika() {
		return this.tipKorisnika;
	}

	public void setTipKorisnika(String tipKorisnika) {
		this.tipKorisnika = tipKorisnika;
	}

	public List<Omiljenakategorija> getOmiljenakategorijas() {
		return this.omiljenakategorijas;
	}

	public void setOmiljenakategorijas(List<Omiljenakategorija> omiljenakategorijas) {
		this.omiljenakategorijas = omiljenakategorijas;
	}

	public Omiljenakategorija addOmiljenakategorija(Omiljenakategorija omiljenakategorija) {
		getOmiljenakategorijas().add(omiljenakategorija);
		omiljenakategorija.setKorisnika(this);

		return omiljenakategorija;
	}

	public Omiljenakategorija removeOmiljenakategorija(Omiljenakategorija omiljenakategorija) {
		getOmiljenakategorijas().remove(omiljenakategorija);
		omiljenakategorija.setKorisnika(null);

		return omiljenakategorija;
	}

	public List<Poruka> getPorukas1() {
		return this.porukas1;
	}

	public void setPorukas1(List<Poruka> porukas1) {
		this.porukas1 = porukas1;
	}

	public Poruka addPorukas1(Poruka porukas1) {
		getPorukas1().add(porukas1);
		porukas1.setKorisnika1(this);

		return porukas1;
	}

	public Poruka removePorukas1(Poruka porukas1) {
		getPorukas1().remove(porukas1);
		porukas1.setKorisnika1(null);

		return porukas1;
	}

	public List<Poruka> getPorukas2() {
		return this.porukas2;
	}

	public void setPorukas2(List<Poruka> porukas2) {
		this.porukas2 = porukas2;
	}

	public Poruka addPorukas2(Poruka porukas2) {
		getPorukas2().add(porukas2);
		porukas2.setKorisnika2(this);

		return porukas2;
	}

	public Poruka removePorukas2(Poruka porukas2) {
		getPorukas2().remove(porukas2);
		porukas2.setKorisnika2(null);

		return porukas2;
	}

	public List<Prijatelji> getPrijateljis1() {
		return this.prijateljis1;
	}

	public void setPrijateljis1(List<Prijatelji> prijateljis1) {
		this.prijateljis1 = prijateljis1;
	}

	public Prijatelji addPrijateljis1(Prijatelji prijateljis1) {
		getPrijateljis1().add(prijateljis1);
		prijateljis1.setKorisnika1(this);

		return prijateljis1;
	}

	public Prijatelji removePrijateljis1(Prijatelji prijateljis1) {
		getPrijateljis1().remove(prijateljis1);
		prijateljis1.setKorisnika1(null);

		return prijateljis1;
	}

	public List<Prijatelji> getPrijateljis2() {
		return this.prijateljis2;
	}

	public void setPrijateljis2(List<Prijatelji> prijateljis2) {
		this.prijateljis2 = prijateljis2;
	}

	public Prijatelji addPrijateljis2(Prijatelji prijateljis2) {
		getPrijateljis2().add(prijateljis2);
		prijateljis2.setKorisnika2(this);

		return prijateljis2;
	}

	public Prijatelji removePrijateljis2(Prijatelji prijateljis2) {
		getPrijateljis2().remove(prijateljis2);
		prijateljis2.setKorisnika2(null);

		return prijateljis2;
	}

	public List<Recept> getRecepts() {
		return this.recepts;
	}

	public void setRecepts(List<Recept> recepts) {
		this.recepts = recepts;
	}

	public Recept addRecept(Recept recept) {
		getRecepts().add(recept);
		recept.setKorisnika(this);

		return recept;
	}

	public Recept removeRecept(Recept recept) {
		getRecepts().remove(recept);
		recept.setKorisnika(null);

		return recept;
	}

}