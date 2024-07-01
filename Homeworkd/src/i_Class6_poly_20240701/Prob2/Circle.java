package i_Class6_poly_20240701.Prob2;

public class Circle extends Shape{

  private double radius;

  public Circle() {
  }

  public Circle(String name) {
    super(name);
  }

  public Circle(String name, double radius) {
    super(name);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public void calculationArea() {
    this.setArea(this.radius * this.radius * Math.PI);


  }
}
