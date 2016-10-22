// call by reference      값을 가지고 있는 주소를 넘기는 것이다.
package step06;

public class Testing {
  public static void main(String[] args) {

    String s1 = "Belly";
    String s2 = "Belly";
    String s3 = "Belly";

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }
    if (s1 == s3) {
      System.out.println("s1 == s3");
    }
  }
}
