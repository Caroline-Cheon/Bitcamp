/*quiz:
클래스 문법을 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라.
*/
package step03.test;

public class Test2 {
// 새 데이터 타입을 정의한다.
  static class Book{
    String title;
    String publisher;
    String language;
    String isbn;
    String[] authors;
    float width;
    float height;
    float thick;
    double price;
    boolean dvd;
  }
  public static void main(String[] args) {

    //Book 데이터 타입에 따라 메모리(인스턴스)를 준비한다.
    Book b1 = new Book();
    //준비한 메모리(인스턴스) 안에 있는 변수에 값 저장
    b1.title = "sprint";
    b1.publisher = "KingYoung";
    b1.language = "korean";
    b1.isbn = "11-123-11";
    b1.authors = new String[] {"mrhong","mrlee"};
    b1.width = 225;
    b1.height = 152;
    b1.thick = 336;
    b1.price = 14800;
    b1.dvd = true;

    System.out.println("title = " + b1.title);
    System.out.println("publisher = " + b1.publisher);
    System.out.println("language = " + b1.language);
    System.out.println("isbn = " + b1.isbn);
    System.out.print("authors = ");
    for (String name : b1.authors) {
      System.out.print(name+" ");
    }
    System.out.println("");
    System.out.println("width = " + b1.width);
    System.out.println("height = " + b1.height);
    System.out.println("thick = " + b1.thick);
    System.out.println("price = " + b1.price);
    System.out.println("dvd = " + b1.dvd);

  }
}
