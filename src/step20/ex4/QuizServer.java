package step20.ex4;

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
        
        
        String recvMsg = in.nextLine();
       
        
        
        String messege = recvMsg + "님 환영합니다. 성격 유형으로 알아보는 진로 탐색 테스트를 시작합니다.";
        out.println(messege);
        
        cursor = stages[0];
        while (true) {
          if ((cursor.yes) == null || (cursor.no) == null) {
            out.println("결과가 나왔습니다. : [ " + cursor + " ]");
            out.println("quit");
            break;
          }
          out.println(cursor + "  선택해주세요(y/n) ");
          
          loop:
          while (true) {  //입력 값이 유효한지 검사하기
            recvMsg = in.nextLine();
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
    stages[16] = new Stage("A: 직장인 - [기자, 외교관, 펀드 매니저, 재무설계사] "
        + "(어떤 일에 있어서든 신중하게 조금씩 전진하는 타입으로 당신은 천천히 판단하면서 확실한 길을 찾아갑니다. "
        + "그 신중함은 주변의 신뢰를 얻는데 큰 도움이 됩니다.");
    stages[17] = new Stage("B: 창조자 - [작가, 쇼핑호스트, 프로그래머, 광고 기획자]"
                      + "(자신의 머릿속에서 번뜩이는 아이디어를 매우 간단히 실현할 수 있는 사람입니다. 주변의 의견 등에 "
                      + "상관없이 자기의 감각을 믿는 사람이기 때문에 여러 분야에 있어서 능력을 발휘할 수 있습니다.)");
    stages[18] = new Stage("C: 예술가 - [건축가, 디자이너, 지휘자, 무용가]"
                      + "(자기가 가진 재능을 통해 생각한 것을 실현하는 타입으로 또한 남들과는 다른 재능을 타고난 굉장히 "
                      + "운이 좋은 사람입니다. 자신이 흥미있는 일에 매달리다보면 반드시 성공할 수 있습니다.)");
    stages[19] = new Stage("D: 도전자 - [요리사, 고고학자, 스포츠 에이전트, 등산가]"
                      + "(사소한 것에서도 무엇인가 새로운 것을 발견할 줄 아는 사람입니다. 언제나 꾸준히 노력하며 누구도 "
                      + "하지 않는 일에 도전하여 언젠가는 세상을 깜짝 놀라게 할만한 일을 이루어 낼 것입니다.)");
    stages[20] = new Stage("E: 사람을 좋아하는 타입 - [행사 기확자, 사회복지사, 국제기구 종사자, 헤드헌터]"
                      + "(사람을 사귀는 것을 좋아하고, 매우 성격이 밝은 사람입니다. 다른 사람들을 위해 하는 일이라면 "
                      + "언제나 즐겁고 기쁜 마음으로 손을 내밉니다.)");
    stages[21] = new Stage("F: 현장에서 일하는 타입 - [영화감독, 운동선수, 동물조련사, 조경사]"
                      + "(무언가에 열중하고 있을 때 놀랄만한 파워를 발휘할 수 있는 사람입니다. 기분이 좋고 자신의 생각대로 "
                      + "일이 이루어질 때 최고의 재능을 발휘할 것입니다.)");
    
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
