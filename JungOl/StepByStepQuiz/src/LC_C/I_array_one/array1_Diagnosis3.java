package LC_C.I_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis3 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    char[] arrayChar = new char[10];

    for(int n=0; n< arrayChar.length ; n++) {
      arrayChar[n] = st.nextToken().charAt(0);
    }

    System.out.println(arrayChar[0] + " " + arrayChar[3] + " " + arrayChar[6]);

    br.close();

  }

}

//Quiz.10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.
//input : A B C D E F G H I J
//A D G
