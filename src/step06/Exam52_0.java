// upside star triangle
package step06;

public class Exam52_0 {
  public static void main(String[] args) {
    int lineCount = 5;
    int starCount = 0;
    while (lineCount > 0) {
      while (starCount++ < lineCount) {
        System.out.print("*");
      }
      System.out.println();
      starCount = 0;
      lineCount--;
    }
  }
}
/*#method
- 특정 목적의 작업을 수행하는 명령어들을 묶어 놓은것
-장점
=> 언제든 다시 그 명령을 실행할 수 있다.
=> 명령들을 관련성에 따라 분류해 놓음으로써 소스 코드의 유지보수가 용이
*/
