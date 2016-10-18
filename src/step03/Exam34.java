
package step03;

public class Exam34 {
  static class Score {
    static int kor;
    static int eng;
    static int math;
    static int sum;
    static float aver;
  }

  public static void main(String[] args) {
      //static 타입으로 만든 데이터 타입은 바로 사용하면 된다.
      Score.kor = 100;
      Score.eng = 90;
      Score.math = 100;
      Score.sum = Score.kor + Score.eng + Score.math;
      Score.aver = Score.sum / 3;

      System.out.println(Score.aver);

  }
}
