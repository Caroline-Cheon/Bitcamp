//subject: class block and define variable
package step05;

public class Exam45_4 {
  static  int a = 20;
  public static void main(String[] args) {
    int a = 200;          // you can define another variable with the same name of class variable
    System.out.println(a);

    // What if you want to use class variable?     =>    call class name!
    System.out.println(Exam45_4.a);
  }
  static void m1() {
    a = 300;
  }
}


/*
# class block variable
- you can use in every other method
-
*/
