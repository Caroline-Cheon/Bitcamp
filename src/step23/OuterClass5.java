/*주제:메서드 파라미터와 익명 클래스
 */
package step23;

public class OuterClass5 {
  
  static public void start(Car car) {
    car.run();
  }
  public static void main(String[] args) {
    Car c1 = new Car("티코") {
      public void run() {
        System.out.println(this.model + ":우헤헤.. 달린다..");
      }
    };
    start(c1);
    
    start(new Car("그랜저") {
      public void run() {
        System.out.println(this.model + ":달린다...");
      }
    });
  }
  // Car클래스를 만들자 마자 익명 클래스를 생성하고 생성자는 문자열을 받는다.
  // 다음 Car 클래스의 메서드를 정의하고 run을 overriding 한다
  // 인스턴스 주소가 this에 저장되어있다.
  /* 연습 방법
  1)
  start(new Car(){})
  2)
  start(new Car("그랜저"){})
  3)
  start(new Car("그랜저"){
    public void run() {
      System.out.println(this.model + "달린다......");
    }
  })
  */
}
