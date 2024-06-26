package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test5 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    double[] arrayFloat = new double[6];
    double avg=0;
    double sum=0;
    for(int n=0; n<arrayFloat.length ; n++) {
      arrayFloat[n] = Double.parseDouble(st.nextToken());
      sum += arrayFloat[n];
    }
    avg = sum/arrayFloat.length;
    System.out.printf("%.1f\n", avg);
    br.close();
  }

}
//Quiz. 6명의 몸무게를 입력받아
// 몸무게의 평균을 출력하는 프로그램을 작성하시오. 출력은 반올림하여 소수 첫째자리까지로 한다.
//input : 23.2 39.6 66.4 50.0 45.6 48.0
//45.5