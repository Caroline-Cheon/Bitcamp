/* 상속 - 오버라이딩 전의 메서드 호출하는 방법*/
package step11;

public class Exam71_2 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m1() {System.out.printf("B.m1()\n");}
    void m3() {System.out.printf("B.m3()\n");}

    void test1() {
      this.m1(); //현재 클래스에서 먼저 메서드를 찾는다
      this.m2(); //현재 클래스에서 찾아보고 없으면 수퍼클래스를 뒤진다.
    }
    void test2() {
      super.m1();  //오버라이딩 하기 전 메서드 호출
      //super.m3();  //무조건 현재 클래스가 아닌 수퍼 클래스부터 m3() 찾는다
                  // 수퍼 클래스에 없으면 그 위으 수퍼클래스에서 찾는다...계속
                   // 그래도 없으면 컴파일 오류!
      this.m3();  //ok
      super.m2(); //현재 클래스에 선언된 메서드가 아니라 수퍼 클래스의 메서드인 경우?
                  //
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.test1();
    System.out.println("------------");
    obj.test2();



  }
}

/*
# 출력결과
B.m1()
A.m2()
-------
A.m1()

# super 키워드
-오버라이딩 전의 메서드를 호출할 때 사용하는 특수 명령어다.
-현재 클래스가 아닌 수퍼 클래스 부터 위로 올라가면서 메서드를 찾는다.

# 메서드 오버라이딩
- 수퍼 클래스에서 자신의 목적에 맞게 재정의한다.
*/
