package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_test5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28");
                break;
        }


        br.close();
    }
}
//Quiz.1~12사이의 정수를 입력받아 평년의 경우 입력받은 월의 날수를 출력하는 프로그램을 작성하시오.
//평년의 경우 1월부터 12월까지 일수는 각각 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31일이다.