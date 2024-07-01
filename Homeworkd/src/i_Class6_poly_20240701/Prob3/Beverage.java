package i_Class6_poly_20240701.Prob3;

public abstract class Beverage {

  private String name;
  protected int price;

  public Beverage() {
  }

  public Beverage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void calcPrice();
  public void print() {
    System.out.printf("판매 음료는 %s이며, 가격은 %d\n", name, price);
  }
}



