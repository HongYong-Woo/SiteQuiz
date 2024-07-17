package m_Collection3_makeBoard_20240711.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.Setter;

@Setter
public abstract class ObjectDBIO {

  private Connection connection = null;
  private String db_url = "jdbc:mysql://localhost:3306/employees";
  private String db_id = "root";
  private String db_pwd = "mysql321";


  //DB Connection
  private boolean open() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection = DriverManager.getConnection(db_url, db_id, db_pwd);
      return true;
    } catch (ClassNotFoundException e) {
      System.err.println(e.getMessage());
      return false;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return false;
    }
  }

  //DB DisConnection
  protected boolean close() {
    try {
      connection.close();
      return true;
    } catch (SQLException e) {
      System.err.println(e.getMessage());
      return  false;
    }
  }

  //search
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

  protected void excute(String query) {
    try {
      open();
      PreparedStatement psmt = connection.prepareStatement(query);
      psmt.executeUpdate();
    }catch (SQLException e) {
      System.err.println(e.getMessage());
    }
  }

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
