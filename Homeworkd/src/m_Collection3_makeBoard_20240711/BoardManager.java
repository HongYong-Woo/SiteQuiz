package m_Collection3_makeBoard_20240711;

import java.util.ArrayList;

public class BoardManager extends BoardDAO{

  public static final BoardManager instance = new BoardManager();

  private BoardManager() {
  }

  public static BoardManager getInstance() {
    return  instance;
  }

  @Override
  public void deleteBoard() {
    return;
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
    return null;
  }

  @Override
  public void updateBoard() {

  }
}
