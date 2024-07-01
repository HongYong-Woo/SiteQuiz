package i_Class6_poly_20240701.Prob1;

public class Truck extends Wheeler{


  Truck() {}
  public Truck(String carName, int velocity , int wheelNumber) {
    super(carName, velocity, wheelNumber);
    System.out.printf("트럭 : 바퀴 %d개 입니다.\n", this.wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += speed*5;

    if(this.velocity >100){
      this.velocity = 100;
      System.out.printf("트럭의 최고속도위반으로 속도를 %d 으로 내립니다.\n", this.velocity);
    }
    else {
      System.out.printf("트럭의 현재 속도는 %d 입니다.\n", this.velocity);
    }
  }

  @Override
  public void speedDown(int speed) {
      this.velocity -= speed*5;

      if(this.velocity <50){
        this.velocity = 50;
        System.out.printf("트럭의 최저속도위반으로 속도를 %d 으로 올립니다.\n", this.velocity);
      }
      else {
        System.out.printf("트럭의 현재 속도는 %d 입니다.\n", this.velocity);
      }
  }
}
