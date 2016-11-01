 /*Class 클래스 - 클래스 이름 알아내기
 */

package step12;

public class Exam77_2 {
  //클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라 한다.
  static class A {
    String name;
    int age;

    public void m1() {System.out.println("Hello");}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) throws Exception {
    //1)인스턴스 생성하는 전형적인 방법 => new 명령
    A obj = new A();
    obj.m1();

    //2)클래스 정보를 이용하여 인스턴스 생성하는 방법
    Class clazz1 = A.class;
    A obj2 = (A)clazz1.newInstance();
    obj2.m1();
  }
}
/*
출력결과

Hello
Hello
*/
