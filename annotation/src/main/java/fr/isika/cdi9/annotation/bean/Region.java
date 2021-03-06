package fr.isika.cdi9.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Region {

	@Value("Aquitaine")
	private String nomRegion;

	@Autowired
	private Pays pays;

	@Autowired
	private Ville ville;

	public void affiche() {
		System.out.println("Pays :" + pays.getNomPays() + " Région :" + nomRegion + " Ville :" + ville.getNomVille());
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}
}
