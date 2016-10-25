// oop      정리1 example
/*정리1
  => 클래스는 사용자가 프로젝트의 조건에 맞는 데이터 타입과 그 타입의 데이터를 다루는 연산자를 정의할 때 사용하는 문법이다.
  정리2
  =>클래스는 서로 관련된 메서드를 유지보수하기 좋도록 묶어두는 문법이다.
*/
package step08;

public class Exam61_0 {
  //학생의 정보를 다루기 위한 새 데이터 타입 정의
  //=> 여러 타입의 메모리로 이루어진 복합 데이터이다.
  static class Student {
    //인스턴스 변수
    //=> Student 인스턴스를 준비할 때 만들 메모리 종류
    //=> 일종의 메모리 설계도
    String name;
    String email;
    String tel;
    int age;
    boolean working;

  //인스턴스 메서드
  //=>인스턴스의 값을 다루는 모든 메서드는 그 데이터 타입의 연산자라 할 수 있다.
  //=>인스턴스 생성할 때 최초로 자동으로 호출되는 메서드를 '생성자' 라고 한다.
    Student (String name, String email, String tel, int age, boolean working) {

      this.name = name;
      this.email = email;
      this.tel = tel;
      this.age = age;
      this.working = working;
    }

    void printStudent() {
      System.out.printf("%s, %s, %s, %d, %b\n",
      this.name, this.email, this.tel, this.age, this.working);
    }

  }

  public static void main(String[] args) {
    Student[] arr = new Student[3];
    arr[0] = new Student("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = new Student("임꺽정", "hong@test.com", "111-1111", 30, false);
    arr[2] = new Student("유관순", "hong@test.com", "111-1111", 40, true);

    for(Student student : arr) {
      student.printStudent();
    }
  }

}
