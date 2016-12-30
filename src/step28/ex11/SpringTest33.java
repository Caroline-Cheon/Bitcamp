/* 주제: <context:annotation-config/> 로 등록한 객체 알아내기
 * => 이 태그는 애노테이션을 처리할 객체를 등록하는 일을 한다.
 */
package step28.ex11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest33 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex11/application-context32.xml");
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name));
    }
  }
}


/*
Engine [valve=16, ventil=8]
Engine [valve=32, ventil=16]
Car [model=소나타, maker=비트자동차, cc=0, engine=Engine [valve=32, ventil=16]]
Car [model=티코, maker=비트자동차, cc=0, engine=Engine [valve=32, ventil=16]]
Car [model=그랜저, maker=비트자동차, cc=0, engine=Engine [valve=32, ventil=16]]
org.springframework.context.annotation.ConfigurationClassPostProcessor@7ce6a65d
org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@1500955a
org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor@e874448
org.springframework.context.annotation.CommonAnnotationBeanPostProcessor@29b5cd00
org.springframework.context.event.EventListenerMethodProcessor@60285225
org.springframework.context.event.DefaultEventListenerFactory@7113b13f
org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor@45820e51


*/












