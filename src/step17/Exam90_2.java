/* 주제: 컬렉션 클래스 HashSet - 데이터 중복 불가!
왜?
Set이다. 집합이다. 집합의 특성 상 중복 값을 허용하지 않는다.
*/

package step17;

import java.util.*;

public class Exam90_2 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();

    set.add("길동이");
    set.add("꺽정이");
    set.add("관순이");
    set.add("중근이");
    set.add("봉길이");
    set.add("길동이");
    set.add("꺽정이");
    
     for (String name : set) {
      System.out.println(name);
    }

    System.out.println("----------------");

    ArrayList<String> list = new ArrayList<String>();

    list.add("길동이");
    list.add("꺽정이");
    list.add("관순이");
    list.add("중근이");
    list.add("봉길이");
    list.add("길동이");
    list.add("꺽정이");
    
    for (String name : list) {
      System.out.println(name);
    }
    
  }
}






