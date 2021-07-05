package fr.isika.cdi9.spring.programme;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.isika.cdi9.spring.config.HibernateConfig;
import fr.isika.cdi9.spring.model.User;
import fr.isika.cdi9.spring.service.IUserservice;

public class ApplicationMain {

	public static void main(String[] args) {

		ApplicationContext contexte = new AnnotationConfigApplicationContext(HibernateConfig.class);

		IUserservice serviceUser = (IUserservice) contexte.getBean("userService");

		User user = new User();
		user.setName("James");
		user.setEmail("james.gosling@gmail.com");

		serviceUser.sauverUser(user);

		System.out.println("recherche par id");
		System.out.println(serviceUser.getById(1L).getName() + " " + serviceUser.getById(1L).getEmail());

		System.out.println("Liste de tous les utilisateurs de ma table :");
		serviceUser.listerUsers();

	}

}
