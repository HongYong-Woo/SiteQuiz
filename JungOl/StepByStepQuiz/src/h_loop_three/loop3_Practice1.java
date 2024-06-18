package h_loop_three;
import java.io.*;
public class loop3_Practice1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int num =1, sum =0;
        while (true) {
            sum += num;
            if(sum > a)
                break;
            num++;
        }
        System.out.printf("%d %d",num, sum);

        br.close();
    }
}
//Quiz. 1부터 차례로 누적하여 합을 구하다가
// 합이 입력받은 수를 넘으면 중단하고
// 마지막으로 더해진 값과 그 때까지의 합을 출력하는 프로그램을 작성하시오.