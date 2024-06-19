package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if((a%400) == 0 || ((a%4)==0 && (a%100) != 0))
            System.out.println("leap year");
        else System.out.println("common year");

        br.close();
    }
}
//Quiz.년도를 입력받아 윤년(leap year)인지 평년(common year)인지 판단하는 프로그램을 작성하시오.