package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test9 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[st.countTokens()];
    int cnt=0;
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());

      if(arrayInt[n] ==0)
        break;

      cnt++;
    }
    System.out.println(cnt);
    for(int n=0; n<cnt ; n++) {
      if (arrayInt[n] % 2 == 0)
        System.out.printf("%d ", arrayInt[n] / 2);
      else {
        System.out.printf("%d ", arrayInt[n] * 2);
      }
    }
    br.close();
  }
}

//Quiz.정수를 입력받다가 0 이 입력되면 0 을 제외하고 그 때까지 입력 받은 개수를 출력한 후
//입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을,
//짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
//
//입력되는 정수의 개수는 100개 이하이다.
//input : 8 10 5 15 100 0
//5
//4 5 10 30 50