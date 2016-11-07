/* 주제: 컬렉션 클래스 HashSet - 데이터 저장과 꺼내기
=> 순서는 유지하지 못한다.
=> toArray()를 통해 값을 보관한 배열을 얻을 수 있다.
   간접적으로 배열 인덱스를 이용하여 값을 꺼낼 수 있다.
   그러나 순서는 보장하지 않는다.
=> 순서를 보장하지 않는 이유? 
   - 저장하는 방법이 다르다.
   - 인스턴스가 리턴한 해시 값(hashCode()메서드의 리턴값)을 가지고 
     저장할 위치를 계산하기 때문이다.
*/


package step17;

import java.util.*;

public class Exam90_1 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();

    set.add("길동이");
    set.add("꺽정이");
    set.add("관순이");
    set.add("중근이");
    set.add("봉길이");
    
    Object[] values = set.toArray();

    for (int i = 0; i < values.length; i++) {
      System.out.println(values[i]);
    }
    
  }
}






