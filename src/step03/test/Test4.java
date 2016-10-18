/*quiz:
클래스 문법을 이용하여 교육센터의 한명의 수강생 정보를 저장하고 출력하라.
*/
package step03.test;

public class Test4 {

  static class Student{
    String name;
    int age;
    int postno;
    String baseAddress;
    String detailAddress;
    String school;
    boolean working;
    String tel;
    String email;
    String birth;
    String[] branch;
    boolean isGraduated;
  }
  public static void main(String[] args) {
    Student caroline = new Student();

    caroline.name = "JeeYeon Cheon";
    caroline.age = 20;
    caroline.postno = 14711;
    caroline.baseAddress = "경기도";
    caroline.detailAddress = "상길동";
    caroline.school = "비트대학교";
    caroline.working = false;
    caroline.tel = "1111-1111";
    caroline.email= "carolinejycheon@gamil.com";
    caroline.branch = new String[] {"gangnam","jongro"};
    caroline.isGraduated = true;


    System.out.println("name = " + caroline.name);
    System.out.println("age = " + caroline.age);
    System.out.println("postno = " + caroline.postno);
    System.out.println("baseAddress = " + caroline.baseAddress);
    System.out.println("detailAddress = " + caroline.detailAddress);
    System.out.println("school = " + caroline.school);
    System.out.println("working = " + caroline.working);
    System.out.println("tel = " + caroline.tel);
    System.out.println("emailAdress = " + caroline.email);
    System.out.print("branch = ");
    for (String branch : caroline.branch) {
      System.out.print(branch+" ");
    }
    System.out.println("");
    System.out.println("isGraduated  = " + caroline.isGraduated );

  }
}
