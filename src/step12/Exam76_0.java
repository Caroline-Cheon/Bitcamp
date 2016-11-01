//Object class- toString()
//=> 원래동작: 패키지명을 포함한 클래스명과 인스턴스 식별번호를 리턴한다.
//=> 만약에 재정의 한다면 그 이유는?
//=> 클래스에 대해 간단한 설명을 리턴하기 위함이다.
package step12;

public class Exam76_0 {
  static class A {}
  static class B {
    @Override
    public String toString() {
      return "이것은 Object를 테스트하는 클래스입니다.";
    }
  }
  public static void main(String[] args) {
    A obj = new A();
    A obj2 = new A();
    System.out.println(obj.toString());
    System.out.println(obj2.toString());

    B obj3 = new B();
    System.out.println(obj3.toString());
  }
}
/*Object 클래스의 기본 메서드들
- toString()
  => 패키지명을 포함한 클래스이름과 인스턴스의 해시값을 리턴한다.
- equals(인스턴스 주소)
  => 현재 인스턴스와 파라미터로 넘어온 인스턴스 주소가 같은 지 검사한다.
- hashcode()
  => 인스턴스의 해시값(식별번호)를 리턴한다.
- getClass()
  => 인스턴스의 클래스 정보 리턴
- finalize()
  => 가비지 컬렉터에 의해 메모리에서 해제되기 전에 호출된다.

  step12.Exam76_0$A@15db9742
  step12.Exam76_0$A@6d06d69c

*/
