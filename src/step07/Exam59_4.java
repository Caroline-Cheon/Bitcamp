// 사용자 정의 타입의 인스턴스- 응용3
package step07;

public class Exam59_4 {

  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }
  static void init(Student student,String name, String email, String tel, int age, boolean working) {

    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;

  }
  public static void main(String[] args) {
    Student[] arr = new Student[3];

    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();

    init(arr[0],"홍길동", "hong@test.com", "111-1111", 20, true);
    init(arr[1],"임꺽정", "hong@test.com", "111-1111", 30, false);
    init(arr[2],"유관순", "hong@test.com", "111-1111", 40, true);

    for(Student student : arr) {
      printStudent(student);
    }
  }

}
