/* 주제: 객체 생성
 * => 설정을 전담하는 클래스를 사용하여 생성할 객체 설정
 */
package step28.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest05 {
  public static void main(String[] args) {
    ApplicationContext iocContainer;
    iocContainer = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    // => 설정을 전담하는 (@Configuration이 붙은) 클래스의 타입을 생성자에 넘긴다.
    
    Car obj1 = (Car)iocContainer.getBean("c1");
    if (obj1 != null) {
      System.out.println("객체를 생성했네");
    }
  }
}















