package kacpi.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kacper Staszek
 */
@Configuration
class MyConfig {

  @Bean
  MySecondBean bean(){
    return new MySecondBean();
  }

  @Bean
  MyBean myBean(){
    return new MyBean();
  }
}
