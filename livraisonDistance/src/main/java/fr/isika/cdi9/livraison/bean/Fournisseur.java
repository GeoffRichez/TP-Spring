package fr.isika.cdi9.livraison.bean;

public class Fournisseur {

	private String nom;
	private Reference ref;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Reference getRef() {
		return ref;
	}

	public void setRef(Reference ref) {
		this.ref = ref;
	}

}
