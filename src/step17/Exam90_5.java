/* 주제: 컬렉션 클래스 HashSet - 사용자가 정의한 클래스에 대해서도 중복 저장 막기
=> 같은 값에 대해 같은 해시값을 리턴하도록 
   hashCode() 메서드를 재정의하라!
=> 또한 같은 값에 대해 true를 리턴하도록
   equals() 메서드도 재정의해야 한다.
*/

package step17;

import java.util.*;

public class Exam90_5 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    
    String name = "홍길동";
    if (!list.contains(name))
      list.add(name);

    if (!list.contains(name))
      list.add(name);

    if (!list.contains(name))
      list.add(name);
    
    for (Object ref : list) {
      System.out.println(ref);
    }
    
  }
}






