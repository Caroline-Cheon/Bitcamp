package test;

import java.util.LinkedList;

public class GrateMan implements Sequence {
  private LinkedList<String> list;

  private int sequenceIndex;

  public GrateMan(String[] grateMans) {
    list = new LinkedList<String>();
    for (String grateMan : grateMans) {
      list.add(grateMan);
    }
  }

  //인터페이스 메소드
  public void indexReset() {
    sequenceIndex = 0;
  }
  public void next() {
    sequenceIndex++;
  }
  public Object get() {
    if (sequenceIndex < 0 || sequenceIndex >= list.size()) {
      return "범위 초과";
    }
    return list.get(sequenceIndex);
  }
  public String getClassInfo() {
    return "위인목록 클래스";
  }
  public int getSequenceSize() {
    return list.size();
  }
}
