package LC_C.h_loop_three;
import java.io.*;
public class loop3_Test8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        int num =1;
        for(int x=0; x<inputNum ; x++) {
            for(int s=0; s <x*2 ; s++) {
                System.out.printf(" ");
            }
            for(int y = inputNum-x; y>0 ; y--) {
                System.out.printf("%d ", num++);
            }
            System.out.println();
        }
        br.close();
    }
}

//Quiz.자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//input : 3
//1 2 3
//  4 5
//    6