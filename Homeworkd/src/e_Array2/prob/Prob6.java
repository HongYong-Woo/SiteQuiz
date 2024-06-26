package e_Array2.prob;

import java.util.Arrays;

public class Prob6 {

	public static void main(String[] args) {
		Prob6 median = new Prob6();

		int[] values1 = { 10, 4, 53, 63, 17, 37, 52, 16, 33, 65 };
		System.out.println("input : "+ Arrays.toString(values1));
		System.out.println("median : "+median.findMedian(values1));
		System.out.println("=================================================");
		
		int[] values2 = { 32, 53, 52, 76, 15, 98, 76, 65, 36, 10 };
		System.out.println("input : "+Arrays.toString(values2));
		System.out.println("median : "+median.findMedian(values2));
	}

	public int findMedian(int[] values) {
		// 메소드를 완성하세요
    int sum=0;
    int avg=0;

    for(int n=0; n<values.length ; n++) {
      sum += values[n];
    }
    avg = sum/values.length;

    int result =Math.abs(values[0]-avg);

    for(int n=0; n<values.length ; n++) {
      if(Math.abs(result-avg)> Math.abs(values[n]-avg))
        result = values[n];
      else if(Math.abs(result-avg) == Math.abs(values[n]-avg)) {
        if(result > values[n])
          result = values[n];
      }
    }
		return result;
	}
}
