package spring_events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kacper Staszek
 */

@Configuration
@ComponentScan
class MyAppConfiguration {

  @Bean
  HelloClass helloClass(){
    return new HelloClass("My property");
  }

  @Bean
  CStartEventHandler startEventHandler(){
    return new CStartEventHandler();
  }

  @Bean
  CStopEventHandler stopEventHandler(){
    return new CStopEventHandler();
  }

  @Bean
  CRefreshEventHandler refreshEventHandler(){
    return new CRefreshEventHandler();
  }
}
