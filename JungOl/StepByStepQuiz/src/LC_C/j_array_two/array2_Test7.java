package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Test7 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arrInt1 = new int[2][3];
    int[][] arrInt2 = new int[2][3];

    System.out.println("first array");
    for(int v=0; v<arrInt1.length ; v++) {
      st = new StringTokenizer(br.readLine());
      for(int h=0; h<arrInt1[v].length ; h++) {
        arrInt1[v][h] = Integer.parseInt(st.nextToken());
      }
    }
    System.out.println("second array");
    for(int v=0; v<arrInt2.length ; v++) {
      st = new StringTokenizer(br.readLine());
      for(int h=0; h<arrInt2[v].length ; h++) {
        arrInt2[v][h] = Integer.parseInt(st.nextToken());
      }
    }

    for(int v=0; v<arrInt2.length ; v++) {
      for(int h=0; h<arrInt2[v].length ; h++) {
        System.out.printf("%d ", arrInt1[v][h] * arrInt2[v][h]);
      }
      System.out.println();
    }

    br.close();
  }
}
//Quiz.2행 3열 배열을 두 개 선언하여 각각의 값을
// 입력 받은 후 두 배열의 같은 위치끼리 곱하여
//새로운 배열에 저장한 후 출력하는 프로그램을 작성하시오.
//input
//first array
//3 6 9
//8 5 2
//second array
//9 8 7
//6 5 4

//27 48 63
//48 25 8