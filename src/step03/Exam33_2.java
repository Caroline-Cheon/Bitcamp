
package step03;

public class Exam33_2 {
  public static void main(String[] args) {
    int[] scores = new int[3];
    //  int Scores2[] = new int[3];   //java 는 int[] 변수명을 더 선호한다.
    scores[0] = 100;
    scores[1] = 100;
    scores[2] = 100;

    //scores[3] = 100;
    //Exception in thread 'main' java.lang.arrayIndexOutofBoundsException: 3]
    //배열의 인덱스 범위는 0-(length -1)

    //배열을 만들지 않고 단지 배열 이름 변수만 선언한 다음에 사용하면 오류!
    //int[] scores2;
    //  scores2[0] = 100;
    // variable scores2 might not have been initialized

    //2) 배열 변수 선언과 함께 값을 지정하기
    int[] scores3 = new int[]{80,81,82};   //중괄호에 나열된 값 개수만큼 배열이 생성된다.
    System.out.println(scores3[2]);

    // 배열 변수 선언과 함께 값을 지정할 때 new int[] 명령을 생략할 수 있다.
    // 변수 선언에 어떤 종류의 메모리인지 지정되어 있기 때문에 생략이 가능한 것이다.
    int[] scores4 = {80,81,82};
    System.out.println(scores4[2]);

    //배열 변수 따로 초기화 명령 따로 작성 할 수 없다.
    int[] scores5;
    //scores5 = {80,81,82};           //illegal start of expression

    //배열 변수 따로 지정 할 때는 new int[]반드시 필요하다.
    scores5 = new int[]{80,81,82};

    //배열 선언할 때 값을 초기화시키는 명령이 있으면 배열 개수를 지정 할 수 없다.
    //초기화 명령{값,값,...}에서 메모리 개수를 자동 계산할 수 있기 때문이다.
    // int[] scores6 = new int[3]{100,100,100};               compile error













  }
}
