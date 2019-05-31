package kacpi.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
class MyBean implements ApplicationContextAware, InitializingBean {

  private MySecondBean mySecondBean;

  private String myProperty = "My property";

  public MyBean(){
    System.out.println("No Arg constructor");
  }

  @Autowired
  public MyBean(MySecondBean mySecondBean) {
    this.mySecondBean = mySecondBean;
    System.out.println("With Args constructor");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("Setter application context");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("POST Construct");
  }

  @PostConstruct
  void init(){
    System.out.println("IDNWAINDOIAWNFIOANWOIF");
  }

  @PreDestroy
  void end(){
    System.out.println("END END END");
  }
}
