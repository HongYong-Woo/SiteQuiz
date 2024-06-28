package LC_C.j_array_two;

import java.io.*;
public class array2_Diagnosis3 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] arrInt = new int[10];
    arrInt[0] =100;
    arrInt[1] = num;
    for(int n=2; n<arrInt.length; n++) {
      arrInt[n] = arrInt[n-2] - arrInt[n-1];

      if(arrInt[n] <0)
        break;
    }

    for(Integer i : arrInt) {
        System.out.printf("%d ",i);

        if(i <0)
          break;
    }
  }
}

//Quiz.100 이하의 자연수를 입력받아
// 첫 번째 항은 100으로 두 번째 항은 입력받은 수로 초기화하고
// 다음 항부터는 전전항에서 전항을 뺀 수로 채워나가는 수열을 작성하여 그 수가 음수가 나올 때까지 출력하는 프로그램을 작성하시오.
//input : 62
//100 62 38 24 14 10 4 6 -2
