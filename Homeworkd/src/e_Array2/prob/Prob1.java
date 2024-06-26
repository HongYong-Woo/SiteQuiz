package e_Array2.prob;
public class Prob1 {

	public static void main(String[] args) {
		
		int[] ia = new int[]{3,7,1,8,10,2,15,2,10}; 
		int[] ib = new int[]{1,2,3,4,5};
		
		Prob1 p = new Prob1();
		System.out.println("( 배열 ia )");
		p.calc(ia);
		System.out.println("( 배열ib )");
		p.calc(ib);
	}
	
	public void calc(int[] ix){
		int oddSum=0, evenSum=0;
		for(int n=0; n<ix.length ; n++) {
			if(ix[n]%2 ==0)
				evenSum += ix[n];
			else
				oddSum += ix[n];
		}
		System.out.printf("홀수의 합 : %d\n짝수의 합 : %d\n" ,oddSum, evenSum);
		
		// 구현하시오.----------------------------- 


	








		//---------------------------------------
		
	}

}
