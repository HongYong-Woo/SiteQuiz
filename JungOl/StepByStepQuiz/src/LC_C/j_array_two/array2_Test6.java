package LC_C.j_array_two;

public class array2_Test6 {

  public static void main(String[] args) {
    int arrayNumber = 5;
    int[][] arrInt = new int[arrayNumber][arrayNumber];
    arrInt[0][0] = 1;
    arrInt[0][2] = 1;
    arrInt[0][4] = 1;

    for(int v=0 ; v< arrInt.length ; v++) {
      for(int h=0 ; h<arrInt[v].length ; h++) {
        if (v == 0) {
          System.out.printf("%d ", arrInt[v][h]);
        }
        else {
          if(h==0)
            arrInt[v][h] = arrInt[v-1][h+1];
          else if(h == arrInt.length-1)
            arrInt[v][h] = arrInt[v-1][h-1];
          else
            arrInt[v][h] = arrInt[v-1][h-1] + arrInt[v-1][h+1];

          System.out.printf("%d ", arrInt[v][h]);
        }
      }
      System.out.println();
    }
  }
}
//QUiz.예제를 보고 적당한 배열을 선언한 후
// 1행의 1열과 3열 5열을 각각 1로 초기화하고
// 나머지는 모두 0으로 초기화 한 후
// 2행부터는 바로 위행의 왼쪽과 오른쪽의 값을 더하여 채운 후 출력하는 프로그램을 작성하시오.
//1 0 1 0 1
//0 2 0 2 0
//2 0 4 0 2
//0 6 0 6 0
//6 0 12 0 6