/* 주제: CharaterStream 클래스 사용법 - BufferedReader
=> 버퍼 기능 + 한 줄 단위로 읽는 기능
*/
package step19;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Exam101_0 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("src/Exam01.java");
    BufferedReader in2 = new BufferedReader(in);

    String line;


    while ((line = in2.readLine()) != null) {
      System.out.println(line);
    }
    

    in2.close();
  }
}
