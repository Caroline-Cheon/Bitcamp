/* 주제: 네트워킹 프로그래밍 소개 - echo server 만들기(Thread 적용)
 * - 
*/
package step20.ex7;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("에코 서버 시작!");
    
    while (true) {
//      Socket socket = ss.accept();
//      MyThread t = new MyThread(socket);
//      t.start(); 
      new MyThread(ss.accept()).start();
      
    } //while
  } //main
  static class MyThread extends Thread {
    Socket socket;
    public MyThread(Socket socket) {
      this.socket = socket;
    }
    public void run() {
      try {
        // 대기열에서 기다리고 있는 클라이언트들 중에서 한 개의 클라이언트 접속을 승인한다.
        System.out.println("클라이언트와 연결되었습니다.----------------------");
   
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        // 1) 클라이언트가 보낸 메세지를 읽는다.
        String message = null;
        do {
          message = in.nextLine();  // 클라이언트가 보낸 메세지를 읽는다.
          out.println("IamNewbie:" + message); // 클라이언트에게 메세지를 그래도 돌려준다.
        } while (!message.toLowerCase().equals("quit"));
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {
        // 예외 무시? 일단 네트워킹 프로그래밍 테스트
      }
    }
  }
}
