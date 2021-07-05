package fr.isika.cdi9.spring.bean;

import org.springframework.stereotype.Component;

@Component("demIndiv")
public class DemandeurIndividuel implements Idemandeur {

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String presenterDemandeur() {
		// TODO Auto-generated method stub
		return "Je présente une demande en tant que demandeur individuelle, voici mon nom :" + nom;

	}

}
