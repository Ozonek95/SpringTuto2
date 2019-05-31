package spring_events;

import java.lang.reflect.Field;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class HelloBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println(bean+" "+beanName);

   if (bean instanceof HelloClass){
     try {
       Field myProperty = bean.getClass().getDeclaredField("myProperty");
       myProperty.setAccessible(true);
       myProperty.set(bean,"Hello mordo");
     } catch (NoSuchFieldException | IllegalAccessException e) {
       e.printStackTrace();
     }
   }
    return null;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if(bean.getClass().isAnnotationPresent(MyAnnotation.class)){
      System.out.println("CIEBIE TEŻ MAM KLOCU "+beanName);
    }
    return null;
  }
}
