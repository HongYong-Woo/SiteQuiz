package LC_C;
import java.io.*;
public class loop2_Test9 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int x=1; x<=num; x++) {
            for(int y =1; y<=num; y++) {
                System.out.printf("(%d, %d) ",x,y);
            }
            System.out.println();
        }
        br.close();
    }
}

//Quiz. 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
//* 주의
//')'와 '('사이에 공백이 1칸 있다. (1,_1) 처럼 출력한다 : '_'는 공백
//입력 : 4
//(1, 1) (1, 2) (1, 3) (1, 4)
//(2, 1) (2, 2) (2, 3) (2, 4)
//(3, 1) (3, 2) (3, 3) (3, 4)
//(4, 1) (4, 2) (4, 3) (4, 4)