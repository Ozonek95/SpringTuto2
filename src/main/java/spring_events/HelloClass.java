package spring_events;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Kacper Staszek
 */

class HelloClass implements InitializingBean, DisposableBean{

  private final String myProperty;

  HelloClass(String myProperty) {
    this.myProperty = myProperty;
  }

  @PostConstruct
  void init(){
    System.out.println("INITIALIZATIOON");
  }

  @PreDestroy
  void destroyAnno(){
    System.out.println("PreDestroy");
  }
  void sayHello(String message){
    System.out.println("Hello "+message);
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("After properties set");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("After destroy");
  }

  @Override
  public void finalize(){
    System.out.println("finalize");
  }

  public String getMyProperty() {
    return myProperty;
  }

}
