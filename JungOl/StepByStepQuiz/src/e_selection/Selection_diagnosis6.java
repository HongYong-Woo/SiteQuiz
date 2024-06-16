package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String gender = st.nextToken();
        int age = Integer.parseInt(st.nextToken());

        if(gender.equals("M")) {
            if(age >= 18)
                System.out.println("MAN");
            else
                System.out.println("BOY");
        }
        else if (gender.equals("F")) {
            if(age >= 18)
                System.out.println("WOMAN");
            else
                System.out.println("GIRL");
        }

        br.close();
    }
}
//Quiz.남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
//
//성별('M', 'F')과 나이를 입력받아
//"MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.