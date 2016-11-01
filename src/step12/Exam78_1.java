 /*Class String- 상수스트링 인스턴스 생성
 => 메모리 관리 효율성을 위해 같은 문자열에 대해 오직 한개의 스트링 인스턴스만 존재한다.
 */

package step12;

public class Exam78_1 {
   public static void main(String[] args) throws Exception {
    //상수스트링 인스턴스는 Constants Pool에 생성된다.  , 중복 x
    String s1 = "ABC";
    String s2 = "ABC";
  //이미 ABC가 상수풀에 존재하기 때문에 리턴하는 것은 위에서 만든 인스턴스 주소이다.
    if (s1 == s2) System.out.println("s1 == s2");
  }
}
/*
출력결과
s1 == s2
*/
