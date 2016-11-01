/* 다른 사람이 만든 클래스를 확장한다
*/
package step11;

public class MyCalculator extends SuperCalculator {
  public void remainder(int value) {
    this.result %= value;
  }
  public void power(int value) {
    int temp = this.result;
    for (int i = 0; i < value-1; i++) {
      this.result *= temp;
    }
  }
}
