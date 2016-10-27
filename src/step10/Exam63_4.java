/* static method and instance method - 변수의 접근
*/
package step10;

public class Exam63_4 {
  static class MyType {
    static int a;
    int b;

    static void m1() {
      System.out.println("스태틱 메서드 호출...");
      MyType.a = 100;      //ok 스태틱 메서드에서 스태틱 변수 접근 가능
      a = 200;          // ok 스태틱메서드와 같은 클래스 안에 있다면 클래스 이름 생략 가능

     //this.b = 300;    //compile error    스태틱메서드는 내장변수 this가 없다.
                      // 왜? 인스턴스 주소 없이 호출하기 때문이다.
     //b =400;    //compile error   인스턴스 주소도 없이 변수에 접근? 불가!

     //결론! 스태틱 메서드(블럭)에서는 오직 스태틱 멤버(변수,메서드)만 사용할 수 있다.
    }
    void m2() {
      System.out.println("인스턴스 메서드 호출...");

      MyType.a = 500;     //ok     스태틱 변수는 클래스 이름만 있다면 언제든 접근 할 수 있다.
      a = 600; //ok    변수 앞에 주소를 안주면 다음 순서로 변수를 찾는다.
                 //  로컬 변수> 인스턴스 변수 > 스태틱변수
                 // 가능한 코드의 가독성을 위해 정확하게 클래스 이름을 지정하라!
      this.b = 700;   //ok      인스턴스 메서드는 인스턴스 주소를 담고 있는 내장 변수 this가 있다.
      b = 800; //ok        변수 앞에 주소를 생략하면 다음 순서로 변수를 찾는다.
                   // 로컬 변수> 인스턴스 변수 > 스태틱변수
                   // 즉 b 가 인스턴스 변수라면 b = 800; 은 다음 코드로 바뀐다. this.b = 800;
      //결론
      //인스턴스 메서드는 공유 변수인 스태틱 변수에 언제든지 접근할 수 있다.
      //그리고 당연히 인스턴스 변수에 접근할 수 있다.
    }
  }
  public static void main(String[] args) {

  }

}
