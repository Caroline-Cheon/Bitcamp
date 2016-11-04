// 주제 : 인스턴스에 직접 접근했을 때 문제점
package step16.ex1;

public class ScoreTest {
  public static void main(String[] args) {
    Score score = new Score("길동이", 100, 98, 75);
    score.sum = 200;
    System.out.printf("합계: %d, 평균: %f\n", score.sum, score.average);
  }
}