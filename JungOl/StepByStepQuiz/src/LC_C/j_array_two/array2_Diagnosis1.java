package LC_C.j_array_two;

import java.io.*;
import java.util.StringTokenizer;

public class array2_Diagnosis1 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    char[] arrayChar = new char[st.countTokens()];
    int[] arrayInt = new int[26];
    int cnt =st.countTokens();
    char ch = 'A';  //'A' = 65
    int index=0;

    for(int n=0; n< cnt ; n++) {
       ch = st.nextToken().charAt(0);
       if(ch >='A' && ch<= 'Z') {
         index = (int)ch -65;
         arrayInt[index] ++;
       }
       else
         break;
    }
    cnt=0;
    for(int n=0; n<arrayInt.length ; n++) {
      if(arrayInt[n] >0) {
        ch = (char)(n + 65);
        arrayChar[cnt] = ch;
            cnt++;
      }
    }


    for(int n=0; n<arrayChar.length ; n++) {
      if(arrayChar[n] ==0)
        break;
      index = (int)arrayChar[n] - 65;
      System.out.printf("%c : %d\n", arrayChar[n], arrayInt[index]);
    }
  }
}
//Quiz.영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//
//영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
//
//입력되는 문자의 개수는 2개 이상 100개 이하이다.
//input : A B C F F F B Z !
//A : 1
//B : 2
//C : 1
//F : 3
//Z : 1