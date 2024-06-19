package Beginner.c_MakePatton2;
import java.io.*;
import java.util.StringTokenizer;

public class starTriangle1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n <=100) {
            switch (m) {
                case 1:
                    for(int y=0; y<n ; y++) {
                        for(int a=0 ; a<=y ; a++) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for(int y=0 ; y<n ; y++) {
                        for(int a = n-y ; a>0 ; a--) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for(int y=0; y<n ; y++) {
                        for(int s =1; s<n-y ; s++) {
                            System.out.printf(" ");
                        }
                        for(int a =0; a<(y*2+1) ; a++) {
                            System.out.printf("*");
                        }
                        System.out.println();
                    }
                    break;
                default: System.out.println("INPUT ERROR!");
                    break;
            }
        }
        else
            System.out.println("INPUT ERROR!");



        br.close();
    }
}
//Quiz.삼각형의 높이 n과 종류 m을 입력 받은 후
// 다음과 같은 삼각형 형태로 출력하는 프로그램을 작성하시오.
//*         ***       *
//**        **       ***
//***       *       *****
//종류1     종류2     종류3
//input : 3 2
//***
//**
//*