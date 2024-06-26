package e_Array2.prob;

public class Prob5 {

  public static int getValue(int[] values, boolean isMax) {
    // int 타입 배열의 최대값 또는 최소값을 리턴한다.
    int max = 0;
    int min = values[0];
    for (int n = 0; n < values.length; n++) {
      if (max < values[n]) {
        max = values[n];
      }

      if (min > values[n]) {
        min = values[n];
      }
    }

    if (isMax) {
      return max;
    } else {
      return min;
    }

  }

  public static void main(String[] args) {
    int[] values = {57, 3, 43, 5, 39, 23, 55, 2};

    int maxValue = getValue(values, true);
    int minValue = getValue(values, false);

    System.out.println("최대값 = " + maxValue);
    System.out.println("최소값 = " + minValue);

  }
}
