/* 주제: 버퍼의 사용 - FileInputStream을 확장하여 버퍼 기능 추가하기
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam97_2 {
  static class BufferedInputStream extends FileInputStream {
    byte[] buf = new byte[8192];
    int length;   // buf 에 저장되는 읽어온 파일의 길이
    int cursor;

    public BufferedInputStream(String path) throws FileNotFoundException {
      super(path);
    }
    @Override
    public int read() throws IOException {
      if (cursor == length) {      //버퍼에 읽을 데이터가 없다면, 파일에서 버퍼로 데이터를 읽어온다.
        length = super.read(buf);  //원래의 read() 를 사용하여 데이터를 읽어온다.
        cursor = 0;                //데이터를 새로 읽어왔으면 커서는 다시 0으로 초기화 시킨다.
        if (length == -1)          //만약 파일의 데이터를 다 읽었다면, 즉시 -1을 리턴하여, 
          return -1;               // 파일의 데이터를 모두 읽었음을 호출자에게 알린다.
      } 
      //파일에서 버퍼로 데이터를 퍼 왔으면, 버퍼에서 데이터를 하나 꺼내서 리턴한다.
      return buf[cursor++] & 0x000000FF; //맨 끝 1바이트 값만 유효하고 나머진 0으로
    }
  }

  public static void main(String[] args) throws Exception{    
    BufferedInputStream in = new BufferedInputStream("temp/jls8.pdf");

    long startMillis = System.currentTimeMillis();

    int count = 0;
    while (in.read() != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n",count, endMillis - startMillis);

    in.close();
  }
}

// 버퍼기능을 구현하는 것을 클래스로 만들어보자 --다음에 용이하게 이용하기위해
//3980659: 177



