package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the poruka database table.
 * 
 */
@Entity
@NamedQuery(name="Poruka.findAll", query="SELECT p FROM Poruka p")
public class Poruka implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PorukaPK id;

	private String sadrzaj;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	@JoinColumn(name="Korisnika_idKorisnika")
	private Korisnika korisnika1;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	@JoinColumn(name="Korisnika_idKorisnika1")
	private Korisnika korisnika2;

	public Poruka() {
	}

	public PorukaPK getId() {
		return this.id;
	}

	public void setId(PorukaPK id) {
		this.id = id;
	}

	public String getSadrzaj() {
		return this.sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
	}

	public Korisnika getKorisnika1() {
		return this.korisnika1;
	}

	public void setKorisnika1(Korisnika korisnika1) {
		this.korisnika1 = korisnika1;
	}

	public Korisnika getKorisnika2() {
		return this.korisnika2;
	}

	public void setKorisnika2(Korisnika korisnika2) {
		this.korisnika2 = korisnika2;
	}

}