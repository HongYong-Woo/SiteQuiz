package LC_C.h_loop_three;
import java.io.*;
public class loop3_Test7 {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int inputNum = Integer.parseInt(br.readLine());
    int n =0;
    char c = 'A';

    for(int x =0; x<inputNum ; x++) {
        for(int y=inputNum - x; y>0 ; y-- ) {
            System.out.printf("%c ", c++);
        }
        for(int y=0; y<x ; y++) {
            System.out.printf("%d ", n++);
        }
        System.out.println();
    }
    br.close();
    }
}

//Quiz. 자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//input : 3
//A B C
//D E 0
//F 1 2
