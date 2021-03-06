/* 주제: File 클래스 사용법 - FileFilter를 사용하기
*/
package step18;

import java.io.File;
import java.io.FileFilter;

public class Exam94_9 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0 ) {
      System.out.println("사용법: java step18.Exam94_9 디렉토리명");
      return;
    }
    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    File[] files = f1.listFiles(new MyFileFilter());

    for (File file : files) {
      System.out.println(file.getName());
    }
  }
    static class MyFileFilter implements FileFilter {
      public boolean accept(File pathname) {
        if (pathname.getName().endsWith(".java"))
          return true;
        return false;
      }
    }
  
}
