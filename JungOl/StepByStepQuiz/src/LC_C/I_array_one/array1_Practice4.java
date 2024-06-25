package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Practice4 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[100];
    int cnt=0;
    for(int n=0; n< arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
      if(arrayInt[n] == 0)
        break;

      cnt++;
    }

    for(int n=0; n<cnt ; n++) {
      if((n+1)%2==0) {
        System.out.printf("%d ", arrayInt[n]);
      }
    }
    br.close();
  }

}
//Quiz. 최대 100개까지의 정수를 차례로 입력받다가 0이 입력되면 입력을 중단하고 짝수 번째에 입력된 정수를 모두 출력하는 프로그램을 작성하시오.
//input : 11 25 3 9 15 6 8 7 12 0
//25 9 6 7
