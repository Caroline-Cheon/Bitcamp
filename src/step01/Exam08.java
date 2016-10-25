//difference between parameter and argument

public class Exam08 {
  public static void main(String[] args) {
  m1("caroline");
  m2("KAYLLIN")                           //method call,method invoke
  }

  static void m1(String name) {
    System.out.print("HEllo\n");
    System.out.print(name+"\n");
  }

  private static void m2(String name) {
    System.out.print("Hey\n");
    System.out.print(name+"\n");
  }
}
