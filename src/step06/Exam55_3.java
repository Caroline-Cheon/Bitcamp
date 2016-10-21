// call by reference      값을 가지고 있는 주소를 넘기는 것이다.
package step06;

public class Exam55_3 {
  static void swap(int[] values) {
    int temp = values[0];
    values[0] =  values[1];
    values[1] = temp;
  }


  public static void main(String[] args) {
    int[] values = {10, 20};
    System.out.printf("main():%d, %d\n", values[0], values[1]);
    swap(values);
    System.out.printf("main():%d, %d\n", values[0], values[1]);

  }
}
