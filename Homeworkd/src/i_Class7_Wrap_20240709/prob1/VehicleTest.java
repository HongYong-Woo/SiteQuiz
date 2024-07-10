package i_Class7_Wrap_20240709.prob1;


public class VehicleTest {
	public static void main(String[] args) {
		Vehicle vehicle1= new Vehicle();
		Owner owner1= new Owner("LEE", "010-2233-4455");
		vehicle1.setOwner(owner1);
		vehicle1.setPrice(25000000);
		System.out.println(vehicle1);
		Vehicle vehicle2= new Vehicle();
		Owner owner2= new Owner("LEE", "010-6677-8899");
		vehicle2.setOwner(owner2);
		vehicle2.setPrice(50000000);
		System.out.println(vehicle2);
		System.out.println("동일한 소유주 여부 : "+ vehicle1.equals(vehicle2));
	}
}