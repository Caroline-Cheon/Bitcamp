/* 상속과 다형성 - 자바 최상위 수퍼 클래스 Object2 */
package step11;

public class Exam75_1 {
  static class A {}
  static class B extends A {}

  public static void main(String[] args) {
    A obj1 = new A();
    String str = obj1.toString();
    System.out.println(str);
  }
}

 
