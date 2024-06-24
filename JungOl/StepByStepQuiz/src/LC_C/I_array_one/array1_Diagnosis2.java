package LC_C.I_array_one;

public class array1_Diagnosis2 {

  public static void main(String[] args) {
      int[] arrayInt = new int[10];
      for(int n=0; n< arrayInt.length ; n++) {
        arrayInt[n] = n+1;
      }

    for (Integer i : arrayInt) {
      System.out.printf("%d ", i);
    }
  }

}
//Quiz.정수 10 개를 저장할 수 있는 배열을 만들어서 1 부터 10 까지를 대입하고 차례대로 출력하는 프로그램을 작성하시오.
//1 2 3 4 5 6 7 8 9 10