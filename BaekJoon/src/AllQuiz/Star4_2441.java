package AllQuiz;

import java.io.*;
public class Star4_2441 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if(num >=1 && num <=100) {
            for(int y =0 ; y<num ; y++) {
                for(int s=0; s<y ; s++) {
                    System.out.printf(" ");
                }
                for(int a=num-y; a>0 ; a--) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
        br.close();
    }
}

//Quiz.첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//input : 5
//*****
// ****
//  ***
//   **
//    *
