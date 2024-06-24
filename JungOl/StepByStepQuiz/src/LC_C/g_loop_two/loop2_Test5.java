package LC_C.g_loop_two;
import java.io.*;
import java.util.StringTokenizer;

public class loop2_Test5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int even=0, odd=0;

        for(int n=1; n<=10; n++) {
            int num = Integer.parseInt(st.nextToken());
            if(num %2==0)
                even++;
            else
                odd++;
        }
        System.out.printf("even : %d\nodd : %d",even,odd);

        br.close();
    }
}

//Quiz.10개의 정수를 입력받아
// 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.