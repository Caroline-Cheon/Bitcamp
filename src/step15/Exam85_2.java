/*  상속 = super()와 this()를 동시에 사용할 수 없다.
*/
package step15;

public class Exam85_2 {
  static class A {
    int v1;
    public A() {
      //super();
      System.out.println("A()...");
      v1 = 100;
    }
    public A(int a) {
      //super();
      System.out.println("A(int)...");
      v1 = a;
    }
  }
  
  static class B extends A {
    int v2;
    public B() {
      //super();
      System.out.println("B()...");
      v2 = 200;
    }
    public B(int a) {
      // this()나 super()는 반드시 생성자 블록에서 첫 문장이 되어야 한다.
      super(200);
      this(); //컴파일 오류
      System.out.println("B(int)...");
      v2 = a;
    }
  }

  public static void main(String[] args) {
    B obj = new B(100);
    System.out.println("-----------------------------");
  }
}
/*
src\step15\Exam85_2.java:30: error: call to this must be first statement in constructor
      this(); //컴파일 오류
          ^
1 error
*/