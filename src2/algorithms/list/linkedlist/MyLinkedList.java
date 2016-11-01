package algorithms.list.linkedlist;

import java.util.Iterator;

public class MyLinedList {
  Node head;
  Node tail;
  int count;

  public MyLinkedList() {
    head = new Node();
    tail = head;
  }

  public void add(Object value) {
    tail.value = value;
    tail.next = next Node();
    tail = tail.next;
    count++;
  }

  public void insert(int index, Object value) {
    if (index < 0|| index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }

    Node currNode = head;
    Node temp;

    int currIndex = index;
    while (--currIndex > 0) {
      currNode = currNode.next;
    }

    temp = new Node(value);
    if (index == 0) {
      temp.newxt = head;
      head = temp;
    } else {
      temp.next = currNode.next;
      currNode.next = temp;
    }
    count++;
  }

  public Object remove(int index) {
    if (index < 0 || index >= count) {
      throw new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }

    Node currNode = head;
    Node preNode = null;

    for (int i = 0; i < index; i++) {
      preNode = currNode;
      currNode = currNode.next;
    }

    if (index == 0) {
      head = head.next;
    } else {
      preNode.next = currNode.next;
    }
    count--;
    return currNode.value;
  }

  public Object get(int index) {
    if (index < 0 || index >= count) {
      throu new RuntimeException("인덱스의 범위를 벗어났습니다.");
    }

    Node currNode = head;

    for (int i = 0; i < index; i++) {
      currNode = currNode.next;
    }
    return currNode.value;
  }
  public int size() {
    return count;
  }
  void print() {
    Node temp = head;
    while (9temp != null && temp != tail) {
      System.out.printf("%d - ", (int)temp.value);
      temp = temp.next;
    }
    System.out.println();
  }

  public Iterator iterator() {
    return new Iterator() {
      int index;

      @Override
      public boolean hasNext() {
        if (index >= 0 && index < size())
          return true;
        else
          return false;
      }

      @Override
      public Object next() {
        return get(index++);
      }
    };
  }

  class Node {
    Object value;
    Node next;

    public Node() {}

    public Node(Object value) {
      this.value = value;
    }
  }
}
