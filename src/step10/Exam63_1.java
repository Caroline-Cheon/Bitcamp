/* static variable and instance variable
*/
package step10;

public class Exam63_1 {
  static class MyType {
    static int a;
    int b;
  }
  public static void main(String[] args) {

    MyType.a = 100; //스태틱변수는 클래스 이름(주소)로 접근한다.
    System.out.println(MyType.a);

    MyType obj = new MyType();
    MyType obj2 = new MyType();

    obj.b = 200;
    obj2.b = 300;

    System.out.printf("MyType.a=%d, MyType.b=%d, obj.b=%d\n",
                      MyType.a, obj.b, obj2.b);

    obj.a = 500;
    System.out.printf("MyType.a=%d, MyType.b=%d, obj.b=%d\n",
                      MyType.a, obj.b, obj2.b);

    obj2.a = 600;
    System.out.printf("MyType.a=%d, MyType.b=%d, obj.b=%d\n",
                      MyType.a, obj.b, obj2.b);


  }
}
/*
# 스태틱 변수를 사용하는 방법
- 클래스 주소(이름)을 사용하여 스태틱 변수에 접근할 수 있다.
- 인스턴스 주소를 사용하여 스태틱 변수에 접근할 수도 있다.
  => 해당 이름의 인스턴스 변수가 없다면,
     스태틱 변수에서 찾는다.
- 인스턴스 주소(레퍼런스)로 스태틱 변수를 사용할 수 있지만,
  소스 코드의 가독성을 높이기 위해서는 가능한 클래스 주소(이름)을 사용하라!

# 인스턴스 주소로 스태틱 변수에 언제든 접근할 수 있다.
=> 스태틱 변수는 모든 인스턴스에서 공유한다.
=> 따라서 인스턴스가 공유해야할 데이터는 스태틱 변수에 저장하는 것이 좋다.
=> 인스턴스들이 공유하는 데이터를 저장하고자 할 때 스태틱 변수를 사용한다.

# 인스턴스 변수의 용도
- 개별 데이터를 저장

# 스태틱 변수의 용도
- 공유 데이터를 저장








*/
