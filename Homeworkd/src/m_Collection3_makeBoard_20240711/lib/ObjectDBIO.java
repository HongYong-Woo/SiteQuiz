package m_Collection3_makeBoard_20240711.lib;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import lombok.Setter;

@Setter
public abstract class ObjectDBIO {

  private Connection connection = null;
  private Properties Info = new Properties();


  /** DB Connection */
  private boolean open() {
    try {
      Info.load(ObjectDBIO.class.getResourceAsStream("../VO./DB_LoginInfo.properties"));
      Class.forName(Info.getProperty("driver"));
      connection = DriverManager.getConnection(Info.getProperty("url"), Info.getProperty("username"), Info.getProperty("password"));
      return true;
    }catch (IOException e) {
      System.err.println(e.getMessage());
      return false;
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
      System.out.println("연결 실패!");
      return false;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  /**DB DisConnection */
  protected boolean close() {
    try {
      connection.close();
      return true;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return  false;
    }
  }

  /**
   * 명령어 처리
   * 처리문 query
   * 수정할 값 rs
   */
  protected ResultSet excute(String query, ResultSet rs) {
    try {
      open();
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs =pstmt.executeQuery();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return rs;
  }

  /**
   * 명렁어 처리
   * 처리문 query
   */
  protected void execute(String query) {
    try {
      open();
      PreparedStatement psmt = connection.prepareStatement(query);
      psmt.executeUpdate();
    }catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

  /**
   * no 재설정
   */
  protected void resetIndex() {
    try {
      //open();
      String query = "ALTER TABLE board AUTO_INCREMENT = 1";
      PreparedStatement psmt = connection.prepareStatement(query);
      psmt.executeUpdate();
      query = "SET @COUNT = 0";
      psmt = connection.prepareStatement(query);
      psmt.executeUpdate();
      query = "UPDATE board SET no = @COUNT:=@COUNT +1";
      psmt = connection.prepareStatement(query);
      psmt.executeUpdate();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }


}
