package LC_C.j_array_two;

public class array2_Practice7 {

  public static void main(String[] args) {
    int n = 5;

    int[][] pascalTriangle = new int[n+1][n+1];
    //triangle[x][y] = triangle[x-1][y-1] + triangle[x-1][y]
    pascalTriangle[0][0] = 1;
    for(int v =1; v<pascalTriangle.length ; v++) {
      for(int h=1; h<=v ; h++) {
        pascalTriangle[v][h] = pascalTriangle[v-1][h-1] + pascalTriangle[v-1][h];
        System.out.printf("%d ", pascalTriangle[v][h]);
      }
      System.out.println();
    }
  }
}
//Quiz.아래와 같은 파스칼 삼각형을 출력하는 프로그램을 작성하시오.
// 파스칼 삼각형은 첫 번째 줄 첫 번째 행을 1로 초기화한 후
// 다음 줄부터는 바로 위의 값과 바로 위 왼쪽의 값을 더한 값이 된다.
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1

