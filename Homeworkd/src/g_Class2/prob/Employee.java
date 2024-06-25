package g_Class2.prob;

public class Employee {
  String Name;
  int Age;
  String Dept;

  public void setName(String name) {
    Name = name;
  }

  public void setAge(int age) {
    Age = age;
  }

  public void setDept(String dept) {
    Dept = dept;
  }

  public void print() {
    System.out.printf("이   름 : %s\t나 이 : %d\t부   서 : %s\n", this.Name, this.Age, this.Dept);
  }
}
