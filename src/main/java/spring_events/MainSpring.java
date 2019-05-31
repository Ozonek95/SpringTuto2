package spring_events;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author Kacper Staszek
 */
class MainSpring {

  public static void main(String[] args) throws InterruptedException {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(
        MyAppConfiguration.class);

    context.start();

    context.registerShutdownHook();

    HelloClass bean = context.getBean(HelloClass.class);

    bean.sayHello("Hello from main()");

    System.out.println(bean.getMyProperty());

    context.stop();

    bean = null;

    context.close();

    System.gc();

    Thread.sleep(3000);
  }
}
