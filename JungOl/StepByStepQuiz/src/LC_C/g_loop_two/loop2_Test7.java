package LC_C.g_loop_two;
import java.io.*;
public class loop2_Test7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int n=1; n<=10 ; n++) {
            System.out.printf("%d ",a*n);
        }

        br.close();
    }
}

//Quiz. 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.