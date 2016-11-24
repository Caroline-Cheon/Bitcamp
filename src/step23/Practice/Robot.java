package step23.Practice;

public class Robot {
  private int id;
  
  public class Brain {
    public void think() {
      System.out.println("Robot " + id + " is thinking.");
    }
  }
  public static class Battery {
    public void charge() {
      System.out.println("Battery changing...");
    }
  }
  public Robot(int b) {
    this.id = id;
  }
  public void start() {
    System.out.println("Strating robot " + id);
    
    Brain brain = new Brain();
    brain.think();
    
    final String name = "Robot";
    
    class Temp {
      public void doSomethind() {
        System.out.println("ID is: " + id);
        System.out.println("My name is " + name);
      }
    }
    
    Temp temp = new Temp();
    temp.doSomethind();
  }
}
