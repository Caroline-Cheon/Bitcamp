//subject:   case and break
package step05;

public class Exam47_2 {
  public static void main(String[] args) {

    switch(args[0]){
    case "guest":
      System.out.println("You can only search");
      break;
    case "member":
      System.out.println("You can search, change, delete");
      break;
    case "manager":
      System.out.println("You can define member");
      break;
    default :
      System.out.println("No right");

    }
  }
}
