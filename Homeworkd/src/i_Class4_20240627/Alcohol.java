package i_Class4_20240627;

public class Alcohol extends Drink{
private double alcper;
Alcohol() {}
  Alcohol(String name, int price, int count, double alcper) {
    super.name = name;
    super.price = price;
    super.count = count;
    this.alcper = alcper;
  }

  public static void printTitle() {
    System.out.printf("상품명(도수[%%])\t단가\t수량\t금액\n");
  }

  public void printData() {
    System.out.printf("%s(%.1f)\t\t\t%d\t%d\t\t%d\n", name, alcper, price, count, getTotalPrice());
  }
}
