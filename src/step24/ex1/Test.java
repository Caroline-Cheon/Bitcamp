package step24.ex1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

import bitcamp.java89.ems.server.Command;

public class Test {
  static ArrayList<String> classnames = new ArrayList<>();
  
  public static void main(String[] args) throws Exception {
    File file = new File("C:\\Users\\BitCamp\\git\\Bitcamp-project\\bin");
    displayFilename(file);
  }

  private static void displayFilename(File dir) {
    if (!dir.isDirectory()) {
      return;
    }

    File[] files = dir.listFiles(new FileFilter(){
      @Override
      public boolean accept(File pathname) {
        if (pathname.isDirectory())
          return true;
        if (pathname.getName().endsWith(".class") && !pathname.getName().contains("$"))       //class파일중에서 innerclass제외
          return true;
        return false;
      }
    });
    for (File file : files) {
      if (file.isDirectory()) {
        displayFilename(file);
      } else {
        // 파일명에서 "\\"를 "/"로 바꿔서 OS 간의 차이가 없도록 한다.    //.class확장자 제거
        String path = file.getAbsolutePath().replaceAll("\\\\", "/").replaceAll(".class", ""); 
        // "패키지명 + 클래스명"만 추출
        int pos = path.indexOf("/bin/");
        
        try {
          // "패키지명 + 클래스명"에 해당하는 클래스 파일을 찾아서 Method Area 영역에 로딩한다.
          // => 리턴 값은 클래스 정보이다.
          Class c = Class.forName(path.substring(pos + 5).replaceAll("/", "."));
          
          // 로딩된 클래스가 Command 인터페이스 구현했는지 검사한ㄷ.
          // 이 클래스가 구현한 인터페이스 목록을 추출한다.
          Class[] interfaceList = c.getInterfaces();
          
          for (Class interfaceClass : interfaceList) {
            if (interfaceClass == Command.class) { //Command 인터페이스와 같은지 
              System.out.println(c.getName());
              break;
            }
          }
        } catch (Exception e) {
          // 만약 클래스를 로딩하지 못하면 무시한다.
        }
      }
    }
  }
}











