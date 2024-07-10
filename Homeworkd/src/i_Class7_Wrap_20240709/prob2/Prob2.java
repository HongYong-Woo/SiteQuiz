package i_Class7_Wrap_20240709.prob2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Prob2 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr;

		System.out.print("문자열을 입력하세요. : ");
		inputStr = br.readLine();
		
		//프로그램을 구현하세요.
		String temp = new StringBuilder(inputStr).reverse().toString();
		inputStr = temp.toUpperCase();
		System.out.println(inputStr);
		br.close();
	}

}
