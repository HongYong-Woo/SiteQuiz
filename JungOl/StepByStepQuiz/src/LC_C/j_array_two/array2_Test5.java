package LC_C.j_array_two;


import java.io.*;
import java.util.StringTokenizer;

public class array2_Test5 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arrInt = new int[4][3];
    int[] arrIntSum = new int[4];
    for(int v=0; v<arrInt.length ; v++) {
      System.out.printf("%dclass? ",v+1);
      st = new StringTokenizer(br.readLine());
      for(int h=0; h<arrInt[v].length ; h++) {
        arrInt[v][h] = Integer.parseInt(st.nextToken());
        arrIntSum[v] += arrInt[v][h];
      }
    }

    for(int n=0; n<arrIntSum.length ; n++) {
      System.out.printf("%dclass : %d\n", n+1, arrIntSum[n]);
    }
    br.close();
  }
}
//Quiz.호석이네 학교는 6학년이 네 반이 있는데 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다.
//반별로 세 명이 제기를 찬 개수를 입력받아 각 반별로 제기를 찬 개수의 합계를 출력하는 프로그램을 작성하시오.
//(반드시 배열을 이용하고 입력후에 출력하는 방식으로 하세요.)
//input
//1class? 15 2 35
//2class? 33 1 6
//3class? 5 10 19
//4class? 1 8 55

//output
//1class : 52
//2class : 40
//3class : 34
//4class : 64