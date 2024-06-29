package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Test3 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrInt = new int[10];
    arrInt[0] = Integer.parseInt(st.nextToken());
    arrInt[1] = Integer.parseInt(st.nextToken());
    int num =0;
    for(int n =2; n<arrInt.length ; n++) {
      num = arrInt[n-2] + arrInt[n-1];
      if(num >= 10)
        num %= 10;

      arrInt[n] = num;
    }

    for(Integer i : arrInt) {
      System.out.printf("%d ", i);
    }

    br.close();
  }
}
//QUiz.10 미만의 자연수 두 개를 입력받아서
//첫 번째 항과 두 번째 항을 입력받은 수로 초기화 시킨 후
//세 번째 항부터는 전전항과 전항의 합을 구하여
//그 합의 1의 자리로 채워서 차례로 10개를 출력하는 프로그램을 작성하시오.
//input : 3 5
//3 5 8 3 1 4 5 9 4 3