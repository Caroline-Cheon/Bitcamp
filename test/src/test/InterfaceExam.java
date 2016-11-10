package test;

public class InterfaceExam  {
  public static void main(String[] args) {

    Nation nations = new Nation(new String[]{"한국", "미국", "중국", "일본", "러시아"});
    GrateMan grateMans = new GrateMan(new String[]{"장보고", "신사임당", "이순신", "김구"});
    Book book = new Book("EBS 수능완성 영어영역 영어", "EBS한국교육방송공사", 9700);

    showClassFullInfo(nations);
    showClassFullInfo(grateMans);
    showClassFullInfo(book);
  }
  
  public static void showClassFullInfo(Sequence obj) {
    System.out.printf("클래스 설명 : %s\n\n", obj.getClassInfo());
    obj.indexReset();
    for (int i = 0; i < obj.getSequenceSize(); i++) {
      System.out.printf("%d 번째 자료 : %s\n", i, obj.get());
      obj.next();
    }
    System.out.println("---------------------");
  }
}
