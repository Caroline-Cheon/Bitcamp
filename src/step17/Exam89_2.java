/* 주제: 컬렉션 클래스 - ArrayList와 for(;)문
=> for(변수선언 : 배열 또는 컬렉션 객체)
=> 컬렉션 객체? 
   java.lang.Iterable 따라 작성된 클래스를 말한다.
   예) ArrayList, LinkedList, Vector, HashSet, Stack etc

*/

package step17;

import java.util.*;

public class Exam89_2 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add("길동이");
    list.add(10); // new Interger(10) => 오토박싱
    list.add(3.14f); // new Float(3.14f) => 오토박싱
    list.add(new Score("임꺽정", 100, 100, 100));
    list.add(new Customer());

    for (Object ref : list) {
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
