package m_Collection3_makeBoard_20240711;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import m_Collection3_makeBoard_20240711.interfaces.BoardIO;
import m_Collection3_makeBoard_20240711.lib.ObjectDBIO;

public abstract class BoardDAO extends ObjectDBIO implements BoardIO {

  @Override
  public void insertboard(Board board) {
    String title = board.getBtitle();
    String content = board.getBcontent();
    String writer = board.getBwriter();
    String date = "2024.07.15";

    String query = "INSERT INTO board(title, content, writer, date) VALUES ( '" +
        title + "', '" +
        content + "', '" +
        writer + "', '" +
        date + "' )";

    super.excute(query);
    super.close();
  }

  @Override
  public void deleteBoard() {

  }

  @Override
  public void clearBoard() {

  }

  @Override
  public Board searchBoard() {
    return null;
  }

  @Override
  public ArrayList<Board> listAllBoard() {
    String query = "SELECT * FROM board";
    ResultSet rs =null;
    ArrayList<Board> templist = new ArrayList<>();
    rs = super.excute(query, rs);
    try {
      while (rs.next()) {
        int no = rs.getInt(1);
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        String date = rs.getString("date");
        templist.add(new Board(no, title, content, writer));
      }
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return templist;
  }

  @Override
  public void updateBoard() {

  }

  public void printBoard() {}
}
