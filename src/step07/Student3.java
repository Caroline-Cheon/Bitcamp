//해당 클래스를 위한 메서드 추가.           Exam59_6 이용
package step07;

public class Student3 {
  String name;
  String email;
  String tel;
  int age;
  boolean working;

  void printStudent() {
    System.out.printf("%s, %s, %s, %d, %b\n",
    this.name, this.email, this.tel, this.age, this.working);
  }
  void init(String name, String email, String tel, int age, boolean working) {

    this.name = name;
    this.email = email;
    this.tel = tel;
    this.age = age;
    this.working = working;

  }

}
