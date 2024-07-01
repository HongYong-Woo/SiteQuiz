package i_Class6_poly_20240701.Prob2;


public class TestShape {
	public static void main(String[] args) {
		Shape [] shape = new Shape[2];

		shape[0] = new Circle("원", 10);
		shape[1] = new Rectangular("직사각형", 50, "4");

		for (Shape  s : shape) {
			s.calculationArea();
			s.print();
		}

		
		
	}
}