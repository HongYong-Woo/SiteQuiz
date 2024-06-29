package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Test8 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arrInt = new int[4][2];
    int[] horSum = new int[4];
    int[] verSum = new int[2];
    int size = 0, sum = 0;
    for (int v = 0; v < arrInt.length; v++) {
      size += arrInt[v].length;
      st = new StringTokenizer(br.readLine());
      for (int h = 0; h < arrInt[v].length; h++) {
        arrInt[v][h] = Integer.parseInt(st.nextToken());
        horSum[v] += arrInt[v][h];
        sum += arrInt[v][h];
      }
      horSum[v] /= arrInt[v].length;
      verSum[0] += arrInt[v][0];
      verSum[1] += arrInt[v][1];
    }
      verSum[0] /= arrInt.length;
      verSum[1] /= arrInt.length;

    for (Integer i : horSum) {
      System.out.printf("%d ", i);
    }
    System.out.println();
    for (Integer i : verSum) {
      System.out.printf("%d ", i);
    }
    System.out.println("\n" + sum / size);

    br.close();
  }
}
//Quiz.4행 2열의 배열을 입력받아
// 가로평균과 세로평균 그리고 전체평균을 출력하는 프로그램을 작성하시오.
// (소수점 이하는 버림 한다.)
//input
//16 27
//39 100
//19 88
//61 20

//output
//21 69 53 40
//33 58
//46
