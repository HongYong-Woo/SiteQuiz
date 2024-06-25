package g_Class2.prob;

public class Teacher {
 private String Name;
 private int Age;
  private String Subject;

  public void setSubject(String subject) {
    Subject = subject;
  }

  public void setAge(int age) {
    Age = age;
  }

  public void setName(String name) {
    Name = name;
  }


  public void print() {
    System.out.printf("이   름 : %s\t나 이 : %d\t담당과목 : %s\n", this.Name, this.Age, this.Subject);
  }
}
