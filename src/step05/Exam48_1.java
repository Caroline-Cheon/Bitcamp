//subject:  while
package step05;

public class Exam48_1 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 10) {
      System.out.printf("%d: LoL\n", count);
      count++;
    }
    System.out.println("-----------------------");
    count = 0;
    while (count < 10) {
      System.out.printf("%d: LoL\n", count++);
    }
  }
}
