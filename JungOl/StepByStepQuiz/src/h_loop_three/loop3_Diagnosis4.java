package h_loop_three;
import java.io.*;
public class loop3_Diagnosis4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for(int x=0; x<a ; x++) {
            for(int y=0 ; y<x ; y++) {
                System.out.printf(" ");
            }
            for(int y=a ; y>x; y--) {
                System.out.printf("*");
            }
            System.out.println();
        }
        br.close();
    }
}
//Quiz. 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
//input : 3
//***
// **
//  *