package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test10 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arrayInt = new int[Integer.parseInt(br.readLine())];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for(int n=0; n<arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    int temp =0;
    for(int v=0; v<arrayInt.length ; v++) {
      for(int h=0; h<arrayInt.length ; h++) {
        if(arrayInt[v] > arrayInt[h]) {
          temp = arrayInt[v];
          arrayInt[v] = arrayInt[h];
          arrayInt[h] = temp;
        }
      }
    }

    for (Integer i : arrayInt) {
      System.out.println(i);
    }

    br.close();
  }
}
//Quiz. 20 이하의 정수 n을 입력받고
// n명의 점수를 입력받아 높은 점수부터 차례로 출력하는 프로그램을 작성하시오.
//input : 5
//input : 35 10 35 100 64
//100
//64
//35
//35
//10