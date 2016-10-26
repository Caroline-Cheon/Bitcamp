package step09.ex3;
import java.util.Scanner;

public class EduApp2 {

  static TextBook[] textbooks = new TextBook[100];
  static int length = 0;
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("비트캠프 관리시스템에 오신 걸 환영합니다.");
    loop:
    while(true) {
      System.out.println("명령하세요, (보기:'add','list','view','quit')");
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch (command) {
        case "add": doAdd(); break;
        case "list": doList(); break;
        case "view": doView(); break;
        case "quit": System.out.println("굿바이"); break loop;
        default :
          System.out.println("지원하지 않는 명령입니다.");
          break;
      }

      System.out.print("계속 명령하시겠습니까(y/n)?");
      if(!keyScan.nextLine().toLowerCase().equals("y"))
        break;
    }
  }

  static void doAdd() {
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

    textbooks[length++] = textbook;
    System.out.println();
  }



  static void doList() {
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
  static void doView() {
    System.out.println("책이름을 입력하세요");
    String input = keyScan.nextLine().toLowerCase();
    for(int i = 0; i <length;  i++) {

      if(textbooks[i].title.toLowerCase().equals(input)) {
        System.out.println("-----------------------------------");
        System.out.printf("text: %s\n",textbooks[i].title);
        System.out.printf("author: %s\n",textbooks[i].author);
        System.out.printf("press: %s\n",textbooks[i].press);
        System.out.printf("releaseDate: %s\n",textbooks[i].releaseDate);
        System.out.printf("language: %s\n",textbooks[i].language);
        System.out.printf("description: %s\n",textbooks[i].description);
        System.out.printf("page: %d\n",textbooks[i].page);
        System.out.printf("price: %d\n",textbooks[i].price);
        System.out.println();
        break;
      }
    }
  }


}
