package m_Collection3_makeBoard_20240711.service;

import java.util.ArrayList;
import lombok.Getter;

import m_Collection3_makeBoard_20240711.vo.Board;

@Getter
public class BoardManager extends ServiceMenu{

  @Getter
  private static final BoardManager instance = new BoardManager();

  private BoardManager() {
  }

}
