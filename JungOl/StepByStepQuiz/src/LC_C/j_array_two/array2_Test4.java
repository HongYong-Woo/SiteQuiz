package LC_C.j_array_two;

public class array2_Test4 {

  public static void main(String[] args) {
    int[][] arrInt = new int[][]{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
    int sum = 0;
    for(int v=0; v<arrInt.length ; v++) {
      for(int h=0; h<arrInt[v].length ; h++) {
        System.out.printf("%d ", arrInt[v][h]);
        sum +=arrInt[v][h];
      }
      System.out.println();
    }
    System.out.println(sum);
  }
}
//Quiz. 4행 3열의 배열을 선언하고 아래의 값으로 초기화 한 후 차례대로 출력한 후
// 배열의 모든 값을 더한 결과를 출력하는 프로그램을 작성하시오.
//{{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}}
//3 5 9
//2 11 5
//8 30 10
//22 5 1
//111