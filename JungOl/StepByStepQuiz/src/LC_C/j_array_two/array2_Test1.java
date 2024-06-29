package LC_C.j_array_two;
import java.io.*;
import java.util.StringTokenizer;

public class array2_Test1 {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());;
    int[] arrInt = new int[6];
    int num=0;
    for(int n=0; n<10 ; n++) {
      num = Integer.parseInt(st.nextToken());
      arrInt[num-1]++;
    }

    for(int n=0; n<arrInt.length ; n++) {
      System.out.printf("%d : %d\n", n+1, arrInt[n]);
    }

    br.close();
  }
}
//Quiz.가람이는 주사위 놀이를 하다가 주사위를 10번 던져서
// 각 숫자가 몇 번씩 나왔는지 알아보려고 한다.
// 한번 던질 때마다 나온 주사위의 숫자를 입력받아서 각 숫자가 몇 번씩 나왔는지 출력하는 프로그램을 작성하시오.
//input : 5 6 3 4 5 5 2 2 4 6
//1 : 0
//2 : 2
//3 : 1
//4 : 2
//5 : 3
//6 : 2
