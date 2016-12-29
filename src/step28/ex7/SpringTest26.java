/* 주제: BeanPostProcessor 의 활용
 * => 빈 생성 후 뒤처리를 담당하는 객체를 정의하고 사용하는 문법
 */
package step28.ex7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest26 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex7/application-context26.xml");
    
    System.out.println("----------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}



/*

MyBeanPostProcessor()
Car()
setMaker()
setModel()
postProcessBeforeInitialization() : obj1
Car [model=소나타, maker=비트자동차, cc=0, madeDate=null, engine=null]
setCc()
postProcessAfterInitialization() : obj1
Car [model=소나타, maker=비트자동차, cc=1980, madeDate=null, engine=null]
Car()
setMaker()
setModel()
postProcessBeforeInitialization() : obj2
Car [model=티코, maker=비트자동차, cc=0, madeDate=null, engine=null]
setCc()
postProcessAfterInitialization() : obj2
Car [model=티코, maker=비트자동차, cc=900, madeDate=null, engine=null]
Car()
setMaker()
setModel()
postProcessBeforeInitialization() : obj3
Car [model=그랜저, maker=비트자동차, cc=0, madeDate=null, engine=null]
setCc()
postProcessAfterInitialization() : obj3
Car [model=그랜저, maker=비트자동차, cc=3500, madeDate=null, engine=null]
----------------------------
Car [model=소나타, maker=비트자동차, cc=1980, madeDate=null, engine=null]
Car [model=티코, maker=비트자동차, cc=900, madeDate=null, engine=null]
Car [model=그랜저, maker=비트자동차, cc=3500, madeDate=null, engine=null]
*/












