//several parameter constructor
package step08;

public class Exam60_4 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book(){}

    Book(String title) {
      System.out.println("Book(String) 호출");
      this.title = title;
    }
    Book(String title, String author) {
      System.out.println("Book(String, String) 호출");
      this.title = title;
      this.author = author;
    }
    Book(String title, String author, int price) {
      System.out.println("Book(String, String, int) 호출");
      this.title = title;
      this.author = author;
      this.price = price;
    }
  }
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book("Java programming");
    Book b3 = new Book("Java programming", "hong gil dong");
    Book b4 = new Book("Java programming", "hong gil dong", 30000);
    //Book b5 = new Book(30000, 500);      imcompatible types: int cannot be converted to String
  }

}
