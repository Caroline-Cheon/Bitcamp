//overloading rule!!
package step08;

public class Exam60_5 {
  static class Book {
    String title;
    String author;
    String press;
    int price;
    int pages;

    Book(String title, String author) {
      System.out.println("Book(String, String) 호출");
      this.title = title;
      this.author = author;
    }
    //error
    //메서드를 찾을 때 넘겨주는 값의 타입과 개수로 찾는다
    //따라서 파라미터가 이름이 다르더라도 타입이 같으면
    //같은 메서드이기 때문에 선언될 수 없다
    Book(String title, String press) {
      System.out.println("Book(String, String) 호출");
      this.title = title;
      this.press = press;
    }

  }
  public static void main(String[] args) {

    Book b1 = new Book("Java programming", "hong gil dong");
    Book b2 = new Book("Java programming", "Bit press");

  }

}
