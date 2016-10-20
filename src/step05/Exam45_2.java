//subject: identifier duplication
package step05;

public class Exam45_2 {
  public static void main(String[] args) {

    int a = 10;
    {
      int b = 20;
      a = 20;
      //int a = 30;     // warning: variable a is already defined!!
    //  String a = "spleepy"; // warning: variable a is already defined!!
    }
    {
      int b = 300;    // another int b is already deleted!!
    }
  }
}


/*
# variable duplication
- variable cannot be duplicated
-
*/
