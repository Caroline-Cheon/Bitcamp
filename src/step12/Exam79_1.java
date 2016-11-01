 /*Wrapper class - primitive type(원시타입)의 값을 좀 더 다양하게 다룰 때 사용하는 클래스
 =>랩퍼 클리스도 스트링 클래스와 마찬가지고 Imuutable 객체이면서 equals*/

package step12;

public class Exam79_1 {
  public static void main(String[] args) throws Exception {
    Integer i1 = 20;// 상수풀에 Integer 클래스의 인스턴스가 자동 생성된다.
    Integer i2 = 20;

    if(i1 == i2) System.out.println("i1 == i2");
    if(i1.equals(i2)) System.out.println("i1과 i2는 내용이 같다");
  }
}
