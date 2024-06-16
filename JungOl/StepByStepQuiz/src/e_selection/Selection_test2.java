package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());

        if(a>0)
            System.out.println("plus");
        else if(a<0)
            System.out.println("minus");
        else
            System.out.println("zero");


        br.close();
    }
}
//Quiz. 정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.