/*주제: 자손 클래스의 멤버에 접근하기
 protected 멤버 자손이 접근할 때는 오직 자기 메모리 경우만 허용한다.
*/
package step16.ex4.other;

import step16.ex4.*;

public class Exam87_3 extends Exam87_0 {
  public static void main(String[] args) {
    Exam87_0 obj = new Exam87_0();
   //obj.v1 = 1000; // private은 다른 클래스에서 접근할 수 없다.
   //obj.v2 = 2000;  //(default)
   //obj.v3 = 3000;  //protected
    obj.v4 = 4000;  //public

     Exam87_3 obj2 = new Exam87_3();
     //obj2.v1 = 1000; // private은 다른 클래스에서 접근할 수 없다.
     //obj2.v2 = 2000;  //(default)
     obj2.v3 = 3000;  //protected
     obj2.v4 = 4000;  //public
  }
}