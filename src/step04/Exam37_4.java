//subject: 연산자 - 후위(post)연산자2
package step04;

public class Exam37_4 {
  public static void main(String[] args) {
    int a = 10;
    int result = a++ + a++ + a++ + a++;
    System.out.printf("a = %d , result = %d \n", a, result);

  }
}
