package i_Class6_poly_20240701.Prob1;

public class Bike extends Wheeler{

  public Bike() {
  }

  public Bike(String carName, int velocity, int wheelNumber) {
    super(carName, velocity, wheelNumber);
    System.out.printf("자전거 : 바퀴 %d개 입니다.\n", this.wheelNumber);
  }

  @Override
  public void speedUp(int speed) {
    this.velocity += speed;

    if(this.velocity >40){
      this.velocity = 40;
      System.out.printf("자전거의 최고속도위반으로 속도를 %d 으로 내립니다.\n", this.velocity);
    }
    else {
      System.out.printf("자전거의 현재 속도는 %d 입니다.\n", this.velocity);
    }
  }

  @Override
  public void speedDown(int speed) {
    this.velocity -= speed;

    if(this.velocity <10) {
      this.velocity = 10;
      System.out.printf("자전거의 최저속도위반으로 속도를 %d 으로 올립니다.\n", this.velocity);
    }
    else {
      System.out.printf("자전거의 현재 속도는 %d 입니다.\n", this.velocity);
    }
  }
}
