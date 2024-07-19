package m_Collection3_makeBoard_20240711;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BoardExample {

  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {
    BoardExample be = new BoardExample();

    be.mainMenu();

    br.close();

  }

  public void mainMenu() throws IOException {
    int selectMenu = 0;
    boolean isOn = true;
    List<Board> temp = new ArrayList<>();
    while (isOn) {
      System.out.println("[게시물 목록]");
      System.out.println("------------------------------------------------------");
      System.out.printf("no\t\t\twriter\t\t\tdate\t\t\ttitle\n");
      System.out.println("------------------------------------------------------");
      BoardManager.getInstance().printBoard();
      System.out.println("------------------------------------------------------");
      System.out.println("메인 메누 : 1.Create | 2.Read | 3.Clear | 4.EXit | 5.Json파일 생성");
      System.out.printf("메뉴 선택 : ");
      try {
        selectMenu = Integer.parseInt(br.readLine());
        switch (selectMenu) {
          case 1 -> createMenu();
          case 2 -> readMenu();
          case 3 -> clearMenu();
          case 4 -> {
            System.out.println("** 게시판 종료 **");
            isOn = false;
          }
          case 5 -> createJsonMenu();
          default -> System.out.println("범위를 벗어났습니다. 다시 입력하여 주세요");
        }
      } catch (NumberFormatException e) {
        System.err.println(e.getMessage());
        System.out.println("숫자를 입력하여 주십시오");
      }
    }
  }

  public void createMenu() throws IOException {
    //List<String> list = new ArrayList<>();
    System.out.println("[새 게시물 입력]");
/*    System.out.printf("제목 : ");
    list.add(br.readLine());
    System.out.printf("내용 : ");
    list.add(br.readLine());
    System.out.printf("작성자 : ");
    list.add(br.readLine());*/

    Board board = inputDate();
    BoardManager.getInstance().insertboard(board);
  }

  public void readMenu() throws IOException {
    boolean isOn = true;
    while (isOn) {
      try {
        System.out.println("[게시물 읽기]");
        System.out.print("bno : ");
        int bno = Integer.parseInt(br.readLine());
        System.out.println("####################");
        Board board = BoardManager.getInstance().searchBoard(bno);
        if(board.getBtitle() == null) {
          throw new NumberFormatException();
        }
        System.out.println(board.toString());
        int selectnum = 0;
        System.out.println("-----------------------------");
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List | ");
        System.out.print("메뉴 선택 : ");
        selectnum = Integer.parseInt(br.readLine());
        switch (selectnum) {
          case 1 -> {updateMenu(bno); isOn = false;}
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
      }
    }
  }



  public void updateMenu(int bno) throws IOException {
    boolean isOn = true;
    while (isOn) {
      System.out.println("[수정 내용 입력]");
      /*System.out.print("제목 : ");
      String title = br.readLine();
      System.out.print("내용 : ");
      String content = br.readLine();
      System.out.print("작성자 : ");
      String writer = br.readLine();*/
      Board board = inputDate();
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
          default -> System.out.println("범위를 벗어났습니다. 다시 입력하여 주세요");
        }

      } catch (NumberFormatException e) {
        System.err.println(e.getMessage());
        System.out.println("숫자를 입력하여 주십시오");
      }
    }
  }

  private void deleteMenu(int bno) {

    BoardManager.getInstance().deleteBoard(bno);
  }

  public void clearMenu() {
    System.out.println("모든 정보를 삭제합니다.");
    BoardManager.getInstance().clearBoard();
  }

  public void createJsonMenu() {
    BoardManager.getInstance().CreateJsonFile(BoardManager.getInstance().listAllBoard());
  }

  public Board inputDate() throws IOException{
    System.out.print("제목 : ");
    String title = br.readLine();
    System.out.print("내용 : ");
    String content = br.readLine();
    System.out.print("작성자 : ");
    String writer = br.readLine();

    return new Board(title, content, writer);
  }
}
