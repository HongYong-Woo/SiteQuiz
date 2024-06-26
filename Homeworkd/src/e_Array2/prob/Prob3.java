package e_Array2.prob;

import java.io.*;
public class Prob3 {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		int[] array = {3, 17, 12, 43, 3, 17, 3, 8, 21, 8};
		System.out.println("<< 중복되지 않은 숫자 >>");
		printUniqueNumber(array);
	}

	private static void printUniqueNumber(int[] array) throws IOException {
		// 구현하세요.
		boolean isSame = false;
		for(int v =0; v<array.length ; v++) {
			isSame = false;
			for(int h=0; h<array.length ; h++) {
				if(array[v] == array[h] && v != h) {
					isSame = true;
					break;
				}
			}
			if(!isSame)
				System.out.printf("%d ", array[v]);
		}
	}
}
