package LC_C.I_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Diagnosis1 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    char[] arrayInt = new char[10];

    for(int n=0; n< arrayInt.length; n++) {
      arrayInt[n] = st.nextToken().charAt(0);
    }

    for(Character i : arrayInt) {
      System.out.printf("%c", i);
    }

    br.close();
  }
}
//Quiz. 문자 10개를 저장할 수 있는 배열을 만들고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램을 작성하시오.
//input : A B C D E F G H I J
//ABCDEFGHIJ