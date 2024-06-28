package LC_C.j_array_two;
import java.io.*;
import java.util.StringTokenizer;

public class array2_Diagnosis6 {

  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    int[][] arrInt = new int[5][4];
    String[] arrString = new String[5];
    int sum=0,cnt=0;
    for(int v=0; v<arrInt.length ; v++) {
      st = new StringTokenizer(br.readLine());
      for(int h=0; h<arrInt[v].length ; h++){
        arrInt[v][h] = Integer.parseInt(st.nextToken());
        sum +=arrInt[v][h];
      }
      if(sum/arrInt[v].length >= 80) {
        arrString[v] = "pass";
        cnt++;
      }
      else {
        arrString[v] = "fail";
      }
      sum=0;
    }

    for(String s : arrString) {
      System.out.println(s);
    }
    System.out.println("Successful : " + cnt);

    br.close();
  }
}
//Quiz. 5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서
// 각 개인별로 평균이 80 이상이면 “pass” 그렇지 않으면 “fail”을 출력하고
// 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
//input
//85 67 95 65
//80 95 86 56
//100 98 67 86
//95 76 84 65
//67 86 90 76

//ouput
//fail
//fail
//pass
//pass
//fail
//Successful : 2
