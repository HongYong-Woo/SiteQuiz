package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int age = Integer.parseInt(st.nextToken());

        if(age >= 20)
            System.out.println("adult");
        else
            System.out.println((20 - age) + " years later");


        br.close();
    }
}
//Quiz.나이를 입력받아
// 20살 이상이면 "adult"라고 출력하고
// 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.