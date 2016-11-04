/*  상속 = super()의 잘못된 사용 : 일반 메서드에서는 수퍼클래스 생성자 호출 불가
*/
package step15;

public class Exam85_0 {
  static class A {
    int v1;
    public A() {
      System.out.println("A()...");
      v1 = 100;
    }
  }
  
  static class B extends A {
    int v2;
    public B() {
      System.out.println("B()...");
      v2 = 200;
    }
    public void m1() {
      super();   // 컴파일 오류! 일반 메서드에서 생성자를 호출할 수 없다.
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    System.out.println("-----------------------------");
  }
}

/*
src\step15\Exam85_0.java:21: error: call to super must be first statement in constructor
      super();   // 컴파일 오류! 일반 메서드에서 생성자를 호출할 수 없다.
           ^
1 error
PS C:\workspace\java01>

*/
