//array
package step06;

public class Exam54_0 {
  static void greeting(String[] names) {
    System.out.print("Hello, ");
    for (String name : names) {
      System.out.print(name + ",");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    greeting(new String[]{"Sally ", "Harry ", "Kate "});
  }
}
