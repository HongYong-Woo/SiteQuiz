package h_Class3.prob;

public class Emp {
  private String Id;
  private String Name;
  private int BaseSalry;

  public String getId() {
    return Id;
  }

  public void setId(String id) {
    Id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public int getBaseSalry() {
    return BaseSalry;
  }

  public void setBaseSalry(int baseSalary) {
    BaseSalry = baseSalary;
  }

  public double getSalary(double bonus) {
    double Salary= this.BaseSalry + this.BaseSalry*bonus;
    return Salary;
  }

  public String toString() {
    String str = this.Name + "(" +this.Id + ")" + "사원의 기본급은 " + this.BaseSalry + "원 입니다.";
    return str;
  }
}
