package LC_C.b_input;
import  java.io.*;
import java.util.StringTokenizer;

public class input_Diagnosis6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("height = ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int height = Integer.parseInt(st.nextToken());

        System.out.printf("Your height is %dcm.", height);

        br.close();
    }
}

//Quiz. 키를 입력받아 출력하는 프로그램을 작성하라.
//첫 줄에 키가 몇 cm인지 정수로 주어진다.
//입력을 받기 전 질문 "height = "를 출력한다.
//키를 출력형식에 맞춰 출력한다.