package LC_C.i_array_one;
import java.io.*;
public class array1_Test6 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] arrayChar = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
    char ch = br.readLine().charAt(0);
    boolean ischeck = false;
    int index=0;
    for(int n=0; n<arrayChar.length ; n++) {
      if(arrayChar[n] == ch) {
        ischeck = true;
        index = n;
        break;
      }
    }

    if(ischeck) {
      System.out.println(index);
    }
    else {
      System.out.println("none");
    }

    br.close();
  }
}

//Quiz. 6개의 문자배열을 만들고 {'J', 'U', 'N', 'G', 'O', 'L'} 으로 초기화 한 후
// 문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
//
//첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 "none" 라는 메시지를 출력하고 끝내는 프로그램을 작성하시오.
//input : L
//5
//iinput : B
//none