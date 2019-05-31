package kacpi.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class MyPostProcessor implements BeanPostProcessor {

  public MyPostProcessor(){
    System.out.println("Creating processor (constructor)");
  }

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.print("before init. ");
    System.out.println(bean +" "+beanName);
    return null;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.print("after init. ");
    System.out.println(bean +" "+beanName);
    return null;
  }
}
