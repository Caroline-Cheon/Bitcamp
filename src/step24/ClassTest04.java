/*주제: 리플렉션API 사용법 - 로딩된 클래스의 정보 얻기 III
 * 3) 특별한 내장 스태틱 변수 "class"를 이용하는 방법
 *    => 모든 클래스는 무조건 미리 내장된 "class"라는 이름의 스태틱 변수가 있다.
 *    => 이 변수에는 그 클래스 정보를 다루는 도구의 주소가 들어 있다.
 * 
 */
package step24;

public class ClassTest04 {
  static class MyClass {
    static int a = 100;
    static void m() {}
    
    static { // 클래스가 로딩될 때 실행된다.
      System.out.println("MyClass 스태틱 블록 실행.");
    }
  }
  
  public static void main(String[] args) throws Exception {
   int value = MyClass.a;
   
   Class<step24.ClassTest04.MyClass> c = MyClass.class;
   Class<?> c2 = MyClass.class;
  }
}
