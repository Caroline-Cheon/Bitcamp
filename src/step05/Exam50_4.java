//subject:  for
package step05;

public class Exam50_4 {
  public static void main(String[] args) {
    String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
      for (int i = 0; i < names.length; i++)
      System.out.printf("%d:%s\n", i, names[i]);
  }
}
