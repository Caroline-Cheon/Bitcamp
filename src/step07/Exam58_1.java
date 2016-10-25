
package step07;

public class Exam58_1 {
  public static void main(String[] args) {
    int[] arr1 = new int[]{10, 20, 30};
    int[] arr2 = new int[]{100, 200, 300, 400, 500};
    arr1 = arr2;        //arr1에 저장된 주소를 잃어버린다. 가비지 발생!
  }
}

/*
# 가비지(garbage)
- 주소를 잃어버려 사용할 수 없는 인스턴스를 말한다.
"Dangling Object"

# 가비지 컬렉터(Garbage Collector)
-가비지를 수집하는 스레드 말한다.
즉 사용할 수 없는 인스턴스를 다른 용도로 사용하도록
강제로 메모리에서 해제한다.
-작동
 1) 메모리가 부족할 때
   os에게 메모리 추가 배달을 요구하기 전에
   먼저 내부 메모리를 최대한 활용하기 위함이다.
 2) CPU가 한가할 때(CPU idle time)
   24시간 365일 계속 실행될 때 동작할 수 있다


# 레퍼런스 테이블(reference table)
- 인스턴스의 주소 관리대장
- 인스턴스를 참조하는 레퍼런스가 추가될 때마다 레퍼런스 값을 증가시키고,
  인스턴스를 참조하는 레퍼런스가 줄 때마다 값을 감소시킨다.
# "Dangling Pointer"
- 무효한 메모리의 주소를 가리키는 변수를 말한다.
- 자바는 이에 해당되지 않는다

*/
