package fr.isika.cdi9.spring.factory;

import fr.isika.cdi9.spring.bean.GateauChocolat;
import fr.isika.cdi9.spring.bean.GateauPomme;
import fr.isika.cdi9.spring.bean.IGateau;

public class GateauFactory extends AbstratGateauFactory{

	@Override
	public IGateau faireUnGateau(String typeDeGateau) {
		// TODO Auto-generated method stub
		IGateau gateau;
		switch(typeDeGateau) {
		case "chocolat":
			gateau = new GateauChocolat();
			break;
		case "pomme" :
			gateau = new GateauPomme();
			break;
			
		default :throw new IllegalArgumentException("Ce gateau n'existe pas !");
		}
		
		return gateau;
	}

}
