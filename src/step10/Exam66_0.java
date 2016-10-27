/* 초기화 문장
*/
package step10;

public class Exam66_0 {

  static class MyType {
    static int a;
    int b = 100;

    static {
      System.out.printf("스태틱블록: a=%d\n", a);
      MyType.a = 50;
    }
    {
      System.out.printf("인스턴스블록: a=%d, b=%d\n", a, b);
      this.b = 60;
    }
    public MyType() {
      System.out.printf("생성자: a=%d, b=%d\n", MyType.a, this.b);
      MyType.a = 500;
      this.b = 600;
    }
  }

  public static void main(String[] args) {
    MyType obj = new MyType();
    System.out.printf("main: a=%d, b=%d\n", MyType.a, obj.b);
   }

}
/*
#객체 생성과 메모리 준비 과정
-클래스가 로딩되어 있지 않다면, 클래스 로딩을 먼저 한다
  => 클래스 로딩
  => 스태틱 변수 생성 및 0으로 초기값 설정   a = 0
  => 스태틱 초기화 문장 실행         a = 0
  => 스테틱 블록 생성             a = 50

-인스턴스 생성
  => 인스턴스 변수 생성 및 0으로 초기값 설정    a = 50, b = 0
  => 인스턴스 초기화 문장 실행        a = 50, b = 100
  => 인스턴스 블록     a = 50, b = 60
  => 생성자        a = 500, b = 600
-main()       a = 500, b = 600
- 변수 생성 --> 0으로 설정 --> 초기화 문장 실행 --> 초기화 블록 실행 --> 생성자 실행

*/
