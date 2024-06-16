package f_loop_one;

import java.io.*;
public class Loop_diagnosis3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num =0;
        while (true) {
            System.out.printf("number? ");
            num = Integer.parseInt(br.readLine());

            if(num >0)
                System.out.println("positive integer");
            else if(num <0)
                System.out.println("negative number");
            else if(num ==0)
                break;
        }

        br.close();
    }
}
//Quiz.한 개의 정수를 입력받아 양수(positive integer)인지
// 음수(negative number)인지 출력하는 작업을 반복하다가
// 0이 입력되면 종료하는 프로그램을 작성하시오.
//* 입출력예의 진한글씨는 출력값입니다.