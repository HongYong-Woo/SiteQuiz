package c_operator;
import  java.io.*;
import java.util.StringTokenizer;

public class operator_test3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken()) + 5;
        int length = Integer.parseInt(st.nextToken()) * 2;

        System.out.printf("width = %d\nlength = %d\narea = %d",width, length, width*length);

        br.close();
    }
}
//Quiz. 직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후
// 가로의 길이는 5 증가시키고
// 세로의 길이는 2배하여 저장한 후 가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.