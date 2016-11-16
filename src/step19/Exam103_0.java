/* 주제: 객체 입출력 - ObjectOutputStream을 사용하여 인스턴스의 값을 출력하기
- 어떻게?
  인스턴스의 값을 바이트 배열로 만들어 출력한다. "직렬화(Serialization)"
- 주의!!
  직렬화를 허락하지 않는 클래스에 대해서는 자동으로 직렬화를 수행할 수 없다.
  

용어정리
- 직렬화(Serialization = marshaling)
  인스턴스의 값을 바이트 배열로 만들어 출력하는 것
- 역직렬화(Deserialization = unmarshaling)
  바이트 배열로 인스턴스로 복원하는 것
*/
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Exam103_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_0.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    Student s1 = new Student("홍길동", 20, true);
    Student s2 = new Student("임꺽정", 30, false);
    Student s3 = new Student("유관순", 40, true);
    Student s4 = new Student("안중근", 50, true);

    out2.writeObject(s1);
    out2.writeObject(s2);
    out2.writeObject(s3);
    out2.writeObject(s4);

    out2.close();
    out.close();
  }
}
