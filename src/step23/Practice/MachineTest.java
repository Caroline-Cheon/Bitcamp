package step23.Practice;

public class MachineTest {
  static Machine machine = new Machine("Apple") {
    public void start() {
      System.out.println(brand + ":I am working now");
    }
  };
  Machine machine2 = new Machine("atom"){
    public void start() {
      System.out.println(brand + ":I am working extremly hard right now!");
    }
  };
  Machine machine3 = new Machine("Atrix"){
    public void start() {
      System.out.println(brand + ":What am I doing for?");
    }
  };
  public static void run(Machine machine) {
    machine.start();
  }
  public static void main(String[] args) {
//    machine.start();
//    
    MachineTest mt = new MachineTest();
    mt.machine2.start();
    
    mt = new MachineTest();
    mt.machine3.start();
    run(machine);
    run(new Machine("Starbucks"){
      public void start() {
        System.out.println(brand + ":I am making coffee all the time");
      }
    });
    run(new Machine("Samsung") {
      public void start() {
        System.out.println(brand + ":I am doing my job very awfully");
      }
    });
    run(new Machine("Bitcamp") {
      public void start() {
        System.out.println(brand + ":Here is Hell, you cannot back off, though");
      }
    });
  }
}
