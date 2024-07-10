package i_Class7_Wrap_20240709.prob2;

public class Prob1 {

	public static void main(String args[]) {
		
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SSG", 6, '#') );
		System.out.println( prob1.leftPad("SSG", 5, '$') ); 
		System.out.println( prob1.leftPad("SSG", 2, '&') ); 
		 
	}
	
	public String leftPad(String str, int size, char padChar) {
    	//여기에 프로그램을 완성하십시오.
			int cnt = size - str.length();
      String temp = str;
      if(cnt >0) {
        char[] arrChar = new char[cnt];
        for(int n=0 ; n< arrChar.length; n++)
						arrChar[n] = padChar;
        temp = new StringBuilder(str).insert(0, arrChar).toString();
      }

    return temp;
	}
	
}
