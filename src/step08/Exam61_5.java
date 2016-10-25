/*oop      정리2 example5
  =>계산 결과를 개별적으로 관리하려면?
    static 변수를 만들지 말고, 인스턴스 변수로 만들어라!
  => 인스턴스 변수?
        - static 이 붙지 않은 변수
        - 인스턴스 변수는 스태틱 변수와 달리 클래스가 로딩될 때 생성 x
        - new 명령을 사용
  */
package step08;

public class Exam61_5 {
  static class Calculator {
    int sum = 0;              // instance variable
    //instance vairable : 스태틱 메서드에서 직접 접근할 수 없다.

    static void plus(Calculator that, int a) {that.sum += a;}
    static void minus(Calculator that, int a) {that.sum -= a;}
    static void multiple(Calculator that, int a) {that.sum *= a;}
    static void divide(Calculator that, int a) {that.sum /= a;}
  }
  public static void main(String[] args) {
    //calculate!!!(연산자 우선순위 고려x)
    //만약 두 개의 계산을 동시에 실행한다면?
    // => 3 + 2 * 3 - 1 = 14
    // => 4 * 5 - 7 /2 = 4

    // 두개의 계산 결과를 저장할 메모리를 따로 만든다
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();

    Calculator.plus(c1, 3);
    Calculator.plus(c2, 4);

    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 5);

    Calculator.multiple(c1, 3);
    Calculator.minus(c2, 7);

    Calculator.minus(c1, 1);
    Calculator.divide(c2, 2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);
  }
}
/* static variable
 - 클래스를 method area 영역에 로딩할 때 자동으로 생성되는 메모리다.
 - 따라서 클래스에 한번만 생성된다
 - JVM이 종료될 때까지 존재*/
