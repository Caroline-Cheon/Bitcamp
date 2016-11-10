/* 주제: FileInputStream 클래스 사용법 - read() 사용법
=> 다양한 타입의 데이터가 저장된 파일에서 바이트 배열로 데이터를 읽어와서
   값을 출력한다. 
*/
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam96_7 {
  static class MyFileStream extends FileInputStream {
    int index;
    int size;
    byte[] bytes;
    
    public MyFileStream(String path) throws Exception  {
      super(path);
      File tempFile = new File(path);
      size = (int)tempFile.length();
      bytes = new byte[size];
      size = read(bytes);
      // for(int i = 0; i < size; i++) {
      //   System.out.printf("%x ", bytes[i]);
      // }
    }

    public int read() {
      return bytes[index++];
    }

    public int read(byte[] bytes, int off, int length) {
      for (int i = off; i < off + length; i++) {
        bytes[i] = new Integer(read()).byteValue();
      }
      return length;
    }

    public int peek() {
      return bytes[index];
    }

  }

  public static void main(String[] args) throws Exception{
    
    MyFileStream in = new MyFileStream("temp/Exam95_7.data");

    String name = null;
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    boolean working = true;

    int leng = in.read() << 8;
    leng += in.read();

    byte[] buf = new byte[1024];
    in.read(buf, 0, leng);
    name = new String(buf, 0, leng, "UTF-8");
  
    kor = in.read() << 24;
    kor += in.read() << 16;
    kor += in.read() << 8;
    kor += in.peek();

    int tempNum = in.peek();
    int tempNum2 = in.read();

    eng = in.read() << 24;
    eng += in.read() << 16;
    eng += in.read() << 8;
    eng += in.read();

    math = in.read() << 24;
    math += in.read() << 16;
    math += in.read() << 8;
    math += in.read();

    sum = in.read() << 24;
    sum += in.read() << 16;
    sum += in.read() << 8;
    sum += in.read();

    working = in.read() == 1 ? true : false;

    System.out.printf("%s,%d,%d,%d,%d,%b\n",
      name, kor, eng, math, sum, working);

    System.out.println("임시숫자(국어)1 : " + tempNum + "    임시숫자2 : " + tempNum2);
    in.close();
  }
}


//String(byte[] bytes, int offset, int length, String charsetName)





