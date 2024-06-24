package LC_C.g_loop_two;
import java.io.*;
public class loop2_Diagnosis1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for(int n=0; n<20; n++) {
            System.out.print(str);
        }
        br.close();
    }
}

//Quiz.문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.