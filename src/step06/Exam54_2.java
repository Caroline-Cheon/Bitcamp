//variable arguments -varargs
package step06;

public class Exam54_2 {
  static int sum(int[] values) {
    int result = 0;
    for (int value : values) {
      result += value;
    }
    return result;
  }
  static int sum2(int...values) {
    int result = 0;
    for (int value : values) {
      result += value;
    }
    return result;
  }
  public static void main(String[] args) {
    int result = sum(new int[]{100,100,100});
    System.out.println(result);
    System.out.println(sum(new int[]{90, 90, 90, 90, 90}));
    System.out.println("-------------------------");

    System.out.println(sum2(100,100,100));
    System.out.println(sum2(90, 90, 90, 90));
    System.out.println("-------------------------");

    System.out.println(sum2(new int[]{90, 90, 90, 90, 90}));


  }
}
