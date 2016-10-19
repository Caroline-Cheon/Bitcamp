package step05;

public class Exam071 {
  public static void main(String[] args) {

    ohora: // ohora의 적용 범위는 한 문장 또는 한 블록이다.
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 4; j++) {
        if (i == 5)
          break ohora; // ohora 블록을 탈출한다.
        System.out.printf(">%d\n", j);
      }
      System.out.printf("[%d]\n", i);
    }


  }
}
