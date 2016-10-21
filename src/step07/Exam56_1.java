//  subject: instance and reference  -string

package step07;

public class Exam56_1{
  public static void main(String[] args) {

    String s1;
    s1 = new String("Belly");
    String s2 = s1;
    String s3 = s2;

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }
    if (s1 == s3) {
      System.out.println("s1 == s3");
    }
  }
}
