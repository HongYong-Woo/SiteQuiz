package b_input;
import java.io.*;
import java.util.StringTokenizer;

public class input_Diagnosis8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        String c = br.readLine();

        System.out.printf("%.2f\n%.2f\n%s", a,b,c);


    }
}
//Quiz.실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
//(C, C++, Java 의 경우 실수는 "double"로 선언하세요.)
