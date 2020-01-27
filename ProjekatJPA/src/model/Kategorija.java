package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the kategorija database table.
 * 
 */
@Entity
@NamedQuery(name="Kategorija.findAll", query="SELECT k FROM Kategorija k")
public class Kategorija implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idKategorija;

	private String imeKategorije;

	//bi-directional many-to-one association to Recept
	@OneToMany(mappedBy="kategorija")
	private List<Recept> recepts;

	public Kategorija() {
	}

	public int getIdKategorija() {
		return this.idKategorija;
	}

	public void setIdKategorija(int idKategorija) {
		this.idKategorija = idKategorija;
	}

	public String getImeKategorije() {
		return this.imeKategorije;
	}

	public void setImeKategorije(String imeKategorije) {
		this.imeKategorije = imeKategorije;
	}

	public List<Recept> getRecepts() {
		return this.recepts;
	}

	public void setRecepts(List<Recept> recepts) {
		this.recepts = recepts;
	}

	public Recept addRecept(Recept recept) {
		getRecepts().add(recept);
		recept.setKategorija(this);

		return recept;
	}

	public Recept removeRecept(Recept recept) {
		getRecepts().remove(recept);
		recept.setKategorija(null);

		return recept;
	}

}