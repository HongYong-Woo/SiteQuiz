package i_Class7_Wrap_20240709.prob4;

import java.util.StringTokenizer;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "입력 숫자 = " + number );		
		System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
		System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
	}
	
	//  이곳에 countNumber 메소드를 작성하십시오.
	public int countNumber(long number, int i) {
		int cnt =0;

/*    while (number !=0) {
      if(number%10 == i)
        cnt++;
      number/= 10;
    }*/

    String numberS = Long.toString(number);
    String[] splitString = numberS.split("");
    String num = Integer.toString(i);
    for(String s : splitString) {
      if(s.equals(num)) {
        cnt++;
      }
    }



    return cnt;
  }
}
