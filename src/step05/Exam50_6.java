//subject:  for
package step05;

public class Exam50_6 {
  public static void main(String[] args) {
    for(int rows =2; rows < 10; rows++) {
      for(int columns =1; columns < 10; columns++) {
        System.out.printf("%d * %d = %d\n", rows, columns, rows*columns);
      }
      System.out.println();
    }
  }
}
