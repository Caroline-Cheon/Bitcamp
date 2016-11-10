package test;

public interface Sequence {
  public void indexReset();
  public void next();
  public Object get();
  public String getClassInfo();
  public int getSequenceSize();
}
