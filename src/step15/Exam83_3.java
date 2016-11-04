/*  상속 = super() : 생성자 호출의 순서
=> 어떤 클래스의 생성자를 호출하면, 항상 수퍼 클래스의 생성자를 호출하게 된다.
   그래서 생성자의 실행은 최상위 수퍼 클래스부터 아래로 실행되는 것이다.
=> 표현할 때 주의할점!
  1) 생성자는 수퍼 클래스부터 호출됩니다.(x)
  - 생성자 호출은 현재 클래스부터 상위 클래스로 따라 올라가면서 호출이 된다.
  - 그리고 실행은 수퍼 클래스부터 내려오면서 현재 클래스의 생성자까지 내려오면서 실행된다.
*/
package step15;

public class Exam83_3 {
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
    C obj3 = new C();
    System.out.println("-----------------------------");
  }
}