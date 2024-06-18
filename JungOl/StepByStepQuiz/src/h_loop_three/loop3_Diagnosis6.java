package h_loop_three;
import java.io.*;
public class loop3_Diagnosis6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        char c = 'A';

        for(int x=0; x<num; x++) {
            for(int y =num-x; y>0 ; y--) {
                System.out.printf("%c", c);
                c++;
            }
            System.out.println();
        }


        br.close();
    }
}
//Quiz. 자연수 n(1 \le n \le 6) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
//Input : 3
//ABC
//DE
//F
