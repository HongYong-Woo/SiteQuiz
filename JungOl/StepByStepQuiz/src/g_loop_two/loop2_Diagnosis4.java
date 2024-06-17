package g_loop_two;
import  java.io.*;
public class loop2_Diagnosis4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int n = num ; n<= 100; n++) {
            sum += n;
        }

        System.out.println(sum);
    }
}

//Quiz. 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.