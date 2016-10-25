/*oop      정리2 example3
  =>중간 계산 결과를 바깥에 두지 말고 그 계산과 관련된 클래스 안에 두자.
  =>static variable
*/
package step08;

public class Exam61_3 {
  static class Calculator {
    //static variable: class 를 실행할 때 Method area에 자동으로 준비된다.
    // new  라는 명령은 제외된다.
    // class 에 한개 만 존재한다.
    static int sum = 0;
    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void divide(int a) {sum /= a;}
  }
  public static void main(String[] args) {
    //calculate!!!(연산자 우선순위 고려x)
    // => 3 + 2 * 3 - 1 = 14
    //int sum = 0; 더이상 계산 결과를 담을 변수 필요 x
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);
  }
}
/* static variable
 - 클래스를 method area 영역에 로딩할 때 자동으로 생성되는 메모리다.
 - 따라서 클래스에 한번만 생성된다
 - JVM이 종료될 때까지 존재*/
