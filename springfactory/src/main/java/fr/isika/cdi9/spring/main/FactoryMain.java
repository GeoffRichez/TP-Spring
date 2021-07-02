package fr.isika.cdi9.spring.main;

import fr.isika.cdi9.spring.bean.IGateau;
import fr.isika.cdi9.spring.factory.AbstratGateauFactory;
import fr.isika.cdi9.spring.factory.GateauFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		AbstratGateauFactory factory = new GateauFactory();
		IGateau gateau = factory.faireUnGateau("pomme");
		
		gateau.ajouterIngredients();

	}

}
