package LC_C.j_array_two;

public class array2_Diagnosis7 {

  public static void main(String[] args) {
    int n = 5;
    int[][] arrInt = new int[n+1][n+1];

    arrInt[0][0] = 1;
    for(int x=1; x<arrInt[0].length ; x++) {
      arrInt[0][x] = 1;
      System.out.printf("%d ", arrInt[0][x]);
    }
    System.out.println();

    for(int v=1; v<arrInt.length-1 ; v++) {

      for(int h=1; h<arrInt[v].length ; h++) {
        arrInt[v][h] = arrInt[v-1][h] + arrInt[v][h-1];
        System.out.printf("%d ", arrInt[v][h]);
      }
      System.out.println();
    }
  }
}
//Quiz.배열을 만들어서 아래와 같이 저장한 후 출력하는 프로그램을 작성하시오.
// 규칙은 첫 번째 행은 모두 1로 초기화 하고
// 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한 것이다.
//1 1 1 1 1
//1 2 3 4 5
//1 3 6 10 15
//1 4 10 20 35
//1 5 15 35 70

