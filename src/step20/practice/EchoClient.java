package step20.practice;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
  public static void main(String[] args) throws Exception{
    Scanner keyScan = new Scanner(System.in);
    
    System.out.println("서버주소는?");
    String serverAddr = keyScan.nextLine();
    
    Socket socket = new Socket(serverAddr, 8888);
    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());
    
    String message;
    do {
      System.out.print("입력> ");
      message = keyScan.nextLine();
      out.print(message);
      System.out.println(in.nextLine());
    } while(!message.toLowerCase().equals("quit")); {}
    
    out.close();
    in.close();
    socket.close();
    keyScan.close();
  }
}
