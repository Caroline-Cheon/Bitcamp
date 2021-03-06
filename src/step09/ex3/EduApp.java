package step09.ex3;
import java.util.Scanner;

public class EduApp {
  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");
    TextBook[] textbooks = new TextBook[100];
    int length = 0;
    Scanner keyScan = new Scanner(System.in);

    while(true) {
      System.out.println("명령하세요, (보기:'add','list','view')");
      System.out.print("명령> ");
      String command = keyScan.nextLine();

      if(command.equals("add")) {addTextBookList(textbooks, length++);}
      else if(command.equals("list")) {printTextBookList(textbooks, length);}
      else if(command.equals("view")) {viewTextBookList(textbooks, length);}

      System.out.print("계속 명령하시겠습니까(Y/N)?");
      if(!keyScan.nextLine().equals("Y"))
        break;
    }
  }

  static void addTextBookList(TextBook[] textbooks, int length) {
    Scanner keyScan = new Scanner(System.in);
    TextBook textbook = new TextBook();

    System.out.print("책이름(ex: java's best practice)? ");
    textbook.title = keyScan.nextLine();

    System.out.print("저자(ex: mr.Nam)? ");
    textbook.author = keyScan.nextLine();

    System.out.print("출판사(ex: Dow)? ");
    textbook.press = keyScan.nextLine();

    System.out.print("출판년도(ex: 2016)? ");
    textbook.releaseDate = keyScan.nextLine();

    System.out.print("언어(ex: Korean)? ");
    textbook.language = keyScan.nextLine();

    System.out.print("설명(ex: Do you want to feel java from basic to OOP? ");
    textbook.description = keyScan.nextLine();

    System.out.print("쪽수(ex: 520)? ");
    textbook.page = Integer.parseInt(keyScan.nextLine());

    System.out.print("가격(ex: 30000)? ");
    textbook.price = Integer.parseInt(keyScan.nextLine());

    textbooks[length] = textbook;
    System.out.println();
  }



  static void printTextBookList(TextBook[] textbooks, int length) {
    for (int i = 0; i < length; i++) {
      TextBook textbook = textbooks[i];  // 이줄을 없애고 그냥  아래 식에서 textboos[i].title 이렇게 써도 된다.
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
    System.out.println("책이름을 입력하세요");
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
