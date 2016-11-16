/* 주제: CharaterStream 클래스 사용법 - LineNumberReader 사용법
=> LineNumberReader = BufferedReader + 줄 번호 카운트 기능
*/
package step19;

import java.io.FileInputStream;
import java.io.LineNumberReader;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;

public class Exam101_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("src/Exam01.java");
    InputStreamReader adapter = new InputStreamReader(in, "UTF-8");
    LineNumberReader in2 = new LineNumberReader(adapter);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.printf("%03d: %s\n", in2.getLineNumber(), line);
    }
    
    in2.close();
  }
}


/*
public class LineNumberReader extends BufferedReader

A buffered character-input stream that keeps track of line numbers. 
This class defines methods setLineNumber(int) and getLineNumber() 
for setting and getting the current line number respectively.
*/