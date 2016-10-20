/*문제
1) 숫자(약 -21억 ~ +21억)를 입력받아서
  컴퓨터에서 생성한 난수를 몇 개 포함하고 있는 지 세어라
   예) java Test02 1566874
출력 예:
난수: 6
개수: 2

*/
package test01;
public class Test06 {
  public static void main(String[] args) {
    int inputNumber = Integer.parseInt(args[0]);
    int randomNumber = (int)(Math.random() * 10);
    int count = 0;
    while (inputNumber > 0) {
      if (inputNumber % 10 == randomNumber) {
        count++;
      }
      inputNumber/= 10;
    }
    System.out.printf("난수: %d\n", randomNumber);
    System.out.printf("개수: %d\n", count);
  }
}
