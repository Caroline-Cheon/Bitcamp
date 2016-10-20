//subject:  while duplication
package step05;

public class Exam48_6 {
  public static void main(String[] args) {
    int count = 0;
    int starCount = 0;
    while(count++ < 5) {
      while (starCount++ < count) {
        System.out.print("*");
      }
      System.out.println();
      starCount = 0;
    }

  }
}
/*
#코딩순서
1) 1~5까지 반복하는 while 문을 작성하라
  반복할 때 마다 현재의 숫자를 출력하라
2) '*'문자를 다섯번 찍는 반복문을 안에 작성하라!
  */
