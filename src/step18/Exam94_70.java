/* 주제: File 클래스 사용법 - FilenameFilter를 사용하기 후
*/
package step18;

import java.io.File;
import java.io.FilenameFilter;

public class Exam94_70 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam94_7 디렉토리명");
      return;
    }
    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    File[] files = f1.listFiles(new FilenameFilter(){
      public boolean accept(File dir, String name) {
        if (name.endsWith(".java"))
          return true;
        return false;
      }
    });

    for (File file: files) {
      System.out.printf("%s\n", file.getName());
    }
  }


}






