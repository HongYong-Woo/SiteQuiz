package i_Class7_Wrap_20240709.prob4;

public class Prob2 {
	public static void main(String[] args) {
		Prob2 p = new Prob2();
		String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
		String[] addrArr = p.split(addr, ',');
		System.out.println("배열 크기 : " + addrArr.length);
		for(int i=0; i<addrArr.length; i++){
			System.out.print(addrArr[i] + " ");
		}
	}

	public String[] split(String str, char separator){
    String[] arrStr;
		String tempStr;
		int index =0, cnt=0;

		for(int n=0; n<str.length() ; n++) {
			if(str.charAt(n) == separator) {
				cnt++;
			}
		}
arrStr = new String[cnt+1];

		int start=0;
		for(int n=0; n<str.length() ; n++) {
			if(str.charAt(n) == separator) {
				tempStr = new StringBuilder(str).substring(start,n);
				arrStr[index] = tempStr;
				index++;
				start = n+1;
			}
		}
		tempStr = new StringBuilder(str).substring(start,str.length());
		arrStr[index] = tempStr;

		return arrStr;
		//return str.split(Character.toString(separator));
	}
}



















