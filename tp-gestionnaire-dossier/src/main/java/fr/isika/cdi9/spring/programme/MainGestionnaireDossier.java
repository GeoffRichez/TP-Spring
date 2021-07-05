package fr.isika.cdi9.spring.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.isika.cdi9.spring.bean.Gestionnaire;

public class MainGestionnaireDossier {

	public static void main(String[] args) {

		ApplicationContext contexte = new AnnotationConfigApplicationContext("maConfig");
		Gestionnaire gestionnaire = contexte.getBean(Gestionnaire.class);
		gestionnaire.getDossier().decrireDossier();
	}

}
