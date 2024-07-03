package j_Interface1_20240702.Prob2;

public class CarFactory extends Factory implements IWorkingTogether{

  public CarFactory() {
  }

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int makeProducts(char skill) {
    int n=0;
    switch (skill) {
      case 'A' : n=3; break;
      case 'B' : n=2; break;
      case 'C' : n=1; break;
      default: n=0; break;
    }

    return n * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {
    if(partner instanceof CarFactory) {
      return ((Factory)partner).makeProducts('B');
    }
    else {return 0;}
  }
}
