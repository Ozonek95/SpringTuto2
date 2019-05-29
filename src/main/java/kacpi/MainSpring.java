package kacpi;

import kacpi.api.UserRepository;
import kacpi.domain.User;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kacper Staszek
 */
class MainSpring {

  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
    context.registerShutdownHook();

    UserRepository repozytoriumUżywtkowników = context
        .getBean("repozytoriumUżywtkowników", UserRepository.class);

    User janek = repozytoriumUżywtkowników.createUser("Janek");
  }
}
