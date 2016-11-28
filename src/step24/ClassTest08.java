/*주제: 리플렉션API 사용법 - 클래스의 메서드 정보 추출하기III
 *  => java.lang.reflect.Method;
 *    - 메서드에 대한 정보를 다루는 클래스
 */
package step24;

import java.lang.reflect.Method;

public class ClassTest08 {
  static class MyClass {
    public void m1() {System.out.println("m1()");}
    public void m1(int a) {} {System.out.println("m1(int a)");}
    public void m1(String a) {} {System.out.println("m1(String a)");}
    public void m1(String a, int b) {} {System.out.println("m1(String a, int b)");}
    public void m2() {}
  }
 
  public static void main(String[] args) throws Exception {
   Class<?> clazz = MyClass.class;
   
   // 특정한 메서드만 추출하기
   // => 메서드 이름을 준다
   // => 메서드의 파라미터 타입정보를 넘긴다.
   
   // 파라미터가 없는 m1() 메서드 정보 추출
   Method m = clazz.getMethod("m1");
   System.out.println(m);
   
   // 파라미터가 있는 m1() 메서드 정보 추출
   // => getMethod(String name, Class<?>.....parameterTypes)
   //m = clazz.getMethod("m1", Class.forName("java.lang.Thread")); // 파라미터로 Thread를 받는 메서드가 없다. 컴파일 오류!
   m = clazz.getMethod("m1", Class.forName("java.lang.String")); 
   System.out.println(m);
   
   // 자바 원시 타입도 "class"라는 내장 스태틱 변수가 있다.
   m = clazz.getMethod("m1", int.class); 
   System.out.println(m);
   
   m = clazz.getMethod("m1", String.class, int.class); 
   System.out.println(m);
   

  }
}
