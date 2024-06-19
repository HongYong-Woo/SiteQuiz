package LC_C.d_debugging;
import java.io.*;
import java.util.StringTokenizer;

public class Debugging_diagnosis1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());


        //출력
        System.out.printf("%d %d", (int)(a*b), (int)a*(int)b);
    }
}

//Quiz. 2개의 실수(double)를 입력 받아서
// 두 수의 곱을 정수로 변환한 결과값과
// 두 수를 각각 정수로 변환하여 곱을 구한 결과값을 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오.
