package LC_C.d_debugging;

import java.io.*;
import java.util.StringTokenizer;

public class Debugging_test1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        //출력
        System.out.printf("%.1f",((float)(a+b+c)/3));
    }
}
//Quiz. 정수로 된 3과목의 점수를 입력받아
// 평균을 구한 후 반올림하여 소수 첫째자리까지 출력하는 프로그램을 작성하시오.