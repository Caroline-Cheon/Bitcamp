package step16.ex2;

public class Calculator {
  private int result;

  public int getResult() {
    return result;
  }
  public void plus(int value) {
    result += value;
  }
  public void minus(int value) {
    result -= value;
  }
}