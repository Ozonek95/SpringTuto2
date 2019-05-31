package kacpi.beanlifecycle;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class MySecondBean {

  @PostConstruct
  void init(){
    System.out.println("POST CONSTRUCTTTTTTT");
  }
}
