package LC_C.d_debugging;
import java.io.*;
import java.util.StringTokenizer;

public class Debugging_test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());

        //연산
        double sum = (int)a+(int)b+(int)c;
        double avg = (a+b+c)/3;

        //출력
        System.out.printf("sum %d\navg %d", (int)sum, (int)avg);
    }
}
//Quiz. 실수로 된 3과목의 점수를 입력받아
// 총점은 정수부분의 합계를 출력하고
// 평균은 실수의 평균을 구한 뒤 정수부분만 출력하는 프로그램을 작성하시오.
