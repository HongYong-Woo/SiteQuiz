package i_Class6_poly_20240701.Prob2;

public class Rectangular extends Shape {

  private double width;
  private String hight;

  public Rectangular() {
  }

  public Rectangular(String name) {
    super(name);
  }

  public Rectangular(String name, double width, String hight) {
    super(name);
    this.width = width;
    this.hight = hight;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public String getHiight() {
    return hight;
  }

  public void setHiight(String hight) {
    this.hight = hight;
  }

  @Override
  public void calculationArea() {
    this.setArea(this.width * Double.parseDouble(this.hight));
  }
}
