//  subject: instance and reference  - 상수 스트링 객체 증명

package step07;

public class Exam56_Test{
  static void m1(String p1) {
    String s = "홍길동";
    if (p1 == s) {
      System.out.println("p1 == s");
    }
  }

  public static void main(String[] args) {

    String s1 = "홍길동";
    m1(s1);

  }
}
