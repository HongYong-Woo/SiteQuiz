package LC_C.h_loop_three;
import java.io.*;
public class loop3_Practice4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());


        for(int x =1; x<=a; x++) {
            //" " 입력
            for(int y = a-x; y>0; y--) {
                System.out.printf(" ");
            }

            //* 입력
            for(int y =1 ; y<=x ; y++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        br.close();
    }
}

//Quiz. 자연수 n을 입력받아 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
//Input : 5
// *
//   **
//  ***
// ****
//*****
