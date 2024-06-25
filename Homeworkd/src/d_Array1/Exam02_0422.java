package d_Array1;

import java.io.*;
import java.util.StringTokenizer;

public class Exam02_0422 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{

		Exam02_0422 ex = new Exam02_0422();

		//ex.Practice1();
		ex.Practice2();

		br.close();
	}

	/** 문제1 */
	public void Practice1() throws IOException {
		System.out.println("다음은 주어진 정수 배열로 부터, 전체 정수의 합 대비 각 정수의 비율을 분석하는 RateTest입니다.");
		System.out.println("입력값에 따라 다음과 같은 결과가 수행 되도록 작성하시오.");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arrayInt = new int[st.countTokens()];
		int sum =0;
		for(int n=0; n< arrayInt.length ; n++) {
			arrayInt[n] = Integer.parseInt(st.nextToken());
			sum += arrayInt[n];
		}
		double percent =0;
		for(int v =0 ; v<arrayInt.length ; v++) {
			percent = (arrayInt[v]/(double)sum)*100;
			for(int h=0; h<(int)percent ; h++) {
				System.out.printf("*");
			}
			System.out.printf("(%f)\n",percent);
		}
	}

	/** 문제2 */
	public void Practice2() {

		char[][] alphabet = new char[5][5];
		char start='A';

		//1.배열에 알파벳 입력

		for(int v=0; v<alphabet.length ; v++) {
			for(int h=0; h<alphabet[v].length ; h++) {
				alphabet[v][h] = start;
				start++;
			}
		}
		//2.원본 배열 출력
		System.out.println("\t\t원본 배열");
		System.out.println("=====================");
		for(int v=0; v<alphabet.length ; v++) {
			for(int h=0; h<alphabet[v].length ; h++) {
				System.out.printf("%c\t\t", alphabet[v][h]);
			}
			System.out.println();
		}


		//3. 배열 수정
		for(int v=0; v<alphabet.length ; v++) {
			for(int h=0; h<alphabet[v].length ; h++) {
				if(v == h)
					alphabet[v][h] = '*';
			}
		}


		//4. 수정된 배열 출력
		System.out.println("\t\t수정된 배열");
		System.out.println("=====================");
		for(int v=0; v<alphabet.length ; v++) {
			for(int h=0; h<alphabet[v].length ; h++) {
				System.out.printf("%c\t\t", alphabet[v][h]);
			}
			System.out.println();
		}
	}

}
