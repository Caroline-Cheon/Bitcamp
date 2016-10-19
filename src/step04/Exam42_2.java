//subject: 연산자 - 비트 논리 연산자
package step04;

public class Exam42_2 {
  public static void main(String[] args) {
//문제 : 이력서에 프로그래밍 가능한 항목을 입력 받기
//프로그래밍 보기
//java, javaScript,HTML, CSS, C, C++, PHP, Python,Perl, VB
//, R, Groovy, XHl, Scala, Ruby, Swift, Object-c, Pascal, C#, Go

  /*  int[] languages = new int[]{
      1, 1, 1, 0, 1, 1, 1, 1, 1, 1,
      0, 1, 1, 0, 0, 0, 1, 1, 0, 0
      };     */
      byte[] languages = new byte[]{
          1, 1, 1, 0, 1, 1, 1, 1, 1, 1,
          0, 1, 1, 0, 0, 0, 1, 1, 0, 0
          };

      int v1 = languages[0] +languages[4] +languages[5];
      String result = (v1 == 3) ? "YES":"NO";
      System.out.println(result);


  }
}
