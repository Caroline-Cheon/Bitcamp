//subject: 연산자 - 연산자 우선순위와 후위 연산자
package step04;

public class Exam38_1 {
  public static void main(String[] args) {
    int a = 10;
    int result = a++ + a++ * a++ + a++;
    System.out.println(a);
    System.out.println(result);

    //후위연산자가 산술연산자보다 우선한다.
  }
}
