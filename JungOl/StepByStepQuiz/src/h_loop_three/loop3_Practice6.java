package h_loop_three;
import java.io.*;
public class loop3_Practice6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt =1;

        for(int x=0; x<num ; x++) {
            for(int y=0 ; y<=x ; y++) {
                System.out.printf("%d " , cnt++);
            }
            System.out.println();

        }

        br.close();
    }
}
//Quiz. 자연수 n을 입력받아 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
//input : 5
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15