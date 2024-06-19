package Beginner.c_MakePatton2;
import java.io.*;
public class starTriangle3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if(n ==0 || n%2 ==0 || n<0 || n>100)
            System.out.println("INPUT ERROR!");
        else {
            for(int y=0; y<n/2+1 ; y++ ) {
                for(int s =0; s<y ; s++) {
                    System.out.printf(" ");
                }
                for(int a=0 ; a< (y*2)+1 ; a++) {
                    System.out.printf("*");
                }
                System.out.println();
            }

            for(int y=0; y<n/2 ; y++) {
                for(int s= (n/2)-1-y ; s>0 ; s--) {
                    System.out.printf(" ");
                }
                for(int a= n-2 - (y*2) ; a>0 ; a--) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
        br.close();
    }
}

//Quiz.삼각형의 높이 N을 입력받아 아래와 같은 모양을 출력하는 프로그램을 작성하시오.
//삼각형의 높이 N(N의 범위는 100 이하의 양의 홀수)을 입력받는다.
//N의 높이에 맞추어 주어진 형태의 모양을 출력한다.
//입력된 데이터가 주어진 범위를 벗어나면 "INPUT ERROR!"를 출력한다.
//input : 7
//*
// ***
//  *****
//   *******
//  *****
// ***
//*