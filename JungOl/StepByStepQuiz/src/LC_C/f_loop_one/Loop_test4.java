package LC_C.f_loop_one;

import java.io.*;
import java.util.StringTokenizer;

public class Loop_test4 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;
        int cnt=0;
        while (true) {
            num = Integer.parseInt(st.nextToken());

            if(num ==0)
                break;
            else if(num%3 !=0 && num%5 !=0)
                cnt++;
        }

        System.out.println(cnt);

    }
}

//Quiz.0 이 입력될 때까지 정수를 계속 입력받아
// 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.