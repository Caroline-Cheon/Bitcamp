
package step03;

public class Exam33_1 {
  public static void main(String[] args) {
    //낱개로 선언하기
    int kor;
    int eng;
    int math;
    kor = 100;
    eng = 100;
    math = 100;

    //변수 선언과 값 지정을 합친 문법
    int age = 28;

    //같은 종류의 변수는 한 가지 이름으로 여러 개 선언 할 수 있다.
    int kor = 90, eng = 90, math = 90;

    //그러나 다음과 같이 콤마을 사용하여 여러개의 변수의 값을 저장할 수 없다.
    // kor = 90, eng = 90, math = 90          compile error

    //다른 언어에서는 다음과 같은 방식으로 변수선언 코드를 정리하기도 한다.
    int k2 = 90;
        d2 = 90;
        j2 = 90;

    int[] Score = new int[3];            //Array 라 부른다.
    //int scores[3] 안타깝게도 자바는 이 문법을 지원하지 않는다.

    //다른 변수의 값을 저장할 수 있다
    int value1 = 100;
    int value2;
    value2 =value; //r-value에는 값 뿐만아니라 변수도 올 수 있다.
                   //변수가 올 경우 그 변수의 복사한 값이 놓인다.

  }
}
