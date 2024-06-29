package LC_C.j_array_two;

import java.io.*;
public class array2_Test9 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    if(num<=10) {
      int[][] pascaltri = new int[num+1][num+1];

      pascaltri[0][0] = 1;
      for(int v=1; v<pascaltri.length ; v++) {
        for(int h=1; h<=v ; h++) {
          pascaltri[v][h] = pascaltri[v-1][h-1] + pascaltri[v-1][h];
        }
      }

      for(int v = pascaltri.length-1; v>0 ; v--) {
        for(int h=v ; h>0 ; h--) {
          System.out.printf("%d ", pascaltri[v][h]);
        }
        System.out.println();
      }
      br.close();

    }
  }
}
//Quiz.행의 크기를 입력받아 파스칼 삼각형을 작성하여
// 마지막 행부터 첫 번째 행까지 차례로 출력하는 프로그램을 작성하시오.
// 행의 크기는 최대 10이다.
//input : 6
//1 5 10 10 5 1
//1 4 6 4 1
//1 3 3 1
//1 2 1
//1 1
//1
