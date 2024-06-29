package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Test10 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    char[][] arrChar = new char[3][5];
    for(int v=0; v<arrChar.length ; v++) {
      st = new StringTokenizer(br.readLine());
      for(int h=0; h<arrChar[v].length ; h++) {
        arrChar[v][h] = (char)(st.nextToken().charAt(0) +32);
      }
    }

    for(int v=0; v<arrChar.length ; v++) {
      for(int h=0; h<arrChar[v].length ; h++) {
        System.out.printf("%c ", arrChar[v][h]);
      }
      System.out.println();
    }
    br.close();
  }
}
//Quiz. 3행 5열의 2차원 문자배열 형태의 대문자들을 입력 받은 후
// 소문자로 바꾸어서 공백으로 구분하여 출력하는 프로그램을 작성하시오.
//Input
//A B C D E
//F G H I J
//K L M N O

//output
//a b c d e
//f g h i j
//k l m n o