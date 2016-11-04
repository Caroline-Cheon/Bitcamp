/*  상속 = super() : 수퍼 클래스의 생성자 호출
=> 모든 생성자는 수퍼 클래스의 
   기본 생성자를 호출하는 명령어를 (super();)
   생성자 블럭 첫 줄에 포함한다.
   만약 개발자가 이 명령어를 작성하지 않으면,
   컴파일러가 자동으로 수퍼클래스의 기본 생성자를 호출한다.
   
=> 다시 주석으로 확인하자!
*/
package step15;

public class Exam83_2 {
  static class A {
    int v1;
    public A() {
   // super();    명령어가 없으면 자동으로 삽입한다.
      System.out.println("A()...");
      v1 = 100;
    }
  }
  
  static class B extends A {
    int v2;
    public B() {
   // super();    명령어가 없으면 자동으로 삽입한다.
      System.out.println("B()...");
      v2 = 200;
    }
  }
  static class C extends B {
    int v3;
    public C() {
   // super();    명령어가 없으면 자동으로 삽입한다.
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