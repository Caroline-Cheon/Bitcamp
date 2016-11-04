 /*주제: 예외처리 - 개념 - 예전에 예외 처리하는 방식 적용
  => C 프로그래밍 시절에는 리턴 값을 검사하여 예외를 처리했다.
  => 리턴 값으로 호출한 쪽에 예외 상황을 알리는 방식의 한계
    - 예외 상황일 때 리턴하는 값이, 정상적인 작업에서 나올 수 있다.
    - 이런 경우를 처리할 수 없다.
    - 작업을 수행하는 명령과 오류를 처리하는 명령이 섞여 있어서
      유지보수가 힘들다.
      소스 코드를 봤을 때 어떤 일을 하는 코드인지 한 눈에 들어오지 않는다.
*/

package step14;

import java.util.Scanner;

public class Exam80_1 {
  static int m1(int a, int b) {
    if (b == 0) {
      //0 으로 나누려고 하면 오류발생시켜야한다.
      return -11119999; //계산 값으로 나오지 않을 가능성이 있는 값을 리턴한다.
    }
    return a / b;
  }
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    //항상 메서드를 호출한 후 리턴 값을 검사해야 한다.
    int result = m1(v1, v2);
    if (result == -11119999) {
      System.out.println("0으로 나눌 수 없습니다.");
    }else {
      System.out.println(result);
    }
    System.out.println("안녕히 가세요!");
   }
}
/*
nextInt()
=> 사용자가 입력한 문자열에서 공백 또는 줄바꿈 코드를 만나면
  문자열을 끊어서 숫자로 바꾼 다음 리턴한다.
  단 한 개 문자열만 끊어서 숫자로 바꾼다.

*/
