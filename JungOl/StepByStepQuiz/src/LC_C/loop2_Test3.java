package LC_C;
import java.io.*;
public class loop2_Test3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum =0;
        for(int n =1; n<=num; n++) {
            if(n%5 ==0)
                sum +=n;
        }
        System.out.println(sum);
    }
}

//Quiz. 정수를 입력받아서 1부터 입력받은
// 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.