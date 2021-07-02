package fr.isika.cdi9.livraison.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.isika.cdi9.livraison.bean.Commande;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contexte = new ClassPathXmlApplicationContext("mesBeans.xml");
		Commande maCommnade = (Commande) contexte.getBean("commande");
		maCommnade.passerUneCommande();

	}

}
