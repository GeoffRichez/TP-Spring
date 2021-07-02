package fr.isika.cdi9.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpectateurAspect {

	@Before("execution(* fr.isika.cdi9.bean.Musicien.joue(..))")
	public void prendPlace() {
		System.out.println("les spectateurs prennent place ...");
	}

	@After("execution(* fr.isika.cdi9.bean.Musicien.joue(..))")
	public void applaudit() {
		System.out.println("Les spectateurs applaudissent !");
	}
}
