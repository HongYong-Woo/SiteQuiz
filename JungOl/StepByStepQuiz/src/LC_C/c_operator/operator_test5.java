package LC_C.c_operator;
import java.io.*;
import java.util.StringTokenizer;

public class operator_test5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int minheight = Integer.parseInt(st.nextToken());
        int minweight = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int kiyoungheight = Integer.parseInt(st.nextToken());
        int kiyoungweight = Integer.parseInt(st.nextToken());

        System.out.printf("%b", (minheight > kiyoungheight && minweight > kiyoungweight));

        br.close();
    }
}

//Quiz. 민수와 기영이의 키와 몸무게를 입력받아
// 민수가 키도 크고 몸무게도 크면 1 그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
//(JAVA는 1 이면 true, 0 이면 false를 출력한다.)