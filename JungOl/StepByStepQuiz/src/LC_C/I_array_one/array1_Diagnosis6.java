package LC_C.i_array_one;

import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis6 {

  public static void main(String[] args) throws IOException{
    int[] arrayInt = new int[10];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int n=0; n< arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    int min = arrayInt[0];
    for(int n=0; n<arrayInt.length ; n++) {
      if(min > arrayInt[n])
        min = arrayInt[n];
    }
    System.out.println(min);

    br.close();
  }
}

//Quiz. 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
// (입력받을 정수는 1000을 넘지 않는다.)
//input : 5 10 8 55 6 31 12 24 61 2
//2
