/*문제
1) 밑변의 길이를 숫자로 입력 받아 트리를 출력하라.
   짝수 길이를 입력 받았으면 +1 하여 홀수 만들어 출력한다.
   예) java Test07 6
출력 예:
   *
  ***
 *****
*******
*/  // 7  4  9 5 11 6
package test01;
public class Test10 {
  public static void main(String[] args) {

    int distance = Integer.parseInt(args[0]);
    int spaceCount = distance / 2;
    int height = distance/2 + 1;
    if (distance % 2 == 0)
      distance++;


    for (int i = 1; i <= height ; i++) {
      for (int j = 1; j <= spaceCount ; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k < i*2 ; k++){
        System.out.print("*");
      }
      System.out.println();
      spaceCount--;
    }


  }
}
