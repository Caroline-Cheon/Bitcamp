package step20.practice;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("에코 서버 시작");
    
    while (true) {
      try {
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다.");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        String message;
        do {
          message = in.nextLine();
          out.print("caroline" + message);
          
        } while(!message.toLowerCase().equals("quit"));
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {
        
      }
    }
    
  }
}
