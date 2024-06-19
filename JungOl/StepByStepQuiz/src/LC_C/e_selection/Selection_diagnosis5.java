package LC_C.e_selection;
import  java.io.*;
import java.util.StringTokenizer;

public class Selection_diagnosis5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        float a = Float.parseFloat(st.nextToken());
        float b = Float.parseFloat(st.nextToken());

        if(a>= 4.0 && b >= 4.0)
            System.out.println("A");
        else if(a>=3.0 && b>= 3.0)
            System.out.println("B");
        else
            System.out.println("C");

        br.close();
    }
}
//Quiz. 두 개의 실수를 입력받아
//모두 4.0 이상이면 "A",
//모두 3.0 이상이면 "B",
//아니면 "C" 라고 출력하는 프로그램을 작성하시오.