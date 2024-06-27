package i_Class4_20240627;

public class Student {

  private String name;
  private String subject;
  private int fee;
  private double returnFee;

  public Student() {
  }

  public Student(String name, String subject, int fee) {
    this.name = name;
    this.subject = subject;
    this.fee = fee;
  }

  public void calcReturnFee() {
    if(this.subject.equals("javaprogram")) {
      this.returnFee = ((double)fee/100) * 25;
    }
    else if(this.subject.equals("jspprogram")) {
      this.returnFee = ((double)fee/100) * 20;
    }
    else {
      System.out.println("그런 과정명은 없습니다.");
    }
  }

  public void print() {
    System.out.printf("%s 씨의 과정명은 %s이고 교육비는 %d 이며 환급금은 %.1f입니다.\n", this.name, this.subject, this.fee, this.returnFee);
  }

}  