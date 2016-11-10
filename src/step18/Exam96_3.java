/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 1바이트 읽기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam96_3 {
  public static void main(String[] args) throws Exception{
    
    FileInputStream in = new FileInputStream("temp/Exam95_3.data");

    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());

    in.close();
  }
}






