package j_Interface1_20240702.Prob1;

public class Chicken  extends Animal implements Cheatable  {

  private boolean imlenments = false;

  public Chicken() {
  }

  public Chicken(int speed) {
    super(speed);
  }

  @Override
  void run(int hours) {
      double dis = this.getSpeed() * hours;
      addDistance(dis);
      if(imlenments) {
        System.out.printf("날으는 닭의 이동거리 = %.1f\n", this.getDistance());
      }
      else {
        System.out.printf("닭의 이동거리 = %.1f\n", this.getDistance());
      }

  }

  @Override
  public void fly() {
    this.setSpeed(this.getSpeed()*2);
    imlenments = true;
    //System.out.printf("날으는 닭의 이동거리 = %.1f\n", this.getDistance());
  }
}
