package LC_C.I_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Practice1 {

  public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] arrayInt = new int[5];
      for(int n=0; n<arrayInt.length ; n++) {
        arrayInt[n] = Integer.parseInt(st.nextToken());
      }

      for(Integer i : arrayInt) {
        System.out.printf("%d ", i);
      }

  }
}

//Quiz.5개의 정수를 입력받은 후 차례로 출력하는 프로그램을 작성하시오.
//input : 5 10 9 3 2
//5 10 9 3 2
