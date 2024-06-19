package LC_C.f_loop_one;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_diagnosis4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num =0;
        int cnt =0;
        int sum=0;
        while(true) {
            num = Integer.parseInt(st.nextToken());
            sum +=num;
            cnt++;
            if(num >= 100) break;

        }
        System.out.printf("%d\n%.1f",sum, (double)sum/cnt);

        br.close();
    }
}
//Quiz. 정수를 계속 입력받다가 100 이상의 수가 입력이 되면
// 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.

//(평균은 반올림하여 소수 첫째자리까지 출력한다.)