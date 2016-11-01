 /*Wrapper class - primitive type(원시타입)의 값을 좀 더 다양하게 다룰 때 사용하는 클래스
 =>랩퍼 클리스도 스트링 클래스와 마찬가지고 Imuutable 객체이면서 equals*/

package step12;

public class Exam79_2 {
  public static void main(String[] args) throws Exception {
    int i1 = 10;
    Integer obj1 = i1;  //primitive type --> new Integer(i1) : autoboxing
    System.out.println(obj1.toString());

    Integer obj2 = new Integer(100);
    int i2 = obj2;     //Integer --> primitive type : autounboxing
    System.out.println(i2);   //obj2.intValue() 를 호출한 것과 같다.

    //intValue() : Returns the value of this Integer as an int.
   }
}
