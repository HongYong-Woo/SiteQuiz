package m_Collection3_makeBoard_20240711;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import m_Collection3_makeBoard_20240711.interfaces.BoardIO;
import m_Collection3_makeBoard_20240711.lib.ObjectDBIO;

public abstract class BoardDAO extends ObjectDBIO implements BoardIO {

  @Override
  public void insertboard(Board board) {
    String title = board.getBtitle();
    String content = board.getBcontent();
    String writer = board.getBwriter();
    String date = board.getStringDate();

    String query = "INSERT INTO board(title, content, writer, date) VALUES ( '" +
        title + "', '" +
        content + "', '" +
        writer + "', '" +
        date + "' )";

    super.excute(query);
    super.close();
  }

  @Override
  public void deleteBoard(int no) {
    String query = "DELETE FROM board WHERE no = " + no;
    super.excute(query);
    super.resetIndex();
    super.close();

  }

  @Override
  public void clearBoard() {
    String query = "DELETE FROM board";
    super.excute(query);
    super.resetIndex();
    super.close();
  }

  @Override
  public Board searchBoard(int no) {
    String query = "SELECT * FROM board WHERE no = " + no;
    ResultSet rs = null;
    Board board = new Board();
    rs = super.excute(query, rs);
    try {
      while (rs.next()) {
        board.setBno(rs.getInt(1));
        board.setBtitle(rs.getString("title"));
        board.setBcontent(rs.getString("content"));
        board.setBwriter(rs.getString("writer"));
        Date date = rs.getDate("date");
        board.setDate(date.toLocalDate());
      }
      rs.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return board;
  }

  @Override
  public ArrayList<Board> listAllBoard() {
    String query = "SELECT * FROM board";
    ResultSet rs = null;
    ArrayList<Board> templist = new ArrayList<>();
    rs = super.excute(query, rs);
    try {
      while (rs.next()) {
        int no = rs.getInt(1);
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        Date date = rs.getDate("date");

        templist.add(new Board(no, title, content, writer, date.toLocalDate()));
      }
      rs.close();
      super.close();
    } catch (SQLException e) {
      System.err.println(e.getMessage());
    }
    return templist;
  }

  @Override
  public void updateBoard(int no, Board board) {
    String query = "UPDATE board SET title = '" + board.getBtitle()
        + "', content = '" + board.getBcontent()
        + "', writer = '" + board.getBwriter() + "' "
        + "WHERE no = " + no;
    ResultSet rs = null;
    super.excute(query);
    super.close();

  }

  public void printBoard() {
    listAllBoard().forEach(no -> {
      System.out.printf("%d%10s%20s%30s\n", no.getBno(), no.getBwriter(), no.getStringDate(),
          no.getBtitle());
    });

  }
}