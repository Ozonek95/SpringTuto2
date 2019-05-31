package spring_events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * @author Kacper Staszek
 */
@MyAnnotation
class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {

//  @Autowired
//  HelloClass helloClass;

  @Override
  public void onApplicationEvent(ContextStoppedEvent event) {
    System.out.println("Application stopped event");
    //helloClass.sayHello("Hello class from stopped event.");
  }
}
