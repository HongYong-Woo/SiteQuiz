package LC_C;
import java.io.*;
public class loop2_Test1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int n=0; n<num ; n++) {
            System.out.println("JUNGOL");
        }

        br.close();
    }
}
//Quiz. 10 이하의 자연수 n을 입력받아 "JUNGOL\n"을 n번 출력하는 프로그램을 작성하시오.
