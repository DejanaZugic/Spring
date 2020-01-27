package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the slika database table.
 * 
 */
@Entity
@NamedQuery(name="Slika.findAll", query="SELECT s FROM Slika s")
public class Slika implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSlika;

	private String opisSlike;

	//bi-directional many-to-one association to Recept
	@ManyToOne
	private Recept recept;

	public Slika() {
	}

	public int getIdSlika() {
		return this.idSlika;
	}

	public void setIdSlika(int idSlika) {
		this.idSlika = idSlika;
	}

	public String getOpisSlike() {
		return this.opisSlike;
	}

	public void setOpisSlike(String opisSlike) {
		this.opisSlike = opisSlike;
	}

	public Recept getRecept() {
		return this.recept;
	}

	public void setRecept(Recept recept) {
		this.recept = recept;
	}

}