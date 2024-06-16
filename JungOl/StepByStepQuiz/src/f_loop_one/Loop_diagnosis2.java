package f_loop_one;

import  java.io.*;
public class Loop_diagnosis2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int sum =0, cnt = 1;
        while (cnt <=a) {
            sum += cnt;
            cnt++;
        }
        System.out.println(sum);

    }
}
//Quiz. 100 이하의 양의 정수만 입력된다.
// while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.