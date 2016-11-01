/* 상속 - 오버라이딩 전의 메서드 호출하는 방법2*/
package step11;

public class Exam71_3 {
  static class A {
    void m1() {System.out.printf("A.m1()\n");}
    void m2() {System.out.printf("A.m2()\n");}
  }
  static class B extends A {
    void m2() {System.out.printf("B.m2()\n");}
    void m3() {System.out.printf("B.m3()\n");}

  }
  static class C extends B {
    void m1() {System.out.printf("C.m1()\n");}
    void m2() {System.out.printf("C.m2()\n");}
    void m4() {System.out.printf("C.m3()\n");}

    void test1() {
  //  super.m4(); //컴파일오류!! 조상 클래스 중에 m4() 메서드가 없다
      super.m1(); //A.m1()
      super.m2(); //B.m2()
      super.m3(); //B.m3()
      super.super.m2();  // ?????? 클래스 B 에서 이미 메서드 m2()를 합리적인 이유로 재정의 했으니
                        //뜬금없이 A의 m2()를 호출하려는 시도자체가 성립이 안된다.
    }

  }

  public static void main(String[] args) {
    C obj = new C();
    obj.test1();



  }
}

/*
# this vs super
- this는 메서드를 찾을 때 현재 클래스의(레퍼런스 변수의) 클래스부터 찾는다.
- super는 현재 클래스의(레퍼런스 변수의 클래스의) 수퍼클래스부터 찾는다.
*/
