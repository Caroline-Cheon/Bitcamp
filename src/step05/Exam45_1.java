//subject:
package step05;

public class Exam45_1 {
  public static void main(String[] args) {
    int a = 10;
    {
      int b = 20;
      {
        int c = 30;
        System.out.printf("{%d,%d,%d}\n", a, b, c);
      }
      //System.out.printf("{%d,%d,%d}\n",a, b, c);
    }
    //System.out.printf("{%d,%d,%d}\n",a, b, c);
  }
}


/*
# 블록 안에 선언된 변수
- 블록 실행을 마치고 나가면 제거된다.
-
*/
