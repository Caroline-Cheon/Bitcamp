/*  상속 = super() : 수퍼 클래스의 생성자 호출
=> 모든 생성자는 수퍼 클래스의 
   기본 생성자를 호출하는 명령어를 (super();)
   생성자 블럭 첫 줄에 포함한다.
   만약 개발자가 이 명령어를 작성하지 않으면,
   컴파일러가 자동으로 수퍼클래스의 기본 생성자를 호출한다.
   
=> 수퍼 클래스의 생성자를 호출하는 명령을 명시적으로 작성해보자!
*/
package step15;

public class Exam83_1 {
  static class A {
    int v1;
    public A() {
      super();
      System.out.println("A()...");
      v1 = 100;
    }
  }
  
  static class B extends A {
    int v2;
    public B() {
      super();
      System.out.println("B()...");
      v2 = 200;
    }
  }
  static class C extends B {
    int v3;
    public C() {
      super();
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println("-----------------------------");

    B obj2 = new B();
    System.out.println("-----------------------------");

    C obj3 = new C();
    System.out.println("-----------------------------");
  }
}