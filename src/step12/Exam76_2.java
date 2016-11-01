//Object class-equals(인스턴스 주소)
//=> 원래 동작: 인스턴스가 다르면 false를 리턴한다.
//=> 재정의 할 때: 같은 값을 같는 인스턴스를 같은 것으로 취급하기위해
 package step12;
public class Exam76_2 {
  static class A {
    String name;
    int age;
  }
  static class B {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
      if(!(obj instanceof B)) return false;
      B other = (B)obj;
      if (this.age != other.age) return false;
      if (!this.name.equals(other.name)) return false;
      return true;
    }

  }
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";
    obj1.age = 20;

    A obj2 = new A();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1.equals(obj2));
     System.out.println("-----------------------------");


    B obj3 = new B();
    obj3.name = "홍길동";
    obj3.age = 20;

    B obj4 = new B();
    obj4.name = "홍길동";
    obj4.age = 20;

    System.out.println(obj3.equals(obj4));
    System.out.println("-----------------------------");
  }
}

/*
false
-----------------------------
true
-----------------------------
*/
