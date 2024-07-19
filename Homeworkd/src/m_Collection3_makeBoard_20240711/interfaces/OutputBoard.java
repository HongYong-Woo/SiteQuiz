package m_Collection3_makeBoard_20240711.interfaces;

import java.util.ArrayList;
import m_Collection3_makeBoard_20240711.VO.Board;

public interface OutputBoard {
  public ArrayList<Board> listAllBoard();
  public void CreateJsonFile(ArrayList<Board> boards);
}
