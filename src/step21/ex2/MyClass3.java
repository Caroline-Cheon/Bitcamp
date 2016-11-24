package step21.ex2;

// 인터페이스 구현2
// method를 한개라도 구현하지 않으면 컴파일 오류!
public class MyClass3 implements MyInterface3 {
  
  public void m1() {} // 컴파일 오류!
  public void m2() {}
  // public void m3() {}
}
