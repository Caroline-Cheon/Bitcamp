package step20.ex4;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class QuizClient {
  private static Scanner keyScan;

  public static void main(String[] args) throws Exception {
    try {
        keyScan = new Scanner(System.in);
        System.out.print("서버주소? ");
        String serverAddress = keyScan.nextLine();
//        @SuppressWarnings("resource")
        Socket socket = new Socket(serverAddress, 8888);
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
      
      System.out.println("이름을 입력해주세요");
      String name = keyScan.nextLine();
      out.println(name);

      // 환영인사를 수신받는다.
      String recvMsg = in.nextLine();
      System.out.println(recvMsg);
      
      // 테스트 시작
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
