// 사용자 정의 타입의 인스턴스- 응용2
package step07;

public class Testing {
  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }
  static Student createStudent(String name, String email, String tel, int age, boolean working) {
    Student student = new Student();
    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;
    return student;
  }
  public static void main(String[] args) {

    Student[] arr = new Student[3];
    arr[0] = createStudent("홍길동", "hong@test.com", "111-1111", 20, true);
    arr[1] = createStudent("임꺽정", "hong@test.com", "111-1111", 30, false);
    arr[2] = createStudent("유관순", "hong@test.com", "111-1111", 40, true);


    for(Student student : arr) {
      printStudent(student);
    }

  }
}
