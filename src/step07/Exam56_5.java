//  subject: instance and reference  - 상수 스트링 객체 증명

package step07;

public class Exam56_5{
  public static void main(String[] args) {

    String s1 = "홍길동";
    Exam56_Test.m1(s1);

  }
}
/*
#상수 문자열과 다른 클래스의 메서드
-클래스 별로 String 상수 객체를 관리하는 것이 아니라
JVM 전체에서 하나로 관리한다.
