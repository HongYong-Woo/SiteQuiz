package i_Class6_poly_20240701.Prob1;

public class Prob1 {
public static void main(String[] args) {
	Truck truck = new Truck("트럭", 50, 4);
  Bike bike = new Bike("자전거", 5, 2);
  truck.speedUp(10);
  bike.speedUp(20);
  truck.speedDown(12);
  bike.speedDown(20);
  truck.stop();
  bike.stop();
  truck.speedUp(10);
}
}
