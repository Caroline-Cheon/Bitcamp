// upside centered star using method
/*
000*****000    * = 5   0 = (lineSize-starLength)/2
*/
package step06;

public class Exam52_2 {
  static void printCenteredStarsLine(int lineSize, int starLength) {
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    if (starLength > lineSize) {
      starLength = lineSize;
    }
    int indentLength = (lineSize - starLength) / 2;

    int indentCount = 0;
    int starCount = 0;

    while (indentCount++ < indentLength) {
      System.out.print("0");
    }
    while (starCount++ < starLength) {
      System.out.print("*");
    }
    System.out.println();
  }


  public static void main(String[] args) {
    int starLength = 1;
    while (starLength < 10) {
      printCenteredStarsLine(9, starLength);
      starLength += 2;
    }

  }
}
