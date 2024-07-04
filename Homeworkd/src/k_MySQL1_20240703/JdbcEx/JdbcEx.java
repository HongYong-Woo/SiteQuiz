package k_MySQL1_20240703.JdbcEx;

import java.sql.*;
import java.io.*;

public class JdbcEx extends MemberDB{

  public static void main(String[] args) throws IOException{
//회원의 정보를 사용자 받는 기능  (static 메소드로)
    JdbcEx jdbc = new JdbcEx();


    jdbc.state();
    //Member 클래스(VO)
   // Member member = new Member(4,"QWE", "Police");
//    memberInsert(member, jdbc.login(););// Member member
//    memberSearch();
//    System.out.println("==회원 정보수정 후 조회===");
//    member.setId(1);
//    member.setJob("student");
//    memberUpdate(member, jdbc.login());
//    memberSearch();
   // System.out.println("==회원 정보삭제 후 조회===");
   // memberDelete(member, jdbc.login());
   // memberSearch(jdbc.login());
  }

  /**
   * member 삽입
   */
  private static void memberInsert(Member member, String[] login) {

    String query = "INSERT into member values(?, ?, ?)";
    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(login[0], login[1], login[2]);

      pstmt = con.prepareStatement(query);
      pstmt.setInt(1, member.getId());
      pstmt.setString(2, member.getName());
      pstmt.setString(3, member.getJob());

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 입력 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 입력이 실패 하였습니다.");
      }
      con.close();
      pstmt.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * member 갱신
   */
  private static void memberUpdate(Member member, String[] login) {
    String query = "UPDATE member SET job = ? where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(login[0], login[1], login[2]);
      pstmt = con.prepareStatement(query);

      pstmt.setString(1, member.getJob());
      pstmt.setInt(2, member.getId());

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 수정 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 수정이 실패 하였습니다.");
      }
      con.close();
      pstmt.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * member 삭제
   */
  private static void memberDelete(Member member, String[] login) {

    String query = "DELETE FROM member where id = ? ";

    Connection con = null;
    PreparedStatement pstmt = null;
    int result = 0;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(login[0], login[1], login[2]);
      pstmt = con.prepareStatement(query);

      pstmt.setInt(1, member.getId());

      result = pstmt.executeUpdate();
      if (result == 1) {
        System.out.println("회원 정보가 삭제 되었습니다.");
      } else if (result == 0) {
        System.out.println("회원 정보 삭제가 실패 하였습니다.");
      }
      con.close();
      pstmt.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * member 검색
   */
  public static void memberSearch(String[] login) {

    String url = "jdbc:mysql://localhost:3306/employees";
    String userName = "root";
    String passWord = "mysql321";
    String query = "SELECT * FROM member";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      //Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection(login[0], login[1], login[2]);
      stmt = con.createStatement();
      rs = stmt.executeQuery(query);
      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String job = rs.getString("job");
        System.out.printf("%d번  이름 : %s  직업 : %s\n", id, name, job);
      }
      rs.close();
      con.close();
      stmt.close();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public String[] login() {
    String[] logininfo = new String[3];
    logininfo[0] = "jdbc:mysql://localhost:3306/employees";
    logininfo[1] = "root";
    logininfo[2] = "mysql321";

    return logininfo;
  }

  @Override
  public void state() throws IOException {
    int select =0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    JdbcEx jdbc = new JdbcEx();
    Member mb = new Member();

    while (select != 5) {
      System.out.println("1.삽입  2.갱신  3.검색  4.삭제  5.종료");
      System.out.printf("숫자를 입력하세요. : ");
      select = Integer.parseInt(br.readLine());
      switch (select) {
        case 1:
          System.out.println("1. 삽입");
          System.out.print("ID번호를 입력하세요 : ");
          mb.setId(Integer.parseInt(br.readLine()));
          System.out.print("이름을 입력하세요 : ");
          mb.setName(br.readLine());
          System.out.print("직업을 입력하세요 : ");
          mb.setJob(br.readLine());
          memberInsert(mb, jdbc.login());
          break;
        case 2:
          System.out.println("2. 갱신");
          System.out.print("수정할 ID번호를 입력하세요 : ");
          mb.setId(Integer.parseInt(br.readLine()));
          System.out.print("수정할 직업을 입력하세요 : ");
          mb.setJob(br.readLine());
          memberUpdate(mb, jdbc.login());
          break;
        case 3:
          System.out.println("3. 검색");
          memberSearch(jdbc.login());
          break;
        case 4:
          System.out.println("4. 삭제");
          System.out.print("삭제할 ID번호를 입력하세요 : ");
          mb.setId(Integer.parseInt(br.readLine()));
          memberDelete(mb, jdbc.login());
          break;
        case 5:
          System.out.println("종료 합니다.");
          break;
        default:
          System.out.println("잘못 입력하셨습니다.");
          break;
      }
    }
    br.close();
  }
}
