package m_Collection3_makeBoard_20240711;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardExample {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    BoardExample be = new BoardExample();

    be.mainMenu();

  br.close();

  }

  public void mainMenu()throws IOException {
    int selectMenu =0;
    boolean isOn = true;
    List<Board> temp = new ArrayList<>();
    while (isOn) {
      System.out.println("[게시물 목록]");
      System.out.println("-----------------------------------------");
      System.out.printf("no\t\twriter\t\tdate\t\ttitle\n");
      System.out.println("-----------------------------------------");
      temp = BoardManager.getInstance().listAllBoard();
      System.out.println("-----------------------------------------");
      System.out.println("메인 메누 : 1.Create | 2.Read | 3.Clear | 4.EXit");
      System.out.printf("메뉴 선택 : ");
      try {
        selectMenu = Integer.parseInt(br.readLine());
        switch (selectMenu) {
          case 1:
            createMenu();
            break;
          case 2:
            readMenu();
            break;
          case 3:
            clearMenu();
            break;
          case 4:
            System.out.println("** 게시판 종료 **");
            isOn = false;
            break;
          default:
            System.out.println("범위를 벗어났습니다. 다시 입력하여 주세요");
            break;
        }
      } catch (NumberFormatException e) {
        System.err.println(e.getMessage());
        System.out.println("숫자를 입력하여 주십시오");
      }
    }
  }
  public void createMenu() throws IOException{
    List<String> list = new ArrayList<>();
    System.out.println("[새 게시물 입력]");
    System.out.printf("제목 : ");
    list.add(br.readLine());
    System.out.printf("내용 : ");
    list.add(br.readLine());
    System.out.printf("작성자 : ");
    list.add(br.readLine());

    Board board = new Board(list.get(0), list.get(1), list.get(2));
    BoardManager.getInstance().insertboard(board);


  }
  public void readMenu(){}
  public void clearMenu() {}
}
