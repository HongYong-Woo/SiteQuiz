package h_loop_three;
import java.io.*;
public class loop3_Test5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int cnt = num*2 -1;

        for(int x =0; x<num ; x++) {
            for(int s = 0 ; s<cnt-1 ; s++) {
                System.out.printf(" ");
            }
            cnt-=2;
            for (int a = 0 ; a < (x*2)+1 ; a++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        br.close();
    }
}

//Quiz. 자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
//input : 3
//    *
//  ***
//*****