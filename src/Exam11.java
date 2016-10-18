//method call applied from java
public class Exam11 {
  public static void main(String[] args) {
    int value = Math.abs(-200);
    System.out.print(value + "\n");

    long millis = System.currentTimeMillis();
    long seconds = millis/1000;
    long minutes = seconds/1000;
    long hours = minutes/1000;

    System.out.print(millis + " millis"+"\n");
    System.out.print(seconds + " seconds"+"\n");
    System.out.print(minutes + " minutes"+"\n");
    System.out.print(hours + " hourss"+"\n");
  }
}



// you can use pakages without writing the name of them.
