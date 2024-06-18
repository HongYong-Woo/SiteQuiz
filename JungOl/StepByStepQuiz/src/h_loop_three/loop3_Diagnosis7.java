package h_loop_three;

import java.io.*;
public class loop3_Diagnosis7 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int nn = 1;
        char cc = 'A';
        for(int x=0; x<num ; x++) {
            for(int n = num-x; n>0 ; n--) {
                System.out.printf("%d ",nn++);
            }

            for(int c = 0 ; c<=x ; c++) {
                System.out.printf("%c ", cc++);
            }
            System.out.println();
        }
    }
}
//Quiz.자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
//input : 3
//1 2 3 A
//4 5 B C
//6 D E F