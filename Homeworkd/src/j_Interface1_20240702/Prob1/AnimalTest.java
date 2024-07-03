package j_Interface1_20240702.Prob1;

public class AnimalTest {

	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		if(cheatableChicken instanceof Cheatable) {
			cheatableChicken.fly();
		}


		for(int n=1; n<=3 ;n ++) {
			System.out.printf("%d시간 후 \n", n);
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
		}

	}
}









