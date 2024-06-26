package e_Array2.prob;

public class Prob09 {
	public static void main(String[] args) {

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
