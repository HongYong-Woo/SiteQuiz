package e_Array2.prob;
public class CalculateRates {
	public static void main(String[] args) throws Exception {
		CalculateRates calculateRates = new CalculateRates();

		// 비율 결과: 6.0%, 2.0%, 12.0%, 49.0%, 31.0%
		calculateRates.calculate(new int[] { 10, 30, 20, 80, 50 });

		// 비율 결과: 20.0%, 20.0%, 20.0%, 20.0%, 20.0%
		calculateRates.calculate(new int[] { 50, 50, 50, 50, 50 });

		// 비율 결과: 7.0%, 13.0%, 20.0%, 27.0%, 33.0%
		calculateRates.calculate(new int[] { 1, 2, 3, 4, 5 });
	}

	public void calculate(int[] nums) throws Exception {
		// calculate 메소드 구현
		int sum =0;
		for(int n=0; n<nums.length ; n++) {
			sum += nums[n];
		}

		double percent=0;
		for(int n=0; n<nums.length ; n++) {
			percent = (nums[n]/(double)sum) *100;
			for(int x=0; x<(int)percent ; x++) {
				System.out.printf("*");
			}
			System.out.printf(" (%.1f%%)\n", (double)Math.round(percent));
		}
		System.out.println();
	}
}