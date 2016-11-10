/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 바이트 배열로 데이터를 읽어오기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam96_4 {
  public static void main(String[] args) throws Exception{
    
    FileInputStream in = new FileInputStream("temp/Exam95_4.data");

    byte[] buf = new byte[1024];

    int len = in.read(buf);

    for (int i = 0; i < len; i++) {
      System.out.printf("%x,", buf[i]);
    }
    System.out.println();
    
    in.close();
  }
}






