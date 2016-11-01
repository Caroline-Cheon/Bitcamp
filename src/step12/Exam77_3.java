 /*Class 클래스 - 메서드 정보 추출하기
 */

package step12;

import java.lang.reflect.Method;

public class Exam77_3 {
  //클래스 안에 메서드나 변수와 동등 레벨로 선언된 경우, 멤버 inner 클래스라 한다.
  static class A {
    String name;
    int age;

    public void m1() {System.out.println("Hello");}
    void m2() {}
    protected void m3() {}
    private void m4() {}
  }

  public static void main(String[] args) throws Exception {
    Class clazz = A.class;
    //1)클래스 메서드 목록을 얻는다.
    //=> 그 클래스의 메서드 및 수퍼 클래스의 메서드를 추출한다.
    //   단 public 접근 범위를 갖는 메서드만 추출한다.
    Method[] methods = clazz.getMethods();

    //2)반복문을 통해 메서드 이름을 알아낸다.
    for (Method method : methods) {
      System.out.println(method.getName());
    }

    System.out.println("======================================");

    methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.println(method.getName());
    }
  }
}

/*
getDeclaredMethods()
Returns an array containing Method objects reflecting all the declared methods
of the class or interface represented by this Class object,
including public, protected, default (package) access, and private methods, but excluding inherited methods.





m1
wait
wait
wait
equals
toString
hashCode
getClass
notify
notifyAll
======================================
m1
m2
m3
m4
*/
