/* 상속 - 사용법
*/
package step11;

public class Exam69_1 {
  static class A {}
  static class B extends A {}
  static class C extends A {}
  static class D extends B, C {}   //compile error

  public static void main(String[] args) {

  }

}

/*
# 클래스 다중 상속
- 자바는 클래스의 다중 상속을 지원하지 않는다.
-
*/
