package Beginner.c_MakePatton2;
import java.io.*;
public class starTriangle2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n ==0 || n%2 ==0 || n<0 || n>=100)
            System.out.println("INPUT ERROR!");
        else {
            int cnt = n/2 +1;

            for(int y=0 ; y<cnt ; y++) {
                for(int s =0 ; s<y ; s++) {
                    System.out.printf(" ");
                }
                for(int a=cnt-y; a>0 ; a--) {
                    System.out.printf("*");
                }
                System.out.println();
            }

            for(int y=1; y<=n/2 ; y++) {
                for(int s=0; s< n/2 ; s++) {
                    System.out.printf(" ");
                }
                for(int a=0; a<=y ; a++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}

//Quiz. 삼각형의 높이 n을 입력 받은 후
// 출력 예제과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
//100 이하의 홀수인 양의 정수 n이 주어진다.
//입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"을 출력한다.
//'*'과 '*' 사이에는 공백이 없다.
//input : 7
//****
// ***
//  **
//   *
//   **
//   ***
//   ****

//input : 0
//INPUT ERROR!