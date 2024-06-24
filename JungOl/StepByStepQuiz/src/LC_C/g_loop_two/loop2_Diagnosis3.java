package LC_C.g_loop_two;
import java.io.*;
public class loop2_Diagnosis3 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int n =1; n<=num; n++) {
            if(n%2 ==0)
                System.out.printf("%d ",n);
        }
    }
}

//Quiz.하나의 정수를 입력받아
// 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오. 입력되는 정수는 50이하이다.