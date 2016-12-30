/* 주제: @Resource 애노테이션 사용하기
 */
package step28.ex12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest34 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex12/application-context34.xml");
    
    System.out.println("----------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}


/*
Car [model=소나타, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=티코, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=그랜저, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8
*/












