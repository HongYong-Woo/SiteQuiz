package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(a>=b)
            System.out.printf("%d", a-b);
        else
            System.out.printf("%d", b-a);

        br.close();
    }
}
//Quiz. 두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.