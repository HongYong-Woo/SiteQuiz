package LC_C.j_array_two;

public class array2_Practice4 {

  public static void main(String[] args) {
    int[][] arrInt = new int[][]{{3,5,4},{2,6,7},{8,10,1}};
    for(int v=0; v<arrInt.length ; v++) {
      for(int h=0; h<arrInt[v].length ; h++) {
        System.out.printf("%d ", arrInt[v][h]);
      }
      System.out.println();
    }
  }
}
//Quiz.3행 3열의 배열을 선언하고 아래의 출력 예와 같이 초기화한 후 출력하는 프로그램을 작성하시오.
//3 5 4
//2 6 7
//8 10 1
