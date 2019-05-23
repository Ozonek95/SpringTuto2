package kacpi;

import kacpi.api.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Kacper Staszek
 */
class MainSpring {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");

    UserRepository repozytoriumUżywtkowników = context
        .getBean("repozytoriumUżywtkowników", UserRepository.class);

    repozytoriumUżywtkowników.createUser("Janek");
  }
}
