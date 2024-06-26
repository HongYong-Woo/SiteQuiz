package e_Array2.prob;

import java.io.*;
import java.util.StringTokenizer;

public class SortUtil {
	public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    System.out.print("정수를 입력하시오 : ");
    st = new StringTokenizer(br.readLine());
    int[] arrInt = new int[st.countTokens()];
    SortUtil su = new SortUtil();

    for(int n=0; n<arrInt.length ; n++) {
      arrInt[n] = Integer.parseInt(st.nextToken());
    }

    System.out.println("입력 배열");
    for(Integer i : arrInt) {
      System.out.printf("%d ", i);
    }
    System.out.println();

    System.out.println("출력 배열(오름차순)");
    int[] sortArr = su.ascending(arrInt);
    for(Integer i : sortArr) {
      System.out.printf("%d ", i);
    }
    System.out.println();

	}
	public int[] ascending(int[] inputNumbers) {
    // implements ascending method.
    int[] tempArr = inputNumbers;
    int temp= 0;
    for(int v=0; v<tempArr.length ; v++) {
      for(int h=0; h<tempArr.length ; h++) {
        if(tempArr[v] < tempArr[h]) {
          temp = tempArr[v];
          tempArr[v] = tempArr[h];
          tempArr[h] = temp;
          h=0;
        }
      }
    }
    return tempArr;
	}
}
