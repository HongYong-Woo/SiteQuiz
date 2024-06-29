package LC_C.j_array_two;
import java.io.*;
import java.util.StringTokenizer;

public class array2_Test2 {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrInt = new int[11];
    int cnt = st.countTokens();
    int num =0;
    for(int n=0; n<cnt ; n++) {
      num = Integer.parseInt(st.nextToken());
      if(num ==0)
        break;

      arrInt[(num/10)]++; //10일때 범위가 벗어남
    }

    for(int n=arrInt.length-1; n>=0 ; n--) {
      if(arrInt[n] !=0)
        System.out.printf("%d : %d person\n", n*10, arrInt[n]);
    }

    br.close();
  }
}
//Quiz. 학생들의 점수를 입력을 받다가
// 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여
// 점수대별 학생 수를 출력하는 프로그램을 작성하시오.
// (1명도 없는 점수는 출력하지 않는다.)학생은 최대 100명이하이다.
//input : 63 80 95 100 46 64 88 0
//100 : 1 person
//90 : 1 person
//80 : 2 person
//60 : 2 person
//40 : 1 person
