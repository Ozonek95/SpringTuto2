package kacpi.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author Kacper Staszek
 */
class Main {

  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    context.registerShutdownHook();
    MyBean bean = context.getBean(MyBean.class);

    System.out.println(bean);

  }
}
