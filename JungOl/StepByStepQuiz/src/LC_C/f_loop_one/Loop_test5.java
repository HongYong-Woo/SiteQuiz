package LC_C.f_loop_one;
import java.io.*;
public class Loop_test5 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Base =0;
        int Height =0;
        char con;

        while (true) {
            System.out.printf("Base = ");
            Base = Integer.parseInt(br.readLine());
            System.out.printf("Height = ");
            Height = Integer.parseInt(br.readLine());
            System.out.printf("Triangle width = %.1f\n", ((double)Base*Height)/2);
            System.out.printf("Continue? ");
            con = br.readLine().charAt(0);

            if(con != 'Y' && con != 'y') {
                break;
            }

        }
    }
}

//Quiz.삼각형의 밑변의 길이와 높이를 입력받아
// 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아
// 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
//
//(넓이는 반올림하여 소수 첫째자리까지 출력한다.)