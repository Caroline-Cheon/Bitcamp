/*주제: 클래스의 접근 제어 테스트
public 접근을 허용하는 Exam86_2과
패키지 멤버만 접근을 허용하는 Exam86_1의 접근을 테스트해본다.
*/


package step16.ex3;

import step16.ex3.*;

public class Test {
  public static void main(String[] args) {
    Exam86_1 obj1; 
    //같은 패키지에서 접근할 수 있다.
    Exam86_2 obj2;
  }

}