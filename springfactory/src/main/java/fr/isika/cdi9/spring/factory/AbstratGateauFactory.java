package fr.isika.cdi9.spring.factory;

import fr.isika.cdi9.spring.bean.IGateau;

public abstract class AbstratGateauFactory {
	
	public abstract IGateau faireUnGateau(String typeDeGateau);

}
