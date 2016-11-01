/*값을 저장할 때 사용할 메모리를 정의한다*/
package step13.v2;
import java.util.Scanner;

public class BoxTest {
  static Scanner keyScan = new Scanner(System.in);

  static Box head;
  static Box tail;
  static int count;

  public static void main(String[] args) {

    head = new Box();
    tail = head;
    count = 0;

    while(true) {
    System.out.print("명령> ");
    String command = keyScan.nextLine().toLowerCase();

    switch (command) {
      case "add": doAdd(); break;
      case "list": doList(); break;
      case "get": doGet(); break;
      default :
        System.out.println("지원하지 않는 명령입니다.");
        break;
      }
    }
  }
  static void doAdd() {
    System.out.print("입력할 값? ");
    int input = Integer.parseInt(keyScan.nextLine());
    tail.value = input;
    tail.next = new Box();
    tail = tail.next;
    count++;
  }
  static void doList() {
    Box cursor = head;
    while(cursor != null && cursor != tail) {
      if(cursor == head ) {
        System.out.print(cursor);
      } else {
        System.out.print(" - " + cursor);

      }
      cursor = cursor.next;
    }
    System.out.println();
  }
  static void doGet() {
    System.out.print("인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }
    Box currBox = head;
    for (int i = 0; i < index; i++) {
      currBox = currBox.next;
    }

     System.out.println(currBox);
  }
}
