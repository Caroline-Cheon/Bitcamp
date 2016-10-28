/* 상속
*/
package step11;

public class Exam68_0 {
  public static void main(String[] args) {
    BestCalculator calc = new BestCalculator();
    // 3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
  }

}
