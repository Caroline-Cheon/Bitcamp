/* 상속과 다형성 - 자바 최상위 수퍼 클래스 Object */
package step11;

public class Exam75_0 /*extends Object*/{
  static class A /*extends Object*/ {}
  static class B extends A {}

  public static void main(String[] args) {
  //어떤클래스의 인스턴스 , 자손인지 확인
  A obj1 = new A();
  B obj2 = new B();

  if (obj1 instanceof A) {System.out.println("obj1은 A의 인스턴스이다");}
  if (obj1 instanceof Object) {System.out.println("obj1은 Object의 자손이다");}

  if (obj2 instanceof B) {System.out.println("obj2은 B의 인스턴스이다");}
  if (obj2 instanceof A) {System.out.println("obj2은 A의 자손이다");}
  if (obj2 instanceof Object) {System.out.println("obj2은 Object의 자손이다");}
   }
}

/*
# java.lang.Object 클래스
- 자바 클래스는 반드시 수퍼 클래스가 있어야 한다.
- 만약 개발자가 수퍼클래스를 지정하지 않으면,
  자동으로 Object를 상속받는다.
*/
