package LC_C.b_input;
import  java.io.*;


public class input_Diagnosis9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double a = Double.parseDouble(br.readLine());
        Double b = Double.parseDouble(br.readLine());
        Double c = Double.parseDouble(br.readLine());

        System.out.printf("%.3f\n%.3f\n%.3f",a,b,c);

    }
}
//Quiz. 세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.