//variable arguments -varargs
package step06;

public class Exam54_3 {
  static void score(int[] values, String name) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s, your total score is %d.\n", name, sum);
  }
  // varags should not define variable more than one!!!!!compile error!
  /*
  static void score2(in... values, String name) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s, your total score is %d.\n", name, sum);
  }
  */
  static void score2(String name, int... values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    System.out.printf("%s, your total score is %d.\n", name, sum);
  }

  public static void main(String[] args) {
    score(new int[]{100, 90, 80}, "Karry");
    //score2(100, 90, 80, "Karry");  error!!
    score2("Karry", 100, 90, 80);
    score2("Harry", 100, 90, 80, 10, 5);

  }
}
//Array can take several parameter unlike varargs
