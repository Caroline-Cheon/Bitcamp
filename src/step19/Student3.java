package step19;

public class Student3 implements java.io.Serializable {
  private static final long serialVersionUID = 1L;
  
  String name;
  int age;
  boolean working;

  public Student3() {}

  public Student3(String name, int age, boolean working) {
    this.name = name;
    this.age = age;
    this.working = working;
  }

  @Override
  public String toString() {
    return String.format("%s,%d,%b", this.name, this.age, this.working);
  }

}