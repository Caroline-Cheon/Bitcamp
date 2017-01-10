/* 주제: 도메인 객체를 사용하여 update 실행
 */
package step29.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_update {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // db에 입력할 데이터를 준비
    Contact contact = new Contact();
    contact.setName("임꺽정3");
    contact.setPosition("부장2");
    contact.setTel("1212-55552");
    contact.setEmail("lee2@test.com");;
    
    int count = sqlSession.update("updateContacts", contact);
    sqlSession.commit(); // 기본이 수동 커밋. 따라서 데이터베이스에 적용하라고 명령해야 한다.
    
    if (count == 1) {
      System.out.println("변경 성공!");
    } else {
      System.out.println("변경 실패!");
    }
    
    sqlSession.close();
  }
}
