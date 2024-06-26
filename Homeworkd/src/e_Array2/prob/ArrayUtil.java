package e_Array2.prob;



public class ArrayUtil {
	public static void main(String[] args){

		char[] arrChar = new char[] {'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm'};

		ArrayUtil au = new ArrayUtil();
		System.out.println("원본 배열");
		au.printArr(arrChar);


		char[] reArrChar = au.reverseString(arrChar,0,3);
		au.printArr(reArrChar);

		reArrChar = au.reverseString(arrChar,4,7);
		au.printArr(reArrChar);

		reArrChar = au.reverseString(arrChar,8,10);
		au.printArr(reArrChar);

		reArrChar = au.reverseString(arrChar,0,10);
		au.printArr(reArrChar);


	}
	public char[] reverseString(char[] s, int start, int end) {
		char[] tempArr = s;

		//reverseString 메소드 구현
		if(start <0 || end> s.length || start > s.length|| end<start ) {//
			System.out.println("잘못 입력하셨습니다.");
		}
		else {
			char[] temparr2 = new char[(int)Math.abs(start - end)+1];
			int cnt=0;
			for(int v=end; v>=start ; v--) {
			//작은 배열을 만든 후 값을 바꿔보자
				temparr2[cnt] = s[v];
				cnt++;
			}

			cnt=0;
			for(int n=start ; n<=end ; n++) {
				tempArr[n] = temparr2[cnt];
				cnt++;
			}

		}
		return tempArr;
	}

	public void printArr(char[] ac) {
		for(Character c : ac) {
			System.out.printf("%c", c);
		}
		System.out.println();
	}
}
