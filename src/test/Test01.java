package test;

public class Test01 {
  static int s1 = 10;
  static int s2 = 20;
  int i1 = 30;
  boolean i2 = true;

  public static void main(String[] args) {
    static int l1 = 100;
    static int l2 = 200;

    Test01 l3;
    Test01 l4;

    l3 = new Test01();
    l4 = new Test01();
    l3 = new Test01(); // 기존의 l3에 들어 있던 주소가 삭제되기 때문에
                        // 기존 인스턴스는 가비지가 된다.
                        // 가비지는 JVM이 사용할 메모리가 부족할 때,
                        // JVM이 한가할 때 해제된다.
                        // 그래서 그 메모리 영역을 다른 인스턴스를 위해
                        // 사용할 수 있게 한다.

  }
}