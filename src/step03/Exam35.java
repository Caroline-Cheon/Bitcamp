//subject:다른 종류의 메모리를 여러 개 묶어서 준비하기.
package step03;

public class Exam35 {
  //class 문법을 사용하여 메모리 종류을 정의한다.
  //여러 종류의 메모리를 묶어 새 데이터 타입을 만든다.
  //배열은 오직 같은 종류의  메모리만 여러개 준비할 수 있다.
  //class 문법을 사용하여 다른 종류의 메모리를 여러 개 준비할 수 있다.
  //scores 는 String(1),int(4), float(1)로 구성되는 메모리임을 정의하는 것이지
  //메모리를 즉시 준비하는 것은 아니다.
  //즉 score는 메모리를 준비할 때 참고할 설계도이다.
  //지금 당장 이런 메모리를 준비하라는 뜻이 아니다.
  //나중에 new라는 명령이 들어오면 그 때 이런 메모리들을 준비하라는 것이다.
  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  public static void main(String[] args) {
      Score s1 = new Score();
       // 1)instance 준비(클래스 설계도에 따라 메모리를 준비하는 것)
       //class에 정의된 대로 복합 메모리 준비하기
       //이렇게 준비한 복합 메모리를 '인스턴스(instance)'라고 한다.

      // 2) 복합 메모리에 값 넣기
      // 인스턴스이름, 내부메모리의 이름
      s1.name = "홍길동";
      s1.kor = 100;
      s1.eng = 100;
      s1.math = 100;
      s1.sum = s1.kor + s1.eng +s1.math;
      s1.aver = s1.sum / 3;

      //3)복합 메모리의 값 꺼내기
      System.out.println(s1.name);
      System.out.println(s1.kor);
      System.out.println(s1.eng);
      System.out.println(s1.math);
      System.out.println(s1.sum);
      System.out.println(s1.aver);






  }
}
