package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test2 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[5];

    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    System.out.println(arrayInt[0] + arrayInt[2] + arrayInt[4]);

    br.close();
  }

}
//Quiz. 5개의 정수를 입력받은 후 첫 번째 세 번째 다섯 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//input : 15 20 33 10 9
//57