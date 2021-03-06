package fr.isika.cdi9.confi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // permet de comprendre les annotations Aspect
@ComponentScan("fr.isika.cdi9")
public class MaConfig {

}
