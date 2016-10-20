//subject:  while duplication
package step05;

public class Exam48_5 {
  public static void main(String[] args) {
    int count = 0;
    int count2 = 0;
    coffee:
    while (count++ < 5) {
      while (count2++ < 3) {
        System.out.println("*****");
        if (count > 2)
          break coffee;
      }
      count2 = 0;
      System.out.println("----------------");
    }

  }
}
