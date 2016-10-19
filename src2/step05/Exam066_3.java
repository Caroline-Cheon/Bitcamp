package step05;

public class Exam066_3 {
  public static void main(String[] args) {

    int count = 0;
    int i = 0;
    while (count++ < 10) {
      System.out.println(i);
      i++;
      if (i > 5) {
        break;
      }
    }
  }
}
