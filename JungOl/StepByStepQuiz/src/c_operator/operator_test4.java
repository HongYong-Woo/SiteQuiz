package c_operator;
import java.io.*;
import java.util.StringTokenizer;

public class operator_test4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());



        System.out.printf("%d %d\n%d %d\n", ++a, b--, a,b);
        System.out.println("a = " + a);

        br.close();
    }
}

//Quiz. 두 정수를 입력받아 첫 번째 수는 전치증가연산자를 사용하고
// 두 번째 수는 후치감소연산자를 사용하여 출력하고 바뀐 값을 다시 출력하는 프로그램을 작성하시오.
