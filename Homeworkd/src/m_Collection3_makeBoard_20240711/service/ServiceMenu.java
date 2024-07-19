package m_Collection3_makeBoard_20240711.Service;

import java.io.BufferedReader;
import java.io.IOException;
import m_Collection3_makeBoard_20240711.DAO.BoardDAO;
import m_Collection3_makeBoard_20240711.VO.Board;

public abstract class ServiceMenu extends BoardDAO {

  /** 생성 메뉴 */
  public void createMenu(BufferedReader br){
    System.out.println("[새 게시물 입력]");

    Board board = inputDate(br);
    BoardManager.getInstance().insertboard(board);
  }

  /**
   * 읽기 메뉴
   */
  public void readMenu(BufferedReader br) {
    boolean isOn = true;
    while (isOn) {
      try {
        System.out.println("[게시물 읽기]");
        System.out.print("bno : ");
        int bno = Integer.parseInt(br.readLine());
        System.out.println("####################");
        Board board = BoardManager.getInstance().searchBoard(bno);

        System.out.println(board.toString());
        int selectnum = 0;
        System.out.println("-----------------------------");
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List | ");
        System.out.print("메뉴 선택 : ");
        selectnum = Integer.parseInt(br.readLine());
        switch (selectnum) {
          case 1 -> {updateMenu(bno, br); isOn = false;}
          case 2 -> {deleteMenu(bno); isOn = false; }
          case 3 -> {
            BoardManager.getInstance().listAllBoard();
            isOn = false;
          }
          default -> throw new NumberFormatException();
        }
      } catch (NumberFormatException e) {
        System.err.println(e.getMessage());
        System.out.println("입력 범위를 벗어났습니다. 다시 입력하여 주세요");
      } catch (IOException e) {
        System.err.println(e.getMessage());
      }
    }
  }


  /**
   * 수정 메뉴
   * 수정할 번호 bno
   */
  public void updateMenu(int bno, BufferedReader br) {
    boolean isOn = true;
    while (isOn) {
      System.out.println("[수정 내용 입력]");
      Board board = inputDate(br);
      System.out.println("-----------------------------");
      System.out.println("보조 메뉴 : 1.Ok | 2.Cancel");
      System.out.print("메뉴 선택 : ");
      try {
        switch (Integer.parseInt(br.readLine())) {
          case 1 -> {
            BoardManager.getInstance().updateBoard(bno,board);
            isOn = false;
          }
          case 2 -> isOn = false;
          default -> throw new NumberFormatException();
        }

      } catch (NumberFormatException e) {
        System.err.println(e.getMessage());
        System.out.println("입력 범위를 벗어났습니다. 다시 입력하여 주세요");
      }catch (IOException e) {
        System.err.println(e.getMessage());
      }
    }
  }

  /**
   * 삭제 메뉴
   * 삭제할 번호 bno
   */
  private void deleteMenu(int bno) {

    BoardManager.getInstance().deleteBoard(bno);
  }

  /**
   * 전체 삭제 메뉴
   */
  public void clearMenu() {
    System.out.println("모든 정보를 삭제합니다.");
    BoardManager.getInstance().clearBoard();
  }

  /** Json파일 생성 매뉴 */
  public void createJsonMenu() {
    BoardManager.getInstance().CreateJsonFile(BoardManager.getInstance().listAllBoard());
  }

  /** board 정보 입력 */
  public Board inputDate(BufferedReader br){
    String title = null;
    String content = null;
    String writer = null;
    try {
      System.out.print("제목 : ");
      title = br.readLine();
      System.out.print("내용 : ");
      content = br.readLine();
      System.out.print("작성자 : ");
      writer = br.readLine();
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }

    return new Board(title, content, writer);//
  }

}
