package m_Collection3_makeBoard_20240711;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import m_Collection3_makeBoard_20240711.interfaces.BoardIO;
import m_Collection3_makeBoard_20240711.lib.ObjectDBIO;
import org.json.JSONObject;

public abstract class BoardDAO extends ObjectDBIO implements BoardIO {

  /** board 추가 */
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

    super.execute(query);
    super.resetIndex();
    super.close();
  }

  /**
   * board 삭제
   * 삭제할 번호 no
   */
  @Override
  public void deleteBoard(int no) {
    String query = "DELETE FROM board WHERE no = " + no;
    super.execute(query);
    super.resetIndex();
    super.close();

  }

  /**
   * 전체 삭제
   */
  @Override
  public void clearBoard() {
    String query = "TRUNCATE TABLE board";
    super.execute(query);
    super.resetIndex();
    super.close();
  }

  /**
   * board 검색
   * 읽을 board 번호 no
   * @return board
   */
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

  /**
   * board list 전체 조회
   * @return ArrayList
   */
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

  /**
   * board 수정
   * 수정할 board번호 no
   * 수정할 board board
   */
  @Override
  public void updateBoard(int no, Board board) {
    String query = "UPDATE board SET title = '" + board.getBtitle()
        + "', content = '" + board.getBcontent()
        + "', writer = '" + board.getBwriter() + "' "
        + "WHERE no = " + no;
    ResultSet rs = null;
    super.execute(query);
    super.close();

  }

  /**
   * board List 전체 출력
   */
  public void printBoard() {
    listAllBoard().forEach(no -> {
      System.out.printf("%d%10s%20s%20s\n", no.getBno(), no.getBwriter(), no.getStringDate(),
          no.getBtitle());
    });
  }

  /**
   * Json파일 생성
   * 생성할 board List boards
   */
  @Override
  public void CreateJsonFile(ArrayList<Board> boards) {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("boards", boards);

    try {
      Writer writer = new FileWriter("C:/Study/boards.json", StandardCharsets.UTF_8);
      String stringJson = jsonObject.toString();
      writer.write(stringJson);
      System.out.println("파일 생성이 완료 되었습니다.");
      writer.flush();
      writer.close();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }
}
