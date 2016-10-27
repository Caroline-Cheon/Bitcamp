/* 초기화 문장
*/
package step10;

public class Exam65_2 {

  static class MyType {

  }

  public static void main(String[] args) {
    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;

    MyType obj = new MyType();
    System.out.println(b);
    System.out.println(s);
    System.out.println((int)c);
    System.out.println(i);
    System.out.println(l);
    System.out.println(f);
    System.out.println(d);
    System.out.println(bool);
  }

}
/*
#초기값
-변수를 만든 후 기본적으로 저장되는 값
-스태틱 변수나 인스턴스 변수는 0으로 초기화 된다
*/
