package step28.ex4;

import java.util.Arrays;

public class Car2 {
  String model;
  String maker;
  int cc;
  Tire[] tires;
  
  @Override
  public String toString() {
    return "Car2 [model=" + model + ", maker=" + maker + ", cc=" + cc + ", tires=" + Arrays.toString(tires) + "]";
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  public int getCc() {
    return cc;
  }
  public void setCc(int cc) {
    this.cc = cc;
  }
  public Tire[] getTires() {
    return tires;
  }
  public void setTires(Tire[] tires) {
    this.tires = tires;
  }
  
   
}
