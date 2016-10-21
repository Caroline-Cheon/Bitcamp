/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!
   예) java Test02 1566874
출력 예:
최대 값: 8
최소 값: 1

*/
package test01;

public class Test05 {
  public static void main(String[] args){
    int fullNumber = Integer.parseInt(args[0]);    //ex.45328
    int maxNum = fullNumber % 10,  //8
        minNum = maxNum;       //8
    fullNumber /= 10;  //4532
    int digit = 0;
    while (fullNumber > 0) {
      digit = fullNumber % 10;
      if (digit > maxNum)
        maxNum = digit;
      if (digit < minNum)
        minNum = digit;
      fullNumber /= 10;
    }
    System.out.printf("최대 값: %d\n", maxNum);
    System.out.printf("최소 값: %d\n", minNum);
  }
}
