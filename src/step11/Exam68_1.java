/* 상속
*/
package step11;

public class Exam68_1 {
  public static void main(String[] args) {
    SuperCalculator calc = new SuperCalculator();
    // 3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);
  }

}
//다른 jar 파일에 있는 클래스 사용하기
//=> 컴파일 할 때 .jar 파일을
