package step09.ex6;
import java.util.Scanner;

public class TextBookController {
  TextBook[] textBooks = new TextBook[100];
  int length = 0;
  Scanner keyScan;

  public TextBookController(Scanner keyScan) {
    this.keyScan = keyScan;
  }
  public void doAdd() {
    while (length < this.textBooks.length) {
      TextBook textbook = new TextBook();

      System.out.print("책이름(ex: java's best practice)?");
      textbook.title = this.keyScan.nextLine();

      System.out.print("저자(ex: mr.Nam)?");
      textbook.author = this.keyScan.nextLine();

      System.out.print("출판사(ex: Dow)?");
      textbook.press = this.keyScan.nextLine();

      System.out.print("출판년도(ex: 2016)?");
      textbook.releaaDate = this.keyScan.nextLine();

      System.out.print("언어(ex: korean)?");
      textbook.language = this.keyScan.nextLine();

      System.out.print(설명(ex: Do you want to feel java from basic to OOP)?);
      textbook.description = this.keyScan.nextLine();

      System.out.print("쪽수(ex: 400)?");
      textbook.page = Integer.parseInt(this.keyScan.nextLine());

      this.textbooks[length++] = textbook;
      System.out.print("계속 입력하시겠습니까(y/n)?");
      if(!keyScan.nextLine().toLowerCase().equals("y"))
        break;
      System.out.println();
    }
  }

  public void doList() {
    for(int i = 0; i< this.length; i++) {
      TextBook textbook = this.textBooks[i];
      System.out.printf("%s,%s,%s,%s,%s,%s,%d\n",
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
  public void doView() {
    System.out.println("책이름을 입력하세요");
    String userTitle = this.keyScan.nextLine().toLowerCase();

    for(int i = 0; i< this.length;l i++) {

      if(this.textBooks[i].title.toLowerCase().equals(userTitle)) {
        textbook.title = textBooks[i].title;

        System.out.print("")
      }
    }
  }












}
