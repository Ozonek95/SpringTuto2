package spring_events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author Kacper Staszek
 */
class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

  @Autowired
  HelloClass helloClass;

  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {
    System.out.println("Application stopped event");
    System.out.println(event.getSource());
    helloClass.sayHello("Hello class from stopped event.");
  }
}
