/* 주제: 컬렉션 클래스 - ArrayList와 제네릭
=> ArrayList는 제네릭을 지원한다.
=> 저장할 데이터의 타입을 지정하지 않으면, 모든 타입을 다룰 수 있다.
=> 제네릭 문법을 사용하여 저장할 데이터의 타입을 제한할 수 있다.

*/

package step17;

import java.util.*;

public class Exam89_3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("길동이");   //okay
   // list.add(10); // error
   // list.add(3.14f); // error
   // list.add(new Score("임꺽정", 100, 100, 100));  // error
   // list.add(new Customer());  // error

    for (Object ref : list) {
      System.out.printf("%s => %s\n",
      ref.toString(), ref.getClass().getName());
    }
  }
}

// 길동이 => java.lang.String