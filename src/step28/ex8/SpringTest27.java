/* 주제: @Autowired 애노테이션의 활용
 * => 의존 객체를 자동으로 주입하라는 표시
 */
package step28.ex8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest27 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new ClassPathXmlApplicationContext(
        "step28/ex8/application-context27.xml");
    
    System.out.println("----------------------------");
    System.out.println(iocContainer.getBean("obj1"));
    System.out.println(iocContainer.getBean("obj2"));
    System.out.println(iocContainer.getBean("obj3"));
  }
}


/*
Car()
Car()
Car()
----------------------------
Car [model=소나타, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=티코, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
Car [model=그랜저, maker=비트자동차, cc=0, engine=Engine [valve=16, ventil=8]]
*/












