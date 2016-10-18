/*quiz:
클래스 문법을 이용하여 쇼핑몰의 한 개 제품 정보를 저장하고 출력하라.
*/
package step03.test;

public class Test3 {
  static class Product{

    String name;
    String brand;
    String productionPlace;
    int numberOfProduct;
    String[] color;
    int price;
    int quantity;
    boolean used;

  }
  public static void main(String[] args) {

    Product tent = new Product();
    tent.name = "tent";
    tent.brand = "warm tent(따수미 텐트)";
    tent.productionPlace = "Asia";
    tent.numberOfProduct = 1591083363;
    tent.color = new String[] {"red","pink","mint"};
    tent.price = 39900;
    tent.quantity = 5;
    tent.used = true;


    System.out.println("brand = " + tent.brand);
    System.out.println("productionPlace = " + tent.productionPlace);
    System.out.println("numberOfProduct = " + tent.numberOfProduct);
    System.out.print("color = ");
    for (String color : tent.color) {
      System.out.print(color+" ");
    }
    System.out.println("");
    System.out.println("price = " + tent.price);
    System.out.println("quantity = " + tent.quantity);
    System.out.println("used = " + tent.used);

  }
}
