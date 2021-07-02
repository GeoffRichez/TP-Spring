package fr.isika.cdi9.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.isika.cdi9.bean.Musicien;
import fr.isika.cdi9.confi.MaConfig;

public class MainMusicien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contexte = new AnnotationConfigApplicationContext(MaConfig.class);
		Musicien musicien = (Musicien) contexte.getBean(Musicien.class);
		musicien.setNom("Lucien");
		musicien.joue();
	}

}
