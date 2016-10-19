//subject: 연산자 - 조건연산자
package step04;

public class Exam41_0 {
  public static void main(String[] args) {
    int age = 10;
    //(조건) ? A : B;
    // =>A,B는 결과를 리턴하는 명령어이다 (expression)

    //compile error! A와 B자리에 그냥 statement가 왔다. expression이 아니다.
    // 결과가 없다! 그 명령을 실행한 후 그 자리에  값이 놓이지 않는다는 의미.
    //(10 < 19) ? System.out.println("minor") :  System.out.println("adult");

    //조건 연산자는 반드시 그 값을 받아야 한다.
    //(age < 19) ? "minor":"adult" ;     compile error!
    String result = (age < 19) ? "minor" : "adult";
    System.out.println(result);













  }
}

/*
# statement(문장)
- 프로그램 언어로 작성하는 명령어
# expression(표현식)
- statement 중에서 결과를 리턴하는 statement
*/
