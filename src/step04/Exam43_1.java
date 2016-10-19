//subject: 연산자 - 비트 이동 연산자
//   오른쪽이동(>>) ,오른쪽이동(>>>) ,왼쪽이동(<<)
package step04;

public class Exam43_1 {
  public static void main(String[] args) {
    int a = 0b1100;  //12
                                  //     1100       12
    System.out.println(a >> 1);   //      110        6
    System.out.println(a >> 2);   //       11        3
    System.out.println(a >> 3);   //        1        1

    int b = -12;
    System.out.println(b >> 1);
    System.out.println(b >> 2);
    System.out.println(b >> 3);
  }
}
/*
# 오른쪽 이동
-2로 나눈 결과와 같다.
-앞의 빈 자리가 부호비트로 채워진다.
-양수(+)는 0, 음수(-)는 1로 채운다.
*/
