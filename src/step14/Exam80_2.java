 /*주제: 예외처리 - 개념 - 예전에 예외 처리하는 방식 적용
  => 메서드 호출자에게 예외상황을 알리는 효과적인 방법!
    - 리턴 값 대신 예외가 발생된 이유를 담은 객체를 던진다.
      리턴이 아니다 던진다.
    - 던진다는 것은 즉시 메서드 실행을 멈추고 호출한 코드로 돌아간다는 것이다.
  => throw new Error("예외에 대한 간단한 내용");
  => 예외 정보를 받는 문법
    try (Error e){
    원래 하려던 작업코드
  } catch {
    오류가 발생했을 때 수행할 작업코드
  } finally {
    오류와 상관없이 무조검 수행해야 할 작업코드
  }
=> 이점
  1) 예외가 발생 할 수 있는 메서드를 만드는 개발자 입장
    => 그 메서드를 호출하는 쪽에 효과적으로 예외 상황을 알릴 수 있다.
  2) 예외가 발생할 수 있는 메서드를 호출하는 개발자 입장
     => 원래 하려던 작업 코드와 예외를 처리하는 코드를 분리할 수 있어서,
        코드를 읽기가 쉬워진다.
*/

package step14;

import java.util.Scanner;

public class Exam80_2 {
  static int m1(int a, int b) {
    if (b == 0) {
      throw new Error("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    //혹시 m1()을 실행시켰는데 m1()에서 예외를 던진다면
    // 그 예외를 받는 코드를 넣어야 한다.
    try {     //<== try
      int result = m1(v1, v2);
      System.out.println(result);
    } catch (Error e) {
        System.out.println(e.getMessage());
    } finally {    //무조건 실행
        System.out.println("안녕히 가세요.");
    }
  }
}
