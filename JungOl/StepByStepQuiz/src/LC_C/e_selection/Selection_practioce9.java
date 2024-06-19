package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_practioce9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.printf("%d", ((a>b)? a : b));

        br.close();
    }
}

//Quiz.두 개의 정수를 입력받아 조건연산자를 이용하여 두 수중 큰 수를 출력하는 프로그램을 작성하시오. 