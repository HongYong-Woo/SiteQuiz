package h_loop_three;
import java.io.*;
public class loop3_Test9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());;

        for(int x=0; x<inputNum ; x++) {
            for(int s =0; s<=x ; s++) {
                System.out.printf("# ");
            }
            System.out.println();
        }

        for(int x =1; x<inputNum; x++) {
            for(int s=0 ; s<x ; s++) {
                System.out.printf("  ");
            }
            for(int c=inputNum-x ; c>0 ; c--) {
                System.out.printf("# ");
            }
            System.out.println();
        }
        br.close();
    }
}


//Quiz. 자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
//input : 3
//#
//# #
//# # #
//  # #
//    #