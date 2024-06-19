package LC_C.h_loop_three;
import java.io.*;
public class loop3_Diagnosis1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num =1, sum=0, cnt=0;

        while (true) {
            if(num%2 !=0) {
                sum += num;
                cnt++;
            }

            if(sum >= n) {
                break;
            }
            num++;
        }
        System.out.printf("%d %d",cnt,sum);

        br.close();
    }
}

//Quiz. 자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서
// 합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.