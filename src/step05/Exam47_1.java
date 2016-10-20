//subject:  
package step05;

public class Exam47_1 {
  public static void main(String[] args) {

    switch(args[0]){
    case "guest":
      System.out.println("You can only search");
    case "member":
      System.out.println("You can search, change, delete");
    case "manager":
      System.out.println("You can define member");
    default :
      System.out.println("No right");

    }
  }
}
