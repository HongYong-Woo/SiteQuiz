package m_Collection3_makeBoard_20240711;

import java.io.*;
import m_Collection3_makeBoard_20240711.service.BoardManager;


public class BoardExample {
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) {
    BoardExample be = new BoardExample();
    be.mainMenu();

  }
  /**메인 메뉴 */
  public void mainMenu(){
    int selectMenu = 0;
    boolean isOn = true;

    while (isOn) {
      System.out.println("[게시물 목록]");
      System.out.println("-------------------------------------------------------------");
      System.out.println("no\t\t\twriter\t\t\tdate\t\t\ttitle");
      System.out.println("-------------------------------------------------------------");
      BoardManager.getInstance().printBoard();
      System.out.println("-------------------------------------------------------------");
      System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.EXit | 5.Json 생성");
      System.out.print("메뉴 선택 : ");
      try {
        selectMenu = Integer.parseInt(br.readLine());
        switch (selectMenu) {
          case 1 -> BoardManager.getInstance().createMenu(br);
          case 2 -> BoardManager.getInstance().readMenu(br);
          case 3 -> BoardManager.getInstance().clearMenu();
          case 4 -> {
            System.out.println("** 게시판 종료 **");
            br.close();
            isOn = false;
          }
          case 5 -> BoardManager.getInstance().createJsonMenu();
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


}
