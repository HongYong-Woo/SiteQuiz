package e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String word = st.nextToken();

        switch (word) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Usually");
                break;
            case "D":
                System.out.println("Effort");
                break;
            case "F":
                System.out.println("Failure");
                break;
            default:
                System.out.println("error");
                break;
        }

        br.close();
    }
}
//Quiz. 영문 대문자를 입력받아
//'A'이면 “Excellent”,
//'B'이면 “Good”,
//'C'이면 “Usually”,
//'D'이면 “Effort”,
//'F'이면 “Failure”,
//그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.