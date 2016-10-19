/* Quiz
프로그램 아규먼트로 나이를 입력 받아 성년, 미성년 여부를 출력하시오!
*/
package step04;

public class Test1 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    String result = (age < 19) ? "minor" : "adult";
    System.out.println(result);

  }
}
/*

*/
