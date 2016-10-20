//subject:
package step05;

public class Exam45_0 {                            //class block
  public static void main(String[] args) {         //method block
    System.out.println("1111");
    { // ordianry block
      System.out.println("2222");
    }

    int a = 10;
    if ( a > 10) { //terms block
      if (a < 15) { //terms block
        //ordianry block
      }else {

      }
    }
  }
}
/*
#block
1) class block
    => method, variable, instance block, static block,
2) method block
    => statement block , ordianry block
3) statement block
    => binding statement according to terms
*/
