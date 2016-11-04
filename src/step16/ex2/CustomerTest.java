// 주제 : 인스턴스에 직접 접근했을 때 문제점 
package step16.ex2;

public class CustomerTest {
  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("길동이");
    //customer.setAge(300);  // 값이 유효하지 않기 때문에 실행 오류 발생!
    customer.setAge(30);
    customer.setGender(false);

    System.out.printf("이름: %s, 나이: %d, 성별(여:true,남:false): %b\n ",
    customer.getName(), customer.getAge(), customer.getGender());
  }
}