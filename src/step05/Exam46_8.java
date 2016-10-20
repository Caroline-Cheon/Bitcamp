//subject:   If else arrangement
package step05;
public class Exam46_8 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 8) {
      if (age < 2)
        System.out.println("You are super baby");
    } else
      System.out.println("You are kid");

  }
}
// You can arrange else if together at the same line
