public class SafeArea {

  //프로그래머스 코딩테스트 입문 : 안전지대
  public static void main(String[] args) {
    int[][] arrInt = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0}};
    SafeArea safeArea = new SafeArea();
    int result;
    result = safeArea.solution(arrInt);

    System.out.println(result);
  }

  public int solution(int[][] board) {
    int answer = board.length * board.length;
    int[][] tempArr = new int[board.length+2][board.length+2];
    int x=0, y=0;
    for (int v = 0; v < board.length; v++) {
      for (int h = 0; h < board[v].length; h++) {
        if(board[v][h] ==1) {
          x = v+1;
          y = h+1;
          tempArr[x-1][y-1] =1;
          tempArr[x-1][y] =1;
          tempArr[x-1][y+1] =1;
          tempArr[x][y-1] =1;
          tempArr[x][y]=1;
          tempArr[x][y+1]=1;
          tempArr[x+1][y-1]=1;
          tempArr[x+1][y]=1;
          tempArr[x+1][y+1]=1;
        }
      }
    }

    for(int v=1; v<tempArr.length-1; v++) {
      for(int h=1; h<tempArr[v].length-1 ; h++) {
        if(tempArr[v][h] ==1)
          answer--;
      }
    }


    return answer;
  }

}
