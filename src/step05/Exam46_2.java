//subject:   If
package step05;

public class Exam46_2 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 19) {
      System.out.println(" You are minor");
      System.out.println(" Adult should use ordinary card");
    }
    if (age >= 19) {
      System.out.println(" You are adult");
      System.out.println(" You cannot use teenagers'card ");
    }
  }
}
