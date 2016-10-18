/*quiz:
자바 원시 타입과 String 이용하여 인터넷 온라인 서점에서 판매하는 도서 정보 한 개를
메모리에 저장하고 그 메모리의 값을 출력하라.
*/
package step03.test;

public class Test1 {
  public static void main(String[] args) {

    String title = "sprint";
    String publisher = "KingYoung";
    String language = "korean";
    String isbn = "11-123-11";
    String[] authors = {"mrhong","mrlee"};
    float width =225;
    float height =152;
    float thick =336;
    double price = 14800;
    boolean dvd = true;

    System.out.println(title);
    System.out.println(publisher);
    System.out.println(language);
    System.out.println(isbn);
    for (String name : authors) {
      System.out.print(name);
    }
    System.out.print("");
    System.out.println(authors[0]+" "+authors[1]);
    System.out.println(width);
    System.out.println(height);
    System.out.println(thick);
    System.out.println(price);
    System.out.println(dvd);

  }
}
