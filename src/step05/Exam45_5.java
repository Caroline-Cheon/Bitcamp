//subject: class block and define variable
package step05;

public class Exam45_5 {
  static  int a = 20;     //  class variable(static variable)
  int x = 100;            //  instance variable

  public static void main(String[] args) {       //parameter (local variable)
    // args is also variable so you cannot overuse!!
    //int args =  20;         //error : variable args is already defined

    int y = 300;         // local variable
  }
  static void ma(int a) {          //parameter (local variable)
    int b;                 // local variable
    {
      int c;              // local variable
    }
  }
}


/*
# class variable (static variable)
- using static
# instance variable
- using new
- should use instance name
#local variable
- variable inside method
- including variables inside method
- every parameter is lacal variable
*/
