package LC_C.h_loop_three;
import java.io.*;
public class loop3_Test10 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int odd = 1;
        for(int x=0; x<n ; x++) {
            for(int y=0; y<n ; y++) {
                System.out.printf("%d ", odd);
                odd +=2;
                if(odd > 10)
                    odd = 1;
            }
            System.out.println();
        }
        br.close();
    }
}

//Quiz. 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 10 미만의 홀수만 출력하시오.
//주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//input : 3
//1 3 5
//7 9 1
//3 5 7