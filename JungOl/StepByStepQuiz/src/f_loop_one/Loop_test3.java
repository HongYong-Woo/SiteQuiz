package f_loop_one;
import  java.io.*;
import java.util.StringTokenizer;

public class Loop_test3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num =0;
        int cnt = st.countTokens();
        int check =0;
        int sum =0;

        for(int n=0; n< cnt; n++) {
            num = Integer.parseInt(st.nextToken());
            if(num >100 || num <0) {
                break;
            }
            check++;
            sum += num;
        }

        System.out.printf("sum : %d\navg : %.1f\n", sum, (double)sum/check);
    }
}

//Quiz.0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면
//그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
//        (평균은 반올림하여 소수 첫째자리까지 출력한다.)