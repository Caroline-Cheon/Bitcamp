//parameter constructor
package step08;

public class Exam60_3 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book(String title) {
      System.out.println("Book(String) 호출");
    }
  }
  public static void main(String[] args) {
    //Book b1 = new Book();    error
    Book b1 = new Book("what's going on");
  }

}
// constructor Book in class Book cannot be applied to give types;
