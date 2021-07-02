package fr.isika.cdi9.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.isika.cdi9.bean.Musicien;

public class MainMusicien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext contexte = new ClassPathXmlApplicationContext("mesBeans.xml");
		Musicien musicien = (Musicien) contexte.getBean("musicien");
		musicien.joue();
	}

}
