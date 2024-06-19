package LC_C.d_debugging;
import java.io.*;
import java.util.StringTokenizer;

public class Debugging_diagnosis2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //출력
        System.out.printf("%d %.2f",a/b, (float)a/b);
    }
}

//Quiz. 2개의 정수를 입력 받아서
// 첫 번째 수를 두 번째 수로 나눈 몫을 출력하고,
//첫 번째 수를 실수로 변환하여 두 번째 수로 나눈 값을 구한 후 반올림하여 소수 둘째 자리까지 출력하는 프로그램을 작성하고, 
//프로그램 내용에 관한 설명을 주석으로 표시하시오.