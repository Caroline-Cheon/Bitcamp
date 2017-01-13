/* 주제: 스프링 IoC 컨테이너에 생성된 객체 조회하기
 * 1) SqlSessionFactory 객체를 만들어 줄 공장 객체를 스프링 설정에 등록해야 한다.
 *    - 
 */
package step30.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01_init {
  public static void main(String[] args) {
    ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
        "step30/ex5/application-context.xml");
    
    
    String[] names = iocContainer.getBeanDefinitionNames();
    for (String name : names) {
      System.out.println(iocContainer.getBean(name).getClass().getName());
    }
  }
}









