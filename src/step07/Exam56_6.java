//  subject: instance and reference  - 상수 스트링 객체 증명

package step07;

public class Exam56_6{
  public static void main(String[] args) {

    String s1 = new String("홍길동");
    String s2 = new String("홍길동");

    if (s1 ==s2) {
      System.out.println("s1과 s2가 같은 인스턴스이다. 즉 주소가 같다!");
    }

    // 스트링 인스턴스에 들어있는 값이 같은지 비교하고 싶다!
    // 값이 같은지 비교할 때는 equals()메소드를 사용하라!
    if (s1.equals(s2)) {
      System.out.println("s1 인스턴스에 저장된 값과 s2의 인스턴스의 저장된 값이 같다.");
    }
  }
}
