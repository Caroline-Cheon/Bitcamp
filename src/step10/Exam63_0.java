/* static variable and instance variable
*/
package step10;

public class Exam63_0 {
  static class MyType {
    static int a;
    int b;
  }
  public static void main(String[] args) {

    //1) how to use static variable
    MyType.a = 100; //스태틱변수는 클래스 이름(주소)로 접근한다.
    System.out.println(MyType.a);

  //MyType.b = 100;
  // non-static variable b cannot be referenced from a static context

  
  //2) how to use instance variable
  MyType obj = new MyType();
  obj.b = 200;

  MyType obj2 = new MyType();
  obj2.b = 300;
  System.out.println(obj.b);
  System.out.println(obj2.b);

  }




}
