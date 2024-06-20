package AllQuiz;

import java.io.*;
public class Star5_2442 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num >=1 && num <=100) {
            for(int y =0; y<num ; y++) {
                for(int s=num-y-1; s>0 ; s--) {
                    System.out.printf(" ");
                }
                for(int a=0; a<(y*2)+1 ; a++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
//첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
//별은 가운데를 기준으로 대칭이어야 한다.
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//input : 5
//    *
//   ***
//  *****
// *******
//*********