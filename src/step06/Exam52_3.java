// upside centered star using method
/*
000*****000    * = 5   0 = (lineSize-starLength)/2
*/
package step06;

public class Exam52_3 {
  static void printCenteredStarsLine(int lineSize, int starLength) {
    if (starLength % 2 == 0) {
      starLength++;
    }
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    int indentLength = (lineSize - starLength) / 2;
    int starCount = 0;
    int indentCount = 0;
    if (indentLength > 0) {
      while (indentCount++ < indentLength) {
        System.out.print(" ");
      }
      while (starCount++ < starLength) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void printBlanks(int length) {
    for (int i = 0; i <length; i++) {
      System.out.print(" ");
    }
  }
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int count = 1;
    while (count <= a) {
      printCenteredStarsLine(a, count);
      count += 2;
    }

  }

}
