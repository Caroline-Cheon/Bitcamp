
public class Exam052 {
  public static void main(String[] args) {
    System.out.println("aaa");

    { // 블록 안이라고 해서 특별할 것 없다.
      // 그냥 순서대로 실행된다.
      System.out.println("bbb");
    }

    System.out.println("ccc");
  }
}
