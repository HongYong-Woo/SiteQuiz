package j_Interface1_20240702.Prob1;

public class Dog extends Animal{

  public Dog() {
  }

  public Dog(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
    double dis = this.getSpeed() * ((double)hours/2);
    addDistance(dis);
    System.out.printf("개의 이동거리 = %.1f\n", this.getDistance());
  }
}
