 /*Class String- 인스턴스 생성
 */

package step12;

public class Exam78_0 {
   public static void main(String[] args) throws Exception {
    //스트링 인스턴스는 Heap에 저장
    String s1 = new String("ABC");
    String s2 = new String("ABC");

    if (s1 == s2) System.out.println("s1 == s2");
  }
}
