package d_debugging;
import java.io.*;
import java.util.StringTokenizer;

public class Debugging_practice1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력
        float a = Float.parseFloat(st.nextToken());
        float b = Float.parseFloat(st.nextToken());

        System.out.printf("%d %d",(int)(a+b), (int)a+(int)b); //출력
    }
}

//Quiz. 실수형 변수 두 개를 입력받아서
// 두 수의 합을 정수로 변환한 결과값과
// 두 수를 각각 정수로 변환하여 합을 구한 결과값을 출력하는 프로그램을 작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오. 
