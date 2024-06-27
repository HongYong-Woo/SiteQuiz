package i_Class4_20240627;

public class Drink {

  protected String name;
  protected int price;
  protected int count;

  public Drink() {
  }

  public Drink(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public int getTotalPrice() {
    return this.price * this.count;
  }

  public static void printTitle() {
    System.out.printf("상품명\t단가\t수량\t금액\n");
  }

  public void printData() {
    System.out.printf("%s\t%d\t\t%d\t\t%d\n", name, price, count, getTotalPrice());
  }
}
