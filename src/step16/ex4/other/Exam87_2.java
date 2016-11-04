/*주제: 다른 클래스의 멤버에 접근하기
*/
package step16.ex4.other;

import step16.ex4.*;

public class Exam87_2 {
  public static void main(String[] args) {
    Exam87_0 obj = new Exam87_0();
   // obj.v1 = 1000; // private은 다른 클래스에서 접근할 수 없다.
   //obj.v2 = 2000;  //(default)
   //obj.v3 = 3000;  //protected
    obj.v4 = 4000;  //public
  }
}