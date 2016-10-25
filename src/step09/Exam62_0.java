
/* 자바 기본 도구 사용법- 입력 도구
=> 입력 받은 데이터를 특정 타입의 데이터로 잘라주는 도구
*/
package step09;
import java.util.Scanner;
public class Exam62_0 {
  public static void main(String[] args) {
    //키보드로부터 입력된 데이터를 우리가 원하는 형식으로 잘라주는 도구 준비
    Scanner keyScan = new Scanner(System.in);

    //사용자가 입력한 값을 줄 단위로 자른다.
    String str = keyScan.nextLine(); //   리턴 값은 한 줄 문자열

    System.out.printf("=>%s\n", str);
  }
}



/*
# System.in
- 시스템 기본 입력 장치(키보드)의 정보를 갖고 있는 변수
*/
