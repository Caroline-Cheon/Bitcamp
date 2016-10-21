// upside centered star using method
/*
000*****000    * = 5   0 = (lineSize-starLength)/2
*/
package step06;

public class Exam52_2 {
  static void printCenteredStarsLine(int lineSize, int starLength) {
    if (starLength % 2 == 0) {
      starLength++;
    }
    if (indentLength % 2 == 0) {
      indentLength++;
    }
    int indentLength = (lineSize - starLength) / 2;
    int starCount = 0;
    int indentCount = 0;
    if (indentLength > 0) {
      while (indentCount++ < indentLength) {
        System.out.print("0");
      }
      while (starCount++ < starLength) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    printCenteredStarsLine(8, 5);

  }

}
