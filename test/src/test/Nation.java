package test;

public class Nation implements Sequence {
  private String[] nations;

  private int sequenceIndex;

  public Nation(String[] nations) {
    this.nations = nations;
  }

  //인터페이스 메소드 구현
  public void indexReset() {
    sequenceIndex = 0;
  }
  public void next() {
    sequenceIndex++;
  }
  public Object get() {
    if (sequenceIndex < 0 || sequenceIndex >= nations.length) {
      return "범위 초과";
    }
    return nations[sequenceIndex];
  }
  public String getClassInfo() {
    return "국가목록 클래스";
  }
  public int getSequenceSize() {
    return nations.length;
  }
}
