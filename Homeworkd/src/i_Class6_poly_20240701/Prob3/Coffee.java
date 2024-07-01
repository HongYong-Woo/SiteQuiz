package i_Class6_poly_20240701.Prob3;

public class Coffee extends Beverage{
  public static int amount;

  public Coffee() {
  }

  public Coffee(String name) {
    super(name);
    amount +=1;
  }


  @Override
  public void calcPrice() {
        switch (this.getName()) {
          case "Americano" :
            this.price = 1500;
            break;
          case "CafeLatte" :
            this.price = 2500;
            break;
          case "Cappuccino" :
            this.price = 3000;
            break;
        }
  }
}
