/* 초기화 문장
*/
package step10;

public class Exam65_1 {

  static class MyType {
    byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
  }

  public static void main(String[] args) {
    MyType obj = new MyType();
    System.out.println(obj.b);
    System.out.println(obj.s);
    System.out.println((int)obj.c);
    System.out.println(obj.i);
    System.out.println(obj.l);
    System.out.println(obj.f);
    System.out.println(obj.d);
    System.out.println(obj.bool);
  }

}
/*
#초기값
-변수를 만든 후 기본적으로 저장되는 값
-스태틱 변수나 인스턴스 변수는 0으로 초기화 된다
*/
