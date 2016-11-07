/* 주제: HashMap에서 값 꺼내기 - Value 목록 알아내기 
=> 
*/
package step17;

import java.util.*;
import java.util.Map.Entry;

public class Exam92_2 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
   
    map.put("s001","길동이");
    map.put("s002","꺽정이");
    map.put("s003","관순이");
    map.put("s004","중근이");
    map.put("s005","봉길이");

    Collection<String> valueList = map.values();

    for (String value : valueList) {
      System.out.printf("%s\n", value);
    }
  }
}






