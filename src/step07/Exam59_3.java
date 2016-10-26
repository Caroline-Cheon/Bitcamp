// 사용자 정의 타입의 인스턴스- 응용2
package step07;

public class Exam59_3 {
  static void printStudent(Student student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }
  public static void main(String[] args) {

    Student[] arr = new Student[3];
    arr[0] = new Student();
    arr[1] = new Student();
    arr[2] = new Student();


    arr[0].name = "홍길동";
    arr[0].email = "hong@test.com";
    arr[0].tel = "111-1111";
    arr[0].age = 20;
    arr[0].working = true;

    arr[1].name = "임꺽정";
    arr[1].email = "hong@test.com";
    arr[1].tel = "111-1111";
    arr[1].age = 30;
    arr[1].working = false;

    arr[2].name = "유관순";
    arr[2].email = "hong@test.com";
    arr[2].tel = "111-1111";
    arr[2].age = 40;
    arr[2].working = true;

    for(Student student : arr) {
      printStudent(student);
    }

  }
}