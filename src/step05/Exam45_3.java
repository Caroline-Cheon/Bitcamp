//subject: class block and define variable
package step05;

public class Exam45_3 {
  static  int a = 20;
  public static void main(String[] args) {
    a = 100; //ok!
    int b = 10;
  }
  static void m1() {
    a = 200;  //ok!
    b = 200; // warning : cannot find symbol!!
  }
}


/*
# class block variable
- you can use in every other method
-
*/
