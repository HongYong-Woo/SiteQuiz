package LC_C.i_array_one;

import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis7 {

  public static void main(String[] args) throws IOException{
    int[] arrayInt = new int[10];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max =0, min = 10000;
    for(int n=0; n<arrayInt.length; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());

      if(100> arrayInt[n] && max < arrayInt[n])
        max = arrayInt[n];

      if(100<= arrayInt[n] &&  min> arrayInt[n])
        min = arrayInt[n];
    }
    if(max == 0)
      max = 100;

    if(min == 10000)
      min = 100;
    System.out.println(max + " " + min);
    br.close();

  }
}

//Quiz.10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와
// 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
//
//(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
//input : 88 123 659 15 443 1 99 313 105 48
//99 105