// 사용자 정의 타입의 인스턴스- 응용4       Student2 이용
package step07;

public class Exam59_5 {

  public static void main(String[] args) {
    Student2[] arr = new Student2[3];

    arr[0] = new Student2();
    arr[1] = new Student2();
    arr[2] = new Student2();

    Student2.init(arr[0],"홍길동", "hong@test.com", "111-1111", 20, true);
    Student2.init(arr[1],"임꺽정", "hong@test.com", "111-1111", 30, false);
    Student2.init(arr[2],"유관순", "hong@test.com", "111-1111", 40, true);

    for(Student2 student : arr) {
      Student2.printStudent(student);
    }
  }

}
