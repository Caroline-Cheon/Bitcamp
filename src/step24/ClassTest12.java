/*주제: 리플렉션API 사용법 - 생성자와 인스턴스 생성
 */
package step24;

import java.lang.reflect.Constructor;

public class ClassTest12 {
  static class MyClass {
    String name;
    public MyClass(String name) {
      this.name = name;
    }
    public void m() {
      System.out.println(this.name);
    }
  }
 
  public static void main(String[] args) throws Exception {
    //Class<?> clazz = MyClass.class;
    //MyClass obj = (MyClass)clazz.newInstance();
    
    Class<MyClass> clazz = MyClass.class;
    
    
    //MyClass obj = clazz.newInstance();
    
    
    Constructor<MyClass> constructor = clazz.getConstructor(String.class);
    MyClass obj = constructor.newInstance("홍길동");
    obj.m();
  }
}
