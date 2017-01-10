/* 주제: Mybatis 사용하여 한 개의 데이터 선택
 */

package step29;

import java.io.InputStream;
import java.util.Map;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectOne {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    Map record = sqlSession.selectOne("selectOneContacts", "aaa@test.com");
    
    if (record != null) {
      System.out.printf("%s, %s, %s, %s\n",
          record.get("name"),
          record.get("posi"),
          record.get("tel"),
          record.get("email"));
    }
    
    //4. SqlSession 사용 후 닫는다.
    sqlSession.close();
  }
}
