package LC_C.d_debugging;
import java.io.*;
import java.util.StringTokenizer;

public class Debugging_practice2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        int a = Integer.parseInt(st.nextToken());

        //출력
        System.out.printf("%d / 4 = %d\n%d / 4.0 = %.2f",a, a/4, a, a/4.0f);
    }
}
//Quiz. 한 개의 정수를 입력받아 정수 4로 나눈 몫과 실수 4.0으로 나눈 결과값을 각각 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오. 
//(단, 실수는 반올림하여 소수 둘째자리까 지 출력한다.)