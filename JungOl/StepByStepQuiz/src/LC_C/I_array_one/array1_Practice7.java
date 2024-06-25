package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Practice7 {

  public static void main(String[] args) throws IOException{
    int[] arrayInt = new int[10];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max=0, min=0;
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());

      if(arrayInt[n]%2==0 && max <arrayInt[n])
        max = arrayInt[n];

      if(arrayInt[n]%2 !=0 && min > arrayInt[n])
        min = arrayInt[n];
    }
    System.out.println(min + " " + max);
    br.close();
  }
}
//Quiz.4자리 이하의 10개의 정수를 입력받아 짝수 중 가장 큰 값과 홀수 중 가장 작은 값을 출력하는 프로그램을 작성하시오.
//-5 10 -8 55 6 -31 12 -24 61 2
//-31 12

