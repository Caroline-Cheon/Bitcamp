/* 스태틱변수와 인스턴스 변수를 초기화 시키는 블록 2
*/
package step10;

public class Exam63_7 {
  static class MyType {
    static int a;
    int b;

    static {System.out.println("스태틱 초기화 블록");}
    {System.out.println("인스턴스 초기화 블록");}

    static {System.out.println("스태틱 초기화 블록2");}
    {System.out.println("인스턴스 초기화 블록2");}
  }
  public static void main(String[] args) {
    System.out.println(MyType.a);
    MyType.a = 100;
    System.out.println(MyType.a);
    System.out.println("--------------------------------------");

    MyType obj; //레퍼런스는 인스턴스 블록 실행하고 상관없다.
    obj = new MyType();
    System.out.println(obj.b);

    MyType obj2 = new MyType();
    System.out.println(obj2.b);
  }

}
