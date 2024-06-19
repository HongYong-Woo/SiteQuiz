package LC_C;
import  java.io.*;
import java.util.StringTokenizer;

public class loop2_Diagnosis5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer((br.readLine()));

        int num =0;
        int mul3 =0, mul5=0;


        for(int n=0 ; n<10 ;n++) {
            num = Integer.parseInt(st.nextToken());
            if(num %3 ==0)
                mul3++;
            if(num %5 ==0)
                mul5++;

        }

        System.out.printf("Multiples of 3 : %d\nMultiples of 5 : %d\n",mul3, mul5);

        br.close();
    }
}

//Quiz. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오