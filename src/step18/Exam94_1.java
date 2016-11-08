/* 주제: File 클래스 사용법 - 파일 정보 다루는 방법
*/
package step18;

import java.io.File;

public class Exam94_1 {
  public static void main(String[] args) throws Exception {
    
    File f1 = new File("test.txt");
    boolean b = f1.exists();
    System.out.println(b);

    File f2 = new File("../intro/Hello.java");
    System.out.println(f2.exists());
    System.out.println(f2.getName());
    System.out.println(f2.getAbsolutePath());
    System.out.println(f2.getCanonicalPath());
    System.out.println(f2.getPath());
    System.out.println(f2.length());
    System.out.println(f2.isFile());
    System.out.println(f2.isDirectory());

  }
}
/*
true
true
Hello.java
C:\workspace\java01\..\intro\Hello.java
C:\workspace\intro\Hello.java
..\intro\Hello.java
106
true
false
*/






