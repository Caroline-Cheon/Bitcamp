/* 스태틱변수와 인스턴스 변수를 초기화 시키는 블록
*/
package step10;

public class Exam63_6 {
  static class MyType {
    static int a;     //스태틱변수
    int b;    //인스턴스 변수
    static {//스태틱 초기화 블록
      System.out.println("스태틱 초기화 블록");
    }
    {       //인스턴스 초기화 블록
      System.out.println("인스턴스 초기화 블록");
      this.b = 20;
    }
    public MyType(){
      System.out.println("생성자 호출");
      this.b = 30;
    }
  }

  public static void main(String[] args) {
    System.out.println(MyType.a);
    MyType.a = 100;
    System.out.println(MyType.a);
    System.out.println("--------------------------------------");

    MyType obj; //레퍼런스는 인스턴스 블록 실행하고 상관없다.
    obj = new MyType();
    System.out.println(obj.b);

    MyType obj2 = new MyType();
    System.out.println(obj2.b);
  }

}
/*
# 스태틱 초기화 블록
 - 클래스 로딩> 스태틱변수 생성> 스태틱초기화 블록 실행
 - 목적: 스태틱 변수를 유효한 값으로 초기화시키는 용도로 사용한다.
 - 클래스가 단 한 번 로딩되기 때문에 이 블록도 단 한 번 실행한다.
 - 스태틱 초기화 블록은 인스턴스와 관련이 없기 때문에
   스태틱 메서드처럼 this 내장 변수가 없다.

 # 인스턴스 초기화 블록
  - new 명령 실행 > 인스턴스 변수 생성> 인스턴스 초기화 블록 >생성자 호출
  - 인스턴스 초기화 블록도 인스턴스 메서드처럼 인스턴스 주소를 담고 있는 내장 변수 this가 존재한다.

# 인스턴스 초기화 블록은 있는데 왜 생성자를 만들까?
  - 인스턴스 블록은 인스턴스를 생성할 때 우리가 원하는 값으로 초기화 시킬 수 없습니다.
  - 즉 이 블록에 값을 전달 할 방법이 없다.
  - 생성자를 호출될 때 파라미터 값을 받을 수 있다.

 # 생성자만 있어도 초기화 시킬 수 있는데 저 '인스턴스 초기화 블록'의 존재 이유는?
  -생성자를 만들 수 없는 클래스가 존재합니다.  => 익명 클래스 (annoymous class)
  - 이 클래스는 이름이 없기 때문에 생성자를 만들 수 없어요. 생성자가 없으면 인스턴스 변수를 초기화 시킬 수 없겠죠?
  - 이때 바로 이 인스턴스 초기화 블록을 사용하는 것입니다.

*/
