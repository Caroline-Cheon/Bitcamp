package step06;

public class Exam52_31 {

  static void printStarsLine(int length) {
    int count = 0;
    while (count++ < length) {
      System.out.print("*");
    }
    System.out.println();
  }

  static void printCenterStarsLine(int lineSize, int starLength) {
    if (lineSize % 2 == 0) {
      lineSize += 1;
    }
    if (starLength > lineSize) {
      starLength = lineSize;
    }
    printBlanks(getBlankSize(lineSize, starLength));
    printStarsLine(starLength);
  }

  static int getBlankSize(int lineSize, int starLength) {
    return (lineSize - starLength) / 2;
  }

  static void printBlanks(int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(" ");
    }
  }

  public static void main(String[] args) {
    int count = 6;
    while (--count > 0) {
      printStarsLine(count);
    }
    System.out.println("-------------------------");
    for (int i = 1; i <= 9; i += 2) {
      printCenterStarsLine(9, i);
    }
  }
}
