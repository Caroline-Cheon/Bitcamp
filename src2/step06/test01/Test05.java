/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서 그 숫자 중에 최대 값과 최소 값을 찾아라!
   예) java Test02 1566874
출력 예:
최대 값: 8
최소 값: 1

*/
package step06;

public class Test05 {
  public static void main(String[] args){
    int number = Integer.parseInt(args[0]);    //ex.45328
    int maxNum = number % 10,  //8
        minNum = maxNum;       //8
    number /= 10;  //4532
    int remainder = 0;
    while (number > 0) {
      remainder = number % 10;
      if (remainder > maxNum)
        maxNum = remainder;
      if (remainder < minNum)
        minNum = remainder;
      number /= 10;
    }
    System.out.printf("최대 값: %d\n", maxNum);
    System.out.printf("최소 값: %d\n", minNum);
  }
}
