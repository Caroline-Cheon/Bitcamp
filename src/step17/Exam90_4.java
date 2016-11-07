/* 주제: 컬렉션 클래스 HashSet - 사용자가 정의한 클래스에 대해서도 중복 저장 막기
=> 같은 값에 대해 같은 해시값을 리턴하도록 
   hashCode() 메서드를 재정의하라!
=> 또한 같은 값에 대해 true를 리턴하도록
   equals() 메서드도 재정의해야 한다.
*/

package step17;

import java.util.*;

public class Exam90_4 {
  public static void main(String[] args) {
    //HashSet<String> set = new HashSet<String>();
    //변수 선언부에 제네릭 정보가 있기 때문에, 인스턴스 생성하는 명령어에는 타입 생략가능
    HashSet<Customer> set = new HashSet<>();
    set.add(new Customer("홍길동", 20, false));
    set.add(new Customer("홍길동", 20, false));
    set.add(new Customer("홍길동", 20, false));
    for (Customer customer : set) {
      System.out.println(customer);
    }

    System.out.println("----------------");

    HashSet<Customer2> set2 = new HashSet<>();
    set2.add(new Customer2("홍길동", 20, false));
    set2.add(new Customer2("홍길동", 20, false));
    set2.add(new Customer2("홍길동", 20, false));
    for (Customer2 customer : set2) {
      System.out.println(customer);
    }
  }
}






