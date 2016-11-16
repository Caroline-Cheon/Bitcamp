
package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam103_6 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_5.data");
    ObjectInputStream in2 = new ObjectInputStream(in);

    Score2 score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    
    score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    
    score = (Score2)in2.readObject();
    score.compute();
    System.out.println(score);
    
    in2.close();
    in.close();
  }
}
