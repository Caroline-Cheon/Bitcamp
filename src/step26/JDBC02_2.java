/* 주제: 데이터 목록 가져오기 II
 * => 여러 개 데이터 가져오기
 * => next()가 true를 리턴하면 서버에서 결과를 가져왔다는 것이고,
 *    false를 리턴하면 서버에서 결과를 가져오지 못했다는 것이다.
 *    리턴 값을 검사하여 결과를 처리한다.
 *     
 */
package step26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBC02_2 {
  public static void main(String[] args) throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    try (
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", "java89", "1111");
        // java.sql.Connection 구현체로부터 SQL 문을 서버에 전달할 객체를 얻는다.
        // => 리턴 값: java.sql.Statement 구현체
        Statement stmt = con.createStatement();
        // SQL을 서버에 전달한다.
        // => 리턴 값: java.sql.ResultSet 구현체
        // => 주의! 리턴하는 객체에 모든 결과가 들어 있는 것이 아니다.
        //           서버에 생성된 결과를 가져오는 역할을 한다.
        //           결과를 가져온 것이 아니다!!
        ResultSet rs = stmt.executeQuery("select position, name, tel, email from ex_contacts");){
      
      while (rs.next()) {  // 서버에서 레코드 한 개를 가져왔다면,
        System.out.printf("%s, %s, %s, %s\n",
            rs.getString("name"),
            rs.getString("position"),
            rs.getString("tel"),
            rs.getString("email"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
}
