package fr.isika.cdi9.bean;

public class Musicien {

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void joue() {
		System.out.println(nom + " joue de la musique");
	}
}
