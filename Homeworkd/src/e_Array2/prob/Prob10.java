package e_Array2.prob;
public class Prob10 {

	public static void main(String[] args) {

		int a[][] = { {30,30,30,30}, {40,40,40,40}, {50,50,50,50} };
		int b[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		int c[][] = new int[3][4];
		
		Prob10 pb = new Prob10();
		pb.sub(a,b,c); 
		pb.prn(c);
		
	}

	public int[][] sub(int[][] a, int[][] b, int[][] c){
			
		 //이곳에 프로그램을 완성하십시오.
		for(int v=0; v<a.length ; v++) {
			for(int h=0; h<a[v].length ; h++) {
				c[v][h] = a[v][h] - b[v][h];
			}
		}
		return c;
	}
	
	public void prn(int[][] c){
		
		 //이곳에 프로그램을 완성하십시오.
		for(int v=0; v<c.length ; v++) {
			for(int h=0; h<c[v].length ; h++) {
				System.out.printf("%d ", c[v][h]);
			}
			System.out.println();
		}
	}
}
