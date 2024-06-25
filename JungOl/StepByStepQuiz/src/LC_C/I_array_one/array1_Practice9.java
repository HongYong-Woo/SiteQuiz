package LC_C.i_array_one;

public class array1_Practice9 {

  public static void main(String[] args) {
    int[] arraytInt = new int[]{95, 75, 85, 100, 50};

    int temp=0;
    for(int n=0; n<arraytInt.length ; n++) {
      for(int x= 0; x<arraytInt.length ; x++) {
        if(arraytInt[n]< arraytInt[x]) {
          temp = arraytInt[n];
          arraytInt[n] = arraytInt[x];
          arraytInt[x] = temp;
        }

      }
    }

    for(Integer i : arraytInt) {
      System.out.printf("%d ",i);
    }
  }
}
//Quiz.5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.
//50 75 85 95 100
