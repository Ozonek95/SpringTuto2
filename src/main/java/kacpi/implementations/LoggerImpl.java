package kacpi.implementations;

import java.time.LocalDate;
import kacpi.api.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
public class LoggerImpl implements Logger, BeanPostProcessor {

  private String name;
  private int version;

  public void log(String message) {
    System.out.println("["+name+" "+version+"] "+LocalDate.now() + " : "+message);
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public void setVersion(int version) {

    this.version = version;
  }

  void init(){
    System.out.println("Init logger");
  }

  void destroy(){
    System.out.println("Destroy logger");
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {

    System.out.println("BeforeInitialization : " + beanName);
    return bean;  // you can return any other object as well
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {

    System.out.println("AfterInitialization : " + beanName);
    return bean;  // you can return any other object as well
  }
}
