package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis9 {

  public static void main(String[] args)throws IOException {
    int[] arrayInt = new int[10];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    for(int n=0; n< arrayInt.length ; n++) {
      arrayInt[n] = Integer.parseInt(st.nextToken());
    }

    int temp=0;
    for(int x=0; x<arrayInt.length ; x++) {
      for(int y=0; y<arrayInt.length ; y++) {
        if(arrayInt[x] > arrayInt[y]) {
          temp = arrayInt[x];
          arrayInt[x] = arrayInt[y];
          arrayInt[y] = temp;
        }
      }
    }

    for(Integer i : arrayInt) {
      System.out.printf("%d ", i);
    }
    br.close();
  }
}
//Quiz. 10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
//input : 95 100 88 65 76 89 58 93 77 99
//100 99 95 93 89 88 77 76 65 58
