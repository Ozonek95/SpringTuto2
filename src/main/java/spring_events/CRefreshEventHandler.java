package spring_events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Kacper Staszek
 */
class CRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent> {

  private int count = 0;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent event) {
    System.out.println("refreshed "+ ++count +" time.");
  }
}
