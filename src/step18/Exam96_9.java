/* 주제: FileInputStream 클래스 사용법 - 다양한 타입의 데이터 읽기
=> FileInputStream을 기능 확장한다.
*/
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Exam96_9 {
  
  public static void main(String[] args) throws Exception{
    
    FileInputStream in = new FileInputStream("temp/Exam95_9.data");

    //System.out.printf("%1$d(%1$x)\n", b, b);
    
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    
    /*
    byte[] buf = new byte[5];
    in.read(buf);

    System.out.printf("%1$d(%1$x)\n", buf[0]);
    System.out.printf("%1$d(%1$x)\n", buf[1]);
    System.out.printf("%1$d(%1$x)\n", buf[2]);
    System.out.printf("%1$d(%1$x)\n", buf[3]);
    System.out.printf("%1$d(%1$x)\n", buf[4]);
    */
    in.close();
  }
}



/*
136(88)
153(99)
170(aa)
187(bb)
204(cc)
*/

/*
-120(88)
-103(99)
-86(aa)
-69(bb)
-52(cc)
*/






