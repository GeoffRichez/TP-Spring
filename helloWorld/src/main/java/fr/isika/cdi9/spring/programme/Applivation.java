package fr.isika.cdi9.spring.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.isika.cdi9.spring.bean.HelloWorld;
import fr.isika.cdi9.spring.bean.ISalutation;

public class Applivation {

	public static void main(String[] args) {
		
		//version avant : sans injection de dependances
//		ISalutation hello = new HelloWorld();
//		hello.direBonjour();
		
		
		//avec injection de dependances
		
		
		//première méthode par xml
		
		ApplicationContext contexte = new ClassPathXmlApplicationContext("beans.xml");
		//appel d'un context et on lui dit où le trouver: chemin du bean.xml
		ISalutation hello = (HelloWorld) contexte.getBean("helloBill");
		//on ne pas instancier un bean sans le caster// donc lui dire le type de bean
		hello.direBonjour();
		
		
		
	}
}
