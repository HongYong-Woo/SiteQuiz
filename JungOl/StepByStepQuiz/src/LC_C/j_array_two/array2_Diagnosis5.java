package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Diagnosis5 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arrInt1 = new int[2][4];
    int[][] arrInt2 = new int[2][4];

    System.out.println("first array");
    st = new StringTokenizer(br.readLine());
    for(int n=0; n<arrInt1[0].length ; n++) {
      arrInt1[0][n] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for(int n=0; n<arrInt1[1].length ; n++) {
      arrInt1[1][n] = Integer.parseInt(st.nextToken());
    }

    System.out.println("second array");
    st = new StringTokenizer(br.readLine());
    for(int n=0; n<arrInt2[0].length ; n++) {
      arrInt2[0][n] = Integer.parseInt(st.nextToken());
    }
    st = new StringTokenizer(br.readLine());
    for(int n=0; n<arrInt2[1].length ; n++) {
      arrInt2[1][n] = Integer.parseInt(st.nextToken());
    }

    int[][] arrInt3 = new int[2][4];
    for(int v=0; v<arrInt3.length ; v++) {
      for(int h=0; h<arrInt3[v].length ; h++) {
        arrInt3[v][h] = arrInt1[v][h] * arrInt2[v][h];
        System.out.printf("%d ",arrInt3[v][h]);
      }
      System.out.println();
    }

  br.close();
  }
}

//Quiz.2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
//입력
//"first array"라고 출력한 후 두 줄에 걸쳐 첫 번째 배열의 원소들을 입력받는다.
//"second array"라고 출력한 후 두 줄에 걸쳐 두 번째 배열의 원소들을 입력받는다.
//input : first array
//1 2 3 4
//5 6 7 8
//second array
//1 4 7 8
//3 6 9 8
//output :
//1 8 21 32
//15 36 63 64
