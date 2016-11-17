/* ver 5: 서버에 파일 데이터를 전송하라!
 * - 실행결과
 * 전송할 파일명? jls8.pdf
 * 전송할 파일명? jls8.pdf
 * 파일크기: 3,980,659
 * 파일을 전송하였습니다.
 */

package step20.ex3.v5;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);
    System.out.print("파일명? ");
    String fileName = keyScan.nextLine();
    
    File file = new File(fileName);
    System.out.printf("전송할 파일명: %s\n", file.getName());
    System.out.printf("전송할 파일크기: %,d\n", file.length());
    
    long starttime = System.currentTimeMillis();
    
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
    Socket socket = new Socket("localhost", 8888);
    Scanner socketIn = new Scanner(socket.getInputStream());
    DataOutputStream socketOut = new DataOutputStream(socket.getOutputStream());
    
    socketOut.writeUTF(file.getName());
    socketOut.writeLong(file.length());
    
    // 파일 끝에 도달할 때까지 읽는다.
    int b = 0;
    int count = 0;
    while((b = in.read()) != -1) {
      socketOut.write(b);
      if (count++ == 10000) {
        System.out.print(".");
        count = 0;
      }
    }
 
    System.out.println("파일을 전송하였습니다.");
    long finishtime = System.currentTimeMillis();
    System.out.println((finishtime - starttime) / 1000 + "초 걸렸습니다.");
    System.out.println(socketIn.nextLine());
    
    
    socketIn.close();
    socketOut.close();
    socket.close();
    
    in.close();
    keyScan.close();
  }

}