/*문제
1) 밑변의 길이와 방향을 입력 받아 직각 삼각형을 출력하라.
예) java Test07 6 역
출력 예:
******
*****
****
***
**
*

예) java Test07 6 순
*
**
***
****
*****
******

*/
package test01;
public class Test09 {
  public static void main(String[] args) {
    int distance = Integer.parseInt(args[0]);
    String direction = args[1];

    if (direction.equals("순")) {
      for(int i = 0; i < distance; i++) {
        for(int j = 0; j < i + 1; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }else if (direction.equals("역")) {
      for(int i = distance; i > 0; i--) {
        for(int j = 0; j < i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }else
      System.out.println("Input correct distance and direction");
  }
}
