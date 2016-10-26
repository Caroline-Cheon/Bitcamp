package step09.test;

public class TextBook {
  String title;
  String author;
  int price;

  public TextBook(){
    this("자바의 정석", "남궁성", 20000);
  }

  public TextBook(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }
}
