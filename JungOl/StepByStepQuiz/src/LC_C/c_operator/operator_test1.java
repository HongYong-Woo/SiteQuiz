package LC_C.c_operator;
import  java.io.*;
import java.util.StringTokenizer;

public class operator_test1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int kor = Integer.parseInt(st.nextToken());
        int eng = Integer.parseInt(st.nextToken());
        int math = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());

        int sum = kor + eng + math + com;

        System.out.printf("sum %d%navg %d", sum, sum/4);


        br.close();
    }
}
//Quiz. 국어 영어 수학 컴퓨터 과목의 점수를 정수로 입력받아서 총점과 평균을 구하는 프로그램을 작성하시오. (단 평균의 소수점 이하는 버림 한다.)