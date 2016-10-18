//subject:산술연산자: 암시적 형변환
package step04;

public class Exam36_3 {

  public static void main(String[] args) {

    int a = 10, b =7;

    //1)암시적 형변환
    float result = (float)a / b;
    System.out.println(result);    //1.4285715

    result = a / (float)b;
    System.out.println(result);    //1.4285715

    //2) 암시적 형변환 확인   (종류가 다르면 연산을 수행할 수 없다)
    int v1 = 100;
    long v2 = 200;
    int result2 = v1 + v2;   //v1 값에 대해 long으로 암시적형변환이 이뤄진다.
                            //결과 값의 종류는 long이다
                              //그래서 int 메모리 result2에 저장할 수 없는 것이다.
                            //컴파일 단계에서 확인가능!컴파일오류 발생
  }
}
/*
# 연산은 반드시 같은 종류의 데이터에 대해서만 수행할 수 있다.
 -만약 피연산자의 종류가 다르다면,
  자바는 다음 규칙에 따라 자동 형변환을 수행한다.
  byte, short --> int -->long -->float(주의) -->double

  예) int + long =(long)int + long = long
      byte + short = (int)byte + (int)short = int
      byte +long = (long)byte +long =long
      byte + float = (float)byte + float = float
      byte + int + float + double
          =(int)byte  +int + float + double
          =int + float + double
          =(float)int+ float + double
          =float + double
          =(double)float +double  =double

      double + int + float + byte
          =.......................생략
*/
