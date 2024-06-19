package LC_C;
import java.io.*;
public class loop2_Practice4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum =0;

        for(int n=0; n<=num ;n++) {
            sum += n;
        }
        System.out.println(sum);
        br.close();

    }
}

//Quiz. 자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.