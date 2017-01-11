/* 주제: 학생 데이터 조인 결과 가져오기
   => 주의!
      StudentMapper.xml에서 "select" 아이디를 가진 SQL이 있고,
      TcherMapper.xml에도 "select" 아이디를 가진 SQL이 있다.
      네임스페이스 이름가 함께 SQL 아이디를 적어 구분하라!
 */

package step29.ex4;

import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01_selectList {
  public static void main(String[] args) throws Exception {
    InputStream in = Resources.getResourceAsStream("step29/ex4/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
    List<Student> list = sqlSession.selectList("student.select");
    
    for (Student student: list) {
      System.out.printf("%s, %s, %s, %s, %b, %s, %s, %s\n",
          student.getMemberNo(),
          student.getName(),
          student.getEmail(),
          student.getTel(),
          student.isWorking(),
          student.getGrade(),
          student.getSchoolName(),
          student.getPhotoPath());
    }
    sqlSession.close();
  }
}
