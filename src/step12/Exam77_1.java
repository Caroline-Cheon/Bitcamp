 /*Class 클래스 - 클래스 이름 알아내기
 */
package step12;

public class Exam77_1 {
  //클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라 한다.
  static class A {
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) throws Exception {

    A obj = new A();
    Class clazz1 = obj.getClass();

    //1) 클래스 이름 리턴
    String classNameWithPackageName = clazz1.getName();
    String classNameOnly = clazz1.getSimpleName();

    System.out.println(classNameWithPackageName);
    System.out.println(classNameOnly);
    System.out.println(clazz1.toString());

    //2) Member class or local class
    System.out.println(clazz1.isMemberClass());   //member inner class or not
    System.out.println(clazz1.isLocalClass());    //local inner class or not

    //메서드 안에 선언된 클래스를 로컬 inner class 라 한다.
    class B {}

    System.out.println(B.class.isMemberClass());
    System.out.println(B.class.isLocalClass());
  }
}
/*

public boolean isLocalClass()

Returns true if and only if the underlying class is a local class.


public boolean isMemberClass()

Returns true if and only if the underlying class is a member class.

-----------------------------------------------------------------------

step12.Exam77_1$A
A
class step12.Exam77_1$A
true
false
false
true

*/
