//Object class-getClass()
//=> 원래 동작: 클래스 정보를 다루는 인스턴스를 리턴한다.
//=> 이 메서드는 오버라이딩하지 않는다.
package step12;
public class Exam76_3 {
  static class A {
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }
  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();

    //1) 인스턴스가 어떤 클래스를 참조하려 만들었는지
    // 그 로딩된 클래스 정보(를 저장한 인스턴스의 정보)를 리턴한다.
    Class ref1 = obj1.getClass();   // 주의!!! 타입인 클래스는 대문자로 시작한다.
    Class ref2 = obj2.getClass();

    //2) 클래스 로딩은 오직 한번만 이루어지기 때문에
    //   클래스 정보는 각 클래스 별 한 개만 존재한다.
    if (ref1 == ref2) System.out.println("ref1 == ref2");

    //3) 클래스 정보에서 클래스 이름을 뽑아내보자!
    System.out.println(ref1.getName());
  }
}
/*
ref1 == ref2
step12.Exam76_3$A
*/
