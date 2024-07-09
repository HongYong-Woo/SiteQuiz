package l_Exception1_20240709.Prob1;


import java.io.*;
//BufferedReader(new InputStreamReader(System.in)) 사용하셔도 됩니다.

public class Prob1 {
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자로 변환할 문자열을 입력바랍니다.");
		String str= br.readLine();
		int result= 0;
		//여기를 작성하십시오.
		result = convert(str);
		System.out.println("변환된 숫자 : " + result);
		br.close();
	}
	
	//필요할 경우 다음의 메서드 선언부분(메서드 시그너처)을 수정하시기 바랍니다.
	private static int convert(String str) {
		//여기를 작성하십시오.
		int num =0;

		try{
			num = Integer.parseInt(str);
		}catch (NumberFormatException e){
			System.out.println(e.getMessage());
			System.out.println("잘못 입력하셨습니다. 숫자를 입력헤 주세요.");
		}

		return num;
	}
}