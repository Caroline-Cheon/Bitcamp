/*oop      정리2 example6
  =>인스턴스 변수를 메서드에서 쉽게 다루고 싶다.
             -인스턴스 메서드로 만들다
             -static 붙이지 말아라
             -단, 호출할 때 인스턴스 주소를 메서드 앞에 둠.
  */
package step08;

public class Exam61_6 {
  static class Calculator {
    int sum = 0;

    //인스턴스 메서드 : 메서드 내장 변수 this에 인스턴스 주소가 전달된다.
    //파라미터에 주소를 넘겨줄 필요없다.
    void plus(int a) {this.sum += a;}
    void minus(int a) {this.sum -= a;}
    void multiple(int a) {this.sum *= a;}
    void divide(int a) {this.sum /= a;}
  }
  public static void main(String[] args) {
    //calculate!!!(연산자 우선순위 고려x)
    //만약 두 개의 계산을 동시에 실행한다면?
    // => 3 + 2 * 3 - 1 = 14
    // => 4 * 5 - 7 /2 = 4

    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    c1.plus(3);
    c2.plus(4);

    c1.plus(2);
    c2.multiple(5);

    c1.multiple(3);
    c2.minus(7);

    c1.minus(1);
    c2.divide(2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);
  }
}
