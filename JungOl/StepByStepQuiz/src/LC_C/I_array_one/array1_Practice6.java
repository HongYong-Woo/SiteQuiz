package LC_C.i_array_one;

import java.io.*;
import java.util.StringTokenizer;

public class array1_Practice6 {

  public static void main(String[] args) throws IOException{
    int[] arrayInt = new int[10];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int n = 0; n< arrayInt.length ; n++){
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    int max=0;
    for(int n=0; n<arrayInt.length; n++) {
      if(max < arrayInt[n])
        max = arrayInt[n];
    }

    System.out.println(max);
    br.close();
  }

}
//Quiz.10개의 자연수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램을 작성하시오.
//input : 5 10 8 55 6 31 12 24 61 2
//61
//