package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        System.out.println(a);

        if(a<0)
            System.out.println("minus");

        br.close();
    }
}
//Quiz.정수를 입력받아
// 첫 줄에 입력 받은 숫자를 출력하고
// 둘째 줄에 음수이면 “minus” 라고 출력하는 프로그램을 작성하시오.