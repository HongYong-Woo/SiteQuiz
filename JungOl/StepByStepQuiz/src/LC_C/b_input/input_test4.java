package LC_C.b_input;
import  java.io.*;
import java.util.StringTokenizer;

public class input_test4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.printf("sum = %d", a+b+c);
    }
}

//Quiz. 세 개의 정수를 입력받아 합을 출력하는 프로그램을 작성하시오.
//(자기주도 C언어 10판에 맞게 수정하였습니다.)

