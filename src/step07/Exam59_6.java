// 사용자 정의 타입의 인스턴스- 응용5     Student3 이용
package step07;

public class Exam59_6 {

  public static void main(String[] args) {
    Student3[] arr = new Student3[3];

    arr[0] = new Student3();
    arr[1] = new Student3();
    arr[2] = new Student3();

    arr[0].init("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1].init("임꺽정", "hong@test.com", "111-1111", 30, false);
    arr[2].init("유관순", "hong@test.com", "111-1111", 40, true);

    for(Student3 student : arr) {
      student.printStudent();
    }
  }

}
