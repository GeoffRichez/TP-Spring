package fr.isika.cdi9.spring.aspect;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GestionnaireAspect {

	@Before("execution(* fr.isika.cdi9.spring.bean.Dossier.decrireDossier(..))")
	public void debutTraitement() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Le traitement a commencé à " + now);
	}

}