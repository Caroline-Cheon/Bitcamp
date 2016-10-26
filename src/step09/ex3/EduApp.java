package step09.ex3;
import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("Welcome to Bitcamp Management System");
    TextBook[] textbooks = new TextBook[100];
    int length = 0;
    Scanner keyScan = new Scanner(System.in);

    while(true) {
      System.out.println("Order among 'add','list','view'");
      System.out.print("Order> ");
      String input = keyScan.nextLine();

      if(input.equals("add")) {addTextBookList(textbooks, length++);}
      else if(input.equals("list")) {printTextBookList(textbooks, length);}
      else if(input.equals("view")) {viewTextBookList(textbooks, length);}

      System.out.print("DO you want to keep ordering(Y/N)?");
      if(!keyScan.nextLine().equals("Y"))
        break;

    }
  }

  static void addTextBookList(TextBook[] textbooks, int length) {
    Scanner keyScan = new Scanner(System.in);
    TextBook textbook = new TextBook();

    System.out.print("title(ex: java's best practice)? ");
    textbook.title = keyScan.nextLine();

    System.out.print("author(ex: mr.Nam)? ");
    textbook.author = keyScan.nextLine();

    System.out.print("press(ex: Dow)? ");
    textbook.press = keyScan.nextLine();

    System.out.print("releaseDate(ex: 2016)? ");
    textbook.releaseDate = keyScan.nextLine();

    System.out.print("language(ex: Korean)? ");
    textbook.language = keyScan.nextLine();

    System.out.print("description(ex: Do you want to feel java from basic to OOP? ");
    textbook.description = keyScan.nextLine();

    System.out.print("page(ex: 520)? ");
    textbook.page = Integer.parseInt(keyScan.nextLine());

    System.out.print("price(ex: 30000)? ");
    textbook.price = Integer.parseInt(keyScan.nextLine());

    textbooks[length] = textbook;
    System.out.println();
  }



  static void printTextBookList(TextBook[] textbooks, int length) {
    System.out.println("BookList Count = " + length);
    for (int i = 0; i < length; i++) {
      TextBook textbook = textbooks[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%d,%d\n",
        textbook.title,
        textbook.author,
        textbook.press,
        textbook.releaseDate,
        textbook.language,
        textbook.description,
        textbook.page,
        textbook.price);
      System.out.println();
    }
  }
  static void viewTextBookList(TextBook[] textbooks, int length) {
    System.out.println("What is Book Title?");
    Scanner keyScan = new Scanner(System.in);
    String input = keyScan.nextLine();
    for(int i = 0; i <length;  i++) {
      TextBook textbook = textbooks[i];
      if(input.equals(textbook.title)) {
        
        System.out.println("-----------------------------------");
        System.out.printf("text: %s\n",textbook.title);
        System.out.printf("author: %s\n",textbook.author);
        System.out.printf("press: %s\n",textbook.press);
        System.out.printf("releaseDate: %s\n",textbook.releaseDate);
        System.out.printf("language: %s\n",textbook.language);
        System.out.printf("description: %s\n",textbook.description);
        System.out.printf("page: %d\n",textbook.page);
        System.out.printf("price: %d\n",textbook.price);
        System.out.println();

      }
    }
  }


}
