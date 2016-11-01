/* 상속과 다형성 - 오버로딩(overloading)*/
package step11;

public class Exam74_0 {
  static class A {
    int result;
    void plus(int value) {
      result += value;
    }
  }
  static class B extends A {
    void minus(int value) {
      result -= value;
    }
     void plus(int value1, int value2) {
      this.result += value1 + value2;
    }
    void minus(int value1, int value2) {
      result -= value1 - value2;
    }
  }
  public static void main(String[] args) {
    B obj = new B();
    obj.plus(10);
    obj.plus(10, 20);
    obj.minus(10);
    obj.minus(10, 20);
//  obj.minus(10, 20, 30);   컴파일오류
   }
}
/*
# 오버로딩(overloading)
- 현재 클래스에 있는 메서드이거나 또는 상속 받은 메서드와
  이름은 같지만 파라미터의 타입과 개수, 순서가 다른 메서드를 추가하는 것
- 목적
  파라미터의 개수나 순서, 타입이 다르더라도
  같은 기능을 하는 메서드에 대해 같은 이름을 부여하여
  일관된 프로그램을 지원하는 문법이다.
*/
