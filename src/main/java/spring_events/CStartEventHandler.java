package spring_events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * @author Kacper Staszek
 */
class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {

  @Autowired
  HelloClass helloClass;

  @Override
  public void onApplicationEvent(ContextStartedEvent event) {
    System.out.println("Start application event");
    System.out.println(event.getSource());
    helloClass.sayHello("from HelloClass in starting application event");
  }
}
