package LC_C.f_loop_one;
import java.io.*;
import java.util.StringTokenizer;

public class Loop_test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int cnt = st.countTokens();
        int num =0;
        int odd =0, even =0;

        for(int n=0; n<cnt; n++) {
            num = Integer.parseInt(st.nextToken());

            if(num ==0)
                break;
            else if(num %2 ==0)
                even++;
            else
                odd++;
        }

        System.out.printf("odd : %d\neven : %d",odd, even);

    }
}
//Quiz. 0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.