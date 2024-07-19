package m_Collection3_makeBoard_20240711.Service;

import java.util.ArrayList;
import lombok.Getter;

import m_Collection3_makeBoard_20240711.VO.Board;

@Getter
public class BoardManager extends ServiceMenu{

  @Getter
  private static final BoardManager instance = new BoardManager();

  private BoardManager() {
  }

  @Override
  public void insertboard(Board board) {
    super.insertboard(board);
  }

  @Override
  public void deleteBoard(int bno) {
    super.deleteBoard(bno);
  }

  @Override
  public void clearBoard() {
    super.clearBoard();
  }

  @Override
  public Board searchBoard(int no) {
    return super.searchBoard(no);
  }

  @Override
  public ArrayList<Board> listAllBoard() {
    return super.listAllBoard();
  }

  @Override
  public void updateBoard(int no, Board board) {
    super.updateBoard(no, board);
  }
}