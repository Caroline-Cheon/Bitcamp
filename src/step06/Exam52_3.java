// upside centered star using method
/*
000*****000    * = 5   0 = (lineSize-starLength)/2
*/
package step06;

public class Exam52_3 {
  static void printCenteredStarsLine(int lineSize, int starLength) {
    if (lineSize % 2 == 0) {
      lineSize++;
    }
    if (starLength > lineSize) {
      starLength = lineSize;
    }
    printMargin(getMarginSize(lineSize, starLength));
    printStarsLine(starLength);

  }
  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }
  static int getMarginSize(int lineSize, int starLength) {
    return (lineSize - starLength) / 2;
  }
  static void printMargin(int length) {
    for (int i = 0; i <length; i++) {
      System.out.print(" ");
    }
  }

  public static void main(String[] args) {
    int starLength = 1;
    while (starLength <=9) {
      printCenteredStarsLine(9, starLength);
      starLength += 2;
    }
  }

}
