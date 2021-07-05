package fr.isika.cdi9.spring.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.isika.cdi9.spring.config.DataConfig;
import fr.isika.cdi9.spring.model.Dossier;
import fr.isika.cdi9.spring.service.IDossierService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contexte = new AnnotationConfigApplicationContext(DataConfig.class);
		IDossierService service = (IDossierService) contexte.getBean("dossierService");

		Dossier d1 = new Dossier();
		d1.setNumeroDossier("42");
		d1.setResponsable("bob");

		Dossier d2 = new Dossier();
		d2.setNumeroDossier("42");
		d2.setResponsable("bob");

		Dossier d3 = new Dossier();
		d3.setNumeroDossier("45");
		d3.setResponsable("Mike");

		service.ajouterDossier(d1);
		service.ajouterDossier(d2);
		service.ajouterDossier(d3);
		service.listerDossier();
//		System.out.println(service.recupererDossierParNum("42").getNumeroDossier());

	}

}
