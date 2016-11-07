/* 주제: 컬렉션 클래스 - ArrayList
=> 배열처럼 인덱스를 사용하여 데이터 목록을 다룰 수 있다.
*/

package step17;

import java.util.*;

public class Exam89_1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    // 1) 목록에 추가하기
    // => ArrayList는 인스턴스만 저장할 수 있다.
    // => primitive type? auto-boxing
    list.add("길동이");
    list.add(10); // new Interger(10) => 오토박싱
    list.add(3.14f); // new Float(3.14f) => 오토박싱
    list.add(new Score("임꺽정", 100, 100, 100));
    list.add(new Customer());

    for (int i = 0; i < list.size(); i++) {
      Object ref = list.get(i);
      System.out.printf("%s => %s\n",
      ref.toString(), ref.getClass().getName());
    }
  }
}

/*
길동이 => java.lang.String
10 => java.lang.Integer
3.14 => java.lang.Float
임꺽정,100,100,100,300,100.000000 => step17.Score
null,0,false => step17.Customer
*/
