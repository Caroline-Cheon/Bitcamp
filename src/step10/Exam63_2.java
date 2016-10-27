/* static method and instance method
*/
package step10;

public class Exam63_2 {
  static class MyType {
    static void m1() {
      System.out.println("스태틱 메서드 호출...");
    }
    void m2() {
      System.out.println("인스턴스 메서드 호출...");
    }
  }
  public static void main(String[] args) {
    MyType.m1();

  //  MyType.m2();        컴파일 오류
  //  non-static method m2() cannot be referenced from a static context
  // 인스턴스 메서서드는 인스턴스 주소를 주지 않고 호출할 수 없다.

    MyType obj = new MyType();
    obj.m2();   //인스턴스 주소가 있어야 호출할 수 있다.
                //설사 인스턴스 안에 변수가 한 개도 없더라도 무조건 인스턴스를 만들어야 한다.
                //인스턴스 변수가 없는 인스턴스 메서드는 의미가 없으니 그러면 스태틱 메서드로 만드는 것이 낫다.

    MyType obj2 = null;
    obj2.m2(); // obj2에는 인스턴스 주소가 없다. 컴파일은 통과! 실행할 때 NullPointerException 예외 발생!

  }

}


/*
# 스태틱 메서드(= 클래스 메서드)
- 호출할 때 클래스 이름(주소)을 줘야 한다.

# 인스턴스 메서드
- 호출할 때 인스턴스 주소를 줘야 한다.
- 인스턴스에 변수가 한 개도 없더라도 인스턴스를 만들어서 호출해야 한다.

# 강사님, 메서드는 언제 생성되나요?
- 생성요?
- 메서드는 클래스가 로딩될 때 Method Area 영역에 올라옵니다.
- 생성된다고 표현하는 것은 적절하지 않습니다.
- 인스턴스 메서드는요?
  인스턴스 메서드든 스태틱 메서드든 둘 다 모두에 해당합니다.
  혹시 인스턴스 메서드에 "인스턴스"라는 말이 들어 있어서
  인스턴스를 생성할 때 로딩되는 줄, 사람들이 많이 착각합니다.
  인스턴스 주소를 가지고 호출해야 된다는 의미에서 인스턴스 메서드라 하는 것입니다.





*/
