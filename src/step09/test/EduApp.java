package step09.test;
import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");
    Scanner keyScan = new Scanner(System.in);
    TextBook textBook = new TextBook();

    System.out.print("title(ex:java)? ");
    textBook.title = keyScan.nextLine();

    System.out.print("author(ex:emily)? ");
    textBook.author = keyScan.nextLine();

    System.out.print("price(ex:20000)? ");
    textBook.author = keyScan.nextLine();

    System.out.printf("title: %s\n", textBook.title);
    System.out.printf("author: %s\n", textBook.author);
    System.out.printf("price: %s\n", textBook.price);
  }
}
