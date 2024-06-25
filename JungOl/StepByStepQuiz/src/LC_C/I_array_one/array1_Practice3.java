package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Practice3 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arrayInt = new int[10];
    for(int n=0; n<arrayInt.length; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    System.out.println(arrayInt[2] + " " + arrayInt[4] + " " + arrayInt[9]);
  }

}
//Quiz.정수 10개를 입력받은 후 세 번째, 다섯 번째와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램을 작성하시오.
//input : 5 3 9 6 8 4 2 8 10 1
//9 8 1
