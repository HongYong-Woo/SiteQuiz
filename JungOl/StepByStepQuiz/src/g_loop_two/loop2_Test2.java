package g_loop_two;
import java.io.*;
import java.util.StringTokenizer;

public class loop2_Test2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a>b) {
            for(int n = b; n<=a ; n++)
                System.out.printf("%d ",n);
        }
        else {
            for(int n = a; n<=b ; n++)
                System.out.printf("%d ",n);
        }

        br.close();
    }
}
//Quiz. 100 이하의 두 개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력하는 프로그램을 작성하시오.
