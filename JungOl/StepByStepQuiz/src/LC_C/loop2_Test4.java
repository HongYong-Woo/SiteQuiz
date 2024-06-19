package LC_C;
import java.io.*;
import java.util.StringTokenizer;

public class loop2_Test4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum =0;

        for (int n=0; n<num ; n++) {
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.printf("%.2f", (double)sum/num);
        br.close();
    }
}

//Quiz.100 이하의 자연수 n을 입력받고
// n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)