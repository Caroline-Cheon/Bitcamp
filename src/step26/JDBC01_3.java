/* 주제: DBMS 에 연결하기 III
 * => 조건
 *    1) DBMS가 설치되어 있어야 한다.
 *    2) DBMS 서버가 실행되고 있다.
 *    3) JDBC 드라이버를 다운로드 하였다.
 *       java01/libs/mysql-connector-java-5.1.40-bin.jar
 *    4) 프로젝트 빌드 경로에 JDBC 드라이버를 추가한다.
 *       => 프로젝트 속성창 > Java Build Path > Libraries > Add JARs...
 *            > JAR 파일 선택창 > libs/mysql-xxx.jar 파일 선택
 *       => 프로젝트 빌드 경로에 JDBC 드라이버 파일(*.jar)을 추가하명
 *          그 JAR 파일에 들어있는 클래스를 사용할 수 있다.
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC01_3 {
  public static void main(String[] args) throws Exception {
    Connection con = null;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
     
      System.out.println("연결 성공!");
    } catch (Exception e) {
      e.printStackTrace();
      
    } finally {
      try {con.close();} catch(Exception e) {}
    }
  }
}
