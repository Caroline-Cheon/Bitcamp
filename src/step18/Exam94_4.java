/* 주제: File 클래스 사용법 - 디렉토리의 파일 목록 뽑아내기
*/
package step18;

import java.io.File;

public class Exam94_4 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0 ) {
      System.out.println("사용법: java step18.Exam94_4 디렉토리명");
      return;
    }
    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    String[] filenames = f1.list();
    for (String filename : filenames) {
      File file = new File(f1.getPath() + "/" + filename);
      System.out.printf("%s %5d %s\n", (file.isDirectory() ? "d" : "-"), file.length(), filename);
    }

  }
}






