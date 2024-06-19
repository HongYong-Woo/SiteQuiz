package LC_C.h_loop_three;
import java.io.*;
public class loop3_Test2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int mul = 0;

        for(int n=1; n< 100 ; n++) {
            mul = num * n;
            if(mul >100)
                break;
            System.out.printf("%d ", mul);
            if(mul %10 ==0)
                break;
        }
        br.close();
    }
}
//QUiz. 1부터 100까지의 정수 중 한 개를 입력받아
// 100 보다 작은 배수들을 차례로 출력하다가 10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
