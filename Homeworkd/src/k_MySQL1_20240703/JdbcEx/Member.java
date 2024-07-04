package k_MySQL1_20240703.JdbcEx;

public class Member {
//public  static Member member = new Member();

  private int id;
  private String name;
  private String job;

  public Member() {
  }

  public Member(int id, String name, String job) {
    this.id = id;
    this.name = name;
    this.job = job;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }
}
