package fr.isika.cdi9.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demEntreprise")
public class DemandeurEntreprise implements Idemandeur {

	@Value("Biscotte Jacquart")
	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String presenterDemandeur() {
		return "Je fais une demande au nom de mon entreprise " + nom;
	}

}
