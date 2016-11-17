package step20.quiz;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class QuizClient {
  public static void main(String[] args) throws Exception {
    try (
        Socket socket = new Socket("127.0.0.1", 8888);
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
            
        Scanner keyScan = new Scanner(System.in);) {
      
      String recvMsg = in.nextLine();
      System.out.println(recvMsg);
      
//      recvMsg = in.nextLine();
//      System.out.println(recvMsg);
      
      while (true) {
        recvMsg = in.nextLine();
        System.out.println(recvMsg);
        
        System.out.print("답변) ");
        String message = keyScan.nextLine();
        
        out.println(message);
      }
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
