package h_Class3.prob;

public class Duck {

  private String Name;
  private int Legs;
  private int Length;

  public void fly() {
    System.out.printf("오리(%s)는 날지 않습니다.\n", this.Name);
  }

  public void sing() {
    System.out.printf("오리(%s)가 소리내어 웁니다.\n", this.Name);
  }

  public String toString() {
    String str = "오리의 이름은 " + this.Name + " 입니다.";
    return str;
  }

  public void setName(String name) {
    Name = name;
  }
}
