
package step08;

public class Exam60_0 {

  public static void main(String[] args) {
    Student[] arr = new Student[3];
//인스턴스를 생성할 때 바로 내가 지정한 값으로 메모리를 설정하고
    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "hong@test.com", "111-1111", 30, false);
    arr[2] = new Student("유관순", "hong@test.com", "111-1111", 40, true);

    for(Student student : arr) {
      student.printStudent();
    }
  }

}

/*      #생성자
    -인스턴스를 생성할 때만 호출할 수 있는 메서드이다.
    -인스턴스를 생성한 후에는 따로 메서드를 호출할 수 없다.
    -모든 클래스는 생성자를 한 개 이상 가져야한다.
    -만약 생성자가 클래스에 없다면 컴파일러가 자동으로 기본생성자를 만든다.
    -생성자를 직접 클래스에 만든다면 컴파일러가 자동으로 기본생성자를 만들어 주지 않는다.
    -결론, 모든 클래스는 한 개 이상의 생성자가 반드시 있다.
    -생성자 문법:
     클래스명(파라미터 선언,...){...}
     반드시 메서드 이름으로 클래스명을 사용해야한다.
     파라미터가 없는 생성자를 기본 생성자라 한다.
    -생성자의 목적(존재 이유)
    => 메모리(인스턴스/객체)를 사용하기 전에 적절히 유효한 값으로 초기화시키는 것
*/
