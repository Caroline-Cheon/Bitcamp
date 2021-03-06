package step20.homework;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {

  public static void main(String[] args) {
    try {
      Scanner keyScan = new Scanner(System.in);

      System.out.print("서버 주소? ");
      String serverAddr = keyScan.nextLine();

      System.out.print("파일 경로? ");
      String fileName = keyScan.nextLine();

      Socket socket = new Socket(serverAddr, 8888);

      //보낼 파일 준비
      File file = new File(fileName);
      FileInputStream in = new FileInputStream(file);
      long fileSize = file.length();

      //서버로 보낼 도구 준비
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());

      byte[] bytes = new byte[8192];
      int len = 0;

      //파일 정보 보내기
      out.writeLong(fileSize);
      out.writeUTF(fileName);

      //파일 내용 보내기
      while ((len = in.read(bytes)) > 0) {  //파일에서 읽을 내용이 없을때까지 반복
        out.write(bytes, 0, len);  //읽은 만큼 보냄
      }

      System.out.println("서버에 전송을 완료했습니다.");

      out.close();
      in.close();
      socket.close();
      keyScan.close();
    } catch (FileNotFoundException e) { 
      System.out.println("입력하신 파일을 찾지 못했습니다.");
    } catch (Exception e) {
    }
  }
}