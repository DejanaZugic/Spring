package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the prijatelji database table.
 * 
 */
@Embeddable
public class PrijateljiPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int korisnika_idKorisnika;

	@Column(insertable=false, updatable=false)
	private int korisnika_idKorisnika1;

	public PrijateljiPK() {
	}
	public int getKorisnika_idKorisnika() {
		return this.korisnika_idKorisnika;
	}
	public void setKorisnika_idKorisnika(int korisnika_idKorisnika) {
		this.korisnika_idKorisnika = korisnika_idKorisnika;
	}
	public int getKorisnika_idKorisnika1() {
		return this.korisnika_idKorisnika1;
	}
	public void setKorisnika_idKorisnika1(int korisnika_idKorisnika1) {
		this.korisnika_idKorisnika1 = korisnika_idKorisnika1;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PrijateljiPK)) {
			return false;
		}
		PrijateljiPK castOther = (PrijateljiPK)other;
		return 
			(this.korisnika_idKorisnika == castOther.korisnika_idKorisnika)
			&& (this.korisnika_idKorisnika1 == castOther.korisnika_idKorisnika1);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.korisnika_idKorisnika;
		hash = hash * prime + this.korisnika_idKorisnika1;
		
		return hash;
	}
}