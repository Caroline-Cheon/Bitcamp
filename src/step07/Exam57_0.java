//  subject: instance and reference  -Array

package step07;

public class Exam57_0{
  public static void main(String[] args) {
    int[] arr1 = new int[]{10, 20, 30};
    int[] arr2 = arr1;

    if (arr2 == arr1) {
      System.out.println("arr2 == arr1");
    }
  }
}
