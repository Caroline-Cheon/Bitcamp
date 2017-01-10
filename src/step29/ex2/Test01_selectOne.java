/* 주제: Mybatis 사용하여 한 개의 데이터 선택
 */

package step29.ex2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectOne {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex2/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    Contact contact = sqlSession.selectOne("selectOneContacts", "aaa@test.com");
    
    if (contact != null) {
      System.out.printf("%s, %s, %s, %s\n",
          contact.getName(),
          contact.getPosition(),
          contact.getTel(),
          contact.getEmail());
    }
    sqlSession.close();
  }
}
