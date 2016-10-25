/*oop      정리2 example2
  =>서로 관련된 메서드를 별도의 클래스로 묶은 후
*/
package step08;

public class Exam61_2 {
  static class Calculator {
    static int plus(int a, int b) {return a + b;}
    static int minus(int a, int b) {return a - b;}
    static int multiple(int a, int b) {return a * b;}
    static int divide(int a, int b) {return a / b;}
  }
  public static void main(String[] args) {
    //calculate!!!(연산자 우선순위 고려x)
    // => 3 + 2 * 3 - 1 = 14
    //1) 각 메서드의 결과 값을 보관할 변수 준비
    int sum = 0;
    sum = Calculator.plus(3, 2);
    sum = Calculator.multiple(sum, 3);
    sum = Calculator.minus(sum, 1);
    System.out.println(sum);
  }
}
