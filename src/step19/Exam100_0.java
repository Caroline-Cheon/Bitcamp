/* 주제: 바이트 스트림과 캐릭터 스트림 - 바이트 스트림 출력
=> InputStream/OutputStream 계열의 클래스
=> FileOutputStream은 바이트 그대로 출력

*/
package step19;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class Exam100_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam100_0.data");
    
    String str = "ABCabc012가각간"; //UTF-16 인코딩으로 char[] 배열에 저장된다.
    //char[] value = {0041 0042 0043 0061 0062 0063 0030 0031 0032 ac00 ac01 ac04};

    //byte[] bytes = str.getBytes("UTF-16");
    byte[] bytes = str.getBytes("UTF-8");

    out.write(bytes);

    out.close();
  }
}


/*
getBytes()
Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.

getBytes(Charset charset)
Encodes this String into a sequence of bytes using the given charset, storing the result into a new byte array.
<UTF-8>
  Offset: 00 01 02 03 04 05 06 07 08 09 0A 0B 0C 0D 0E 0F 	
00000000: 41 42 43 61 62 63 30 31 32 EA B0 80 EA B0 81 EA    ABCabc012j0.j0.j
00000010: B0 84
<UTF-16>
  Offset: 00 01 02 03 04 05 06 07 08 09 0A 0B 0C 0D 0E 0F 	
00000000: FE FF 00 41 00 42 00 43 00 61 00 62 00 63 00 30    ~..A.B.C.a.b.c.0
00000010: 00 31 00 32 AC 00 AC 01 AC 04                      .1.2,.,.,.
*/



