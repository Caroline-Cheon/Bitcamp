//subject:   If else
package step05;
public class Exam46_5 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 8)
      System.out.println("You are infant");
    else
      if (age >= 8 && age < 14)
        System.out.println("You are kid");
      else
        if (age >= 14 && age < 19)
          System.out.println("You are teenager");
        else
          if (age >= 19 && age < 40)
            System.out.println("You are youth");
            else
              if (age >= 40 && age < 60)
                System.out.println("You are just citizen");
              else
                System.out.println("You are elder");
  }
}
