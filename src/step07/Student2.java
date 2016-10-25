//해당 클래스를 위한 메서드 추가.           Exam59_5 이용
package step07;

public class Student2 {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  static void printStudent(Student2 student) {
    System.out.printf("%s, %s, %s, %d, %b\n",
    student.name, student.email, student.tel, student.age, student.working);
  }
  static void init(Student2 student,String name, String email, String tel, int age, boolean working) {

    student.name = name;
    student.email = email;
    student.tel = tel;
    student.age = age;
    student.working = working;

  }

}
