/* 주제: Mybatis를 이용하여 insert 실행
 */
package step29.ex3;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_insert {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex3/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    // db에 입력할 데이터를 준비
    Contact contact = new Contact();
    contact.setName("임꺽정");
    contact.setPosition("부장");
    contact.setTel("1212-5555");
    contact.setEmail("lee2@test.com");
    
    try {
      sqlSession.insert("insertContacts", contact);
      sqlSession.commit(); // 기본이 수동 커밋. 따라서 데이터베이스에 적용하라고 명령해야 한다.
      System.out.println("입력 성공!");
      
    } catch (Exception e) {
      System.out.println("입력 실패!");
    }
    
    sqlSession.close();
  }
}
