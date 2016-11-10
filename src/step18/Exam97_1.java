/* 주제: 버퍼의 사용 - 사용 전 읽기 시간, 읽는 데 걸리는 시간
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam97_1 {
  public static void main(String[] args) throws Exception{    
    FileInputStream in = new FileInputStream("temp/jls8.pdf");

    // 1970 년 1월 1일 0시 0분 0초 부터 경과된 밀리초
    long startMillis = System.currentTimeMillis();

    int count = 0;
    byte[] buf = new byte[8192];
    while (in.read(buf) != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n",count, endMillis - startMillis);

    in.close();
  }
}



//486: 2


