package step13.v2;

import java.util.Scanner;

public class BoxTest {
  static Scanner keyScan;
  static Box head;
  static Box tail;
  static int length;

  static {
    keyScan = new Scanner(System.in);
    head = new Box();
    tail = head;
    length = 0;
  }
  public static void main(String[] args) {

    loop:
    while(true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();

      switch(command) {
        case "add": doAdd(); break;
        case "list": doList(); break;
        case "get": doGet(); break;
        case "delete": doDelete(); break;
        case "quit": break loop;
        default :
          System.out.println("지원하지 않는 명령입니다.");
          break;
      }
    }
  }
  static void doAdd() {
    System.out.print("입력할 값? ");
    tail.value = Integer.parseInt(keyScan.nextLine());
    tail.next = new Box();
    tail = tail.next;
    length++;
  }
  static void doList() {
    Box cursor = head;
    while (cursor != null && cursor != tail) {
      if (cursor == head) {
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
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return;
    }
    Box cursor = head;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    System.out.println(cursor);
  }
  static void doDelete() {
    System.out.print("삭제할 값의 인덱스? ");
    int index = Integer.parseInt(keyScan.nextLine());
    if (index < 0 || index >= length) {
      System.out.println("인덱스가 유효하지 않습니다.");
      return;
    }
    if (index == 0) {
      head = head.next;
      length--;
      return;
    }
    Box cursor = head;

    for(int i = 0; i < (index - 1); i++) {
      cursor = cursor.next;
    }
    cursor.next = cursor.next.next;
    length--;
  }
}

/*

static void doDelete() {
  System.out.print("삭제할 값의 인덱스? ");
  int index = Integer.parseInt(keyScan.nextLine());
  if (index < 0 || index >= length) {
    System.out.println("인덱스가 유효하지 않습니다.");
    return;
  }
  Box currBox = head;
  Box prevBox = null;

  for(int i = 0; i < index; i++) {
    prevBox = currBox;
    currBox = currBox.next;
  }
  if (index == 0) {
    head = head.next;
  } else {
    prevBox.next = currBox.next;
  }
  length--;
}


*/
