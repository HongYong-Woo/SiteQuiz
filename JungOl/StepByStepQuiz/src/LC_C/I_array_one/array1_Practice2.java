package LC_C.I_array_one;

public class array1_Practice2 {

  public static void main(String[] args) {
    char[] arrayChar = new char[26];

    for(int n = 0 ; n< arrayChar.length ; n++) {
      arrayChar[n] = (char)(90 - n);
    }

    for(Character c : arrayChar) {
      System.out.printf("%c ", c);
    }
  }
}
//Quiz. 26개의 문자배열을 선언하고 'A'부터 'Z'까지의 대문자를 차례로 대입 시킨 후 배열의 마지막부터 처음까지 각 문자를 출력하는 프로그램을 작성하시오.
//Z Y X W V U T S R Q P O N M L K J I H G F E D C B A