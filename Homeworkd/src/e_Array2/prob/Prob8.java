package e_Array2.prob;

public class Prob8 {

  public static void main(String[] args) {
    int[][] arrayInt = new int[5][5];

    //값 입력
    for(int v=0; v<arrayInt.length ; v++) {
      for(int h=0; h<arrayInt[v].length ; h++) {
        arrayInt[v][h] = (v+1)*5 - h;
      }
    }

    //값 출력
    for(int v=0; v<arrayInt.length ; v++) {
      for(int h=0; h<arrayInt[v].length ; h++) {
        System.out.printf("[v][h] : %d\t", arrayInt[v][h]);
      }
      System.out.println();
    }

  }

}
