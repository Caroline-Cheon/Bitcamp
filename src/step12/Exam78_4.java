 /*Class String - immutable(불변의)객체와 mutable객체
  스트링 인스턴스의 값은 한 번 생성되면 변경되지 않음
  Wrapper 인스턴스도 immutable이다.*/

package step12;

public class Exam78_4 {
   public static void main(String[] args) throws Exception {
    //Immutable example
    String s1 = "Hello, world!";
    String s2 = s1.replace('o','x');          //기존 스트링 문자'o'를 문자 'x'로 교체한 새 스트링 인스턴스를 만든다.

    System.out.println(s1);
    System.out.println(s2);

    //Mutable example
    StringBuffer buf1 = new StringBuffer("Hello, world");
    buf1.replace(2, 4, "xx");
    System.out.println(buf1);
    //replace(int start, int end, String str)
   }
}
/*
Hello, world!
Hellx, wxrld!
Hexxo, world
*/
