package g_loop_two;
import java.io.*;
import java.util.StringTokenizer;

public class loop2_Test8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int x = 1; x<=a; x++) {
            int sum = x;
            for(int y = 1; y<=b; y++) {
                System.out.printf("%d ",sum);
                sum += x;
            }
            System.out.println();
        }

        br.close();
    }
}

//Quiz. 행과 열의 수를 입력받아 다음과 같이 출력하는 프로그램을 작성하시오.
//입력 : 3 4
//1 2 3 4
//2 4 6 8
//3 6 9 12