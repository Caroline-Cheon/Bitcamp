//subject:산술연산자: 강제로 데이터종류 바꾸기
package step04;

public class Exam36_4 {
  public static void main(String[] args) {
    int a =10;
    float b = 7;

    float result = a / b;   //데이터타입이 다르기 때문에 암시적으로 형변환 발생
    System.out.println(result);            //1.4285715

    byte b1 = 10, b2 = 10;
    //byte b3 = b1 + b2;      //b1과 b2의 값은 암시적으로 int로 형변환된다.컴파일오류
    int b3 = b1 + b2;         //ok!

    //예외: 상수 값끼리의 연산 결과는
    //메모리에 값을 넣을 수 있을 때 byte와 short 메모리에 저장하는 것을 허락한다.
    byte b4 = 10 +20;  //상수의 결과 값은 컴파일러가 알 수 있기 때문에
                     // 값의 저장 여부를 바로 검사할 수 있다.
                     // 그래서 byte메모리에 저장하는 것을 허락한다.
    byte b4 = 100 +200;  //컴파일오류! 상수 값의 계산 결과가 메모리의 크기를 초과.
  }
}
/*
# java는 정수 연산을 수행할 때 최소 단위가 int이다.
=>따라서 byte, short 값을 연산할 때는
  내부적으로 int로 형변환된 다음에 연산이 수행된다.

*/
