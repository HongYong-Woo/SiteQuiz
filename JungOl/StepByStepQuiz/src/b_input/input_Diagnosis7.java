package b_input;
import  java.io.*;
import java.util.StringTokenizer;

public class input_Diagnosis7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d * %d = %d\n%d / %d = %d", a,b,a*b,a,b,a/b);

    }
}

//Quiz. 두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
//(먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)