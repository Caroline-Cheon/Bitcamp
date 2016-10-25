//  subject: instance and reference  - 인스턴스 생성 위치

package step07;

public class Exam58_0{
  static int[] m1() {
    return m2();
  }
  static int[] m2() {
    return m3();
  }
  static int[] m3() {
    return new int[]{10, 20, 30};
  }
  public static void main(String[] args) {
    int[] arr1 = m1();
  }
}
