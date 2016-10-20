//subject:   If
package step05;

public class Exam46_0 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
/*
    if (age)   // int cannot be converted to boolean
      System.out.println("compile error");
*/
    if(age < 19) System.out.println(" You are minor");
    if(age >= 19) System.out.println(" You are adult");
  }
}
/*
 - Syntax
    if (term) statement;
    if (term) {
      statement1;
      statement2;
      .....
  }
         term should be boolean type
*/
