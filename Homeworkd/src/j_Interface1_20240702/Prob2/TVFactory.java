package j_Interface1_20240702.Prob2;

public class TVFactory extends Factory implements IWorkingTogether{

  public TVFactory() {
  }

  public TVFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }

  @Override
  public int makeProducts(char skill) {
    int n=0;
    switch (skill) {
      case 'A' : n=8; break;
      case 'B' : n=5; break;
      case 'C' : n=3; break;
      default: n=1; break;
    }

    return n * getWorkingTime();
  }

  @Override
  public int workTogether(IWorkingTogether partner) {

    if(partner instanceof TVFactory) {
      return ((Factory)partner).makeProducts('C');
    }
    else {return 0;}

  }
}
