<<<<<<< HEAD
=======
// call by reference      값을 가지고 있는 주소를 넘기는 것이다.
>>>>>>> b5e200dd9e45ee9f7e698c0c6f9ee74c9208aed4
package step06;

public class Testing {
  public static void main(String[] args) {
<<<<<<< HEAD
    int[] arr = new int[20];

    initByIndexValue(arr);
    mix(arr);
    printAll(arr, -1);

    mix(arr); // 언제든 필요할 때 마다 mix()에 선언된 명령을 재 실행할 수 있다.
    printAll(arr, -1); // 이것이 메서드를 만드는 이유다!
  }

  static void mix(int[] arr) {
    int index1, index2, temp;
    for (int i = 0; i < arr.length; i++) {
      index1 = (int)(Math.random() * arr.length);
      index2 = (int)(Math.random() * arr.length);
      temp = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = temp;
    }
  }

  static void printAll(int[] arr, int keyIndex) {
    for (int i = 0; i < arr.length; i++) {
      if (keyIndex >= 0 && i == keyIndex) {
        System.out.printf("[%d] ", arr[i]);
      } else {
        System.out.printf("%d ", arr[i]);
      }
    }
    System.out.println();
  }

  static void initByIndexValue(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
  }

  static void sort(int[] arr) {
    int temp;
    for (int x = 1; x < arr.length; x++) {
      for (int i = 0; i < arr.length - x; i++) {
        if (arr[i] > arr[i+1]) {
          temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
=======

    String s1 = "Belly";
    String s2 = "Belly";
    String s3 = "Belly";

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }
    if (s1 == s3) {
      System.out.println("s1 == s3");
>>>>>>> b5e200dd9e45ee9f7e698c0c6f9ee74c9208aed4
    }
  }

}
