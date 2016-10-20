//subject: block variable
package step05;

public class Exam45_6 {
  static  int a = 20;     //  class variable(static variable)

  public static void main(String[] args) {
    a = 100;
    m1();
  }
  static void m1() {
    System.out.println(a);
    System.out.println(Exam45_6.a);
  }
}
