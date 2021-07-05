package fr.isika.cdi9.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dossier {

	@Value("fr123151")
	private String numeroDossier;

	@Autowired
	@Qualifier("demEntreprise")
	private Idemandeur demandeur;

	@Autowired
	@Qualifier("demIndiv")
	private Idemandeur demandeurIndiv;

	public void decrireDossier() {
		System.out.println(
				"Je suis le dossier numero : " + numeroDossier + " demandeur :" + demandeurIndiv.presenterDemandeur());
		demandeur.presenterDemandeur();
	}

	public String getNumeroDossier() {
		return numeroDossier;
	}

	public void setNumeroDossier(String numeroDossier) {
		this.numeroDossier = numeroDossier;
	}

	public Idemandeur getDemandeur() {
		return demandeur;
	}

	public void setDemandeur(Idemandeur demandeur) {
		this.demandeur = demandeur;
	}

	public Idemandeur getDemandeurIndiv() {
		return demandeurIndiv;
	}

	public void setDemandeurIndiv(Idemandeur demandeurIndiv) {
		this.demandeurIndiv = demandeurIndiv;
	}

}
