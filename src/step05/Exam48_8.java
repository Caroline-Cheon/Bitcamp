//subject:  while duplication
package step05;

public class Exam48_8 {
  public static void main(String[] args) {
    int rows = 1;
    int columns = 0;
    while(rows++ < 9) {
      while(columns++ < 9) {
        System.out.printf("%d * %d = %d\n", rows, columns, rows * columns);
      }
      System.out.println();
      columns = 0;
    }
  }
}
