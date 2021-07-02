package fr.isika.cdi9.annotation.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.isika.cdi9.annotation.bean.Region;
import fr.isika.cdi9.annotation.config.MaConfig;

public class Main {
	public static void main(String[] args) {

		ApplicationContext contexte = new AnnotationConfigApplicationContext(MaConfig.class);

		Region region = contexte.getBean(Region.class);

		region.affiche();
	}

}
