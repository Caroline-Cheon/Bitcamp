package test;

public class Book implements Sequence {
  private String name;
  private String press;
  private int price;

  private int sequenceIndex;

  public Book(String name, String press, int price) {
    this.name = name;
    this.press = press;
    this.price = price;
  }

  //인터페이스 메소드 구현
  public void indexReset() {
    sequenceIndex = 0;
  }
  public void next() {
    sequenceIndex++;
  }
  public Object get() {
    switch (sequenceIndex) {
    case 0:
      return name;
    case 1:
      return press;
    case 2:
      return price;
    default:
      return "범위 초과";
    }
  }
  public String getClassInfo() {
    return "책 정보 클래스";
  }
  public int getSequenceSize() {
    return 3;
  }
}
