package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prijatelji database table.
 * 
 */
@Entity
@NamedQuery(name="Prijatelji.findAll", query="SELECT p FROM Prijatelji p")
public class Prijatelji implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PrijateljiPK id;

	private String status;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	@JoinColumn(name="Korisnika_idKorisnika")
	private Korisnika korisnika1;

	//bi-directional many-to-one association to Korisnika
	@ManyToOne
	@JoinColumn(name="Korisnika_idKorisnika1")
	private Korisnika korisnika2;

	public Prijatelji() {
	}

	public PrijateljiPK getId() {
		return this.id;
	}

	public void setId(PrijateljiPK id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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