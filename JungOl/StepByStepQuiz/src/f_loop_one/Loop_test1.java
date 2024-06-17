package f_loop_one;
import java.io.*;
public class Loop_test1 {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int n=1; n<=a ;n++) {
            System.out.printf("%d ",n);

            br.close();
        }

    }
}

//Quiz. 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.