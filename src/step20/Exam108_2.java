/* 주제: 스레드 프로그래밍 - 스레드 동기화
 * - 만약 스레드가 사용하는 객체가 다르다면,
 *   동시에 여러 synchronized 메서드에 진입할 수 있다.
 *   즉 객체 별로 진입을 관리한다.
 */
package step20;

public class Exam108_2 {
  
  public static void main(String[] args) throws Exception {
    String s1;
    String s2;
    String s3;
    String s4;
    
    s1 = "abc";
    s2 = "가가가";
    s3 = "하하하";
    s4 = "abc";
    System.out.printf("s1 = %d, s2 = %d, s3 = %d, s4 = %d\n", hash(s1), hash(s2), hash(s3), hash(s4));
    String[] v = new String[1000];
    
    v[hash(s1)] = s1;
    v[hash(s2)] = s2;
    v[hash(s3)] = s3;
    
    System.out.println("s2 = " + v[hash(s2)]);
    
  }
  
  static int hash(String input) {
    return input.hashCode() % 1000;
  }
}