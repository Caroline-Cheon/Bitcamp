//주제: 명령어 흐름을 제어하는 문법 - 블록 안에 선언된 변수
package step05;
public class Exam053 {
  public static void main(String[] args) {
    int a = 10;

    {

      int b = 20;
      System.out.println(a);
      System.out.println(b);
      a = 100;
    }

    System.out.println(a);
    //System.out.println(b); 
  }
}
