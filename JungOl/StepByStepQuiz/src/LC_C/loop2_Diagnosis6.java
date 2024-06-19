package LC_C;
import  java.io.*;
import java.util.StringTokenizer;

public class loop2_Diagnosis6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum =0;
        double avg =0;
        for(int n=1; n<= subNum ;n++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num;
        }

        avg = (double) sum/subNum;
        System.out.printf("avg : %.1f\n",avg);
        if(avg >= 80)
            System.out.println("pass");
        else
            System.out.println("fail");

    }
}

//Quiz.10 이하의 과목수 n이 주어진다.
//정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고
//평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.
//평균은 반올림하여 소수 첫째자리까지 출력한다.