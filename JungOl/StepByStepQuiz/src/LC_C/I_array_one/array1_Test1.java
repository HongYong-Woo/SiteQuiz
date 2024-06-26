package LC_C.i_array_one;
import java.io.*;
import java.util.StringTokenizer;

public class array1_Test1 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    char[] arrayChar = new char[10];
    for(int n= 0; n<arrayChar.length ; n++) {
      arrayChar[n] = st.nextToken().charAt(0);
    }

    for(int n= arrayChar.length-1; n>=0 ; n--) {
      System.out.printf("%c ", arrayChar[n]);
    }

    br.close();
  }

}

//Quiz. 10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.
//input : A E C X Y Z c b z e
//e z b c Z Y X C E A