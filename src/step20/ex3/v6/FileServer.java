/* ver 6: 클라이언트가 보낸 파일을 저장하라!
 - java01/upload 폴더에 저장한다.
 - 실행 결과
 * 전송받은 파일명: jls8.pdf
 * 전송받은 파일크기: 3,980,659
 * 파일을 저장하였습니다.
 */

//힌트 : FileWriter와 FileOutputStream 중에서 가공하지 않고 저장할 것이기 때문에 후자 선택
package step20.ex3.v6;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    while (true) {
      Socket socket = ss.accept();
      long startMillis = System.currentTimeMillis();
      printClientInfo(socket);
      
      DataInputStream socketIn = new DataInputStream(socket.getInputStream());
      PrintStream socketOut = new PrintStream(socket.getOutputStream());
      
      
      String filename = socketIn.readUTF();
      long filesize = socketIn.readLong();
      
      System.out.printf("전송받은 파일명: %s\n", filename);
      System.out.printf("전송받은 파일크기: %d\n", filesize);
      
      FileOutputStream fileOut = new FileOutputStream("upload/" + filename);

      for ( long i = 0; i < filesize; i++) {
        fileOut.write(socketIn.read());
      }
      System.out.println("파일을 모두 읽었습니다.");

      fileOut.close();
      
      socketOut.println("저장완료");
      
      socketIn.close();
      socketOut.close();
      socket.close();
      
      long endMillis = System.currentTimeMillis();
      System.out.printf("요청처리시간: %d\n", endMillis - startMillis);
      
    }
  }

  private static void printClientInfo(Socket socket) {
    InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
    System.out.printf("클라이언트 IP: %s", socketAddress.getAddress());
    
  }

}
