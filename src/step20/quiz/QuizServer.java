package step20.quiz;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class QuizServer {
  static class Stage {
    String stage;
    Stage yes;
    Stage no;
    
    public Stage(String stage) {
      this.stage = stage;
    }
    public void setStage(Stage a, Stage b) {
      this.yes = a;
      this.no = b;
    }
    public String toString() {
      return stage;
    }
  }
  
  static Stage[] stages;
  static Stage cursor;
  
  public static void main(String[] args) throws Exception {
    
    InitStage();
    
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    while (true) {
      try (
          Socket socket = serverSocket.accept();
          
          Scanner in = new Scanner(socket.getInputStream());
          PrintStream out = new PrintStream(socket.getOutputStream());
              
          Scanner keyScan = new Scanner(System.in);) {
        
        String messege = "성격 유형으로 알아보는 진로 탐색 테스트";
        out.println(messege);
        
        cursor = stages[0];
        while (true) {
          if ((cursor.yes) == null || (cursor.no) == null) {
            out.println("결과가 나왔습니다. : [ " + cursor + " ] 타입 ");
            out.println("quit");
            break;
          }
          out.println(cursor + "  선택해주세요(y/n) ");
          
          loop:
          while (true) {  //입력 값이 유효한지 검사하기
            String recvMsg = in.nextLine();
            switch (recvMsg.toLowerCase()) {
            
            case "y":
              cursor = cursor.yes;
              break loop;
            case "n":
              cursor = cursor.no;
              break loop;
            default:
              out.println("다시 선택해주세요(y/n)");
              break;
            }
          } //while y/n
        }
        socket.close();
        out.close();
        in.close();
        
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

  static void InitStage() {
    stages = new Stage[22];
    
    stages[0] = new Stage("비오는 날은 밖에 나가고 싶지 않다");
    stages[1] = new Stage("자주 길을 헤맨다");
    stages[2] = new Stage("주스보다 사이다가 좋다");
    stages[3] = new Stage("근처에 불이나면 반드시 구경하러 간다");
    stages[4] = new Stage("일기를 자주 쓰는 편이다");
    stages[5] = new Stage("동물과 식물을 사랑한다");
    stages[6] = new Stage("친구가 많은 편이다");
    stages[7] = new Stage("달걀프라이는 노른자를 터뜨리지 않는게 좋다");
    stages[8] = new Stage("계절 중 여름이 제일 좋다");
    stages[9] = new Stage("검정보다 빨강이 좋다");
    stages[10] = new Stage("높은 곳에 올라가도 무섭지 않다");
    stages[11] = new Stage("음악을 들을 때 리듬에 맞춰 발을 움직이다");
    stages[12] = new Stage("요리의 맛에 민감한 편이다");
    stages[13] = new Stage("신문이나 뉴스를 자주 보는 편이다");
    stages[14] = new Stage("미술관에 가는 것이 좋다");
    stages[15] = new Stage("남의 이야기를 잘 들어주는 편이다");
    stages[16] = new Stage("a");
    stages[17] = new Stage("b");
    stages[18] = new Stage("c");
    stages[19] = new Stage("d");
    stages[20] = new Stage("e");
    stages[21] = new Stage("f");
    
    stages[0].setStage(stages[1], stages[2]);
    stages[1].setStage(stages[3], stages[4]);
    stages[2].setStage(stages[4], stages[5]);
    stages[3].setStage(stages[8], stages[6]);
    stages[4].setStage(stages[6], stages[7]);
    stages[5].setStage(stages[7], stages[10]);
    stages[6].setStage(stages[8], stages[9]);
    stages[7].setStage(stages[9], stages[10]);
    stages[8].setStage(stages[13], stages[11]);
    stages[9].setStage(stages[11], stages[12]);
    stages[10].setStage(stages[12], stages[15]);
    stages[11].setStage(stages[14], stages[13]);
    stages[12].setStage(stages[14], stages[15]);
    stages[13].setStage(stages[16], stages[17]);
    stages[14].setStage(stages[18], stages[19]);
    stages[15].setStage(stages[20], stages[21]);
    stages[16].setStage(null, null);
    stages[17].setStage(null, null);
    stages[18].setStage(null, null);
    stages[19].setStage(null, null);
    stages[20].setStage(null, null);
    stages[21].setStage(null, null);
  }
}
