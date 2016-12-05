package game;

import java.util.ArrayList;

public class CoffeeSelector {
  public static void main(String[] args) {
    String[] students = {"서동훈", "천지연", "정선교", "남경훈"};
    
    ArrayList<String> list = new ArrayList<>();
    for (String name : students) {
      list.add(name);
    }
    
    int index = (int)(Math.random() * list.size());
    System.out.println(students[index]);
  }
}
