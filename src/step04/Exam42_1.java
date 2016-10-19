//subject: 연산자 - 비트 논리 연산자
package step04;

public class Exam42_1 {
  public static void main(String[] args) {
//문제 : 이력서에 프로그래밍 가능한 항목을 입력 받기
//프로그래밍 보기
//java, javaScript,HTML, CSS, C, C++, PHP, Python,Perl, VB
//, R, Groovy, XHl, Scala, Ruby, Swift, Object-c, Pascal, C#, Go

    boolean[] languages = new boolean[]{
      true, true, true, true, true, true, true, true, true, true,
      false, true, true, false, false, false, true, true, false, false
    };

    //Java, C, C++을 할 줄 아는 사람인지 검사하라!
    //다 할줄알면 ok 아니면 no
      String result = ( languages[0] && languages[4] && languages[5] )?
      "Okay, You can be employed" : "No, You cannot be employed";
      System.out.println(result);

      int v1 = (languages[0]) ? 1 : 0;
      int v2 = (languages[4]) ? 1 : 0;
      int v3 = (languages[5]) ? 1 : 0;
      String result2 = (v1 + v2 + v3 == 3) ? "YES":"NO";
      System.out.println(result2);

      int w1 = ((languages[0]) ? 1 : 0);
      w1 = w1 + ((languages[4]) ? 1 : 0);
      w1 = w1 + ((languages[5]) ? 1 : 0);
      String result3 = (w1 == 3) ? "YES":"NO";
      System.out.println(result3);


  }
}
