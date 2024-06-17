package g_loop_two;
import java.io.*;
import java.util.StringTokenizer;

public class loop2_Test6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum =0;
        int cnt =0;
        if(a>b) {
            for(int n = b; n<=a ; n++) {
                if(n%3==0 || n%5==0) {
                    sum +=n;
                    cnt++;
                }

            }
        }
        else {
            for (int n = a; n <= b; n++) {
                if(n%3==0 || n%5==0) {
                    sum +=n;
                    cnt++;
                }
            }
        }
        System.out.printf("sum : %d\navg : %.1f",sum, (double)sum/cnt);

        br.close();
    }
}
//Quiz. 두 개의 정수를 입력받아
// 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.
//
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)
