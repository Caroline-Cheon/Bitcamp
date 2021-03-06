/* 주제: File 클래스 사용법 - 파일 삭제하기
*/
package step18;

import java.io.File;

public class Exam94_3 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0 ) {
      System.out.println("사용법: java step18.Exam94_3 파일명");
      return;
    }
    File f1 = new File(args[0]);
    if (!f1.exists()) {
      System.out.println("파일이 존재하지 않습니다.");
      return;
    }
    f1.delete();
    System.out.println("파일을 삭제하였습니다.");
    
  }
}






