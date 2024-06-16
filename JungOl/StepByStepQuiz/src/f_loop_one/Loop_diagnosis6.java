package f_loop_one;
import java.io.*;
public class Loop_diagnosis6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a=0;

        while (true){
            System.out.printf("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
            a = Integer.parseInt(br.readLine());

            if(a == 1)
                System.out.println("\nSeoul\n");
            else if(a == 2)
                System.out.println("\nWashington\n");
            else if(a == 3)
                System.out.println("\nTokyo\n");
            else if(a == 4)
                System.out.println("\nBeijing\n");
            else {
                System.out.println("\nnone\n");
                break;
            }

        }

        br.close();
    }
}
//Quiz.아래와 같이 나라 이름을 출력하고 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업을 반복하다가
// 해당하는 번호 이외의 숫자가 입력되면 "none"라고 출력한 후 종료하는 프로그램을 작성하시오.
//* 각 나라의 수도 : 
//대한민국 = 서울(Seoul)
//미국 = 워싱턴(Washington)
//일본 = 동경(Tokyo)
//중국 = 북경(Beijing)