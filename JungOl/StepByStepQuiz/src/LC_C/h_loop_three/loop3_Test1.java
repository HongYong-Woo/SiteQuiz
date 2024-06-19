package LC_C.h_loop_three;
import java.io.*;
import java.util.StringTokenizer;

public class loop3_Test1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num =0;
        int sum =0;
        double avg =0;
        int cnt =0;

        while (true) {
            num = Integer.parseInt(st.nextToken());

            if(num == 0)
                break;
            sum += num;
            cnt++;
            if(st.countTokens() ==0)
                break;
        }
        avg = (double) sum/cnt;
        System.out.printf("%d %d",sum, (int)avg );
        br.close();
    }
}
//Quiz. 정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이
// 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
//
//평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)
