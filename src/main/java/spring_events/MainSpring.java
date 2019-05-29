package spring_events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Kacper Staszek
 */
class MainSpring {

  public static void main(String[] args) throws InterruptedException {
    ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(
        MyAppConfiguration.class);

    context.start();

    HelloClass bean = context.getBean(HelloClass.class);

    bean.sayHello("Hello from main()");
    Thread.sleep(2000);
    context.stop();
  }
}
