package LC_C.h_loop_three;
import java.io.*;
public class loop3_Test6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int x = 1; x<=num ; x++) {
            for(int y = (num*2)-(x*2); y>0 ; y--) {
                System.out.printf(" ");
            }
            for(int y=1 ; y<=x ; y++) {
                System.out.printf("%d ", y);
            }
            System.out.println();
        }

        br.close();
    }
}
//Quiz. 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
//주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
//input : 3
//    1
//  1 2
//1 2 3



