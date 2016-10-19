//subject: 연산자 - 비트 논리 연산자
package step04;

public class Exam42_0 {
  public static void main(String[] args) {
    int a = 0b0110_1100;  //108
    int b = 0b0011_0001; //49
    int c = a & b;     //0010_0000
    System.out.println(c);
    System.out.println(Integer.toString(c,2));

    c = a | b;  //0111_1101
    System.out.println(c);
    System.out.println(Integer.toBinaryString(c));

    c = a ^ b;  //101_1101
    System.out.println(c);
    System.out.println(Integer.toBinaryString(c));

    long c2 = ~a;  //1001_0011
    System.out.println(c2);
    System.out.println(Long.toBinaryString(c2));
  }
}

/*
# 비트 연산자
- 비트 단위로 연산을 수행한다.
-보통 이미지 처리 프로그램에서 많이 사용한다.

1) AND(&) 비트 연산자
- 두 비트 모두 1일때만 1이다. 그 외에는 0이다.
- 기존의 값을 줄이는 효과가 있다.
2) OR(!) 비트 연산자
- 둘 중 한 개의 비트라도 1이면 결과는 1이다. 둘 다 0 일때만 0이다.
- 기존 값을 높이는 효과가 있다.
3) XOR 비트 연산자
- 두 비트가 다를 경우 1이다. 같으면 0이다.
- 두 값이 같은지 다른지 알아낼 때
4) NOT(~)비트 연산자
- 대상비트를 모두 반대 값으로 바꾼다.
1은 0으로, 0은 1로 바꾼다.
색상을 반전시킬 때 사용한다.
*/
