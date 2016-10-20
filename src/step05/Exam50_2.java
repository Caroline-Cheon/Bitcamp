//subject:  do while
package step05;

public class Exam50_2 {
  public static void main(String[] args) {
    int count = 0;
    for (; count < 3; count++)
      System.out.printf("%d: cup\n",count);
    System.out.println("------------------");

    count = 0;
    for (; count < 3;) {
      System.out.printf("%d: cup\n",count);
      count++;
    }
    System.out.println("------------------");

    count = 0;
    for (;;) {
      if (count >= 3)
        break;
      System.out.printf("%d: cup\n",count);
      count++;
    }
  }
}
