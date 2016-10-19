/* Quiz
프로그램 아규먼트로 나이를 입력 받아 성년, 미성년 여부를 출력하시오!
*/
package step04.test;

public class Test2 {
  public static void main(String[] args) {

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);

    int result = (num1 > num2) ? num1 : num2;
    System.out.println(result);

    String result2 = (num1 > num2) ? args[0] : args[1];
    System.out.println(result2);

  }
}
/*

*/
