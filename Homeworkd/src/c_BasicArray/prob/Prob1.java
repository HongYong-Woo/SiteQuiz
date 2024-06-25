package c_BasicArray.prob;

import java.io.ObjectInputStream.GetField;

public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10};
		int[] ib = new int[]{1,2,3,4,5};

		Prob1 pr = new Prob1();
		pr.Practice1("ia", ia);
		pr.Practice1("ib", ib);


		pr.Practice2();

	}

	/**
	 * 문제 1
	 * @함수명 str
	 * @배열 arrayInt
	 */
	public void Practice1(String str, int[] arrayInt) {
		System.out.println("문제1 . Prob1의 main() 메소드에는 정수형 배열이 초기화되어 있다.");
		System.out.println("이 배열을 매개변수로 받아서 배열의 내용을 홀수, 짝수 인지 구분하여 홀수의 합과 짝수의 합을 출력하시오.");
		int oddSum=0, evenSum=0;
		for(int n=0; n<arrayInt.length ; n++) {
			if(arrayInt[n] ==0)
				evenSum += arrayInt[n];
			else
				oddSum += arrayInt[n];
		}
		System.out.printf("( 배열 %s )\n홀수의 합 : %d\n짝수의 합 : %d\n", str ,oddSum, evenSum);
	}

	/** 문제2 */
	public void Practice2() {
		System.out.println("문제2. 1부터 100사이의 난수를 발생시커서 배열의 원소로 초기화 하고 출력하기");
		int[] arrayInt = new int[5];

		for(int n=0; n< arrayInt.length ; n++) {
			arrayInt[n] = (int)(Math.random()*100) +1;
			System.out.printf("%d ", arrayInt[n]);
		}
		System.out.println();
	}

}


