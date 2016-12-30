/* 주제: <bean> 태그의 선언과 객체 생성 순서
 */
package step28.ex13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest35 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex13/application-context35.xml");
    
    System.out.println("----------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}


/*
Car()
Engine()
setValve()
setVentil()
setEngine()
setMaker()
setModel()
Car()
setEngine()
setMaker()
setModel()
Car()
setEngine()
setMaker()
setModel()
----------------------------
Car [model=소나타, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=티코, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=그랜저, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]

*/












