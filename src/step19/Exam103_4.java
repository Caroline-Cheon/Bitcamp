
package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam103_4 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_3.data");
    ObjectInputStream in2 = new ObjectInputStream(in);

    
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
 
    in2.close();
    in.close();
  }
}
