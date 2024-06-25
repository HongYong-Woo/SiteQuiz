package g_Class2.prob;

public class Student {
  private String Name;
  private int Age;
  private int Id;

  public void setName(String name) {
    Name = name;
  }

  public void setAge(int age) {
    Age = age;
  }

  public void setId(int id) {
    Id = id;
  }

  public void print() {
    System.out.printf("이   름 : %s\t나 이 : %d\t학   번 : %d\n", this.Name, this.Age, this.Id);
  }
}
