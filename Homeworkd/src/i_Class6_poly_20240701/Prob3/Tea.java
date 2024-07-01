package i_Class6_poly_20240701.Prob3;

public class Tea extends Beverage{
public static int amount;

  public Tea() {
  }

  public Tea(String name) {
    super(name);
    amount +=1;
  }


  @Override
  public void calcPrice() {
    switch (this.getName()) {
      case "lemonTea" :
        this.price = 1500;
        break;
      case "ginsengTea" :
        this.price = 2000;
        break;
      case "redginsengTea" :
        this.price = 2500;
        break;
    }
  }
}
