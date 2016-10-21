// upside star triangle using method
package step06;

public class Exam52_1 {
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  } //printStarsLine end

  public static void main(String[] args) {
    int count = 6;
    while (--count > 0) {
      printStarsLine(count);
    } //while end

    System.out.println("==========================");

    count = 0;
    while (count++ < 5) {
      printStarsLine(count);
    } //while end

  }   //main end
}//class end
