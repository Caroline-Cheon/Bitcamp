//  subject: instance and reference  - 상수풀(constants pool)

package step07;

public class Exam56_3{
  public static void main(String[] args) {

    String s1 = "Belly";           //Constants Pool에 새 인스턴스 생성
    String s2 = "Belly";           //기존의 생성된 인스턴스 주소를 리턴
    String s3 = "Belly";           //기존에 생성된 인스턴스 주소를 리턴

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }
    if (s1 == s3) {
      System.out.println("s1 == s3");
    }
  }
}
