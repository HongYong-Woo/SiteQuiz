package LC_C.f_loop_one;
import java.io.*;
public class Loop_diagnosis5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num =0;

        while (true) {
            num = Integer.parseInt(br.readLine());

            if(num == -1)
                break;

            if(num%3 ==0)
                System.out.printf("%d\n", num/3);
        }
    }
}
//Quiz.정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고
//3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
//-1이 입력되면 종료하는 프로그램을 작성하시오.

