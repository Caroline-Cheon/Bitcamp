// 주제 : 접근 제한된 변수의 값을 설정하는 방법 => 공개된 메서드 호출
package step16.ex2;

public class ScoreTest {
  public static void main(String[] args) {
    Score score = new Score("길동이", 100, 98, 75);
    //score.sum = 200; //컴파일 오류! 접근 불가!

    //Score.kor = 50; //국어 점수를 변경하고 싶은데 접근이 막혀있다면
                      //인스턴스를 새로 만들 수 밖에 없지 않는가?
                      //이럴 경우 값을 개별적으로 변경할 수 있는 메서드가 필요하다
                      //그래서 Score에 값을 개별적으로 변경할 수 있는 메서드가 필요

    System.out.printf("합계: %d, 평균: %f\n", score.getSum(), score.getAverage());

    score.setKor(50);           
    System.out.printf("합계: %d, 평균: %f\n", score.getSum(), score.getAverage());
    //이렇게 직접 접근 불가한 변수는 공개된 메서드를 통해 값을 꺼낸다.
  }
}


//의문점: 직접 변수에 접근하거나 게터를 이용하거나 결과는 같은데 왜 게터를 사용하지?