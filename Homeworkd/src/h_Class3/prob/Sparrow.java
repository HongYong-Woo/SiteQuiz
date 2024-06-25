package h_Class3.prob;

public class Sparrow {
  private String Name;
  private int Legs;
  private int Length;

  public void fly() {
    System.out.printf("참새(%s)는 날아다닙니다.\n", this.Name);
  }
  public  void sing() {
    System.out.printf("참새(%s)가 소리내어 웁니다.\n", this.Name);
  }
  public String toString() {
    String str = "참새의 이름은 " + this.Name + " 입니다.";
    return str;}

  public void setName(String name) {
    Name = name;
  }

}
