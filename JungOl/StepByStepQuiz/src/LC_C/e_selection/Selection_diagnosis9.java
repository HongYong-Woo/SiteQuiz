package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int min = (a<b)? a:b;
        min = (min<c)? min:c;

        System.out.printf("%d", min);

        br.close();
    }
}

//Quiz.3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.